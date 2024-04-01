public class Moto extends Veiculo{
   
   /*Variáveis*/
   private int cilindradas;
   /*Variáveis*/
   
   /*Contrutor*/
   public Moto(){
   }
   
   public Moto(String marca, String modelo, int ano, double preco, int cilindradas){
      
      super(marca,modelo,ano,preco);
      this.cilindradas = cilindradas;
   }
   public Moto(int cilindradas){
      
      this.cilindradas = cilindradas;
      
   }
   /* FIM Contrutor*/
   
   /*Getter e Setter*/
   
   public void setCilindradas(int cilindradas){
   
      this.cilindradas = cilindradas;
      
   }
   
   public int getCilindradas(){
   
      return cilindradas;
   
   }
   /*FIM Getter e Setter*/
   
   /*Metodos*/
   @Override
   public void exibirInformacoes(){
   
      super.exibirInformacoes();
      System.out.println("Cilindradas:" + cilindradas);
   }
   /*Metodos*/
   

}