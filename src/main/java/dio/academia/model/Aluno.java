package dio.academia.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@Data
@AllArgsConstructor
@Entity
@Table(name = "alunos")
public class Aluno {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(nullable = false,length = 30)
    private String nome;
    @Column(nullable = false,unique = true,length = 11)
    private String cpf;
    @Column(nullable = false,length = 50)
    private String bairro;

    private LocalDate dataNascimento;
    @OneToMany(mappedBy = "aluno",cascade = CascadeType.REMOVE,fetch = FetchType.LAZY)
    private List<AvaliacaoFisica> avaliacaoFisicaList= new ArrayList<>();
}
