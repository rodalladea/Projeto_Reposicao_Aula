package com.reposicao.reposicaoAulaProjeto.dominio.Academia;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.io.Serializable;

@MappedSuperclass
@Data
@NoArgsConstructor
@AllArgsConstructor
public abstract class AbstractPessoa  implements Serializable {

    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    protected Long id;
    protected String name;
}
