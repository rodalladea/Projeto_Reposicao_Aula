package com.reposicao.reposicaoAulaProjeto.dominio.Academia.Repository;

import com.reposicao.reposicaoAulaProjeto.dominio.Academia.Diario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DiarioRepository extends JpaRepository<Diario, Long> {
}
