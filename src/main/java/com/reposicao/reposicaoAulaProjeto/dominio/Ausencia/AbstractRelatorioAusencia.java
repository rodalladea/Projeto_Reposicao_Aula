package com.reposicao.reposicaoAulaProjeto.dominio.Ausencia;


import com.reposicao.reposicaoAulaProjeto.dominio.Academia.Professor;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@MappedSuperclass
@Data
@NoArgsConstructor
@AllArgsConstructor
public abstract class AbstractRelatorioAusencia implements Serializable {


    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Long id;

    @Temporal(TemporalType.TIMESTAMP)//timestamp_format = 'dd/mm/yyyy hh24:mi:ss.ff';
    protected Date dataSaida;

    @Temporal(TemporalType.TIMESTAMP)//timestamp_format = 'dd/mm/yyyy hh24:mi:ss.ff';
    protected Date dataRetorno;

    @ManyToOne
    protected Professor professor;


}
