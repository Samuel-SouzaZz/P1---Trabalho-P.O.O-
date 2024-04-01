public class ControleDeBonificacoes{
   
   private double totalBonificacoesPagas;
   
   public ControleDeBonificacoes(){
   }
   
   public void registrarBonificacaoPaga(Funcionarios funcionarios){
      if (funcionarios instanceof Gerente){
          totalBonificacoesPagas += funcionarios.getSalario() * 0.6;
      } else {
           totalBonificacoesPagas += funcionarios.getSalario() * 0.3;
        }
   }

    public double getTotalDeBonificacoes() {
        return totalBonificacoesPagas;
    }
}
