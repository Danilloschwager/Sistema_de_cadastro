package Sistema.EST.model;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "usuarios")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nome;

    @Column(nullable = false)
    private String servico;

    @Column(nullable = false)
    private LocalDateTime agendamento;

    @Column(nullable = false, unique = true)
    private String telefone;

    @Column(unique = true)
    private String email;
}