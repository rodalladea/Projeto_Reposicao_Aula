package com.reposicao.reposicaoAulaProjeto.dominio.Academia;

import com.reposicao.reposicaoAulaProjeto.dominio.Ausencia.RelatorioAusenciaPrevista;
import com.reposicao.reposicaoAulaProjeto.dominio.Reposicao.PlanoDeReposicao;

import javax.persistence.*;
import java.io.Serializable;


@Entity
public class Cordenador extends AbstractPessoa implements Serializable {


    @OneToOne
    private Curso curso;
    @ManyToOne
    private PlanoDeReposicao planoDeReposicao;
    @ManyToOne
    private RelatorioAusenciaPrevista ausencia;


    public Cordenador(Long id, String nome, Curso curso, PlanoDeReposicao planoDeReposicao, RelatorioAusenciaPrevista ausencia) {
        this.setId(id);
        this.setName(nome);
        this.setCurso(curso);
        this.setPlanoDeReposicao(planoDeReposicao);
        this.setAusencia(ausencia);
    }

    public Cordenador() {
        super();

    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public PlanoDeReposicao getPlanoDeReposicao() {
        return planoDeReposicao;
    }

    public void setPlanoDeReposicao(PlanoDeReposicao planoDeReposicao) {
        this.planoDeReposicao = planoDeReposicao;
    }

    public RelatorioAusenciaPrevista getAusencia() {
        return ausencia;
    }

    public void setAusencia(RelatorioAusenciaPrevista ausencia) {
        this.ausencia = ausencia;
    }
}
