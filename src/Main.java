import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age;
        String firstName;
        String myFavouriteFood;
        System.out.println("Please enter your age: ");
        age = scanner.nextInt();
        System.out.println("Please enter your name: ");
        firstName = scanner.nextLine();
        System.out.println("Enter your favourite food: ");
        myFavouriteFood = scanner.nextLine();
        System.out.println("Age: " + age + "\nName: " + firstName + "\nFavourite Food: " + myFavouriteFood);





    }

}