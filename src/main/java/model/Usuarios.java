package model;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "aluno")

public class Usuarios {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    //variaveis
    private Long idUser;
    private String nome;
    private String email;
    private String senha;
    private String telefone;
    private String cpf;
    private String endereco;

    //relacionamento
    @ManyToOne
    @JoinColumn(name = "idAnimal")
    private TipoUsuario tipouser;



    //getter and setter
    public Long getIdUser() {
        return idUser;
    }

    public void setIdUser(Long idUser) {
        this.idUser = idUser;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    //hasCode
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Usuarios usuarios = (Usuarios) o;
        return idUser.equals(usuarios.idUser);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idUser);
    }


}
