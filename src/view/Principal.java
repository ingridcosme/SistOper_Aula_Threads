package view;

import controller.ThreadCalc;
import controller.ThreadId;

public class Principal {

	public static void main(String[] args) {
		//Inicializando várias Threads da classe ThreadId ao mesmo tempo
		for(int idThread = 0 ; idThread < 5 ; idThread++) {
			//Instanciando a classe de dois modos:
			//ThreaId threadId = new ThreadId(idThread);			
			Thread threadId = new ThreadId(idThread);
			
			threadId.start();  //Inciando a Thread
		}

		//Iniciando Threads da classe ThreadCalc
		int a = 10;
		int b = 2;
		
		for(int op = 0 ; op < 4 ; op++) {
			Thread tCalc = new ThreadCalc(a, b, op);
			tCalc.start();
		}
	}

}
