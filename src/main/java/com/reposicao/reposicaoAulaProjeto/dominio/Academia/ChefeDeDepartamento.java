package com.reposicao.reposicaoAulaProjeto.dominio.Academia;


import lombok.Data;


import javax.persistence.*;
import java.io.Serializable;


@Entity
public class ChefeDeDepartamento extends AbstractPessoa  implements Serializable {

    @ManyToOne
    private Diretoria diretoria;


    @OneToOne
    private Cordenador cordenador;

    public ChefeDeDepartamento() {
        super();
    }

    public ChefeDeDepartamento(Long id, String name, Cordenador cordenador,Diretoria diretoria) {
        this.setName(name);
        this.setId(id);
        this.setCordenador(cordenador);
        this.setDiretoria(diretoria);
    }

    public Diretoria getDiretoria() {
        return diretoria;
    }

    public void setDiretoria(Diretoria diretoria) {
        this.diretoria = diretoria;
    }

    public Cordenador getCordenador() {
        return cordenador;
    }

    public void setCordenador(Cordenador cordenador) {
        this.cordenador = cordenador;
    }
}
