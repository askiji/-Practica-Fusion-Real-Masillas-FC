public class Mascota {
	private String nombre;
	private String color;
	
	
	public Mascota(String nombre, String color) {
		super();
		this.nombre = nombre;
		this.color = color;
	}

	public Mascota(String nombre) {
		this.nombre = nombre;

	}

	public String getNombre() {
		return nombre;
	}
	

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void MandarMensaje() {
		System.out.println("Soy " + this.nombre + " y te voy a contar algo o no y soy de color " + this.color );
	}

}