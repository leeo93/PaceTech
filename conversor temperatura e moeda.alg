algoritmo "Conversor Temperatura e Moeda"
var
TCelsius, TFahrenheit, Cotacao, Reais, Dolar :real
OpcaoMenu, Opcaotemperatura, OpcaoCotacao, Sair: inteiro



inicio
enquanto Opcaomenu <> 3 faca
escreval("Escolher a opção para conversão")
escreval(" 1- Para Conversor Temperatura")
escreval(" 2- Para Converter Moeda")
escreval(" 3- Para Sair")
leia(OpcaoMenu)
limpatela
  se OpcaoMenu = 1 entao
  escreval("Escola Conversão")
  escreval(" 1- Celsius para Fahrenheit ")
  escreval(" 2- Fahrenheit para Celsius")
  leia(OpcaoTemperatura)
limpatela
   se OpcaoTemperatura = 1 entao
   escreval("Digite a Temperatura Cº")
   leia (TCelsius)
   TFahrenheit <- (TCelsius * 1.8) + 32
   escreval("A temperatura em Fahrenheit é:",TFahrenheit:1:1, "º")
  senao
    se OpcaoTemperatura = 2 entao
    escreval("Digite a Temperatura Fº")
    leia (TFahrenheit)
    TCelsius <-(TFahrenheit-32)/1.8
    escreval("A temperatura em Celsius é:",TCelsius:1:1, "º")
    fimse
   fimse
senao
   se OpcaoMenu = 2 entao
   escreval("Escola a Conversão")
   escreval(" 1-Real para Dólar")
   escreval(" 2-Dólar para Real")
   leia (OpcaoCotacao)
limpatela
    escreval("Escreva cotação do Dólar hoje ")
    leia (Cotacao)
     se OpcaoCotacao = 1 entao
     escreval("Quantos Reais você tem?")
     leia (Reais)
     Dolar <- Reais / Cotacao
    escreval("Você tem ","U$", Dolar:1:2)
   senao
     se OpcaoCotacao = 2 entao
     escreval("Quantos Dólar você tem ?")
     leia (Dolar)
     Reais <- Dolar * Cotacao
     escreval("Você tem ","R$", Reais:1:2)
   fimse
   fimse
   fimse
fimse
fimenquanto
fimalgoritmo
