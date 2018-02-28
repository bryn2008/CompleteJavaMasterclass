package uk.co.cjmc.section4;

public class ByteChallenge {

    public static void main(String[] args) {

    byte myByteValue = 8;
    short myShortValue = 2;
    int myIntValue = 20;
    long myLongValue = 50000 + 10 * (myByteValue + myShortValue + myIntValue);

    System.out.println("longTotoal = " + myLongValue);


    }

}
