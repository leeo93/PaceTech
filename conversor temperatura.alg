algoritmo "semnome"
// Função :
// Autor :
// Data : 20/05/2022
// Seção de Declarações
var
celsius , fahrenheit :real
opcao:inteiro
inicio
// Seção de Comandos 
escreval("Bem Vindo Ao COnversor De Temperatura")
escreval(**)
escreval("Digite:   ")
escreval("1 para converter para Celsius")
escreval("2 para converter para Fahrenheit")
leia(opcao)

se ((opcao > 1) e (opcao < 7)) entao

escreval ("Foi")

fimse

se opcao = 1 entao
   escreval(**)
   escreval("digite a temperatura em Fahrenheit para ser convertida para Celsius")
   leia(fahrenheit)
   celsius <- (fahrenheit - 32) / 1.8
   escreval(**)
   escreval(fahrenheit, "f corresponde a", celsius, "c,")
   senao
   se opcao = 2 entao
   escreval(**)
   escreval("digite a temperatura em celsius para ser convertida para fahrenehit")
   leia(celsius)
   fahrenheit <- (celsius * 1.8) + 32
   escreval(**)
   escreval(celsius, "c corresponde a", fahrenheit, "f,")
senao
   escreval("opcao invalida")
   fimse
fimse
   

fimalgoritmo
