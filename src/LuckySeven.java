import java.util.Random;
import java.util.Scanner;

public class LuckySeven {
    public static void main(String[] args) throws Exception {
        //Initiate the methods
        Random rand = new Random();
        Scanner scan = new Scanner(System.in);       
        //initilized the variables
        int number1;
        int number2;
        int number3;
        int balance = 5;
        int choiceValue;
        while (balance > 0) {
            number1 = rand.nextInt(10)+1;
            number2 = rand.nextInt(10)+1;
            number3 = rand.nextInt(10)+1;
            System.out.println("Your balance is: " + balance + " how much you wish to play with: ");
            choiceValue = scan.nextInt();

            switch (choiceValue) {
                case 1:
                balance = balance - 1;
                System.out.println("You got: " + number1);
                    if (number1 == 7) {
                        System.out.println("You won you got a seven, 3$ will be added to your balance!");
                        balance = balance + 3;
                    }else{
                        System.out.println("Sorry you lost, better luck next time!");
                    }
                    break;
                case 2:
                if (balance >= 2) {
                balance = balance - 2;
                System.out.println("You got: " + number1 + " / "+ number2);
                if (number1 == 7 && number2 == 7) {
                    System.out.println("You won you got 2 Seven, 5$ will be added to your balance!");
                    balance = balance + 5;
                }else{
                    System.out.println("Sorry you lost, better luck next time!");
                }
            }else{
                System.out.println("sorry your balance is "+ balance +" less than 2 try another value");
            }
                    break;
                case 3:
                if (balance >= 3) {
                balance = balance - 3;
                System.out.println("You got: " + number1 + " / " + number2 + " / " + number3);
                if (number1 == 7 && number2 == 7 && number3 == 7) {
                    System.out.println("You won you got 3 Sevens, 10$ will be added to your balance!");
                    balance = balance + 10;
                }else{
                    System.out.println("Sorry you lost, better luck next time!");
                }
            }else{
                System.out.println("sorry your balance is "+ balance+" wich less than 3 try another value");
            }
                    break;
            
                default:
                    break;
            }

        }

        System.out.println("Game over, unfortunately you lost all your money!");
        
    }
}
