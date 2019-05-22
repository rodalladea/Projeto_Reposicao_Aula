package com.reposicao.reposicaoAulaProjeto.dominio.Academia;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@MappedSuperclass
@Data
@NoArgsConstructor
@AllArgsConstructor
public abstract class AbstractPessoa  implements Serializable {

    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    protected Long id;
    @Column
    protected String name;
}
