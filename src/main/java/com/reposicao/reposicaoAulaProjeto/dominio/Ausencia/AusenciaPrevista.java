package com.reposicao.reposicaoAulaProjeto.dominio.Ausencia;

import com.reposicao.reposicaoAulaProjeto.dominio.Academia.Professor;
import lombok.Data;

import javax.persistence.Entity;
import java.io.Serializable;
import java.util.Date;

@Data
@Entity
public class AusenciaPrevista extends AbstractAusencia implements Serializable {

    public AusenciaPrevista(Long id, Date dataSaida, Date dataRetorno, Professor professor) {
        this.setId(id);
        this.setDataRetorno(dataRetorno);
        this.setProfessor(professor);
        this.setDataSaida(dataSaida);
    }

    public AusenciaPrevista(){
        super();
    }

}

