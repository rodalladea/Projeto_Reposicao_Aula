package com.reposicao.reposicaoAulaProjeto.dominio.Academia;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.reposicao.reposicaoAulaProjeto.dominio.Ausencia.AbstractAusencia;
import com.reposicao.reposicaoAulaProjeto.dominio.Reposicao.PlanoDeReposicao;
import lombok.Data;

import javax.persistence.Entity;
import java.io.Serializable;


@Entity
@Data
public abstract class Cordenador extends AbstractPessoa implements Serializable {


    protected Curso curso;
    protected PlanoDeReposicao planoDeReposicao;
    protected AbstractAusencia ausencia;


    public Cordenador(Long id, String nome, Curso curso, PlanoDeReposicao planoDeReposicao, AbstractAusencia ausencia) {
        this.setId(id);
        this.setName(nome);
        this.setCurso(curso);
        this.setPlanoDeReposicao(planoDeReposicao);
        this.setAusencia(ausencia);
    }

    public Cordenador() {
        super();

    }
}
