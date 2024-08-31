package controller;

public class ThreadVetor extends Thread {
	
	int num;
	int[] vetor;
	
	public ThreadVetor(int num, int[] vetor) {
		this.num = num;
		this.vetor = vetor;
	}

	@Override
	public void run() {
		if (num % 2 == 0) {
			double tempoInicial = System.nanoTime() * Math.pow(10, 9);
			for (int i = 0; i < vetor.length; i++) {
			}
			double tempoFinal = System.nanoTime() * Math.pow(10, 9);
			System.out.println("Tempo para percorrer o vetor: " + Double.toString(tempoFinal - tempoInicial) + " s");
		} else {
			double tempoInicial = System.nanoTime() * Math.pow(10, 9);
			for (int i : vetor) {
			}
			double tempoFinal = System.nanoTime() * Math.pow(10, 9);
			System.out.println("Tempo para percorrer o vetor: " + Double.toString(tempoFinal - tempoInicial) + " s");
		}
	}
}
