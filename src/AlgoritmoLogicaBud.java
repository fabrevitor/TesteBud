import java.util.Scanner;

public class AlgoritmoLogicaBud{
    // Crie uma função que recebe um número qualquer e encontra
    // o maior número formado por dígitos consecutivos naquele número.

    //Exemplos de entrada e saída da função:
    // Entrada 1 --> 53590
    // Saída 1 --> 90

    // Entrada 2 --> 374030098567819
    // Saída 2 --> 5678

    // Entrada 3 --> 9012364509789
    // Saída 3 --> 90123

    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int num = 0;

        System.out.println("Digite o número:");
        String s = scan.nextLine();

        try{
            num = Integer.parseInt(s);
        } catch(Exception e){
            System.out.println("Não foi possível utilizar o valor digitado.");
        }

        System.out.println("Número digitado: " + num);

    }
}