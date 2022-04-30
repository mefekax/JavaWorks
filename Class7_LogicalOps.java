package JavaTrainingGoesOn2;

public class Class7_LogicalOps {

    public static void main(String[] args) {

        System.out.println(5+3==7);
        boolean sonuc1=5>4 && 7<9 && 6+3==9 && 5+2!=8;
        System.out.println("sonuc1 değeri: "+sonuc1);

        boolean sonuc2=5>4 && 7>9 && 6+3==9 && 5+2!=8;
        System.out.println(sonuc2);//false ilk görüldüğü yerde durur

        boolean sonuc3=5>4 & 7>9 & 6+3==9 & 5+2!=8;
        System.out.println(sonuc3);//false görülse de sonuna kadar gider

        int sayi3=15;
        //sayi3ün 10 ile 20 arasında olduğunu true döndür
        System.out.println((sayi3<20 && sayi3>10));

        int sayi4=5;
        //sayi4in 10 ile 20 arasında olmadığını true döndür
        System.out.println((sayi4<10) || (sayi4>20));



    }
}
