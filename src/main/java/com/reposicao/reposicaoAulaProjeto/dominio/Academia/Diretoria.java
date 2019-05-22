package com.reposicao.reposicaoAulaProjeto.dominio.Academia;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import java.io.Serializable;

@Entity
@Data
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

    public  Diretoria(){
        super();
    }

}
