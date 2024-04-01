public class ProdutoFisico extends ItemPedido{
   /*Variáveis*/
    private double peso;
    /*Variáveis*/
    
    /*Contrutor*/ 
    public ProdutoFisico(){
    super("","",0.0,0);
    }
    
    public ProdutoFisico(String codigoDoProduto, String descricao, double precoUnitario, int quantidade, double peso) {
    
        super(codigoDoProduto, descricao, precoUnitario, quantidade);
        this.peso = peso;
        
    }
    /*Contrutor*/ 
    
}