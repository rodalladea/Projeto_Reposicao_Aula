package com.reposicao.reposicaoAulaProjeto.dominio.Academia.Repository;

import com.reposicao.reposicaoAulaProjeto.dominio.Academia.Professor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProfessorRepository  extends JpaRepository<Professor, Long> {
}
