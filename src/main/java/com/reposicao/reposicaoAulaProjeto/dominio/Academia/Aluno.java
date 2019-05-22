package com.reposicao.reposicaoAulaProjeto.dominio.Academia;

import lombok.Data;

import javax.persistence.Entity;
import java.io.Serializable;

@Entity
@Data
public class Aluno extends AbstractPessoa implements Serializable {

    private int matricula;


    public Aluno(Long id, String name, int matricula) {
        this.setId(id);
        this.setName(name);
        this.setMatricula(matricula);
    }

    public Aluno() {
        super();
    }
}