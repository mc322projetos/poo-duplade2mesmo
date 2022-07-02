// falta arrumar o caminho dos pacotes

import java.awt.EventQueue;

import view.JanelaJogo;

public class AppCatRinto {
	
	public static void main(String args[]) {
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				new JanelaJogo();
			}
		});
	}
}
