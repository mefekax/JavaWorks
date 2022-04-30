package JavaTrainingGoesOn2;

public class Class5_Wrapper {


    public static void main(String[] args) {

        String str1="12345";
        String str2="23456";
        //verilen iki stringdeki sayıları topla

        System.out.println(Integer.valueOf(str1)+Integer.valueOf(str2));
        //Integer baş harfi büyük, wrapper class açılır, metodlardan valueof ile
        //string değerini sayısala çevirir, sonra iki ifade toplanır.
        //ancak string sayıya dönüşmüş değildir, string string olarak kalır

        System.out.println(str1+str2);
        //Integer.valueof(String) metod sadece rakam içeren stringlerle kullanılır






    }
}
