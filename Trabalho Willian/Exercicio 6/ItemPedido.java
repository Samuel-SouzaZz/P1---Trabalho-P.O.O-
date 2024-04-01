//6) Crie uma classe chamada ItemPedido e defina os atributos comuns a todos os itens de pedido, como
//código do produto, descrição, preço unitário e quantidade.
//Implemente o método calcularTotal() na classe ItemPedido para calcular o total de um item de pedido.
//Crie as seguintes subclasses de ItemPedido: ProdutoFisico e Servico para representar diferentes tipos de
//ItemPedido.
//Adicione atributos específicos a cada subclasse, como peso para ProdutoFisico e tempoDuracaoServico
//para Servico.
//Crie uma classe chamada Pedido que deverá conter o atributo numeroPedido e valorTotalPedido, além
//do método registrarItemPedido, que deverá registrar o valor total de cada item do pedido (ver exemplo da
//conta), e o método getValorTotalPedido.
//Chame o método registrarItemPedido passando os objetos de ItemPedido como parâmetro, e finalmente
//exiba o valor total do pedido
public class ItemPedido{
   /*Variáveis*/
   private String codigoDoProduto;
   private String descricao;
   private double precoUnitario;
   private int quantidade;
   /*FIM Variáveis*/
   
   /*Contrutor*/
   public ItemPedido(String codigoDoProduto, String descricao, double precoUnitario, int quantidade){
   
      this.codigoDoProduto = codigoDoProduto;
      this.descricao = descricao;
      this.precoUnitario = precoUnitario;
      this.quantidade = quantidade;
      
   }
   
   public ItemPedido(double precoUnitario, int quantidade){
   
      this.precoUnitario = precoUnitario;
      this.quantidade = quantidade;
      
   }
   
   /*FIM Contrutor*/
  
   /*Getters e Setters*/
   public String getCodigoDoProduto() {
        return codigoDoProduto;
    }

    public void setCodigoDoProduto(String codigoDoProduto) {
        this.codigoDoProduto = codigoDoProduto;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPrecoUnitario() {
        return precoUnitario;
    }

    public void setPrecoUnitario(double precoUnitario) {
        this.precoUnitario = precoUnitario;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    /*FIM Getters e Setters*/
    
    /*Metodos*/
    public double  calcularTotal(){
    
    return precoUnitario * quantidade;
    
    }
    /*FIM Metodos*/
   
}