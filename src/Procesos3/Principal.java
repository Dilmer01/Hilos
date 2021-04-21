
package Procesos3;

public class Principal {

	public static void main(String[] args) {
		Hilo1 h1 = new Hilo1();
		Hilo2 h2 = new Hilo2();
		Hilo3 h3 = new Hilo3();
		Hilo4 h4 = new Hilo4();
		//hilo1
		h1.start();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO: handle exception
			System.out.println(e);
		}
		//hilo2
				h2.start();
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO: handle exception
					System.out.println(e);
				}
				//hilo3
				h3.start();
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO: handle exception
					System.out.println(e);
				}
				//hilo4
				h4.start();
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO: handle exception
					System.out.println(e);
				}

	}

}
