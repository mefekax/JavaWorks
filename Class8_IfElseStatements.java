package JavaTrainingGoesOn2;

import java.util.Scanner;

public class Class8_IfElseStatements {

    public static void main(String[] args) {
            /*
            int a=10;
            int b=20;
            if(a<b && b<100) {
                System.out.println("isteğiniz gerçekleşecektir..");
            }

            if (a>0) System.out.println("süslü parantez olmazsa bir satır çalışır");

            System.out.println("bu satır koşula bağlı olmaksızın çalışır");
            */


            Scanner scan=new Scanner(System.in);


            //girilen sayının tek çift olduğunu yazdıran
        /*
        System.out.println("bir tamsayı giriniz: ");
        int sayi=scan.nextInt();
        if (sayi%2==0) System.out.println("sayı çifttir");
        else System.out.println("sayı tektir");
        */


        /*
        System.out.println("gün adı girin: ");
        String gun=scan.next().toLowerCase();
        if (gun.equals("pazar")) System.out.println("haftasonu");
        */
        /*
        System.out.println("gün ismini girin: ");
        String gun=scan.next().toLowerCase();
        if(gun.equals("pazar") || gun.equals("cumartesi")) {
            System.out.println("haftasonu");
            }
        else if(gun.equals("pazartesi") || gun.equals("salı") || gun.equals("çarşamba") || gun.equals("perşembe") || gun.equals("cuma")) {
            System.out.println("haftaiçi");
        }
        else System.out.println("yanlış giriş yaptın!");
        */

        /*
        //girilen bir karakterin harf olup olmadığını kontrol et
        System.out.println("bir karakter girin: ");
        char karakter=scan.next().charAt(0);
        if ((karakter>='A' && karakter<='Z') || (karakter>='a' && karakter<='z')){
            System.out.println("girilen bir harftir.");
        } else System.out.println("girilen bir harf değildir.");
        //ASCII kodları içerisindeki a-z harfler ingilizce, türkçeler olmuyor
        */
        //Character.isLetter(karakter);


        /*
        System.out.println("100 üzerinden notunuzu giriniz:");
        double GPA=scan.nextDouble();
        /*
        if (GPA<0 || GPA>100) {
            System.out.println("hatalı not");
        }else if (GPA<50) System.out.println("notunuz D");
        else if (GPA>=50 && GPA<60) System.out.println("notunuz C");
        else if (GPA>=60 && GPA<80) System.out.println("notunuz B");
        else System.out.println("notunuz A");
        */

        /*
        //yukarıdaki kodun revize edilmiş hali
        //bazı kontoller gereksiz
        if (GPA<0 || GPA>100) {
            System.out.println("hatalı not");
        }else if (GPA<50) System.out.println("notunuz D");
        else if (GPA<60) System.out.println("notunuz C");
        else if (GPA<80) System.out.println("notunuz B");
        else System.out.println("notunuz A");
        */

        /*
        System.out.println("lütfen iki sayı giriniz: ");
        double num1=scan.nextDouble();
        double num2=scan.nextDouble();

        if (num1>0 && num2>0) {
            System.out.println("pozitif iki sayının toplamı:"+(num1+num2));
        } else
            if (num1<0 && num2<0) {
                System.out.println("negatif iki sayının çarpımı: "+(num1*num2));
            } else
                if (num1*num2<0) {
                    System.out.println("sayılar farklı işaretli");
                }
                else System.out.println("sıfır yutan elemandır");
        */

        //Nested Ifs

        //çalışan kadınsa 60 yaşından büyük olduğunda emekli olabilir
        //çalışan erkekse 65 yaşından büyük olduğunda emekli olabilir
        /*
        System.out.println("cinsiyetiniz: "+ "\nkadın için K, \nerkek için E");
        char cins=scan.next().toUpperCase().charAt(0);
        System.out.println("yaşınızı giriniz: ");
        int yas=scan.nextInt();

        if (cins=='K') {
            if (yas<0 || yas >120) {
                System.out.println("hatalı yaş girildi");
            } else if (yas<60) {
                System.out.println("emekli olmana "+(60-yas)+" yıl var");
            } else System.out.println("tebrikler! emekli olabilirsin");
        }
        else if (cins=='E') {
            if (yas<0 || yas>120) {
                System.out.println("hatalı yaş girildi");
            } else if (yas<65) {
                System.out.println("emekli olmana "+(65-yas)+" yıl var");
            } else System.out.println("tebrikler! emekli olabilirsin");
        }
        else {
            System.out.println("geçerli bilgi giriniz: ");
        }
        */

        System.out.println("4 basamaklı pozitif bir tamsayı giriniz: ");
        int num=scan.nextInt();

        if (num<1000 || num>9999) {
            System.out.println("sayı 4 basamaklı olmalı");
        }
        else if (num%5==0) {
            if (num%2==0) {
                System.out.println("5e bölünen çift sayı");
            }
            else {
                System.out.println("5e bölünen tek sayı");
            }
        }
        else {
            System.out.println("tekrar deneyin");
        }








    }
}
