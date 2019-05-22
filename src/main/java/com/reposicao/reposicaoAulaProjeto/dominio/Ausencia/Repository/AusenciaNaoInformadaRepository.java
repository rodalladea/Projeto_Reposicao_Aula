package com.reposicao.reposicaoAulaProjeto.dominio.Ausencia.Repository;

import com.reposicao.reposicaoAulaProjeto.dominio.Ausencia.RelatorioAusenciaNaoInformada;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AusenciaNaoInformadaRepository extends JpaRepository<RelatorioAusenciaNaoInformada, Long> {
}
