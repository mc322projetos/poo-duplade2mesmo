package controller;

import java.util.Timer;
import java.util.TimerTask;

public class Cronometro {
	private Timer tm;
	private int contador;
	private int tempoLevado;
	private boolean rodando = false;
	private Control control;

	Cronometro(Control control) {
		this.control = control;
	}

	public void start() {
		contador = 30;
		if (!rodando) {
			tm = new Timer();
			rodando = true;
			tm.scheduleAtFixedRate(new TimerTask() {
				@Override
				public void run() {
					contador -= 1;
					if (contador == 0) {
						tm.cancel();
						rodando = false;
						tempoLevado = 30;
						control.tempoAcabou(false);
					} else if (control.win()) {
						control.tempoAcabou(true);
						rodando = false;
						tempoLevado = 30 - contador;
						tm.cancel();
					} else {
						tempoLevado = 30 - contador;
						control.getView().getMainScreen().getDogLabel().moverCachorro();
						control.setCountdown(contador);
					}
				}		
			}, 1000, 1000);
		}
	}

	public int getTempoLevado() {
		return tempoLevado;
	}

	public boolean getRodando() {
		return rodando;
	}

	public void cancel() {
		tm.cancel();
		rodando = false;
	}
}
