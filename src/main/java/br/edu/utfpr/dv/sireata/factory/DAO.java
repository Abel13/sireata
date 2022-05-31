package br.edu.utfpr.dv.sireata.factory;

import br.edu.utfpr.dv.sireata.dao.AnexoDAO;
import br.edu.utfpr.dv.sireata.dao.AtaDAO;

public enum DAO {
  Anexo {
    public AnexoDAO getAnexoInstance() {
      return new AnexoDAO();
    }
  },
  Ata {
    public AtaDAO getAtaInstance() {
      return new AtaDAO();
    }
  };

  public AnexoDAO getAnexoInstance() {
    return Anexo.getAnexoInstance();
  }

  public AtaDAO getAtaInstance() {
    return Ata.getAtaInstance();
  }
}
