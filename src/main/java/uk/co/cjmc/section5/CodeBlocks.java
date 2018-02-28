package uk.co.cjmc.section5;

public class CodeBlocks {

    public static void main(String[] args) {

        boolean gameOver = true;
        int score = 5000;
        int levelCompleted = 5;
        int bonus = 100;

        calculateScore(gameOver, score, levelCompleted, bonus);

        // refactor to use a method and avoid duplication
        calculateScore(gameOver, 10000, 8, 200);

//        score = 10000;
//        levelCompleted = 8;
//        bonus = 200;
//
//        if(gameOver){
//            int finalScore = score + (levelCompleted * bonus);
//            System.out.println("Your final score was " + finalScore);
//        }

    }

    public static void calculateScore(boolean gameOver, int score, int levelCompleted, int bonus){

        if(gameOver){
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 1000;  // disadvantage of duplicated code
            System.out.println("Your final score was " + finalScore);
        }

    }
}
