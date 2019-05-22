package com.reposicao.reposicaoAulaProjeto.dominio.Ausencia;

import com.reposicao.reposicaoAulaProjeto.dominio.Academia.Professor;

import javax.persistence.Entity;
import java.io.Serializable;
import java.util.Date;


@Entity
public class RelatorioAusenciaNaoInformada extends AbstractRelatorioAusencia implements Serializable {

    public RelatorioAusenciaNaoInformada(Long id, Date dataSaida, Date dataRetorno, Professor professor) {
        this.setId(id);
        this.setDataRetorno(dataRetorno);
        this.setProfessor(professor);
        this.setDataSaida(dataSaida);
    }

    public RelatorioAusenciaNaoInformada(){
        super();
    }
}