package com.reposicao.reposicaoAulaProjeto.dominio.Academia;

import com.reposicao.reposicaoAulaProjeto.dominio.Academia.Repository.CordenadorRepository;
import com.reposicao.reposicaoAulaProjeto.dominio.Academia.Repository.CursoRepository;
import com.reposicao.reposicaoAulaProjeto.dominio.Ausencia.*;
import com.reposicao.reposicaoAulaProjeto.dominio.Ausencia.Repository.AusenciaImprevistaRepository;
import com.reposicao.reposicaoAulaProjeto.dominio.Ausencia.Repository.AusenciaNaoInformadaRepository;
import com.reposicao.reposicaoAulaProjeto.dominio.Ausencia.Repository.AusenciaPrevistaRepository;
import org.junit.Before;
import org.junit.Rule;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Cordenador Tester.
 *
 * @author <Authors name>
 * @since <pre>05/22/2019</pre>
 * @version 1.0
 */
@DataJpaTest
@RunWith(SpringRunner.class)
public class CordenadorTest  {

    @Autowired
    private CordenadorRepository cordenadorRepository;
    @Autowired
    private CursoRepository cursoRepository;
    @Autowired
    private AusenciaImprevistaRepository ausenciaImprevistaRepository;
    @Autowired
    private AusenciaNaoInformadaRepository ausenciaNaoInformadaRepository;
    @Autowired
    private AusenciaPrevistaRepository ausenciaPrevistaRepository;
    @Rule
    public ExpectedException thrown = ExpectedException.none();

    private Curso curso, curso2;
    private AbstractRelatorioAusencia ausenciaPrevista, ausenciaImprevista, ausenciaNaoInformada;

    @Before
    public void setUp(){
        this.curso = new Curso();
        this.curso2 = new Curso();
        this.curso.setDescricao("Arquitetura");
        this.curso.setSigla("SO33");
        this.curso2.setDescricao("Geografia");
        this.curso2.setSigla("GO33");
        this.cursoRepository.save(curso);
        this.cursoRepository.save(curso2);

    }
}






