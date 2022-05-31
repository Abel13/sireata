package br.edu.utfpr.dv.sireata.factory;

import java.util.List;

import br.edu.utfpr.dv.sireata.model.Comentario;

public interface ComentarioFactory extends DaoFactory {
  public Comentario buscarPorUsuario(int idUsuario, int idPauta) throws Exception;

  public List<Comentario> listarPorPauta(int idPauta) throws Exception;
}
