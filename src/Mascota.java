public class Mascota {
	
	private String nombre;
	private float potencia;
	
	public float getPotencia() {
		return potencia;
	}

	public void setPotencia(float potencia) {
		this.potencia = potencia;
	}

	public Mascota(String nombre) {
		this.nombre = nombre;

	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void MandarMensaje() {
		System.out.println(" Soy  " + this.nombre + " y te voy a contar algo o no y tengo una potencia de "  + this.potencia);
	}

}