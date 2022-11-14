import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner sayiGir = new Scanner(System.in);
        System.out.print("Bir Sayı Girin: ");
        int number = sayiGir.nextInt();
        boolean isPrime=true;
        for (int i=2;i<number;i++)
        {
            if(number%i==0)
            {

                isPrime=false;
            }
        }
        if(number==1){System.out.println("1 Sayısı Asal Değldir"); return;}
        if(isPrime==true){System.out.println("Asaldır."); }
        if(isPrime==false){System.out.println("Asal Değildir.");}
        if(number<2){System.out.println("Geçersiz Sayı");}

    }

}