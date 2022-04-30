package JavaTrainingGoesOn2;

import java.util.Scanner;

public class ThirdClass {

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("4 basamaklı bir sayı girin: ");
        int sayi=scan.nextInt();//kullanıcıdan sayı al

        int rakam=0;
        int rakamlarTop=0;

        //1. adım rakam=0 rakamlarTop=0 sayi=7532
        rakam=sayi%10;//2
        rakamlarTop+=rakam;//2
        sayi/=10;//753

        //2. adım rakam=2 rakamlarTop=2 sayi=753
        rakam=sayi%10;//3
        rakamlarTop+=rakam;//5
        sayi/=10;//75

        //3.adım rakam=3 rakamlarTop=5 sayi=75
        rakam=sayi%10;//5
        rakamlarTop+=rakam;//10
        sayi/=10;//7

        //4.adım rakam=5 rakamlarTop=10 sayi=7
        rakam=sayi%10;//7
        rakamlarTop+=rakam;//17
        sayi/=10;//0.7 --> 0

        System.out.println("rakamlar toplamı: "+rakamlarTop);

    }
}
