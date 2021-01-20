
package com.example.demo.entities;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.data.repository.query.Param;

import javax.persistence.*;
import java.math.BigInteger;
import java.util.Date;
import java.util.Objects;


@Entity
@Table(name="formulario")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Formulario {

    private Integer id;
    private BigInteger nodocumento ;
    private  String email;
    private  String comentarios;
    private Parametro marcaFavorita;
    private Date fecha_respuesta;


    @Id
    @SequenceGenerator(
            name="formulario_sequence",
            sequenceName="formulario_sequence",
            allocationSize=1)
    @GeneratedValue(strategy= GenerationType.SEQUENCE,
            generator="formulario_sequence")
    @Column(name = "id_formulario")
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Column(name = "nodocumento")
    public BigInteger getNodocumento() {
        return nodocumento;
    }

    public void setNodocumento(BigInteger nodocumento) {
        this.nodocumento = nodocumento;
    }


    @Column(name = "email")
    public String getEmail() {
        return email;
    }


    public void setEmail(String email) {
        this.email = email;
    }

    @Column(name = "comentarios")
    public String getComentarios() {
        return comentarios;
    }

    public void setComentarios(String comentarios) {
        this.comentarios = comentarios;
    }


    @ManyToOne
    @JoinColumn(name = "marca_favorita", referencedColumnName = "id_parametro")
    public Parametro getMarcaFavorita() {
        return marcaFavorita;
    }

    public void setMarcaFavorita(Parametro marcaFavorita) {
        this.marcaFavorita = marcaFavorita;
    }

    @Column(name = "fecha_respuesta")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm a z")
    public Date getFecha_respuesta() {
        return fecha_respuesta;
    }

    public void setFecha_respuesta(Date fecha_respuesta) {
        this.fecha_respuesta = fecha_respuesta;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Formulario that = (Formulario) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(nodocumento, that.nodocumento) &&
                Objects.equals(email, that.email) &&
                Objects.equals(comentarios, that.comentarios) &&
                Objects.equals(marcaFavorita, that.marcaFavorita) &&
                Objects.equals(fecha_respuesta, that.fecha_respuesta);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nodocumento, email, comentarios, marcaFavorita, fecha_respuesta);
    }
}
