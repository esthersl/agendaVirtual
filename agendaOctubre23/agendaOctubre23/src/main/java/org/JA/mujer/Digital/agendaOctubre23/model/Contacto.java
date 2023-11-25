package org.JA.mujer.Digital.agendaOctubre23.model;

import lombok.Getter;
import lombok.Setter;
import net.bytebuddy.dynamic.loading.InjectionClassLoader;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
@Entity
@Setter
@Getter
public class Contacto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idcontacto")
    private Integer id;
    @NotBlank
    private String nombre;

    @PastOrPresent
    @DateTimeFormat(iso= DateTimeFormat.ISO.DATE)
    @Column(name="fechanac")
    private LocalDate fechaNacimineto;
    @Size(max = 15)
    private String celular;

    @Email
    private String mail;
    @Column(name="fechareg")
    private LocalDateTime fechaRegistro;

}
