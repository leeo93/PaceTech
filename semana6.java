/*
Data: 10/06/2022
Autor:Leonardo
Função: Conversores de unidades monetárias e de temperaturas
*/
semana6 ;

importar  java . útil . Scanner ;

 classe  pública ProjetoSemana06 {

    public  static  void  main ( String [] args ) {
        float  cotacaoDolar ;
        float  tempCelsius = 0 ;
        float  tempFahrenheit = 0 ;
        float  valorReais = 0 ;
        float  valorDolares = 0 ;
        char  opcao ;
        char  continuar = 's' ;
        
         Leitor de scanner = novo  Scanner ( System . in );
        
        Sistema . fora . println ( "Olá! Bem vindo ao JAVA Pacetech Traveler's Help" );
        Sistema . fora . print ( "Informe a cotação do Dólar Americano: " );
        cotacaoDolar = leitor . próximoFloat ();
        
        while ( continuar == 'S' || continuar == 's' ){
            Sistema . fora . println ( "\n================= MENU =================" );
            Sistema . fora . println ( " 1 - Temperatura: Celsius para Fahrenheit\n" );
            Sistema . fora . println ( " 2 - Temperatura: Fahrenheit para Celsius\n" );
            Sistema . fora . println ( " 3 - Moeda: Reais(R$) para Dólar(US$)\n" );
            Sistema . fora . println ( " 4 - Moeda: Dólar(US$) para Reais(R$)" );
            Sistema . fora . println ( "========================================\n" );
            Sistema . fora . print ( "Informe a opção que deseja: " );
        
            opcao = leitor . seguinte (). charAt ( 0 );
            
            switch ( opcao ){
                
                caso  '1' :
                    Sistema . fora . print ( "Informe a temperatura em ºCelsius: " );
                    tempCelsius = leitor . nextInt ();
                    tempFahrenheit = 1.8f * tempCelsius + 32 ;
                    Sistema . fora . println ( "\n==> Resultado: " + tempCelsius + "ºC equivale(m) a " + tempFahrenheit + "ºF." );
                    quebrar ;
                    
                caso  '2' :
                    Sistema . fora . print ( "Informe a temperatura em ºFahrenheit: " );
                    tempFahrenheit = leitor . nextInt ();
                    tempCelsius = ( tempFahrenheit - 32 ) /1.8f ;
                    Sistema . fora . println ( "\n==> Resultado: " + tempFahrenheit + "ºF equivale(m) a " + tempCelsius + "ºC." );
                    quebrar ;
                    
                caso  '3' :
                    Sistema . fora . print ( "Informe o valor em Reais(R$): " );
                    valorReais = leitor . próximoFloat ();
                    valorDolares = valorReais / cotacaoDolar ;
                    Sistema . fora . println ( "\n==> Resultado: R$ " + valorReais + " equivale(m) a US$ " + valorDolares +
                    "de acordo com a cotação informada." );
                    quebrar ;
                    
                caso  '4' :
                    Sistema . fora . print ( "Informe o valor em Dólares(US$): " );
                    valorDolares = leitor . próximoFloat ();
                    valorReais = valorDolares * cotacaoDolar ;
                    Sistema . fora . println ( "\n==> Resultado: US$ " + valorDolares + " equivale(m) a R$ " + valorReais +
                    "de acordo com a cotação informada." );
                    quebrar ;
                                        
                padrão :
                    Sistema . fora . println ( "\n==> Erro! Informe uma opção do menu..." );
                  
            }   // troca de fim
            Sistema . fora . print ( "\nfazer outra conversão? (S - sim / N - não): " );
            seguir = leitor . seguinte (). charAt ( 0 );
        }   // fim enquanto
        
        Sistema . fora . println ( "\nA uma boa viagem!\n" )