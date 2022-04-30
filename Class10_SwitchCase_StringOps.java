package JavaTrainingGoesOn2;

import java.util.Locale;
import java.util.Scanner;

public class Class10_SwitchCase_StringOps {

    public static void main(String[] args) {


        Scanner scan=new Scanner(System.in);

        /*
        //girilen ay numarasına göre ay adını yazdır
        System.out.println("Kaçıncı ay ?");
        int ay=scan.nextInt();

        switch(ay) {

            case 1:
                System.out.println("Ocak");break;
            case 2:
                System.out.println("Şubat");break;
            case 3:
                System.out.println("Mart");break;
            case 4:
                System.out.println("Nisan");break;
            case 5:
                System.out.println("Mayıs");break;
            case 6:
                System.out.println("Haziran");break;
            case 7:
                System.out.println("Temmuz");break;
            case 8:
                System.out.println("Ağustos");break;
            case 9:
                System.out.println("Eylül");break;
            case 10:
                System.out.println("Ekim");break;
            case 11:
                System.out.println("Kasım");break;
            case 12:
                System.out.println("Aralık");break;
            default:
                System.out.println("Hatalı giriş");
        }
        */

        /*
        //girilen ay numarasına göre mevsimi yazdır
        System.out.println("Kaçıncı ay ?");
        int ay=scan.nextInt();

        switch(ay) {
            case 12:
            case 1:
            case 2:
                System.out.println("Kış");
                break;

            case 3:
            case 4:
            case 5:
                System.out.println("İlkbahar");
                break;

            case 6:
            case 7:
            case 8:
                System.out.println("Yaz");
                break;

            case 9,10,11:

                System.out.println("Sonhabar");
                break;

            default:
                System.out.println("hatalı giriş");
        }

        // **** switch case
        // long, double, float ve boolean ile çalışmaz*******
        */

        /*
        String str1="Java";
        String str2="Candır";

        String cumle=str1.concat(" ").concat(str2);
        System.out.println(cumle);

        //concat metodu içine string ifade yazılır
        System.out.println(str1.concat(" "+5));
        System.out.println(str1.concat(true+""));

        System.out.println(cumle.charAt(0));
        System.out.println(str1.charAt(2)+""+str1.charAt(3));//araya "" atılmazsa
        //char sayısal değerleri yazdırır

        //jAVA yazdır
        System.out.println(str1.toLowerCase().charAt(0)+""+str1.toUpperCase().charAt(1)
        +str1.toUpperCase().charAt(2)+str1.toUpperCase().charAt(3));
        */

        /*
        //farklı dillerde yazılan harfleri büyük küçük çevirme
        String str="Java Güzeldir";
        System.out.println(str.toUpperCase(Locale.forLanguageTag("tr")));
        */

        /*
        String str1="Ali Can";
        String str2="Ali"+" Can";

        System.out.println("== ile :"+(str1==str2));
        System.out.println("equals ile :"+(str1.equals(str2)));

        String str3=str1+"";
        System.out.println("== ile: "+(str3==str2));
        System.out.println("equals ile: "+str3.equals(str2));
        //stringde == metodu her zaman doğru sonuç vermez
        //bu nedenle string karşılaştırnma equals() metodu ile yapılır
        */

        /*
        String str5="hasan";
        String str6="HASAN";

        System.out.println(str5.equals(str6));//false
        //java büyük küçük harf duyarlıdır, dolayısıyla iki string eşit değildir
        System.out.println(str5.toUpperCase().equals(str6));//true
        //ilk string büyük harfe çevrilince karşılaştırma sonucu doğru çıkar
         */

        /*
        //kullanıcıya derse katılmak isteyip istemediği sorullur
        // evet derse, talep alınmıştır
        // hayır derse yine bekleriz yazdır

        System.out.println("Derse katılacak mısınız?: (e/h)");
        String cvp=scan.next();
        if (cvp.equalsIgnoreCase("e")) { //iki stringi büyük küçüğe bakmadan karşılaştır
            System.out.println("talebiniz alınmıştır");
        }
        else if (cvp.equalsIgnoreCase("h")) {
            System.out.println("yine bekleriz");
        } else System.out.println("hatalı giriş");
        */

        /*
        String bune=null;//null pointer hiçbir yere referansı yok, değeri de yok
        //değer atanmadığının işaretçisidir
        // bune="";
        System.out.println(bune);
        System.out.println(bune.length());
        */


        /*
        //kullanıcıdan ismini alıp baş ve son harfini Büyük harflerle yazdırın

        System.out.println("Adınızı giriniz: ");
        String isim=scan.nextLine();
        System.out.println(isim.toUpperCase().charAt(0)+""+isim.toUpperCase().charAt(isim.length()-1));
        */


        /*
        String str1="Java bir başka güzel";
        //char olarak bir harf indexi
        //string olarak verilen bir metnin de indexi
        System.out.println(str1.indexOf('J'));
        System.out.println(str1.indexOf("aşka"));
        System.out.println(str1.indexOf("l"));
        System.out.println(str1.length()-1);

        System.out.println(str1.indexOf('b',str1.indexOf('b')+1));
        //ilk bden sonrakinin indexini

        //olmayan bir element için index -1 döndürür
        */


        /*
        //kullanıcıdan e-posta adresi al
        //@ işareti yoksa geçersiz, varsa geçerli yazdır
        System.out.println("e-posta adresi giriniz: ");
        String eposta=scan.next();
        if(eposta.indexOf("@")==-1) {
            System.out.println("geçersiz e-posta");
        } else {
            System.out.println("geçerli e-posta");
        }
        */ //string.indexOf('a',11) //stringde 11. karakterden itibaren a'yı aratır


















    }
}
