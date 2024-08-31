package view;

import controller.ThreadVetor;

public class Main {
	
	public static void main(String[] args) {
		
		int[] vetor = new int[1000];
		int max = 100;
		int min = 1;
		for (int i : vetor) {
			i = (int) (Math.random() * (max - min - 1) + min);
		}
		
		Thread threadVetor1 = new ThreadVetor(1, vetor);
		Thread threadVetor2 = new ThreadVetor(2, vetor);
		threadVetor1.start();
		threadVetor2.start();
	}
}
