package com.reposicao.reposicaoAulaProjeto.dominio.Reposicao;


import com.reposicao.reposicaoAulaProjeto.dominio.Academia.Diario;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PlanoDeReposicao implements Serializable {

    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @ManyToOne
    @JoinColumn(name = "id")
    private Diario diario;

    private String conteudo;

    @Temporal(TemporalType.TIMESTAMP)//timestamp_format = 'dd/mm/yyyy hh24:mi:ss.ff';
    private Date dataReposicao;

    private String categoria;

    private boolean aprovado;



}
