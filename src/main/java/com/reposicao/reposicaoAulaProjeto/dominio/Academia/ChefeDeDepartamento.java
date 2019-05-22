package com.reposicao.reposicaoAulaProjeto.dominio.Academia;

import com.reposicao.reposicaoAulaProjeto.dominio.Ausencia.AbstractAusencia;
import com.reposicao.reposicaoAulaProjeto.dominio.Reposicao.PlanoDeReposicao;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import java.io.Serializable;


@Entity
@Data
public class ChefeDeDepartamento extends Cordenador implements Serializable {

    @ManyToOne
    private Diretoria diretoria;

    public ChefeDeDepartamento(Long id, String nome, Curso curso, PlanoDeReposicao planoDeReposicao, AbstractAusencia ausencia, Diretoria diretoria) {
        this.setDiretoria(diretoria);
        this.setAusencia(ausencia);
        this.setCurso(curso);
        this.setId(id);
        this.setName(nome);
        this.setPlanoDeReposicao(planoDeReposicao);
    }

    private ChefeDeDepartamento(){super();}
}
