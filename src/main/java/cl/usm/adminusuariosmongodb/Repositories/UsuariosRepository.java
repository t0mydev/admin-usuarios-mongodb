package cl.usm.adminusuariosmongodb.Repositories;

import cl.usm.adminusuariosmongodb.Entities.Usuario;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UsuariosRepository extends MongoRepository<Usuario,String> {
}
