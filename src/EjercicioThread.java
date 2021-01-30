import java.util.Scanner;

public class EjercicioThread extends Thread{
	
	private int limSup;
	private int id;
	private long time;
	
	public EjercicioThread(int id, int limSup, long time) {
		
		this.id=id;
		this.limSup=limSup;
		this.time=time;
	}
	
	public void run() {
		try {
			
			if(id==1)
			{
				for (int i = 2; i <=limSup; i+=2) 
				{
					System.out.println(i);
					Thread.sleep(time);
				}
			}
			if(id==2)
			{
				for (int i = 1; i <= limSup; i+=2) 
				{
					System.out.println(i);
					Thread.sleep(time);
				}
			}

		}
		catch(Exception e) {}
	}
	
	public static void main(String[] args) {
		
		Scanner lector = new Scanner(System.in);
		System.out.println("Por favor ingrese el l�mite superior: ");

		int limSup=Integer.parseInt(lector.nextLine().trim());
		
		System.out.println("Por favor ingrese los milisegundos que quiere dormir los thread: ");

		long time = Long.parseLong(lector.nextLine().trim());
		
		EjercicioThread t1 = new EjercicioThread(1,limSup,time);
		EjercicioThread t2 = new EjercicioThread(2,limSup,time);

		
		t1.start();
		t2.start();
		
		lector.close();
	}

}