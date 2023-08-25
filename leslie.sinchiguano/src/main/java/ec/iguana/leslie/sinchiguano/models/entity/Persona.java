package ec.iguana.leslie.sinchiguano.models.entity;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
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

    @Column(name = "identificacionPersona", nullable = false, length = 13, unique = true)
    @NotNull
    @NotEmpty
    private String identificacionPersona;

    @NotNull
    @NotEmpty
    @Column(name = "nombrePersona", nullable = false, length = 200)
    private String nombrePersona;

    @NotNull
    @NotEmpty
    @Column(name = "apellidoPersona", nullable = false, length = 200)
    private String apellidoPersona;

    @NotNull
    @NotEmpty
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
