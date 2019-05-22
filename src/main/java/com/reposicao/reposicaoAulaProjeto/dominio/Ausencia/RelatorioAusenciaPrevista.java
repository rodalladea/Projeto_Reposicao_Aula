package com.reposicao.reposicaoAulaProjeto.dominio.Ausencia;

import com.reposicao.reposicaoAulaProjeto.dominio.Academia.Professor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.io.Serializable;
import java.util.Date;

@Entity
public class RelatorioAusenciaPrevista extends AbstractRelatorioAusencia implements Serializable {

    @Column
    private String motivo;

    @Column
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataComunicado;

    public RelatorioAusenciaPrevista(Long id, Date dataSaida, Date dataRetorno, Professor professor, String motivo, Date dataComunicado) {
        this.setId(id);
        this.setDataSaida(dataSaida);
        this.setDataRetorno(dataRetorno);
        this.setProfessor(professor);
        this.setDataComunicado(dataComunicado);
        this.setMotivo(motivo);
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public Date getDataComunicado() {
        return dataComunicado;
    }

    public void setDataComunicado(Date dataComunicado) {
        this.dataComunicado = dataComunicado;
    }

    public RelatorioAusenciaPrevista(){
        super();
    }

}

