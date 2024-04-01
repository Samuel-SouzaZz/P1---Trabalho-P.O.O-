import java.util.ArrayList;
import java.util.List;

public class Pedido{
 
  /*Variáveis*/
  private int numeroPedido;
  private double valorTotalPedido;
  private List<ItemPedido> itensPedido;
  /*FIM Variáveis*/
  
  /*Contrutor*/ 
  public Pedido(int numeroPedido) {
   this.numeroPedido = numeroPedido;
   this.itensPedido = new ArrayList<>();
  }
  /*FIM Contrutor*/
  
  /*Metodos*/  
  public void registrarItemPedido(ItemPedido itemPedido) {
    itensPedido.add(itemPedido);
    valorTotalPedido += itemPedido.calcularTotal();
  }
    
  public double getValorTotalPedido() {
  
    return valorTotalPedido;
    
  }
  /*FIM Metodos*/
}