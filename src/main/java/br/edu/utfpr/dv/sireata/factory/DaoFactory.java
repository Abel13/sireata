package br.edu.utfpr.dv.sireata.factory;

public interface DaoFactory {
  public int salvar(Object obj) throws Exception;

  public boolean excluir(int id) throws Exception;

  public Object buscarPorId(int id) throws Exception;

  public Object listarPorAta(int idAta) throws Exception;
}