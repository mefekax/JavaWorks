package JavaTrainingGoesOn2;

public class SecondClass {

    public static void main(String[] args) {

        //Increment-Decrement

        /*
        int sayi=20;
        System.out.println(sayi++);
        System.out.println(sayi);
        System.out.println(sayi+10);
        sayi+=10;
        System.out.println(sayi);
        System.out.println(sayi=sayi+=10);
        System.out.println(sayi);
        System.out.println(sayi+=10);
        System.out.println(sayi);
        System.out.println("sayının sonuna ++ koy: "+ sayi++);
        System.out.println(sayi);
        System.out.println("sayının önüne ++ koy: " + ++sayi);
        System.out.println(sayi);
        */
        int a=15;
        int b=++a;
        System.out.println(b);
        a=15;
        b=a++;
        System.out.println(b);

        int sayi1=10,sayi2=20,sayi3=30;
        sayi2=sayi1++;//sayi2ye önce sayi1 assign edilir, sonra sayi1 artırılır
        System.out.println(sayi1+" "+sayi2+" "+sayi3);
        sayi3=++sayi1;//önce artırma sonra atama yapılır
        System.out.println(sayi1+" "+sayi2+" "+sayi3);
        System.out.println(--sayi2);










    }

}
