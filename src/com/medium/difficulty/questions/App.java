package com.medium.difficulty.questions;

public class App {

	public static void main(String[] args) {
		int matrics[][] = { { 1, 1, 1 }, { 1, 0, 1 }, { 1, 1, 1 } };

		int row = 0;
		int column = 0;

		for (int i = 0; i < matrics.length; i++) {
			for (int j = 0; j < matrics[i].length; j++) {
				if (matrics[i][j] == 0) {
					row = i;
					column = j;
					break;
				}
			}
		}

		for (int i = 0; i < matrics.length; i++) {
			for (int j = 0; j < matrics[i].length; j++) {
				if (i == row || j == column) {
					matrics[i][j] = 0;
				}
			}
		}

		for (int i = 0; i < matrics.length; i++) {
			for (int j = 0; j < matrics[i].length; j++) {
				System.out.print(matrics[i][j] + " ");
			}
			System.out.println();
		}

	}

}