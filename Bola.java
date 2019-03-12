package BillardSimulation;

public class Bola implements Runnable {
	
	private Board billar;
	private Ball bola;
	
	public Bola(Ball bola, Board billar) {
		this.bola = bola;
		this.billar=billar;
	}

	@Override
	public void run() {
		
		try {
			while (true) {
			bola.move();
			billar.repaint();
			Thread.sleep(10);
			}
		} catch (InterruptedException e) {
			
		}
		
	}
	
}
