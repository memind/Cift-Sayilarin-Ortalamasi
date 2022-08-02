import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        int k, toplam, dongu;
        double ortalama;
        Scanner inp = new Scanner(System.in);

        System.out.print("Sayı giriniz: ");
        k = inp.nextInt();

        toplam = 0;
        dongu = 0;

        for (int i = 0; i <= k; i++){
           if(i%3 == 0 || i%4 == 0){
            System.out.println(i);
            toplam = toplam + i;
            dongu++;
           }
        }

        ortalama = toplam / dongu ;
        System.out.println("Ortalama: " + ortalama);
    }
}