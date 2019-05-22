package com.reposicao.reposicaoAulaProjeto.dominio.Academia;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import java.io.Serializable;

@Entity
public class Diretoria extends AbstractField implements Serializable {

    @Column
    private String instituicao;
    @Column
    private String resolucaoDeFaltas;


    public Diretoria(Long id, String descricao, String sigla, String instituicao, String resolucaoDeFaltas) {
        this.setDescricao(descricao);
        this.setSigla(sigla);
        this.setId(id);
        this.setResolucaoDeFaltas(resolucaoDeFaltas);
        this.setInstituicao(instituicao);
    }

    public String getInstituicao() {
        return instituicao;
    }

    public void setInstituicao(String instituicao) {
        this.instituicao = instituicao;
    }

    public String getResolucaoDeFaltas() {
        return resolucaoDeFaltas;
    }

    public void setResolucaoDeFaltas(String resolucaoDeFaltas) {
        this.resolucaoDeFaltas = resolucaoDeFaltas;
    }

    public  Diretoria(){
        super();
    }

}
