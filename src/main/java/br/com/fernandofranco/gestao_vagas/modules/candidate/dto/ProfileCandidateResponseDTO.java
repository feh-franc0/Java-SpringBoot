package br.com.fernandofranco.gestao_vagas.modules.candidate.dto;

import java.util.UUID;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ProfileCandidateResponseDTO {
  @Schema(example = "Desenvolvedor Java")
  private String description;

  @Schema(example = "Fernando")
  private String username;

  @Schema(example = "frando@gmail.com")
  private String email;

  private UUID id;

  @Schema(example = "Fernando Franco")
  private String name;
}
