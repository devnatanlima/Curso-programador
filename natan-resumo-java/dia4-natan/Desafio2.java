public class Desafio2 {
    public static void main(String[] args) {
        /* String frase = "HELLO MUNDO";
        for(i=0; i<= frase.length() -1; i++)
        System.ou.print(frase.charAT(i) + " ")
        System.out.println("H " + "E " + "L " + "L " + "O      " + "W " + "O " + "R " + "D "); */

        // A forma abaixo é a do professor
        String spaces = "hello word";
        for(int i = 0; i <= spaces.length() -1; i++ )
        System.out.print(spaces.charAt(i) + " ");
        
        //o charAT pega cada caracters de um por um do spaces e passa pro i, lembrando que o length tambem conta o espaço como sendo 1 caracters, por isso que usa-se o -1 para subtrair o caracters referente ao espaço.

    }
    
}
