import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Kac sayi gireceksiniz: ");
        int N = input.nextInt();

        System.out.print("1. sayiyi giriniz: ");
        int number = input.nextInt();

        int min = number;
        int max = number;

        for(int i = 2; i<=N ; i++){
            System.out.print(i+ ". sayiyi giriniz: ");
            number = input.nextInt();

            if(number<min){
                min=number;
            }
            if(number>max){
                max=number;
            }
        }
         System.out.println("En kucuk sayi: " +min);
        System.out.println("En buyuk sayi: " +max);

    }}