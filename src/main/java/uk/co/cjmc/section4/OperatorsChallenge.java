package uk.co.cjmc.section4;

public class OperatorsChallenge {

    public static void main(String[] args) {

        double valOne = 20;
        double valTwo = 80;

        double result = (valOne + valTwo) * 20; // java precedence for the multiplier operator is higher than adding

        double remainder = result % 40;

        if(remainder <= 20) {
            System.out.println("Total was over the limit");
        }


    }
}
