package br.uniamerica.consultorio.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@NoArgsConstructor
@Table(name = "especialidades", schema = "public")
public class Especialidade extends AbstractEntity {
    @Getter @Setter
    @Column(nullable = false)
    private String nome;
}
