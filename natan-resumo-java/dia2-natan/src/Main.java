import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // int[] valores = {10, 20, 15, 30, 40};
        // Arrays.sort(valores); mostra os valores do menor para o maior na sequencia.
        // System.out.println(Arrays.toString(valores));
        // System.out.println(valores.length);
        // length é o tamanho da Arrays

        // String[] cars = {"BMW", "Tesla", "Jeep", "Fiat"};
        // cars[2] = "Ferrari";
        // System.out.println(Arrays.toString(cars));
        // System.out.println(cars[2]);

        // String[][] cars = { {"BMW", "Tesla"}, {"Jeep", "Fiat"} };
        // System.out.println(Arrays.deepToString(cars));

        // quando quiser usar uma varial na qual o seu valor nao se altere, transforme a
        // variavel numa constante.
        // final double taxaJuros = 11.92;
        // System.out.println(taxaJuros);
        // // taxaJuros = 11.52;
        // System.out.println(taxaJuros);

        // int a = 2 + 2;
        // int b = 2 - 2;
        // int c = 2 * 2;
        // double d = (double)4 / (double)3;
        // System.out.println(a);
        // System.out.println(b);
        // System.out.println(c);
        // System.out.println(d);
        // int e = 4;
        // // e++; aumenta +1
        // e--; diminui -1
        // System.out.println(e);

        // String valorProduto = "10";
        // int valorTotal = Integer.parseInt(valorProduto) + 2; transformando uma String
        // em um Integer.
        // System.out.println(valorTotal);

        // double value = Math.round(10.5);
        // System.out.println(value);
        // Math.round ele arredonda para cima ou para baixo
        // Math.ceil arredonda para cima
        // Math.floor arredonda para baixo
        // Math.random da numeros aleatorios.
        // int value = (int)Math.round(Math.random() * 100);
        // System.out.println(value);

        int[] my_array1 = {
                1789, 2035, 1899, 1456, 2013,
                1458, 2458, 1254, 1472, 2365,
                1456, 2165, 1457, 2456 };
                System.out.println("Array 1 - Original:" + Arrays.toString(my_array1));
                 Arrays.sort(my_array1);
        System.out.println("Array em ordem:" + Arrays.toString(my_array1));

        String[] my_array2 = {
                "Java",
                "Python",
                "PHP",
                "C#",
                "C Programming",
                "C++"
        };
// System.out.println("Array 2 - Original:" + Arrays.toString(my_array2));
//         Arrays.sort(my_array2);
//        System.out.println("Array em ordem:" + Arrays.toString(my_array2));

System.out.println("Array 2 - Original:" + Arrays.toString(my_array2));
                 Arrays.sort(my_array2);
        System.out.println("Array 2 em ordem:" + Arrays.toString(my_array2));

    }
}
