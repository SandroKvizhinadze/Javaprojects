// reverse.java პროექტის უფრო ჭკვიანური და გაძლიერებული მგალითი ნაკლები ძალისხმევით და მეტი შესაძლებლობებით:
import java.util.InputMismatchException;
import java.util.Scanner;// სკანერის იმპორტირება
public class smartwayreverse{
    public static void main(String[] args){
      Scanner scaner = new Scanner(System.in); // სკანერის გამოძახება
      System.out.println("Sehiyvanet tqventvis sasurveli ricxvi:"); //შეტყობინება მომხმარებლისთვის
      //შეცდომის შეტყობინება იმ შემთხვევაში თუ numberი არ არის integerი:
      try{
          int number  = scaner.nextInt(); //შეყვანილი ინფორმაციის სკანირება
          String stringn = Integer.toString(number); // სტრინგათ გადაქცევა რათა გამოვიყენოთ შეტრიალების ფუნქცია იმისთვის რომ არ მოგვიწიოს მათემატიკური ოპრეაციების გაკეთება
          String reversed = new StringBuilder(stringn).reverse().toString();//შეტრიალება ტექსტის სახით.
          System.out.println(number + " is shetrialebuli ricxvia: " + reversed);// პასუხი
      }catch(InputMismatchException e){ //თუ შეყვანილი ინფორმაცია არ არის ინტეჯერი
        System.out.println("araswori ingormacia!"); //შეცდომა
      }
          scaner.close();
    }
}