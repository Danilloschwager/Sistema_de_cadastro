package Sistema.EST.repository;

import Sistema.EST.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

    Optional<Usuario> findByNome(String nome);

    List<Usuario> findByNomeContainingIgnoreCase(String nome);

    boolean existsByNome(String nome);

    List<Usuario> findAllByOrderByNomeAsc();

    List<Usuario> findByServico(String servico);
}
