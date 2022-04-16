import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*char mychar='a';
        System.out.println("Hello world!");
        System.out.println(mychar);
        System.out.println(5+4+3);
        */
        Scanner gir=new Scanner(System.in);

        /*System.out.println("enter a number: ");
        int num=gir.nextInt();
        System.out.println("twice the "+num+" is "+(2*num));
        System.out.println("increase number by.."+(--num));
        num-=2;
        System.out.println("number now "+(num));
        num *= 3;
        System.out.println("number now "+(num));
        */

        /*System.out.println(" basamak toplamı bulunacak sayı: ");
        int num=gir.nextInt();
        int rakam=0;
        int basamak=0;

        rakam=num%10;//654ün 4ü

        basamak+=rakam;

        num/=10;
        rakam=num%10;
        basamak+=rakam;

        num/=10;
        basamak+=num;
        System.out.println(basamak);
        */

        String a="Hello";
        int b=2;
        int c=3;
        System.out.println(b+c+a);

        if (c>b) {
            System.out.println(c+b);
            }
        if (c==b) {
            System.out.println(b*c);
        }

    }
}