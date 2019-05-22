package com.reposicao.reposicaoAulaProjeto.dominio.Academia;

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
public class Diario implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @ManyToOne
    private Disciplina disciplina;

    @ManyToOne
    private Aluno aluno;

    private int totalAulas;
    private int totalFaltas;

    private int anoLetivo;

    @Temporal(TemporalType.TIMESTAMP)//timestamp_format = 'dd/mm/yyyy hh24:mi:ss.ff';
    private Date inicioPeriodo;

    @Temporal(TemporalType.TIMESTAMP)//timestamp_format = 'dd/mm/yyyy hh24:mi:ss.ff';
    private Date fimPeriodo;

    private int aulasSegunda;
    private int aulasTerca;
    private int aulasQuarta;
    private int aulasQuinta;
    private int aulasSexta;
}
