package JavaTrainingGoesOn2;

public class FourthAndWrapperClass {

    public static void main(String[] args) {

        String str="I love Java";
        int sayi=10;

        System.out.println(str.toUpperCase());
        System.out.println(str);
        //wrapper class
        //primitive data türlerini non-primitive gibi kullanmak

        double sayi2=20.5;//double. girildiğinde metod açılmaz, primitive
        Double sayi3=15.3;//Double. girildiğinde metodlar açılır, wrapper

        short sayi4=20;
        Short sayi5=30;

        sayi4=sayi5;//primitive ve wrapper arasında geçiş olabilir
        System.out.println(sayi4+" "+sayi5);

        System.out.println(Short.MAX_VALUE);//32767
        System.out.println(Short.MIN_VALUE);//-32768
        System.out.println(Short.BYTES);//2 bytes
        System.out.println(Short.SIZE);//16 bits














    }
}
