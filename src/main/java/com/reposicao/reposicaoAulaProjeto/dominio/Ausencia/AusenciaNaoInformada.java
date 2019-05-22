package com.reposicao.reposicaoAulaProjeto.dominio.Ausencia;

import com.reposicao.reposicaoAulaProjeto.dominio.Academia.Professor;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.io.Serializable;
import java.util.Date;


@Entity
@Data
public class AusenciaNaoInformada extends AbstractAusencia implements Serializable {

    public AusenciaNaoInformada(Long id, Date dataSaida, Date dataRetorno, Professor professor) {
        this.setId(id);
        this.setDataRetorno(dataRetorno);
        this.setProfessor(professor);
        this.setDataSaida(dataSaida);
    }

    public AusenciaNaoInformada(){
        super();
    }
}