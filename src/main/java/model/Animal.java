package model;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "animal")

public class Animal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    //variaveis
    private Long idAnimal;
    private String nome;
    private int idade;
    private int sexo;
    private int porte;
    private int situacao;

    //relacionamento
    @ManyToOne
    @JoinColumn(name = "idUser")
    private TipoUsuario tipoanimal;

    //getter and setter
    public Long getIdAnimal() {
        return idAnimal;
    }

    public void setIdAnimal(Long idAnimal) {
        this.idAnimal = idAnimal;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getSexo() {
        return sexo;
    }

    public void setSexo(int sexo) {
        this.sexo = sexo;
    }

    public int getPorte() {
        return porte;
    }

    public void setPorte(int porte) {
        this.porte = porte;
    }

    public int getSituacao() {
        return situacao;
    }

    public void setSituacao(int situacao) {
        this.situacao = situacao;
    }

    //hasCode
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return idAnimal.equals(animal.idAnimal);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idAnimal);
    }
}
