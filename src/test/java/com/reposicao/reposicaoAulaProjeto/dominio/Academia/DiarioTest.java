package com.reposicao.reposicaoAulaProjeto.dominio.Academia;

import com.reposicao.reposicaoAulaProjeto.dominio.Academia.Repository.*;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Diario Tester.
 *
 * @author <Authors name>
 * @since <pre>05/22/2019</pre>
 * @version 1.0
 */
@DataJpaTest
@RunWith(SpringRunner.class)
public class DiarioTest {

    @Autowired
    private DiarioRepository diarioRepository;
    @Autowired
    private DisciplinaRepository disciplinaRepository;
    @Autowired
    private AlunoRepository alunoRepository;
    @Rule
    public ExpectedException thrown = ExpectedException.none();
    @Autowired
    ProfessorRepository professorRepository;
    @Autowired
    private CursoRepository cursoRepository;


    private Curso curso, curso2;
    private Professor professor, professor2;
    private Disciplina disciplina, disciplina2;
    private Aluno aluno, aluno2;
    SimpleDateFormat f = new SimpleDateFormat("dd/mm/yyyy");

    @Before
    public void setUp(){
        this.curso = new Curso();
        this.professor = new Professor();
        this.curso2 = new Curso();
        this.professor2 = new Professor();
        this.curso.setDescricao("Arquitetura");
        this.curso.setSigla("SO33");
        this.curso2.setDescricao("Geografia");
        this.curso2.setSigla("GO33");
        this.cursoRepository.save(curso);
        this.cursoRepository.save(curso2);
        professor.setName("Jorge");
        professor.setSIAPE(1234);
        professor.setCargaHoraria("28 Dias");
        professor2.setName("Fernando");
        professor2.setSIAPE(12340000);
        professor2.setCargaHoraria("18 Dias");
        this.professorRepository.save(professor);
        this.professorRepository.save(professor2);
        this.disciplina2 = new Disciplina();
        this.disciplina = new Disciplina();
        disciplina.setDescricao("Progamacao Distri");
        disciplina.setSigla("ProgD");
        disciplina.setProfessor(this.professor);
        disciplina.setCurso(this.curso);
        disciplina2.setDescricao("Progamacao DistriFake");
        disciplina2.setSigla("ProgDFake");
        disciplina2.setProfessor(this.professor);
        disciplina2.setCurso(this.curso);
        this.disciplinaRepository.save(disciplina);
        this.disciplinaRepository.save(disciplina2);
    }


    @org.junit.Test
    public void testeSalvaDiario() throws ParseException {
        Diario diario = new Diario();
        Diario diario2 = new Diario();
        diario.setAluno(aluno);
        diario.setDisciplina(disciplina);
        diario.setAnoLetivo(2019);
        diario.setAulasQuarta(0);
        diario.setAulasSegunda(3);
        diario.setAulasQuinta(2);
        diario.setAulasTerca(0);
        diario.setAulasSexta(0);
        diario.setInicioPeriodo(this.f.parse("12/03/2019"));
        diario.setFimPeriodo(this.f.parse("22/06/2019"));
        diario.setTotalAulas(69);
        diario.setTotalFaltas(12);
        this.diarioRepository.save(diario);
        diario2.setAluno(aluno);
        diario2.setDisciplina(disciplina);
        diario2.setAnoLetivo(2018);
        diario2.setAulasQuarta(2);
        diario2.setAulasSegunda(2);
        diario2.setAulasQuinta(0);
        diario2.setAulasTerca(0);
        diario2.setAulasSexta(0);
        diario2.setInicioPeriodo(this.f.parse("12/07/2019"));
        diario2.setFimPeriodo(this.f.parse("22/12/2019"));
        diario2.setTotalAulas(89);
        diario2.setTotalFaltas(2);
        this.diarioRepository.save(diario2);
        assertThat(diario.getId()).isNotNull();
        assertThat(diario.getAluno()).isEqualTo(this.aluno);
        assertThat(diario.getDisciplina()).isEqualTo(this.disciplina);
        assertThat(diario.getDisciplina().getCurso()).isEqualTo(this.curso);

        assertThat(diario2.getId()).isNotNull();
        assertThat(diario2.getAluno()).isEqualTo(this.aluno);
        assertThat(diario2.getDisciplina()).isEqualTo(this.disciplina);
        assertThat(diario2.getDisciplina().getCurso()).isEqualTo(this.curso);
    }

    @org.junit.Test
    public void testeAlteraDiario() throws ParseException {

        Diario diario = new Diario();
        diario.setAluno(aluno);
        diario.setDisciplina(disciplina);
        diario.setAnoLetivo(2019);
        diario.setAulasQuarta(0);
        diario.setAulasSegunda(3);
        diario.setAulasQuinta(2);
        diario.setAulasTerca(0);
        diario.setAulasSexta(0);
        diario.setInicioPeriodo(this.f.parse("12/03/2019"));
        diario.setFimPeriodo(this.f.parse("22/06/2019"));
        diario.setTotalAulas(69);
        diario.setTotalFaltas(12);
        this.diarioRepository.save(diario);
        diario.setAluno(aluno2);
        diario.setDisciplina(disciplina2);
        diario.setAnoLetivo(2018);
        diario.setAulasQuarta(2);
        diario.setAulasSegunda(2);
        diario.setAulasQuinta(0);
        diario.setAulasTerca(0);
        diario.setAulasSexta(0);
        diario.setInicioPeriodo(this.f.parse("12/07/2019"));
        diario.setFimPeriodo(this.f.parse("22/12/2019"));
        diario.setTotalAulas(89);
        diario.setTotalFaltas(2);
        this.diarioRepository.save(diario);
        Diario diario2 = this.diarioRepository.getOne(diario.getId());
        assertThat(diario2.getId()).isNotNull();
        assertThat(diario2.getAluno()).isEqualTo(this.aluno2);
        assertThat(diario2.getDisciplina()).isEqualTo(this.disciplina2);
        assertThat(diario2.getDisciplina().getCurso()).isEqualTo(this.curso);

    }

    @Test()
    public void testeExcluiDiario() throws ParseException {
        thrown.expect(org.springframework.orm.jpa.JpaObjectRetrievalFailureException.class);
        Diario diario = new Diario();
        diario.setAluno(aluno);
        diario.setDisciplina(disciplina);
        diario.setAnoLetivo(2019);
        diario.setAulasQuarta(0);
        diario.setAulasSegunda(3);
        diario.setAulasQuinta(2);
        diario.setAulasTerca(0);
        diario.setAulasSexta(0);
        diario.setInicioPeriodo(this.f.parse("12/03/2019"));
        diario.setFimPeriodo(this.f.parse("22/06/2019"));
        diario.setTotalAulas(69);
        diario.setTotalFaltas(12);
        this.diarioRepository.save(diario);
        this.diarioRepository.delete(diario);
        this.diarioRepository.getOne(diario.getId());
    }


}
