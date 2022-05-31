package br.edu.utfpr.dv.sireata.factory;

import java.util.List;

import br.edu.utfpr.dv.sireata.model.Pauta;

public interface PautaFactory extends DaoFactory {
  public void excluir(int id) throws Exception;

  public List<Pauta> listarPorAta(int idAta) throws Exception;
}
