package Sistema.EST.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;

@Entity
@Table(name = "usuarios")
@Getter // Melhor que @Data para entidades JPA
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder // Permite criar objetos assim: Usuario.builder().nome("Ana").build()
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "O nome é obrigatório")
    @Column(nullable = false)
    private String nome;

    @NotBlank(message = "O serviço deve ser informado")
    @Column(nullable = false)
    private String servico;

    @Column(nullable = false)
    private LocalDateTime agendamento;

    @NotBlank(message = "O telefone é obrigatório")
    @Column(nullable = false, unique = true, length = 20)
    private String telefone;

    @Email(message = "Email inválido")
    @Column(unique = true)
    private String email;

    @CreationTimestamp // Preenche a data de criação automaticamente
    @Column(updatable = false, nullable = false)
    private LocalDateTime dataCriacao;
}
