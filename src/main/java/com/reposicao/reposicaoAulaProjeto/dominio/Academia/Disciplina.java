package com.reposicao.reposicaoAulaProjeto.dominio.Academia;


import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.io.Serializable;

@Entity
@Data
public class Disciplina extends AbstractField implements Serializable {

    @ManyToOne
    @JoinColumn(name="id")
    private Curso curso;

    @ManyToOne
    @JoinColumn(name="id")
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
