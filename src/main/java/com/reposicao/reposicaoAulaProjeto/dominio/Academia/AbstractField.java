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
public abstract class AbstractField implements Serializable {

        @Column(name="field_id")
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Long id;

    protected String descricao;

    protected String sigla;

}
