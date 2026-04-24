package cl.usm.adminusuariosmongodb.Services;

import cl.usm.adminusuariosmongodb.Entities.Usuario;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

public interface UsuariosService {
    boolean createUser(Usuario usuario);
    List<Usuario> getAll();
    Optional<Usuario> findByEmail(String email);
}
