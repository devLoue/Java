package Casting;

public class Main {
    public static void main(String[] args) {
        // De int para double
        int valorInteiro = 3;
        double valorDouble = valorInteiro;
        System.out.println("valorInteiro: "+valorInteiro+" valorDouble: "+valorDouble);

        //De double para int
        double n3 = 3.3;
        int n4;
        n4 = (int)n3;
        System.out.println("n3: "+n3+" n4: "+n4);

        //De char para string
        char letra= 's';
        String palavra = String.valueOf(letra);
        System.out.println("String: "+palavra);

        //De string para char
        String s = "String";
        char c = s.charAt(0);
        System.out.println("Char: "+c);

        //De int para string
        String teste = String.valueOf(n4);
        System.out.println("Sim, isso é uma string"+teste);
    }

}
