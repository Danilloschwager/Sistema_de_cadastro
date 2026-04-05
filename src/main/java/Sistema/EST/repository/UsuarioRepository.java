package Sistema.EST.repository;

import Sistema.EST.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

    Usuario findByNome(String nome);

    List<Usuario> findByNomeContaining(String nome);

    boolean existsByNome(String nome);

    List<Usuario> findAllByOrderByNomeAsc();

    List<Usuario> findByServico(String servico);
}