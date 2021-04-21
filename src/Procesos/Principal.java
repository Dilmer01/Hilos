package Procesos;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hilo1 h1 = new Hilo1();
		Hilo1 h2 = new Hilo1();
		
		h1.start();

		try {
			Thread.sleep(1000);
			
		} catch (InterruptedException  e ) {
			System.out.println(e);
			// TODO: handle exception
		}
		
		h2.start();

		try {
			Thread.sleep(1000);
			
		} catch (InterruptedException  e ) {
			System.out.println(e);
			// TODO: handle exception
		}

		

	}

}
