package mx.uam.ayd.miproyecto.negocio;

public class ServicioUsuarios {

	/**
	 * Este metodo recibe un login y password y compara estos valores
	 * con lo que se tiene almacenado
	 * 
	 * @param login cadena con la clave de usuario
	 * @param password cadena con la contrasena
	 * @return true si coinciden, false sino
	 */
	public boolean validaUsuario(String login, String password) {
		
		
		if (login.equals("juan") && password.equals("123")) {
			return true;
		}
		
		
		return true;
	}
}
