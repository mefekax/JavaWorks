package JavaTrainingGoesOn2;

public class Class6_ConcatenationAndOps {

    public static void main(String[] args) {

        String str1="Java";
        String str2="Güzel";
        int sayi1=5;
        int sayi2=3;

        //variable değerlerini değiştirmeden
        //aşağıdaki ifadeleri yazdırın

        //Java5Güzel
        System.out.println(str1+sayi1+str2);

        //2Güzel15
        System.out.println((sayi1-sayi2)+str2+(sayi1*sayi2));

        //Java22
        System.out.println(str1+(sayi1-sayi2)+""+(sayi1-sayi2));

        //53Güzel
        System.out.println(sayi1+""+sayi2+str2);//işlem önceliği nedeniyle araya
        //giren "" sayı toplama yerine concatenate işlemi yaptırıyor
        System.out.println(sayi1+(sayi2+str2));
        System.out.println(""+sayi1+sayi2+str2);
        //"" sayı toplama yerine concatenate işlemi yaptırıyor

        System.out.println(5*2==15);
        System.out.println(5+2!=7);
        System.out.println(5+2>=7);
        System.out.println(5*2<9);
        System.out.println((5+2==7) && (4+3!=5)); //and && operatörü
        System.out.println((5*2!=15) && (5>7));//mükemmeliyetçidir
        System.out.println((5+2==7) || (4+3!=5));// or || operatörü iyimserdir
        System.out.println((5*2==15) || (5>7));







    }

}
