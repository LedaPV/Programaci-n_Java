package abstractainterfaces;

abstract class Producto {
	private String nombre;
	private String descripcion;
	private double precio;
	
	public Producto(String nombre, String descripcion, double precio) {
		super();
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.precio = precio;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	
	//Ahora podemos crear nuestro método abstracto.
	
	public abstract void MonstrarInformacion();
	

	
	
	
}