package model;

import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class TipoUsuario {
    //user
    @OneToMany(mappedBy = "tipouser")

    private List<Usuarios> tipousuarios = new ArrayList<>();

    public List<Usuarios> getTipousuarios() {
        return tipousuarios;
    }

    //getter and setter
    public void setTipousuarios(List<Usuarios> tipousuarios) {
        this.tipousuarios = tipousuarios;
    }

    //animal
    @OneToMany(mappedBy = "tipoanimal")

    private List<Animal> tipoanimais = new ArrayList<>();

    public List<Animal> getTipoanimais() {
        return tipoanimais;
    }

    public void setTipoanimais(List<Animal> tipoanimais) {
        this.tipoanimais = tipoanimais;
    }

    //hasCode PK e FK

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TipoUsuario that = (TipoUsuario) o;
        return tipousuarios.equals(that.tipousuarios) && tipoanimais.equals(that.tipoanimais);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tipousuarios, tipoanimais);
    }
}
