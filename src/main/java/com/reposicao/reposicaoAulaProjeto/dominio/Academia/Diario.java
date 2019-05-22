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
    @JoinColumn(name="id")
    private Disciplina disciplina;

    @ManyToOne
    @JoinColumn(name="id")
    private Aluno aluno;

    @Column
    private int totalAulas;
    @Column
    private int totalFaltas;
    @Column
    private int anoLetivo;

    @Temporal(TemporalType.TIMESTAMP)//timestamp_format = 'dd/mm/yyyy hh24:mi:ss.ff';
    private Date inicioPeriodo;

    @Temporal(TemporalType.TIMESTAMP)//timestamp_format = 'dd/mm/yyyy hh24:mi:ss.ff';
    private Date fimPeriodo;
    @Column
    private int aulasSegunda;
    @Column
    private int aulasTerca;
    @Column
    private int aulasQuarta;
    @Column
    private int aulasQuinta;
    @Column
    private int aulasSexta;
}
