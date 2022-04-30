package JavaTrainingGoesOn2;

import java.util.Scanner;

public class Class11_StringOps {

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        /*
        //kullanıcıdan bir cümle ve kelime isteyip
        //girilen kelime cümlede yoksa cümlede yok
        //cümlede 1 kezkullanılmış ise 1 kez geçiyor
        //cümlede 1den fazla geçiyorsa 1den çok geçiyor
        //yazdır
        System.out.println("Bir cümle giriniz: ");
        String cumle=scan.nextLine();
        System.out.print("Bir de kelime giriniz: ");
        String kelime=scan.next();

        int ilk=cumle.indexOf(kelime);
        int ikinci=cumle.indexOf(kelime, ilk+1);


        if (ilk==-1) {
            System.out.println(kelime+" bu cümlede yok.");
        } else if (ikinci==-1) {
            System.out.println(kelime+" bu cümlede 1 kez geçiyor.");
        } else {
            System.out.println(kelime+" bu cümlede 1den fazla geçiyor.");
        }
        System.out.println(cumle.indexOf(kelime));
        System.out.println(cumle.indexOf(kelime,5));//kelimenin belirli indextensonraki yeri
        System.out.println(cumle.lastIndexOf(kelime));//kelimenin geçtiği son index, arama sondan başlar

        */

        /*
        //lastIndexOf ile yapılmış benzer bir program
        String cumle="Java öğren, yeni program ile yeni bir sayfa aç.";
        String kelime="java";
        int ilkIndex=cumle.toLowerCase().indexOf(kelime);
        int sonIndex=cumle.toLowerCase().lastIndexOf(kelime);

        if (ilkIndex==-1) System.out.println("kelime bulunamadı");
        else if (ilkIndex==sonIndex) System.out.println("kelime bir kez kullanılmış");
        else System.out.println("kelime birden fazla kullanılmış");
        */

        //String str="Eclipse";
        //System.out.println(str.lastIndexOf("p",0));
        //bir indexten itibaren başa doğru aratıyor, index dahil oluyor


        //contains() *****
        //string içinde string arar, boolean döndürür

        //String cumle="Java öğren, yeni program ile yeni bir sayfa aç.";
        //String kelime="ileti";
        //if (cumle.toLowerCase().contains(kelime)) {
        //    System.out.println("kelime bulundu");
        //} else System.out.println("kelime bulunamadı");
        /*
        System.out.println("e-posta giriniz");
        String eposta=scan.next();
        if (eposta.toLowerCase().contains("@gmail.com")) {
            System.out.println("e-posta kaydedildi");
        } else System.out.println("e-posta yazımı hatalı");
        */
        /*
        //yukarıdaki programın farklı versiyonu
        String email="hacievhat@mail.com";
        String aranan="@gmail.com";
        if (!email.toLowerCase().contains(aranan)){
            System.out.println("gmail agresi girin");
        } else if (email.lastIndexOf(aranan)==(email.length()-aranan.length())) {
            System.out.println("e-mail kaydedildi");
        } else System.out.println("yazım hatası");
        */

        /*
        //endsWith()
        //string ifadenin bir string/karakter ile bitip bitmediğini boolean döndürür
        String email="hacievhat@gmail.com";
        String aranan="@gmail.com";
        if (!email.contains(aranan)) {
            System.out.println("gmail adresi girin");
        }
        else if (email.endsWith(aranan)) System.out.println("e-mail kaydedildi");
        else System.out.println("yazım hatası");
        */

        /*
        //startsWith()
        //string verilen strin/karakter ile başlıyor ise boolean döndürür
        //isEmpty()
        //string hiçbir karakter içermiyorsa True döndürür

        String str1="Java welcomes you";
        String str2="";
        String str3=null;
        String str4=" ";

        System.out.println(str1.isEmpty());
        System.out.println(str2.isEmpty());
        //System.out.println(str3.isBlank());
        System.out.println(str4.isEmpty());
        */

        /*
        //replace()
        //string içindeki string/karakterileri yenisi ile değiştirir
        //atama yapılmazsa string içeriği değişmez
        String str1="Java dünyasına hoşgeldin!";
        System.out.println(str1.replace("Java","Python"));
        System.out.println(str1);
        */

        /*
        //************
        //replaceAll()
        //tüm harfleri bir harf ile değiştirir
        //char kullanılamaz
        //reg ex kullanılabilir
        // \\s space
        // \\S space dışındaki tümü
        // \\w harf ve rakamlar
        // \\W harf ve rakamlar dışındakiler
        // \\d rakamlar
        // \\D rakam dışındakiler

        //kullanıcıdan alınan ad/soyadı alıp tüm karakterleri * yap
        System.out.println("ad ve soyad giriniz: ");
        String adsoyad=scan.nextLine();
        System.out.println(adsoyad.replaceAll("\\S","*"));
        */
        /*
        String str="Java'da rakamlar 1234567890";
        System.out.println(str+"\n");
        System.out.println(str.replaceAll("a","*"));
        System.out.println(str.replaceAll("\\s","*"));
        System.out.println(str.replaceAll("\\S","*"));
        System.out.println(str.replaceAll("\\w","*"));
        System.out.println(str.replaceAll("\\W","*"));
        System.out.println(str.replaceAll("\\d","*"));
        System.out.println(str.replaceAll("\\D","*"));
        */

        /*
        //replaceFirst() verilen stringde ilk bulunanı değiştir
        String str="Java'da rakamlar 1234567890";
        System.out.println(str.replaceFirst("\\D","*"));
        System.out.println(str.replaceFirst(" ","*"));
        System.out.println(str.replaceFirst("\\d","*"));
        System.out.println(str.replaceFirst("\\W","*"));
        */


        //substring
        /*
        String str="Java ile IT çok güzel";
        System.out.println(str.substring(5));//indexler inclusive
        System.out.println(str.substring(8,12));//başlangıç indexi dahil bitiş hariçtir
        //Mehmet Hoca ile IT çok güzel yazdır
        System.out.println(str.replace("Java","Mehmet Hoca"));
        System.out.println("Mehmet Hoca "+ str.substring(5));

        System.out.println(str.substring(9));

        System.out.println(str.substring(0,5));// Java
        System.out.println(str.substring(0,1));// J
        //str.charAt(5) //6. harfi char olarak getirir
        //5. harfi string olarak bulun //str.substring(5,6)
        System.out.println(str.charAt(5));
        System.out.println(str.substring(5,6));
        System.out.println(str.substring(5,5));
        //System.out.println(str.substring(5,2));//bitiş indexi başlangıçtan küçük olamaz

        System.out.println(str.substring(str.length()));// "" döndürür
        //System.out.println(str.length());
        System.out.println(str.substring(21));// "" döndürür
        System.out.println(str.substring(20,20));// "" döndürür
        */



        // amazon.com arama sonucu  1-48 of 101 results for "nutella"
        // sonuc sayısı 100'den fazla is güzel, az ise kötü yazdır
        /*
        String search="1-48 of 95 results for \"nutella\"";
        int ilkBosluk=search.indexOf(" ");
        int ikinciBosluk=search.indexOf(" ",ilkBosluk+1);
        int ucuncuBosluk=search.indexOf(" ",ikinciBosluk+1);
        String araBul=search.substring(ikinciBosluk+1,ucuncuBosluk);
        int sonucum=Integer.valueOf(araBul);
        if (sonucum>100) {
            System.out.println("güzel");
        } else System.out.println("kötü");
        */

        /*
        int ara=search.indexOf("results");
        String sonuc=search.substring(ara-4,ara-1);
        int sorgu=Integer.valueOf(sonuc);
        if (sorgu>100) {System.out.println("güzel");}
        else System.out.println("kötü");
        */



        /*
        //trim()
        //verilen stringin başında ve sonundaki boşlukları kırpar
        String str="   Siz ne derseniz deyin, Java bildiğini okur.   ";
        System.out.println(str.trim());
        //atama yapılazsa string olduğu gibi kalır!!
        System.out.println(str.length());
        System.out.println(str.trim().length());
        */


        /*
        //kullanıcıdan 4 harfli bir kelime iste
        //kelimeyi tersten yazdır
        System.out.println("4 harften oluşan bir kelime giriniz: ");
        String kelime=scan.next();
        if (kelime.length()>4) {
            System.out.println("hatalı giriş!");
        } else if (kelime.isBlank()) {
            System.out.println("hatalı giriş");
        }
         else {
            System.out.print(kelime.charAt(kelime.length()-1));
            System.out.print(kelime.charAt(kelime.length()-2));
            System.out.print(kelime.charAt(kelime.length()-3));
            System.out.print(kelime.charAt(kelime.length()-4));
            System.out.println("");
            String tersten=kelime.substring(3)+kelime.substring(2,3)
                    +kelime.substring(1,2)+kelime.substring(0,1);
            System.out.println(tersten.toLowerCase());
        }
        */


        /*
        //string olarak verilen fiyat etikelerini toplayın
        //String p1="$13.99"
        //String p2="$10.55"


        String p1="$13.99";
        String p2="$10.55";

        double fiyat1=Double.valueOf(p1.substring(1));
        double fiyat2=Double.valueOf(p2.substring(1));
        System.out.println("string olarak verilen etiket fiyatların toplamı: $"+(fiyat1+fiyat2));
        */


        /*
        //kullanıcıdan isim, soyisim ve kart numarasını iste
        //isim-soyisim: M****** B*******
        //kart no: ***** ***** **** 1234
        //şeklinde yazdır

        System.out.println("adınızı girin: ");
        String ad=scan.next();
        System.out.println("soyadınızı girin: ");
        String soyad=scan.next();
        System.out.println("kart numaranızı girin: ");
        String kartNo=scan.nextLine();
        System.out.println("isim: "+ad.substring(0,1)+ad.substring(1,ad.length()).replaceAll("\\w","*"));
        System.out.println("soyisim: "+soyad.substring(0,1)+soyad.substring(1,soyad.length()).replaceAll("\\w","*"));
        //hocanın yöntem
        //String newName=name.substring(0,1).toUpperCase()+
        //               name.substring(1).replaceAll("\\s","*");
        // String newLast=last.substring(0,1).toUpperCase()+
        //               last.substring(1).replaceAll("\\s","*");
        //String cardNo="**** **** **** "+cardNo.substring(12);
        */




        /*
        //kullanıcıdan şifre iste
        //şartları sağlıyorsa şifre başarı ile oluşturuldu
        //değilse şifre başarısız, yeni bir şifre deneyin
        //ilk harf büyük olmalı
        //son harf küçük olmalı
        //boşluk içermemeli
        //şifre en az 8 karakter olmalı

        //System.out.println("bir şifre giriniz: ");
        //String sifre=scan.nextLine();
        //scanner ile okunan şifredeki boşluklar karakter olarak sayılmıyor!
        //ilginç!!
        String sifre="Ardiye i";
        boolean ilkHarf=false;
        boolean sonHarf=false;
        boolean bosluk=false;
        boolean uzunluk=false;

        if (sifre.length()>=8) {
            uzunluk=true;
        }
        else {
            System.out.println("şifre uzunluk şartını sağlamıyor");
        }

        if (sifre.charAt(0)>='A' && sifre.charAt(0)<='Z') {
            ilkHarf=true;
        }
        else {
            System.out.println("ilk harf büyük olmalı");
        }

        if (sifre.charAt(sifre.length()-1)>='a' && sifre.charAt(sifre.length()-1)<='z') {
            sonHarf=true;
        }
        else {
            System.out.println("son harf küçük olmalı");
        }

        if (!sifre.contains(" ")) {
            bosluk=true;

        }
        else {
            System.out.println("şifre boşluk içermemeli");
        }

        if (ilkHarf && sonHarf && bosluk && uzunluk) {
            System.out.println("Sifre başarı ile oluşturuldu");
        }
        else {
            System.out.println("şifre başarısız, yeni bir şifre deneyin");
        }

        */

























    }
}
