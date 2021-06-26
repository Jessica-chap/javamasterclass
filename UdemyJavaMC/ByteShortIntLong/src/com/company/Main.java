package com.company;

public class Main {

	public static void main(String[] args) {
		int myValue = 10000;

		int myMinIntValue = Integer.MIN_VALUE;
		int myMaxIntValue = Integer.MAX_VALUE;
		System.out.println("Inter Minimum Value = " + myMinIntValue);
		System.out.println("Inter Maximum Value = " + myMaxIntValue);
		System.out.println("Busted MAX value = " + (myMaxIntValue + 1));
		System.out.println("Busted MIN value = " + (myMinIntValue - 1));

		byte myMinByteValue = Byte.MIN_VALUE;
		byte myMaxByteValue = Byte.MAX_VALUE;
		System.out.println("Byte Min Value = " + myMinByteValue);
		System.out.println("Byte Max Value = " + myMaxByteValue);

		short myMinShortValue = Short.MIN_VALUE;
		short myMaxShortValue = Short.MAX_VALUE;
		System.out.println("Short Min Value = " + myMinShortValue);
		System.out.println("Short Max Value = " + myMaxShortValue);

		long myLongValue = 100L;
		long myMinLongValue = Long.MIN_VALUE;
		long myMaxLongValue = Long.MAX_VALUE;
		System.out.println("Long Min Value = " + myMinLongValue);
		System.out.println("Long Max Value = " + myMaxLongValue);
		long bigLongLiteralValue = 2_147_483_647_234L;

		int myTotal = (myMinIntValue / 2);
		byte myNewByteValue = (byte) (myMinByteValue / 2);
		short myNewShortValue = (short) (myMinShortValue / 2);

		byte bytechall = 100;
		short shortchall = 3000;
		int intchall = 2000000;

		long totalchall = 50000 + (10 * (bytechall + shortchall + intchall));
	}
}
