package Sincronitzacio;

public class Sincro2 implements Runnable {
	private SeientsAvio sa = new SeientsAvio();

	public void run() {
		//Realitza reserva de 3 seients
		gestioSeientsAvio(3);

		if (sa.getSeientsLliures() <= 0) {
			System.out.println("No hi ha seients lliures");
		}
	}

	public void gestioSeientsAvio(int numSeientsReserva) {

		// Comprovar si queden seients lliures
		
		boolean seients_lliures = false;
		
		synchronized(this)
		{
			if(sa.getSeientsLliures() >= numSeientsReserva)
			{
				seients_lliures = true;
			}
		}

		if (seients_lliures == true) {

			System.out.println(
					Thread.currentThread().getName() + " far� una reserva de " + numSeientsReserva + " places.");

			espera() ;


			sa.reservaSeients(numSeientsReserva);



			System.out.println(Thread.currentThread().getName() + " Les places lliures s�n " + sa.getSeientsLliures());

		} else {

			System.out.println("No hi ha places suficients pel client " + Thread.currentThread().getName() + " Queden: "
					+ sa.getSeientsLliures() + " places lliures.");

			espera();

		}

	}

	public static void main(String[] args) {

		Sincro2 objAg = new Sincro2();

		//Threads amb mem�ria compartida
		Thread fil_1 = new Thread(objAg);
		Thread fil_2 = new Thread(objAg);

		fil_1.setName("Client 1");
		fil_2.setName("Client 2");

		fil_1.start();
		fil_2.start();

	}

	private void espera() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

class SeientsAvio {
	private int seientsLliures = 5;

	public int getSeientsLliures() {
		return seientsLliures;
	}

	public boolean getSeientsLliures(int numPlaces) {
		if (numPlaces <= seientsLliures) {
			return true;
		} else {
			return false;
		}
	}

	public void reservaSeients(int numSeientsReserva) {
		seientsLliures -= numSeientsReserva;
	}
}



