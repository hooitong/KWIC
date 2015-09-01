package adt.input;

import adt.memory.MovieTitleMemory;
import adt.memory.NoiseWordMemory;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Input {

	private Scanner sc = new Scanner(System.in);
	MovieTitleMemory movieTitleArray = MovieTitleMemory.getInstance();
	NoiseWordMemory noiseWordArray = NoiseWordMemory.getInstance();

	/**
	 * To add a movie title to the system
	 */
	public void addMovieTitle() {
		System.out.println("Please key in the list of movie title: ");
		System.out.println("Press enter to terminate.");
		
		ArrayList<String> inputArray = new ArrayList<String>();
		String temp;
		while (sc.hasNextLine()) {
			temp = sc.nextLine();
			if (temp.isEmpty()) {
				break;
			}

			inputArray.add(temp);
		}
		
		movieTitleArray.setArrayList(inputArray);
	}

	/**
	 * To add a noise word to the system
	 */
	public void addNoiseWord() {
		System.out.println("Please enter the list of ignore words (separated by space or comma): ");
		String ignoreWords = sc.nextLine();

		ArrayList<String> ignoreList =
				new ArrayList<String>(Arrays.asList(ignoreWords.split("(\\s)")));
		
		noiseWordArray.setArrayList(ignoreList);

	}
}

