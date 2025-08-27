package desafios;

import java.util.Scanner;

import static java.lang.Math.abs;

public class Solucao1013 {
    public static void main(String[] args) {

        int a, b, c;
         Scanner input = new Scanner(System.in);

         a = input.nextInt();
         b = input.nextInt();
         c = input.nextInt();

         System.out.println("O maior número é " + retornaMaiorEntreTresNumeros(a, b, c));

    }

    public static int retornaMaiorEntreTresNumeros(int a, int b, int c){
        int maiorEntreDois = (a+b + abs(a-b))/2;
        int maiorDeTodos;

        if (c > maiorEntreDois){
            maiorDeTodos = c;
        }
        else{
            maiorDeTodos = maiorEntreDois;
        }
        return maiorDeTodos;
    }

}
