// falta arrumar o caminho dos pacotes

import java.awt.EventQueue;

import controller.Control;

public class AppCatRinto {
	
	public static void main(String args[]) {
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				new Control();
			}
		});
	}
}
