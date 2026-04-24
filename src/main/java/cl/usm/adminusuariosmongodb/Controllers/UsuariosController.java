package cl.usm.adminusuariosmongodb.Controllers;

import cl.usm.adminusuariosmongodb.Entities.Usuario;
import cl.usm.adminusuariosmongodb.Services.UsuariosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UsuariosController {
    @Autowired
    private UsuariosService usuariosService;

    @GetMapping("/usuarios")
    public ResponseEntity<List<Usuario>> getAll(){
        try {
            List<Usuario> usuarios =this.usuariosService.getAll();
            return ResponseEntity.ok(usuarios);
        }catch(Exception exception){
            return ResponseEntity.internalServerError().build();
        }
    }
    @PostMapping("/usuarios")
    public ResponseEntity<?> createUser(@RequestBody Usuario usuario){
        boolean result= this.usuariosService.createUser(usuario);
        if (result){
            return ResponseEntity.ok().build();
        }
        return ResponseEntity.internalServerError().build();
    }
    @GetMapping("usuarios/{email}")
    public ResponseEntity<?> findByEmail(@PathVariable String email){
        return null;
    }
}
