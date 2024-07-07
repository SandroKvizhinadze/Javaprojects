import java.util.Scanner;

public class reverse{
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("sheiyvanet 3 nishna ricxvi:");
        int X = scanner.nextInt();
        if(X < 100 || X > 999){
            System.out.println("araswori ricxvi");
        }else{
            int a = X / 100;
            int b = (X % 100) / 10;
            int c = (X % 100) % 10;
            int correct = (c * 100) + b * 10 + a;
            System.out.println("correct answer is: " + correct );
         }


      
        scanner.close();
    }
}