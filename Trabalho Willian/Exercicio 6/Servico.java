public class Servico extends ItemPedido{
   /*Variáveis*/
   private int tempoDuracaoServico;
   /*FIM Variáveis*/
   
   /*Contrutor*/ 
    public Servico(){
    super("","",0.0,0);
    }
    
    public Servico(String codigoProduto, String descricao, double precoUnitario, int quantidade, int tempoDuracaoServico) {
    
        super(codigoProduto, descricao, precoUnitario, quantidade);
        this.tempoDuracaoServico = tempoDuracaoServico;
        
    }
    /*FIM Contrutor*/
}