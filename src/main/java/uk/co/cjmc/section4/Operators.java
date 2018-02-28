package uk.co.cjmc.section4;

public class Operators {

    public static void main(String[] args) {

        int result = 1 + 2;
        System.out.println("1 + 2 = " + result);

        int previousResult = result;

        result = result - 1;
        System.out.println(previousResult + " -1 = " + result);

        previousResult = result;

        result = result * 10;
        System.out.println(previousResult + " * 10 = " + result);

        previousResult = result;

        result = result / 5;
        System.out.println(previousResult + " / 5 = " + result);

        previousResult = result;
        result = result % 3;
        System.out.println(previousResult + " % 3 = " + result);

        previousResult = result;
        result = result + 1;
        System.out.println("Result is now " + result);
        result++;
        System.out.println("Result is now " + result);
        result--;
        System.out.println("Result is now " + result);

        result += 2;
        System.out.println("Result is now " + result);
        result *= 10;
        System.out.println("Result is now " + result);
        result -= 10;
        System.out.println("Result is now " + result);
        result /= 10;
        System.out.println("Result is now " + result);

        boolean isAlien = false;
        if(isAlien == false){
            System.out.println("It's not an Alien!");
        }

        int topScore = 100;
        if (topScore >= 100){
            System.out.println("You got the high score!");
        }

        int secondTopScore = 160;
        if ((secondTopScore > topScore) && topScore == 100){
            System.out.println("You got the second high score!");
        }

        if ((topScore > 90) || (secondTopScore <= 90)){
            System.out.println("One of these tests is true!");
        }

        int newValue = 50;
        if (newValue == 50){
            System.out.println("This is true");
        }

        boolean isCar = false;
        if(isCar == true){
            System.out.println("This is not supposed to happen");
        }

        isCar = true; // set isCar to true so that the ternary operator makes wasCar true.

        boolean wasCar = isCar ? true : false; // ternary operator
        if (wasCar){
            System.out.println("wasCar is true");
        }

    }
}