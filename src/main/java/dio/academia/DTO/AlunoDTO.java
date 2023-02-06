package dio.academia.DTO;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AlunoDTO {
    @NotBlank
    @Size(min = 3,max = 30)
    private String nome;
    @NotBlank
    private String cpf;
    @NotBlank
    @Size(min = 5,max = 50)
    private String bairro;
    @NotBlank
    @Past
    private LocalDate dataNascimento;
}
