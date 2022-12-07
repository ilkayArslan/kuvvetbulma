import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen Bir Sayı Giriniz : ");
        int num = input.nextInt();

        System.out.println("4ün katları");
        for (int i = 1; i<num;i*=4){

            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("5in katları");
        for (int i = 1;i<num;i*=5){
            System.out.print(i +" ");
        }


    }
}