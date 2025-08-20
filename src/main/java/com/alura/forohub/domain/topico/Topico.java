package com.alura.forohub.domain.topico;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Table(name = "topicos")
@Entity(name = "Topico")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Topico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String titulo;
    private String mensaje;

    @Column(name = "fecha_creacion")
    private LocalDateTime fechaCreacion;
    
    private String status;
    private String autor;
    private String curso;

    public Topico(DatosRegistroTopico datosRegistroTopico) {
        this.titulo = datosRegistroTopico.titulo();
        this.mensaje = datosRegistroTopico.mensaje();
        this.autor = datosRegistroTopico.autor();
        this.curso = datosRegistroTopico.curso();
        this.fechaCreacion = LocalDateTime.now();
        this.status = "ACTIVO";
    }

    public void actualizarDatos(DatosActualizarTopico datosActualizarTopico) {
        if (datosActualizarTopico.titulo() != null && !datosActualizarTopico.titulo().isBlank()) {
            this.titulo = datosActualizarTopico.titulo();
        }        if (datosActualizarTopico.mensaje() != null && !datosActualizarTopico.mensaje().isBlank()) {
            this.mensaje = datosActualizarTopico.mensaje();
        }        if (datosActualizarTopico.autor() != null && !datosActualizarTopico.autor().isBlank()) {
            this.autor = datosActualizarTopico.autor();
        }        if (datosActualizarTopico.curso() != null && !datosActualizarTopico.curso().isBlank()) {
            this.curso = datosActualizarTopico.curso();
        }        if (datosActualizarTopico.status() != null && !datosActualizarTopico.status().isBlank()) {
            this.status = datosActualizarTopico.status();
        }
    }
}
