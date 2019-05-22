package com.reposicao.reposicaoAulaProjeto.dominio.Ausencia.Repository;

import com.reposicao.reposicaoAulaProjeto.dominio.Ausencia.RelatorioAusenciaImprevista;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AusenciaImprevistaRepository  extends JpaRepository<RelatorioAusenciaImprevista, Long> {
}
