package br.edu.utfpr.dv.sireata.model;

public class ComentarioNaoAnalisado extends SituacaoComentario {
  private static ComentarioNaoAnalisado instance;

  private ComentarioNaoAnalisado() {
    super();
  }

  public static ComentarioNaoAnalisado getInstance() {
    if (instance == null) {
      instance = new ComentarioNaoAnalisado();
    }

    return instance;
  }

  public int getValue() {
    return 0;
  }

  public String toString() {
    return "Não Analisado";
  }
}
