
public abstract class UsuarioBase implements Usuario {
	private String nombre;
	private String apellidos;
	
	public UsuarioBase(String nombre, String apellidos) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
	}

	@Override
	public String getNombre() {
		return this.nombre;
	}

	@Override
	public String getApellidos() {
		
		return this.apellidos;
	}

	@Override
	public abstract boolean isAdministrator();

}
