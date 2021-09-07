package controller;

public class ThreadCalc extends Thread {  //extends Thread (herda as características da superclasse Thread)
	
	private int a, b, op;

	public ThreadCalc(int a, int b, int op) {  
		this.a = a;
		this.b = b;
		this.op = op;
	}
	
	@Override
	public void run() {
		calc();
	}

	private void calc() {
		/*Para colocar a Thread em estado - bloqueada por um determinado tempo
		
		int tempo = 1000;  //tempo em ms que ela vai ficar bloqueada
		try {
			sleep(op * tempo);
		} catch (InterruptedException e) {
			//caso haja uma exceção por interrupção
			e.printStackTrace();
		}
		*/
		
		int res = 0;
		String operacao = "";
		
		switch (op) {
		case 0:
			res = a + b;
			operacao = "+";
			break;
		
		case 1:
			res = a - b;
			operacao = "-";
			break;
		
		case 2:
			res = a * b;
			operacao = "*";
			break;
		
		case 3:
			res = a / b;
			operacao = "/";
			break;
		}
		
		//Imprime a operação com a identificação da Thread
		System.out.println("TID #" + getId() + " ==> " + a + " " + operacao 
				+ " " + b + " = " + res);
	}

}
