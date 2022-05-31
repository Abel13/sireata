package br.edu.utfpr.dv.sireata.factory;

import java.util.List;

import br.edu.utfpr.dv.sireata.model.Campus;

public interface CampusFactory extends DaoFactory {
  public Campus buscarPorDepartamento(int idDepartamento) throws Exception;

  public List<Campus> listarTodos(boolean apenasAtivos) throws Exception;

  public List<Campus> listarParaCriacaoAta(int idUsuario) throws Exception;

  public List<Campus> listarParaConsultaAtas(int idUsuario) throws Exception;
}
