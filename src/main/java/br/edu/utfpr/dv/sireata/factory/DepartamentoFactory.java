package br.edu.utfpr.dv.sireata.factory;

import java.util.List;

import br.edu.utfpr.dv.sireata.model.Departamento;

public interface DepartamentoFactory extends DaoFactory {
  public Departamento buscarPorOrgao(int idOrgao) throws Exception;

  public List<Departamento> listarTodos(boolean apenasAtivos) throws Exception;

  public List<Departamento> listarPorCampus(int idCampus, boolean apenasAtivos) throws Exception;

  public List<Departamento> listarParaCriacaoAta(int idCampus, int idUsuario) throws Exception;

  public List<Departamento> listarParaConsultaAtas(int idCampus, int idUsuario) throws Exception;
}
