package ejercicio_5;

public class TelevisorMain {

	public static void main(String[] args) {

		LG lg = new LG("LG 50UQ80006LB", 50, "LED", " UHD 4K", "inteligente α5 Gen5 AI Processor 4K.");
		Samsung sam = new Samsung("Samsung UE50AU7175UXXC", 50, "LED", " UHD 4K", "Crystal UHD.");
		
		System.out.println("--MARCA LG--");
		System.out.println(lg);
		System.out.println("-------------------------------------------");
		System.out.println("--MARCA SAMSUNG--");
		System.out.println(sam);
		
	}
	

}
