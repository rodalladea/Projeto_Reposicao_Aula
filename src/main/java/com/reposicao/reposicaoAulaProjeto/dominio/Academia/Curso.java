package com.reposicao.reposicaoAulaProjeto.dominio.Academia;

import lombok.Data;

import javax.persistence.Entity;
import java.io.Serializable;


@Entity
public class Curso extends AbstractField implements Serializable {

    public Curso(Long id, String descricao, String sigla) {
        this.setDescricao(descricao);
        this.setId(id);
        this.setSigla(sigla);
    }

    public Curso(){
        super();
    }
}
