package com.reposicao.reposicaoAulaProjeto.dominio.Academia;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;

/** 
* Professor Tester. 
* 
* @author <Authors name> 
* @since <pre>mai 22, 2019</pre> 
* @version 1.0 
*/

@RunWith(SpringRunner.class)
@DataJpaTest
public class ProfessorTest {


    @Autowired
    private ProfessorRepository professorRepository;
    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void testeSalvaProfessor(){
        Professor professor = new Professor();
        professor.setName("Jorge");
        professor.setSIAPE(1234);
        professor.setCargaHoraria("28 Dias");
        this.professorRepository.save(professor);
        assertThat(professor.getId()).isNotNull();
        assertThat(professor.getName()).isEqualTo("Jorge");
        assertThat(professor.getSIAPE()).isEqualTo(1234);
        assertThat(professor.getCargaHoraria()).isEqualTo("28 Dias");
    }

    @Test
    public void testeAlteraProfessor(){
        Professor professor = new Professor();
        professor.setName("Jorge");
        professor.setSIAPE(1234);
        professor.setCargaHoraria("28 Dias");
        this.professorRepository.save(professor);
        professor.setName("Jorge Chavier");
        professor.setSIAPE(123434);
        professor.setCargaHoraria("18 Dias");
        this.professorRepository.save(professor);
        Professor professor2 = this.professorRepository.getOne(professor.getId());
        assertThat(professor2.getName()).isEqualTo("Jorge Chavier");
        assertThat(professor2.getSIAPE()).isEqualTo(123434);
        assertThat(professor2.getCargaHoraria()).isEqualTo("18 Dias");
    }

    @Test ()
    public void testeExcluiProfessor(){
        thrown.expect(org.springframework.orm.jpa.JpaObjectRetrievalFailureException.class);
        Professor professor = new Professor();
        professor.setName("Jorge");
        professor.setSIAPE(1234);
        professor.setCargaHoraria("18 Dias");
        this.professorRepository.save(professor);
        this.professorRepository.delete(professor);
        Professor professor2 = this.professorRepository.getOne(professor.getId());
    }


} 
