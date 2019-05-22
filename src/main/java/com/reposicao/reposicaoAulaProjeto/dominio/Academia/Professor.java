package com.reposicao.reposicaoAulaProjeto.dominio.Academia;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import java.io.Serializable;

@Entity
@Data
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

    public Professor() {
        super();
    }
}


