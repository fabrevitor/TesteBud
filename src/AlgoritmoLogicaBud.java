import java.util.Scanner;

public class AlgoritmoLogicaBud{
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
