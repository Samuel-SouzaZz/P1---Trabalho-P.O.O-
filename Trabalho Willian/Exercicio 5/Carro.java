public class Carro extends Veiculo{
   
   /*Variáveis*/
   private int numeroDePortas;
   /*Variáveis*/
   
   /*Contrutor*/
   public Carro(){
   }
   
   public Carro(String marca, String modelo, int ano, double preco, int numeroDePortas){
      
      super(marca,modelo,ano,preco);
      this.numeroDePortas = numeroDePortas;
   }
   public Carro(int numeroDePortas){
      
      this.numeroDePortas = numeroDePortas;
      
   }
   /* FIM Contrutor*/
   
   /*Getter e Setter*/
   
   public void setNumeroDePortas(int numeroDePortas){
   
      this.numeroDePortas = numeroDePortas;
      
   }
   
   public int getNumeroDePortas(){
   
      return numeroDePortas;
   
   }
   /*FIM Getter e Setter*/
   
   /*Metodos*/
   @Override
   public void exibirInformacoes(){
   
      super.exibirInformacoes();
      System.out.println("Numero de Portas:" + numeroDePortas);
      
   }
   /*Metodos*/
   
   
}