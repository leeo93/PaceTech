/*
Data: 10/06/2022
Autor:Leonardo
Fun��o: Conversores de unidades monet�rias e de temperaturas
*/
semana6 ;

importar  java . �til . Scanner ;

 classe  p�blica ProjetoSemana06 {

    public  static  void  main ( String [] args ) {
        float  cotacaoDolar ;
        float  tempCelsius = 0 ;
        float  tempFahrenheit = 0 ;
        float  valorReais = 0 ;
        float  valorDolares = 0 ;
        char  opcao ;
        char  continuar = 's' ;
        
         Leitor de scanner = novo  Scanner ( System . in );
        
        Sistema . fora . println ( "Ol�! Bem vindo ao JAVA Pacetech Traveler's Help" );
        Sistema . fora . print ( "Informe a cota��o do D�lar Americano: " );
        cotacaoDolar = leitor . pr�ximoFloat ();
        
        while ( continuar == 'S' || continuar == 's' ){
            Sistema . fora . println ( "\n================= MENU =================" );
            Sistema . fora . println ( " 1 - Temperatura: Celsius para Fahrenheit\n" );
            Sistema . fora . println ( " 2 - Temperatura: Fahrenheit para Celsius\n" );
            Sistema . fora . println ( " 3 - Moeda: Reais(R$) para D�lar(US$)\n" );
            Sistema . fora . println ( " 4 - Moeda: D�lar(US$) para Reais(R$)" );
            Sistema . fora . println ( "========================================\n" );
            Sistema . fora . print ( "Informe a op��o que deseja: " );
        
            opcao = leitor . seguinte (). charAt ( 0 );
            
            switch ( opcao ){
                
                caso  '1' :
                    Sistema . fora . print ( "Informe a temperatura em �Celsius: " );
                    tempCelsius = leitor . nextInt ();
                    tempFahrenheit = 1.8f * tempCelsius + 32 ;
                    Sistema . fora . println ( "\n==> Resultado: " + tempCelsius + "�C equivale(m) a " + tempFahrenheit + "�F." );
                    quebrar ;
                    
                caso  '2' :
                    Sistema . fora . print ( "Informe a temperatura em �Fahrenheit: " );
                    tempFahrenheit = leitor . nextInt ();
                    tempCelsius = ( tempFahrenheit - 32 ) /1.8f ;
                    Sistema . fora . println ( "\n==> Resultado: " + tempFahrenheit + "�F equivale(m) a " + tempCelsius + "�C." );
                    quebrar ;
                    
                caso  '3' :
                    Sistema . fora . print ( "Informe o valor em Reais(R$): " );
                    valorReais = leitor . pr�ximoFloat ();
                    valorDolares = valorReais / cotacaoDolar ;
                    Sistema . fora . println ( "\n==> Resultado: R$ " + valorReais + " equivale(m) a US$ " + valorDolares +
                    "de acordo com a cota��o informada." );
                    quebrar ;
                    
                caso  '4' :
                    Sistema . fora . print ( "Informe o valor em D�lares(US$): " );
                    valorDolares = leitor . pr�ximoFloat ();
                    valorReais = valorDolares * cotacaoDolar ;
                    Sistema . fora . println ( "\n==> Resultado: US$ " + valorDolares + " equivale(m) a R$ " + valorReais +
                    "de acordo com a cota��o informada." );
                    quebrar ;
                                        
                padr�o :
                    Sistema . fora . println ( "\n==> Erro! Informe uma op��o do menu..." );
                  
            }   // troca de fim
            Sistema . fora . print ( "\nfazer outra convers�o? (S - sim / N - n�o): " );
            seguir = leitor . seguinte (). charAt ( 0 );
        }   // fim enquanto
        
        Sistema . fora . println ( "\nA uma boa viagem!\n" )