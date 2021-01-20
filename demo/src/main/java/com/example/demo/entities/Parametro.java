package com.example.demo.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name="parametro")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Parametro {

    private Integer idParametro ;
    private String tipoParametro;
    private String nombreParametro;


    @Id
    @SequenceGenerator(
            name="parametro_sequence",
            sequenceName="parametro_sequence",
            allocationSize=1)
    @GeneratedValue(strategy= GenerationType.SEQUENCE,
            generator="parametro_sequence")
    @Column(name = "id_parametro")
    public Integer getIdParametro() {
        return idParametro;
    }


    public void setIdParametro(Integer idParametro) {
        this.idParametro = idParametro;
    }




    @Column(name = "tipo_parametro")
    public String getTipoParametro() {
        return tipoParametro;
    }

    public void setTipoParametro(String tipoParametro) {
        this.tipoParametro = tipoParametro;
    }

    @Column(name = "nombre_parametro")
    public String getNombreParametro() {
        return nombreParametro;
    }

    public void setNombreParametro(String nombreParametro) {
        this.nombreParametro = nombreParametro;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Parametro parametro = (Parametro) o;
        return Objects.equals(idParametro, parametro.idParametro) &&
                Objects.equals(tipoParametro, parametro.tipoParametro) &&
                Objects.equals(nombreParametro, parametro.nombreParametro);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idParametro, tipoParametro, nombreParametro);
    }
}
