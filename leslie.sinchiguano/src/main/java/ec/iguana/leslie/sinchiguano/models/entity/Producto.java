package ec.iguana.leslie.sinchiguano.models.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.DecimalMin;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.ColumnDefault;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import org.hibernate.validator.constraints.Length;

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

    @NotNull(message = "${campo.requiered}")
    @NotBlank(message = "${campo.no.vacio}")
    @Length(max = 200, message = "${campo.maximo.caracteres} 200")
    @Length(min = 2, message = "${campo.minimo.caracteres} 2")
    @Column(name = "nombreProducto", nullable = false, length = 200, unique = true)
    private String nombreProducto;

    @NotNull(message = "${campo.requiered}")
    @NotBlank(message = "${campo.no.vacio}")
    @DecimalMin(value = "0.00", message = "${campo.minimo} 0.00")
    @Column(name = "valorProducto", nullable = false, precision = 8, scale = 4)
    private BigDecimal valorProducto;

    @NotNull(message = "${campo.requiered}")
    @NotBlank(message = "${campo.no.vacio}")
    @DecimalMin(value = "0.00", message = "${campo.minimo} 0.00")
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
