package controller;

public class ThreadId extends Thread {  //extends Thread (herda as características da superclasse Thread)

	private int idThread;
	
	//Construtor
	public ThreadId(int idThread) {
		this.idThread = idThread;
	}
	
	@Override
	public void run() {
		System.out.println(idThread);  //Printar o id
	}

}
