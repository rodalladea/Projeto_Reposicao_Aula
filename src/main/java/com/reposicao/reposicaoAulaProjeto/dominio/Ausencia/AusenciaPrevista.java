package com.reposicao.reposicaoAulaProjeto.dominio.Ausencia;

import com.reposicao.reposicaoAulaProjeto.dominio.Academia.Professor;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.io.Serializable;
import java.util.Date;

@Entity
@Data
public class AusenciaPrevista extends AbstractAusencia implements Serializable {

    @Column
    private String motivo;

    @Column
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataComunicado;

    public AusenciaPrevista(Long id, Date dataSaida, Date dataRetorno, Professor professor, String motivo, Date dataComunicado) {
        this.setId(id);
        this.setDataSaida(dataSaida);
        this.setDataRetorno(dataRetorno);
        this.setProfessor(professor);
        this.setDataComunicado(dataComunicado);
        this.setMotivo(motivo);
    }

    public AusenciaPrevista(){
        super();
    }

}

