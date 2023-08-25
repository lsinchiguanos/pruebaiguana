package ec.iguana.leslie.sinchiguano.models.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.ColumnDefault;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.util.Date;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "ingrediente")
public class Ingrediente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idIngrediente")
    private Integer idIngrediente;

    @NotNull
    @NotEmpty
    @Column(name = "nombreIngrediente", nullable = false, length = 200, unique = true)
    private String nombreIngrediente;

    @NotNull
    @NotEmpty
    @Min(value = 0)
    @Column(name = "procentajeIngrediente", nullable = false, precision = 8, scale = 4)
    private BigDecimal procentajeIngrediente;

    @NotNull
    @NotEmpty
    @Min(value = 0)
    @Column(name = "valorIngrediente", nullable = false, precision = 8, scale = 4)
    private BigDecimal valorIngrediente;

    @Column(name = "estadoIngrediente", nullable = false, insertable = false)
    @ColumnDefault("1")
    /* *
    1 -> activo
    2 -> inactivo
    * */
    private Integer estadoIngrediente;

    @Column(name = "createdAt", nullable = false, insertable = false, columnDefinition = "timestamp default CURRENT_TIMESTAMP")
    private Date createdAt;

    @Column(name = "updatedAt", insertable = false)
    private Date updatedAt;

    @Column(name = "deletedAt", insertable = false)
    private Date deletedAt;

}
