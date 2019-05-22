package com.reposicao.reposicaoAulaProjeto.dominio.Academia.Repository;

import com.reposicao.reposicaoAulaProjeto.dominio.Academia.Curso;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CursoRepository extends JpaRepository<Curso, Long> {
}
