import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner take = new Scanner(System.in);

    int num = (int)(Math.random()*100) + 1;
    int guess;
    
    do{
      System.out.println("If you don't want to continue type '0'.");
      System.out.println("Guess the number: ");
      guess = take.nextInt();
      if(guess > num){
        System.out.println("You're number is bigger than the digit!");
      } else if(guess < num){
        System.out.println("You're number is smaller than the digit!");
      } else{
        System.out.println("Yeahh! you matched the digit.");
        break;
      }
    } while(guess != 0);

    if(guess == 0){
      System.out.println("You stop the game!");
      System.out.println("Digit that you are suppose to find is " + num);
    }

    take.close();
    
  }
}