package com.reposicao.reposicaoAulaProjeto.dominio.Academia;

import lombok.Data;

import javax.persistence.Entity;
import java.io.Serializable;


@Entity
@Data
public class Curso extends AbstractField implements Serializable {

    public Curso(Long id, String descricao, String sigla) {
        super(id, descricao, sigla);
    }

    public Curso(){
        super();
    }
}
