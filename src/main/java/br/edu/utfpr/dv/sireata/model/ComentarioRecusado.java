package br.edu.utfpr.dv.sireata.model;

public class ComentarioRecusado extends SituacaoComentario {
  private static ComentarioRecusado instance;

  private ComentarioRecusado() {
    super();
  }

  public static ComentarioRecusado getInstance() {
    if (instance == null) {
      instance = new ComentarioRecusado();
    }

    return instance;
  }

  public int getValue() {
    return 2;
  }

  public String toString() {
    return "Recusado";
  }

}
