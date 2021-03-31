package com.pantera.demospringsecurity;

import com.pantera.demospringsecurity.domain.Usuario;
import com.pantera.demospringsecurity.repository.UsuarioRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class DemoSpringSecurityApplicationTests {

	@Autowired
	private UsuarioRepository usuarioRepository;

	@Autowired
	private BCryptPasswordEncoder encoder;

	@Test
	void crearUsuario() {
		Usuario user = new Usuario();
		user.setNombre("pante");
		user.setClave(encoder.encode("456"));
		Usuario usuarioBD = usuarioRepository.save(user);

		assertThat(usuarioBD.getClave()).isEqualTo(user.getClave());

	}

}
