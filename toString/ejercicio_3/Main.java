package ejercicio_3;

public class Main {

	public static void main(String[] args) {
		Mamifero [] mamiferos = {
				new Mamifero ("Lobo", "Cánido", "Medio", "Blanco, marron, gris y negro"),
				new Mamifero ("Gato", "Felino", "Corto/medio/largo", "Negro, blanco, marrón y mestizos")
		};
		Ave [] aves = {
				new Ave("Águila", "Falconiforme", "Media", "Blanco, marron, gris y negro"),
				new Ave("Loro", "Psitaciformes", "Media y largas", "Verdes, rojas y azules")
				
		};
		
		Peces[] pez = {
				new Peces("Globo","Tetraodontiformes", "Vertebrado", 3),
				new Peces("Payaso", "Pomacentridae", "Vertebrado", 3)
		};
		
		System.out.println("---Datos de los mamíferos: ");
		for (Mamifero mamifero : mamiferos) {
		System.out.println(mamifero);
		System.out.println();
		}
		
		System.out.println("---Datos de las aves: ");
		for (Ave pajaritos : aves) {
		System.out.println(pajaritos);
		System.out.println();
		}
		
		System.out.println("---Datos de los peces: ");
		for (Peces pescaditos : pez) {
		System.out.println(pescaditos);
		System.out.println();
		}

	}

}
