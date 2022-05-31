package br.edu.utfpr.dv.sireata.factory;

import java.util.List;

import br.edu.utfpr.dv.sireata.model.Usuario;

public interface UsuarioFactory extends DaoFactory {
  public List<Usuario> listarTodos(boolean apenasAtivos) throws Exception;

  public List<Usuario> listar(String nome, boolean apenasAtivos, boolean apenasExternos) throws Exception;

  public Usuario buscarPorLogin(String login) throws Exception;

  public Usuario buscarPorId(int id) throws Exception;

  public String buscarEmail(int id) throws Exception;

  public String[] buscarEmails(int[] ids) throws Exception;

  public boolean podeCriarAta(int idUsuario) throws Exception;
}
