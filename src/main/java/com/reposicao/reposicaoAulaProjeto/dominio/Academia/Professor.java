package com.reposicao.reposicaoAulaProjeto.dominio.Academia;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import java.io.Serializable;

@Entity
public class Professor extends AbstractPessoa implements Serializable {

    @Column
    private int SIAPE;
    @Column
    private String cargaHoraria;

    public Professor(Long id, String name, int SIAPE, String cargaHoraria) {
        this.setId(id);
        this.setName(name);
        this.setSIAPE(SIAPE);
        this.setCargaHoraria(cargaHoraria);
    }

    public int getSIAPE() {
        return SIAPE;
    }

    public void setSIAPE(int SIAPE) {
        this.SIAPE = SIAPE;
    }

    public String getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(String cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public Professor() {
        super();
    }
}


