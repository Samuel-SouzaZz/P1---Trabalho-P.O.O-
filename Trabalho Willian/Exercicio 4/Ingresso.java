//4) Crie uma classe chamada Ingresso que possua os atributos número, data de validade e valor, e um
//método que retorne o valor do ingresso.
//Crie uma classe IngressoVIP, que herda de Ingresso e possui um atributo ValorAdicional. O método para
//retornar o valor da classe IngressoVIP deve considerar que o valor do ingresso é o valor da superclasse
//somado ao valor adicional do IngressoVIP.
//Na classe principal (main), solicite ao usuário para informar o tipo de ingresso que ele deseja comprar e
//exiba os resultados.

public class Ingresso {

 private int numero;
 private String dataValidade;
 private int valor;
 
 public Ingresso(){
 
 
 }
 public Ingresso(int valor){
   this.valor = valor;
 }
 
 public Ingresso(int numero, String dataValidade, int valor){
 
   this.numero = numero;
   this.dataValidade = dataValidade;
   this.valor = valor;
   
 }
 
 public int getNumero(){
   
   return numero;
   
 }
 
 public void setNumero(int numero){
 
   this.numero = numero;
 
 }
 
 public String getdataValidade(){
   
   return dataValidade;
   
 }
 
 public void setDatavaValidade(String dataValidade){
 
   this.dataValidade = dataValidade;
 
 }
 
 public int getValor(){
   
   return valor;
   
 }
 
 public void setvalor(int valor){
 
   this.valor = valor;
 
 }
}