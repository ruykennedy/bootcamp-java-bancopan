package com.academia.dio.api.dto;

import java.time.LocalDate;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AlunoOutput {

    private Long id;
    private String nome;
    private String cpf;
    private LocalDate dataNascimento;
}
