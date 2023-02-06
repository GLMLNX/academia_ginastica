package dio.academia.DTO;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AvaliacaoFisicaDTO {
    private int id_aluno;
    @NotBlank
    private double peso_aluno;
    @NotBlank
    private double altura_aluno;

}
