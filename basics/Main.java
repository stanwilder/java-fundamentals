import java.util.Random;

public class Main {
  public static void main(String[] args) {
    System.out.println("Hello World!");
    int dogCount = 1;
    System.out.println("I own " + dogCount + " " + pluralize("dog", dogCount) + ".");
    int catCount = 2;
    System.out.println("I own " + catCount + " " + pluralize("cat", catCount) + ".");
    int turtleCount = 0;
    System.out.println("I own " + turtleCount + " " + pluralize("turtle", turtleCount) + ".");
    flipNHeads(1);
    
    // System.out.println(pluralize("duck", 4));
  }


  public static String pluralize(String str, int num){
    // str could be either cat,dog,turtle
    // num could be 0,1,2 - because they gave us the numbers
    
    // if num is greater than 1 then return str plural
    
    if (num < 1){
      return (" " + str + "s");
    } else {
      if (num == 1){
        return(" " + str);
      } else {
        if (num > 1){
          return(" " + str + "s");
        }
          }
        }

  
  return "I have nothing";
  }
  // Raul helped with random math function
  // n is all the same number
  public static void flipNHeads(int n){
    // heads is for heads in a row
  int heads = 0;
  // increimentation for random number of flips
  int counter = 0;
  // random number generator
  Random rand = new Random();
  
  while (heads <= n){
    // counter++;
    int flipCount = rand.nextInt(1);
    if (flipCount < 0.5){
      System.out.println("Tails!");
      heads=0;
    } else if (flipCount >= 0.5){
        System.out.println("Heads!!");
        heads++;
        
      }
    
  }
}}
