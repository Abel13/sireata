package br.edu.utfpr.dv.sireata.model;

public abstract class SituacaoComentario {
  private static SituacaoComentario[] situacoes = {
    ComentarioNaoAnalisado.getInstance(),
    ComentarioAceito.getInstance(),
    ComentarioRecusado.getInstance(),
  };

  public abstract int getValue();

  public abstract String toString();
  
  public static SituacaoComentario valueOf(int value) {
    return situacoes[value];
  };
}
