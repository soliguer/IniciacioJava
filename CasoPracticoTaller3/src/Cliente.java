
public class Cliente extends UsuarioBase {

	public Cliente(String nombre, String apellidos) {
		super(nombre, apellidos);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean isAdministrator() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isSuperAdministrator() {
		// TODO Auto-generated method stub
		return false;
	}

}
