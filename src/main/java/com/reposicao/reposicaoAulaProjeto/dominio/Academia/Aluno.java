package com.reposicao.reposicaoAulaProjeto.dominio.Academia;

import lombok.Data;

import javax.persistence.Entity;
import java.io.Serializable;

@Entity
public class Aluno extends AbstractPessoa implements Serializable {

    private int matricula;

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public Aluno(Long id, String name, int matricula) {
        this.setId(id);
        this.setName(name);
        this.setMatricula(matricula);
    }

    public Aluno() {
        super();
    }
}