package projeto.connectionJPA;

import java.io.Serializable;
import javax.persistance.Entity;
import javax.persistance.*;

import org.springframework.jpa.repository.JpaRepository;

@Repository
public interface RepositorioCliente extends JPARepository < Cliente{

    
} 
