package br.edu.utfpr.dv.sireata.model;

public class ComentarioAceito extends SituacaoComentario {
  private static ComentarioAceito instance;

  private ComentarioAceito() {
    super();
  }

  public static ComentarioAceito getInstance() {
    if (instance == null) {
      instance = new ComentarioAceito();
    }

    return instance;
  }

  public int getValue() {
    return 1;
  }

  public String toString() {
    return "Aceito";
  }
}
