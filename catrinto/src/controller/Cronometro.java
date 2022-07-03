package controller;

import java.util.Timer;
import java.util.TimerTask;

public class Cronometro {
	Timer tm;
	private int contador = 100;
	private boolean rodando = false;
	Control control;

	Cronometro(Control control) {
		this.control = control;
	}

	public void start() {
		if (!rodando) {
			tm = new Timer();
			rodando = true;
			tm.scheduleAtFixedRate(new TimerTask() {
				@Override
				public void run() {
					contador -= 1;
					if (contador == 0) {
						tm.cancel();
						control.tempoAcabou();
					}
					control.setCountdown(contador);
				}		
			}, 1000, 1000);
		}
	}
}
