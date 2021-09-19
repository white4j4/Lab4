import java.util.*;
/*
Lab 4
Joshua White, Mackenzie Peters
9/16/2021
*/
class Main {
  public static void main(String[] args) {
    
    Random r = new Random();

    int randomNum = r.nextInt(50) + 1;

    System.out.println("The random number is: " + randomNum);

    countDown(randomNum);

    if (randomNum <= 5) 
    {
    System.out.println("Ahoy Mateys!");
    }
    else if (randomNum > 25 && randomNum < 42)
    {
    System.out.println("Cannonball!");
    }
    else
    {
    System.out.println("Blast off!");
    }

    /*
    while (randomNum >= 0)
    {
      System.out.println(randomNum);
      randomNum--;
    }
    */
  }
  static void countDown(int theRandomNum) {
    while (theRandomNum >= 0)
    {
      System.out.println(theRandomNum);
      theRandomNum--;
    }
  }
}