package com.reposicao.reposicaoAulaProjeto.dominio.Ausencia.Repository;

import com.reposicao.reposicaoAulaProjeto.dominio.Ausencia.RelatorioAusenciaPrevista;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AusenciaPrevistaRepository extends JpaRepository<RelatorioAusenciaPrevista, Long> {
}
