package test.mx.uam.ayd.miproyecto.negocio;

import static org.junit.Assert.*;
import mx.uam.ayd.miproyecto.negocio.ServicioUsuarios;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ServicioUsuariosTest {

	private ServicioUsuarios servicio;
	
	@Before
	public void setUp() throws Exception {
		servicio = new ServicioUsuarios();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testValidaUsuario() {
		// caso de prueba 1
		boolean retorno = servicio.validaUsuario("juan", "123");
		assertEquals("Regreso false en vez de true", retorno, true);
		
		//caso de prueba 2
		retorno = servicio.validaUsuario("pedro", "888");
		assertEquals("Regreso true en vez de false", retorno, false);
	}

}
