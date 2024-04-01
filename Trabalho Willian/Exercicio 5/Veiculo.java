//5) Crie uma classe chamada Veiculo e defina os atributos comuns a todos os veículos, como marca,
//modelo, ano e preço. Implemente métodos na classe Veiculo, como exibirInformacoes() para exibir
//informações sobre o veículo.
//Crie as seguintes subclasses de Veiculo: Carro e Moto para representar diferentes tipos de veículos.
//Adicione atributos específicos a cada subclasse, como numPortas para Carro e cilindradas para Moto.
//Implemente o método exibirInformacoes() nas subclasses para exibir informações específicas de cada tipo
//de veículo.
//Na classe principal (main), crie instâncias de diferentes tipos de veículos e exiba os detalhes de cada
//veículo cadastrado.
//Exemplo do programa em execução:
//Informações dos Veículos:
//-----------------------------------
//Veículo: Volkswagen Gol
//Ano: 2020
//Preço: R$ 45000.00
//Número de Portas: 4
//Veículo: Honda CG 125
//Ano: 2019
//Preço: R$ 8000.00
//Cilindradas: 125
public class Veiculo{
   /*Variáveis*/
   private String marca;
   private String modelo;
   private int ano;
   private double preco;
   /*Fim Variáveis*/
   
   /*Contrutor*/
   public Veiculo(){
   
   }
   
   public Veiculo(String marca, String modelo, int ano, double preco){
   
      this.marca = marca;
      this.modelo = modelo;
      this.ano = ano;
      this.preco = preco;
      
   }
   /*Fim Contrutor*/
   
   /*Getter e Setter*/
   public String getMarca(){
   
      return marca;
      
   }
   public void setMarca(String marca){
   
      this.marca = marca;
      
   }
   public String getModelo(){
   
      return modelo;
      
   }
   public void setModelo(String modelo){
   
      this.modelo = modelo;
      
   }
   public int getAno(){
   
      return ano;
      
   }
   public void setAno(int ano){
   
      this.ano = ano;
      
   }
   public double getPreco(){
   
      return preco;
      
   }
   public void setPreco(int preco){
   
      this.preco = preco;
      
   }
   /*Fim Getter e Setter*/
   
   /*Metodos*/
   
   public void exibirInformacoes(){
   
      System.out.println("Marca:" + getMarca());
      System.out.println("Modelo:" + getModelo());
      System.out.println("Ano da Moto:" + getAno());
      System.out.println("Preco da moto:" + getPreco());
   
   }
   
   
   /*Fim Metodos*/
   
 
}