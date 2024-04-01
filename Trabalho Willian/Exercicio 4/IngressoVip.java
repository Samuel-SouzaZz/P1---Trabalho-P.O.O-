public class IngressoVip extends Ingresso {

   private int valorAdicional;

   public IngressoVip() {
   }

    public IngressoVip(int valorAdicional, int valor) {
        super(valor);
        this.valorAdicional = valorAdicional;
    }   
   public int getValorAdicional(){
   
      return valorAdicional;
   
   }
   
   public void setValorAdicional(int valorAdicional){
   
      this.valorAdicional = valorAdicional;
   
   }
   
   public int valorIngressoVip(){
   
      return super.getValor() + valorAdicional; 
      
   }
   
}