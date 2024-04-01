//3) Crie uma classe chamada ManipulacaoString e implemente métodos estáticos para as seguintes
//operações de manipulação de strings:
//- Um método para contar o número de vogais em uma string.
//- Um método para inverter uma string.
//- Um método para verificar se uma string é um palíndromo (ou seja, se ela é igual quando lida de trás
//para frente).
// classe principal (main), solicite ao usuário que insira uma string. Use os métodos estáticos da classe
//ManipulacaoString para realizar as operações desejadas e exiba os resultados.
//Exemplo do programa em execução:
//Manipulação de Strings
//--------------------------------
//Digite uma string: radar
//Número de vogais na string: 2
//String invertida: radar
//É um palíndromo? Sim

public class ManipulacaoString {

    public static boolean verificarPalindromo(String texto) {
      
       String textoInvertido = inverterString(texto);
       return texto.equalsIgnoreCase(textoInvertido);
       
    }
    
    public static int contarVogais(String texto) {
       
       int contador = 0;
       for (char letra : texto.toLowerCase().toCharArray()) {
            if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
                contador++;
            }
       }
        return contador;
    }

   
    public static String inverterString(String texto) {
        
        StringBuilder reverso = new StringBuilder();
        for (int i = texto.length() - 1; i >= 0; i--) {
        
            reverso.append(texto.charAt(i));
            
        }
        
        return reverso.toString();
        
    }

    
 
}
