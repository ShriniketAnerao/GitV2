package practice;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class swap {
	public static void main(String[] args) throws Exception {

		Scanner scr = new Scanner(System.in);

		String str = scr.nextLine();

		int count = 1;

		for (int i = 0; i < str.length() - 1; i++) {

			if ((str.charAt(i) == ' ') && (str.charAt(i+1) != ' ')) {
				count++;
			}

		}

		System.out.println(count);

	}
}
