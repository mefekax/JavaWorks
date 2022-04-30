package JavaTrainingGoesOn2;

import java.util.Scanner;

public class Class9_TernarySwitch {

    public static void main(String[] args) {

        //kullanıcıdan tam sayı al
        //tek çift yazdır

        Scanner scan=new Scanner(System.in);
        System.out.println("bir tamsayı giriniz");
        int sayi=scan.nextInt();

        /*
        if (sayi%2==0) {
            System.out.println("sayı çift");
        } else System.out.println("sayı tek");
        */

        //ternary biçimi
        //System.out.println(sayi%2==0? "sayı çift" : "sayı tek");


        //String sonuc=sayi>99?" sayı 3 basamaklı ya da daha büyük" : "sayı negatif ya da 3 basamaktan küçük";
        //System.out.println("girdiğiniz sayının analizi: "+ sonuc);


        //verilen sayının pozitif mi negatif mi olduğuna bakıp
        //0 ya da pozitif ise tek veya çift
        //negatif ise -100den büyük ya da küçük yardırın
        //System.out.println(sayi<0?(sayi<-100?"-100den küçük":"-100den büyük"):(sayi%2==0?"sayı çift": "sayı tek") );

        //ternary sonuçlar farklı data türleri ise sadece print edilir
        //System.out.println(sayi>100?"sayının karesi"+sayi*sayi : "sayı 100den büyük olmalı");

        /*
        switch (sayi) {
            case 1:
                System.out.println("sayı 1");
                break;
            case 2:
                System.out.println("sayı 2");
                break;
            default:
                System.out.println("hiçbiri");
        }
        */













    }
}
