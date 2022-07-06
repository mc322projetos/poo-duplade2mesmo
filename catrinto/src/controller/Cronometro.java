package controller;

import java.util.Timer;
import java.util.TimerTask;

public class Cronometro {
	Timer tm;
	private int contador;
	private boolean rodando = false;
	Control control;

	Cronometro(Control control) {
		this.control = control;
	}

	public void start() {
		contador = 100;
		if (!rodando) {
			tm = new Timer();
			rodando = true;
			tm.scheduleAtFixedRate(new TimerTask() {
				@Override
				public void run() {
					contador -= 1;
					// control.getMaze().moverCachorro();
					if (contador == 0) {
						tm.cancel();
						rodando = false;
						contador = 100;
						control.tempoAcabou();
					}
					control.setCountdown(contador);
				}		
			}, 1000, 1000);
		}
	}
	
	public int getContador() {
		return contador;
	}

	public int getTempoLevado() {
		return 100 - contador;
	}

    public void cancel() {
		rodando = false;
		tm.cancel();
    }

	public boolean getRodando() {
		return rodando;
	}
}
