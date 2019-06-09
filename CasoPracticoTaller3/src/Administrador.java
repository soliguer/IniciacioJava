
public class Administrador extends UsuarioBase {

	public Administrador(String nombre, String apellidos) {
		super(nombre, apellidos);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean isAdministrator() {
		return true;
	}

	@Override
	public boolean isSuperAdministrator() {

		return false;
	}

}
