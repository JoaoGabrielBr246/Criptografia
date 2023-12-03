package application;

import java.util.*;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite uma frase: ");
        String text = sc.nextLine();

        byte[] bytes = text.getBytes();

        Base64.Encoder encoder = Base64.getEncoder();

        String crypto = encoder.encodeToString(bytes);


        if (text.length() < 5) {
            System.out.println("Digite algo maior que 5 caracteres");

        }else{
            System.out.println(crypto);
        }



        sc.close();
    }
}
