package ec.iguana.leslie.sinchiguano.models.entity;

import jakarta.persistence.*;

import lombok.*;
import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import org.hibernate.validator.constraints.Length;

import java.util.Date;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@DynamicInsert
@DynamicUpdate
@Entity(name = "persona")
public class Persona {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idPersona")
    private Integer idPersona;

    @NotNull(message = "${campo.requiered}")
    @NotBlank(message = "${campo.no.vacio}")
    @Column(name = "identificacionPersona", nullable = false, length = 13, unique = true)
    private String identificacionPersona;

    @NotNull(message = "${campo.requiered}")
    @NotBlank(message = "${campo.no.vacio}")
    @Length(max = 200, message = "${campo.maximo.caracteres} 200")
    @Length(min = 2, message = "${campo.minimo.caracteres} 2")
    @Column(name = "nombrePersona", nullable = false, length = 200)
    private String nombrePersona;

    @NotNull(message = "${campo.requiered}")
    @NotBlank(message = "${campo.no.vacio}")
    @Length(max = 200, message = "${campo.maximo.caracteres} 200")
    @Length(min = 2, message = "${campo.minimo.caracteres} 2")
    @Column(name = "apellidoPersona", nullable = false, length = 200)
    private String apellidoPersona;

    @NotNull(message = "${campo.requiered}")
    @NotBlank(message = "${campo.no.vacio}")
    @Column(name = "contactoPersona", nullable = false, length = 50)
    private String contactoPersona;

    @Column(name = "estadoPersona", nullable = false, insertable = false)
    @ColumnDefault("1")
    /* *
    1 -> activo
    2 -> inactivo
    * */
    private Integer estadoPersona;

    @Column(name = "createdAt", nullable = false, insertable = false, columnDefinition = "timestamp default CURRENT_TIMESTAMP")
    private Date createdAt;

    @Column(name = "updatedAt", insertable = false)
    private Date updatedAt;

    @Column(name = "deletedAt", insertable = false)
    private Date deletedAt;
}
