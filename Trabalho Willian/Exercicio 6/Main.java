public class Main {
    
    public static void main(String[] args) {
       
        
        ProdutoFisico produto1 = new ProdutoFisico("001", "Jaqueta", 29.99, 2, 0.2);
        ProdutoFisico produto2 = new ProdutoFisico("002", "Coeca", 79.99, 1, 0.5);
        Servico servico1 = new Servico("003", "Pote de sorvete", 100.0, 1, 2);
        
        
        Pedido pedido = new Pedido(123);
        
        
        pedido.registrarItemPedido(produto1);
        pedido.registrarItemPedido(produto2);
        pedido.registrarItemPedido(servico1);
        
        
        System.out.println("Valor total do pedido: R$" + pedido.getValorTotalPedido());
        
    }
}
