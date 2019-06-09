
public class SuperUsuario extends UsuarioBase {

	public SuperUsuario(String nombre, String apellidos) {
		super(nombre, apellidos);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean isAdministrator() {

		return true;
	}

	@Override
	public boolean isSuperAdministrator() {

		return true;
	}

}
