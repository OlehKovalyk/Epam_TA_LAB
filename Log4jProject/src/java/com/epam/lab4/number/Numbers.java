package com.epam.lab4.number;

import java.io.IOException;

import com.epam.lab4.exception.IncorectNumberException;
import com.epam.lab4.wrapperscanner.WrapperScanner;

public class Numbers {
	private static WrapperScanner scanner = WrapperScanner.getInstance();
	
	public static int readNumber() throws IOException{
		System.out.println("Please, enter number.");
		return scanner.getNextInt();
	}

	public static int getSumNumbers(int number) throws IncorectNumberException {
		if(number<0){
			throw new IncorectNumberException("You enter a negative number!");
		}
		int sum = 0;
		for (int i = 1; i <= number;i++) {
			sum += i;
		}
		return sum;
	}

	public static void searchSumAndCountNumber() throws IOException {
		int sum = 0;
		int count = -1;
		int number;
		double arithmeticMean = 0;
		do {
			number=readNumber();
			sum += number;
			count++;
		} while (number != 0);
		if (count != 0) {
			arithmeticMean = sum / count;
		}
		System.out.println("The count of numbers: " + count + ", total sum of numbers: " + sum
				+ ", the arithmetic mean: " + arithmeticMean);
	}

	public static void searchNumbers() throws IOException {
		int startInterval;
		int endInterval;
		System.out.println("Please, enter interval.");
		int firstNumber = scanner.getNextInt();
		int secondNumber = scanner.getNextInt();
		if (firstNumber < secondNumber) {
			startInterval = firstNumber;
			endInterval = secondNumber;
		} else {
			startInterval = secondNumber;
			endInterval = firstNumber;
		}
		for (int i = startInterval; i <= endInterval; i++) {
			if ((i % 7 == 1) || (i % 7 == 2) || (i % 7 == 5)) {
				System.out.println(i);
			}
		}
	}

	private static int checkPositiveNumber(int number){
		if(number<0){
			number=-number;
		}
		return number;
	}
	
	public static int getCountEvenDigits(int number) {
		checkPositiveNumber(number);
		int count = 0;
		int digit;
		do {
			digit = number % 10;
			number/=10;
			if (digit % 2 == 0) {
				count++;
			}
		} while (number > 0);
		return count;
	}
	
	public static int getMaxDigit(int number){
		checkPositiveNumber(number);
		int maxDigit =0;
		int digit;
		do{
			digit =number%10;
			number/=10;
			if(maxDigit<digit){
				maxDigit=digit;
			}
		}while(number>0);
		return maxDigit;
	}
}
