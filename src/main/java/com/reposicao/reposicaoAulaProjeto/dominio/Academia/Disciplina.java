package com.reposicao.reposicaoAulaProjeto.dominio.Academia;


import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import java.io.Serializable;

@Entity
@Data
public class Disciplina extends AbstractField implements Serializable {

    @ManyToOne
    private Curso curso;
    @ManyToOne
    private Professor professor;

    public Disciplina(Long id, String descricao, String sigla, Curso curso, Professor professor) {
        this.setProfessor(professor);
        this.setId(id);
        this.setDescricao(descricao);
        this.setSigla(sigla);
        this.setCurso(curso);
    }

    public Disciplina (){
        super();
    }
}
