import java.io.IOException;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        //main menu
        System.out.println("Welcome to the quiz");
        System.out.println("Please select a category");
        System.out.println("1. Cats");
        System.out.println("2. Exit");


        Scanner input = new Scanner(System.in);
        int category = input.nextInt();



     //////category selection////
        if (category == 1) {
            System.out.println("Cats");
            System.out.println("Please select a quiz");

            //////list of all the quizzes the sub category///
            System.out.println("1.cat breeds");
            System.out.println("2.cat facts");
            System.out.println("3.famous cats");
            System.out.println("4.go back to main menu");



            int quiz = input.nextInt();

            if (quiz == 1) {
                System.out.println("cat breeds");
                //call the cat breeds quiz class here
                //create an object of the class and call the method
                CatBreeds objectName = new CatBreeds();
                objectName.main(args);

            }
            if (quiz == 2) {
                System.out.println("cat facts");
                CatFacts objectName = new CatFacts();
                objectName.main(args);
            }
            if (quiz == 3) {
                System.out.println("famous cats");
            }
            if (quiz == 4) {
                System.out.println("go back to main menu");

            }
        }


        if (category == 2) {
            System.out.println("Exit");
            System.exit(0);
        }
    }
}




///to do list///
//1. create a class for each quiz

//how do you run other classes from a main class?
//A: you can create an object of the class and call the method

//how do you create an object of a class?
//A: ClassName objectName = new ClassName();

//how do you call a method from a class?
//A: objectName.methodName();
