public class Programa {

    public static void main(String[] args) {
       
       
        double percentual = Calculadora.calcularPercentual(679.00, 6);
        System.out.println("6% de 679.00 é: " + percentual);

        
        double valorCalculado = Calculadora.calcularRegraDeTres(100, 200, 50);
        System.out.println("Regra de tres dos numeros 100, 200, 50 é: " + valorCalculado);
        
    }
}