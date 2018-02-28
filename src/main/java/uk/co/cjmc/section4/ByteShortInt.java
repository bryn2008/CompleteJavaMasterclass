package uk.co.cjmc.section4;

public class ByteShortInt {

    public static void main(String[] args) {

        // int has a width of 32
        int myMinValue = -2147483648;
        int myMaxValue = 2147483647;

        // byte has a width of 8
        byte myByteValue = -128;

        // only compatible types, will require casting
        byte myNewByteVale = (byte) (myByteValue/2);
        System.out.println("My new Byte Value: " + myNewByteVale);

        // short has a width of 16
        short myShortValue = 32767;

        // long has a width of 64
        long myLongValue = 9_223_372_036_854_775_807L;

    }
}
