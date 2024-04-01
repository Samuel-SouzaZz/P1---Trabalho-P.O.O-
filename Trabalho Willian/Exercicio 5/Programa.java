public class Programa{

   public static void main(String[] args) {
   
      Carro carro = new Carro("Volkswagen","Gol", 2020, 45000.00, 4);
      Moto moto = new Moto("Honda","CG 125", 2019, 8000.00, 125);
      
      carro.exibirInformacoes();
      moto.exibirInformacoes();
      
      
   }
}