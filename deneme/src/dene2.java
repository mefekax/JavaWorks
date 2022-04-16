import java.util.Scanner;
public class dene2 {
    public static void main(String[] args) {
        /*int a=5,b=4;
        boolean canRetire=true;
        System.out.println("iki sayının toplamı:"+(a+b));
        char harf='%';
        short okulmevcudu=1590;
        float matnot=90.3f;
        System.out.println(okulmevcudu+matnot);*/

        int num1=10,num2=20,a;
        /*a=num1;
        num1=num2;
        num2=a;
        */
        num1=num1+num2;
        num2=num1-num2;
        num1=num1-num2;
        System.out.println(num1+" "+num2);
        Scanner input=new Scanner(System.in);

        System.out.println("enter name: ");//prompt user to enter
        String name= input.next(); //klavyeden girileni değişkene assign et
        System.out.println("girilen "+name);//girileni ekrana yazdır

        System.out.println("enter your name: ");
        name= input.next();
        System.out.println("enter age: ");
        int age=input.nextInt();

        System.out.println("hi "+name+" you are "+age+" years old.");

    }
}
