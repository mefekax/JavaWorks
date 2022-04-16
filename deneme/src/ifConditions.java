import java.util.Scanner;

public class ifConditions {
    public static void main(String[] args) {
        Scanner gir=new Scanner(System.in);

       /* int num1=200;
        int num2=25;

        if (num1>num2) {
            System.out.println("Sayı1 sayı2den büyük");

        }

        if (num1>100) {
            System.out.println("sayı1 100den büyük");
        }

        if (num1*num2>500) {
            System.out.println("sayıların çarpımı 500den büyük");
        }
        */

        /*
        System.out.println("Haftanın günlerinden birinin baş harfini gir:");
        char ilkHarf=gir.next().charAt(0);

        if (ilkHarf=='p' || ilkHarf=='P') {
            System.out.println("Pazartesi, Perşembe, Pazar");
        }

        if (ilkHarf=='s' || ilkHarf=='S') {
            System.out.println("Salı");
        }

        if (ilkHarf=='c' || ilkHarf=='C') {
            System.out.println("Cuma, Cumartesi");
        }

        if (ilkHarf=='ç' || ilkHarf=='Ç') {
            System.out.println("Çarşamba");
        }
        System.out.println();
        */

        System.out.println("gün ismi: ");
        String gun=gir.next();

        if (gun.equalsIgnoreCase("pazartesi") || gun.equalsIgnoreCase("salı")) {
            System.out.println("...haftaiçi...");
        }

        if (gun.equalsIgnoreCase("cumartesi") || gun.equalsIgnoreCase("pazar")) {
            System.out.println("...haftasonu...");
        }








        /*
        if (num%2==0) {
            System.out.println("even number");
        }
        if (num%2!=0) {
            System.out.println("odd number");
        }
        */
















    }
}
