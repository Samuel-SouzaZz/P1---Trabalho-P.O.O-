//2) Crie uma classe chamada Calculadora que contenha os seguintes métodos estáticos:
//calcularPercentual: Esse método deverá calcular a porcentagem de um valor em relação a outro. Ex: 5%
//de 750.00.
//calcularRegraDeTres: Método para calcular a regra de três. Deverá ser passado como parâmetro o valor1,
//valor2 e o valor de referência.
//Crie uma classe chamada Programa com um método main,e dentro do programa você deverá chamar os
//métodos e exibir o valor dos cálculos.

public class Calculadora{
 //variaveis.
 private double resultado;
 private double valor1;
 private double valor2;
 private double valorReferencial;
 
 //metodo construtor.
 public Calculadora(){
 }
 public Calculadora(double valor1, double valor2, double valorReferencial, double resultado){
   
   this.valor1 = valor1;
   this.valor2 = valor2;
   this.valorReferencial = valorReferencial;
   this.resultado = resultado;
   
 }
//gett e setters.
 public double getValor1(){
 
   return valor1;
   
 }
 
 public void setValor1(double valor1){
 
   this.valor1 = valor1;
    
 }
 
 public double getValor2(){
 
   return valor2;
   
 }
 
 public void setValor2(double valor1){
 
   this.valor2 = valor2;
    
 }  
 
 public double getValorReferencial(){
 
   return valorReferencial;
   
 }
 
 public void setValorReferencial(double valorReferencial){
 
   this.valorReferencial = valorReferencial;
    
 }
 
 public double getResultado(){
 
   return resultado;
   
 }
 
 public void setResultado (double resultado){
 
   this.resultado = resultado;
    
 }  
 
 //fim gett e setters.
 
 // Metodos
  
 public static double calcularPercentual(double valor1, double valor2){
 
   return valor1 * (valor2 / 100);
 
 }
 public static double calcularRegraDeTres(double valor1, double valor2, double valorReferencial){
 
   return (valor2 * valorReferencial) / valor1;
 
 }

 
 
 
 
 
}
