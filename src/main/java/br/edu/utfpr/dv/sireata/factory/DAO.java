package br.edu.utfpr.dv.sireata.factory;

import br.edu.utfpr.dv.sireata.dao.AnexoDAO;
import br.edu.utfpr.dv.sireata.dao.AtaDAO;
import br.edu.utfpr.dv.sireata.dao.AtaParticipanteDAO;
import br.edu.utfpr.dv.sireata.dao.ComentarioDAO;
import br.edu.utfpr.dv.sireata.dao.OrgaoDAO;

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
  },
  AtaParticipante {
    public AtaParticipanteDAO getAtaParticipanteInstance() {
      return new AtaParticipanteDAO();
    }
  },
  Orgao {
    public OrgaoDAO getOrgaoInstance() {
      return new OrgaoDAO();
    }
  },
  Comentario {
    public ComentarioDAO getComentarioInstance() {
      return new ComentarioDAO();
    }
  };

  public AnexoDAO getAnexoInstance() {
    return Anexo.getAnexoInstance();
  }

  public AtaDAO getAtaInstance() {
    return Ata.getAtaInstance();
  }

  public AtaParticipanteDAO getAtaParticipanteInstance() {
    return AtaParticipante.getAtaParticipanteInstance();
  }

  public OrgaoDAO getOrgaoInstance() {
    return Orgao.getOrgaoInstance();
  }

  public ComentarioDAO getComentarioInstance() {
    return Comentario.getComentarioInstance();
  }
}
