package com.reposicao.reposicaoAulaProjeto.dominio.Academia;

import lombok.Data;
import org.aspectj.lang.annotation.control.CodeGenerationHint;

import javax.persistence.Column;
import javax.persistence.Entity;
import java.io.Serializable;

@Entity
public class Aluno extends AbstractPessoa implements Serializable {

    private int matricula;

    public int getMatricula() {
        return matricula;
    }
    public boolean aprovaReprocao; //Deduzindo que seja reposição

    public boolean isAprovaReprocao() {
        return aprovaReprocao;
    }

    @Column(nullable = true) //So propriedades getter são permitidas para anotação @Column
    public void setAprovaReprocao(boolean aprovaReprocao) {
        this.aprovaReprocao = aprovaReprocao;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public Aluno(Long id, String name, int matricula, boolean aprovaReprocao) {
        this.setId(id);
        this.setAprovaReprocao(aprovaReprocao);
        this.setName(name);
        this.setMatricula(matricula);
    }

    public Aluno() {
        super();
    }
}