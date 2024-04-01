//1) Crie a classe Funcionario com os atributos nome, cpf e salario. Em seguida crie a classe Gerente que
//deverá ser uma subclasse da classe Funcionario, com os atributos adicionais
//quantidadeFuncionariosGerenciados e senha.
//Os funcionários recebem uma bonificação no final do ano, que será de 30% para funcionários comuns, e de
//60% para gerentes. O valor da bonificação será o percentual aplicado sobre o valor do salário.
//Crie uma classe chamada ControleDeBonificacoes, ela não deverá herdar nenhuma classe. Ela deverá
//conter o atributo totalDeBonificacoes, o método registrarBonificacaoPaga, que deverá registrar o valor
//de bonificação paga a cada funcionário (ver exemplo da conta), e o método getTotalDeBonificacoes.
//As classes Funcionario e Gerente deverão ter ter um construtor padrão e um construtor parametrizado.
//Crie uma classe chamada Programa com um método main, e dentro do programa crie duas instâncias da
//classe Funcionario e uma instância da classe Gerente, em seguida preencha os atributos dessas classes.
//Na sequência crie uma instância da classe ControleDeBonificacoes, e chame o método
//registrarBonificacaoPaga passando as classes como parâmetro, e finalmente exiba o valor total de
//bonificações pagas a todos os funcionários.

public class Funcionarios {

  private String nome;
  private String cpf;
  private double salario;

 public Funcionarios(){
 }

 public Funcionarios(String nome, String cpf, double salario){
    this.nome = nome;
    this.cpf = cpf;
    this.salario = salario;
 }

 public String getNome(){
    return nome;
 }

 public void setNome(String nome){
    this.nome = nome;
 }

 public String getCpf() {
    return cpf;
 }

 public void setCpf(String cpf) {
    this.cpf = cpf;
 }

public double getSalario() {
    return salario;
}

public void setSalario(double salario) {
    this.salario = salario;
}


}