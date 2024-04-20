package br.com.fernandofranco.gestao_vagas.exceptions;

public class JobNotFoundException extends RuntimeException {
  public JobNotFoundException() {
    super("Job Not Found.");
  }
}
