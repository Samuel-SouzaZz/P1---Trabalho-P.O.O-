public class Main {
    public static void main(String[] args) {
    
    Funcionarios funcionario1 =  new Funcionarios("Gustavo","123.540.678-78",3000.00);
    Funcionarios funcionario2 =  new Funcionarios("Eduarda","123.800.698-38",3000.00);
    Gerente gerente = new Gerente("Carlos", "111.222.333-44", 5000.00, 5, "senha123");
   
   ControleDeBonificacoes controle = new ControleDeBonificacoes();
   controle.registrarBonificacaoPaga(funcionario1);
   controle.registrarBonificacaoPaga(funcionario2);
   controle.registrarBonificacaoPaga(gerente);

   System.out.println("Total de bonificações pagas: " + controle.getTotalDeBonificacoes());
   
    }
}