package com.reposicao.reposicaoAulaProjeto.dominio.Ausencia;

import com.reposicao.reposicaoAulaProjeto.dominio.Academia.Professor;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.io.Serializable;
import java.util.Date;


@Entity
@Data
public class AusenciaNaoInformada extends AbstractAusencia implements Serializable {

    private String motivo;

    @Temporal(TemporalType.TIMESTAMP)
    private Date dataComunicado;

    public AusenciaNaoInformada(Long id, Date dataSaida, Date dataRetorno, Professor professor, String motivo) {
        this.setId(id);
        this.setDataSaida(dataSaida);
        this.setDataRetorno(dataRetorno);
        this.setProfessor(professor);
        this.setMotivo(motivo);
    }

    public AusenciaNaoInformada(){
        super();
    }
}