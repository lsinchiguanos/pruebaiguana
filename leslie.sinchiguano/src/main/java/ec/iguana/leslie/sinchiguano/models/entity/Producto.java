package ec.iguana.leslie.sinchiguano.models.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.ColumnDefault;

import java.math.BigDecimal;
import java.util.Date;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "producto")
public class Producto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idProducto")
    private Integer idProducto;

    @NotNull
    @NotEmpty
    @Column(name = "nombreProducto", nullable = false, length = 200, unique = true)
    private String nombreProducto;

    @NotNull
    @NotEmpty
    @Min(value = 0)
    @Column(name = "valorProducto", nullable = false, precision = 8, scale = 4)
    private BigDecimal valorProducto;

    @NotNull
    @NotEmpty
    @Min(value = 0)
    @Column(name = "porcentajeProducto", nullable = false, precision = 8, scale = 4)
    private BigDecimal porcentajeProducto;

    @Column(name = "estadoProducto", nullable = false, insertable = false)
    @ColumnDefault("1")
    /* *
    1 -> activo
    2 -> inactivo
    * */
    private Integer estadoProducto;

    @Column(name = "createdAt", nullable = false, insertable = false, columnDefinition = "timestamp default CURRENT_TIMESTAMP")
    private Date createdAt;

    @Column(name = "updatedAt", insertable = false)
    private Date updatedAt;

    @Column(name = "deletedAt", insertable = false)
    private Date deletedAt;
}
