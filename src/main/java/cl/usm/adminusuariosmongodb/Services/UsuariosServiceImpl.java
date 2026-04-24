package cl.usm.adminusuariosmongodb.Services;

import cl.usm.adminusuariosmongodb.Entities.Usuario;
import cl.usm.adminusuariosmongodb.Repositories.UsuariosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsuariosServiceImpl implements UsuariosService {
    @Autowired
    UsuariosRepository usuariosRepository;

    @Override
    public boolean createUser(Usuario usuario) {
        try{
            this.usuariosRepository.insert(usuario);
            return true;
        }catch (Exception exception){
            return false;
        }
    }

    @Override
    public List<Usuario> getAll() {
        return this.usuariosRepository.findAll();
    }

    @Override
    public Optional<Usuario> findByEmail(String email) {
        return this.usuariosRepository.findById(email);
    }
}
