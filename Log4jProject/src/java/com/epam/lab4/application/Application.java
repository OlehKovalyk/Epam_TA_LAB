package com.epam.lab4.application;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import com.epam.lab4.exception.IncorectNumberException;
import com.epam.lab4.number.Numbers;
import com.epam.lab4.wrapperscanner.WrapperScanner;

public class Application {
	private static WrapperScanner scanner = WrapperScanner.getInstance();
	private static final Logger LOG = Logger.getLogger(Application.class);

	public static int menu() throws IOException {
		System.out.println("Please, choose the item.\n" + "1:Find a sum of the numbers.\n"
				+ "2:Input of numbers until the user will enter 0.\n"
				+ "3:Display on console those which give residue 1, 2 or 5 during dividing by 7.\n"
				+ "4:Find the count of even digits of some natural number.\n"
				+ "5:Find the largest digit of natural number.\n" + "6:Exit.");
		return scanner.getNextInt();
	}

	public static void main(String[] args) {
		PropertyConfigurator.configure("src\\resourse\\log4j.properties");
		//PropertyConfigurator.configure("src\\resourse\\log4jsms.properties");
		while (true) {
			try {
				switch (menu()) {
				case 1:
					LOG.info("Find a sum of numbers.");
					System.out.println(Numbers.getSumNumbers(Numbers.readNumber()));
					break;
				case 2:
					LOG.info("Input of numbers until the user will enter 0.");
					LOG.warn("Input of numbers until the user will enter 0.");
					Numbers.searchSumAndCountNumber();
					break;
				case 3:
					LOG.info("Display on console those which give residue 1, 2 or 5 during dividing by 7.");
					Numbers.searchNumbers();
					break;
				case 4:
					LOG.info("Find the count of even digits of some natural number.");
					System.out.println(Numbers.getCountEvenDigits(Numbers.readNumber()));
					break;
				case 5:
					LOG.info("Find the largest digit of natural number.");
					System.out.println(Numbers.getMaxDigit(Numbers.readNumber()));
					break;
				case 6:
					LOG.info("The end of program.");
					System.exit(0);

				default:
					throw new IncorectNumberException("You enter incorrect number");
//					LOG.error("You enter incorrect number");
//					break;
				}

			} catch (IOException | IncorectNumberException e) {
				LOG.error(e);
				System.out.println(e);
			}
		}
	}

}
