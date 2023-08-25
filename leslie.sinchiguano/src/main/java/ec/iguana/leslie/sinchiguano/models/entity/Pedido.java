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
@Entity(name = "pedido")
public class Pedido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idPedido")
    private Integer idPedido;

    @ManyToOne
    @JoinColumn(name = "idPersona", nullable = false)
    private Persona persona;

    @NotNull
    @Column(name = "fechaPedido", nullable = false, insertable = false, columnDefinition = "timestamp default CURRENT_TIMESTAMP")
    private Date fechaPedido;

    @NotNull
    @NotEmpty
    @Column(name = "numeroPedido", nullable = false, length = 200, unique = true)
    private String numeroPedido;

    @NotNull
    @NotEmpty
    @Min(value = 0)
    @Column(name = "subTotalPedido", nullable = false, precision = 8, scale = 4)
    private BigDecimal subTotalPedido;

    @NotNull
    @NotEmpty
    @Min(value = 0)
    @Column(name = "ivaPedido", nullable = false, precision = 8, scale = 4)
    private BigDecimal ivaPedido;

    @NotNull
    @NotEmpty
    @Min(value = 0)
    @Column(name = "totalPedido", nullable = false, precision = 8, scale = 4)
    private BigDecimal totalPedido;

    @NotNull
    @NotEmpty
    @Min(value = 0)
    @Column(name = "propinaPedido", nullable = false, precision = 8, scale = 4)
    private BigDecimal propinaPedido;

    @Column(name = "entregaPedido", insertable = false)
    private Date entregaPedido;

    @Column(name = "estadoPedido", nullable = false, insertable = false)
    @ColumnDefault("1")
    /* *
    1 -> espera
    2 -> cancelados
    3 -> despachados
    * */
    private Integer estadoPedido;

    @Column(name = "createdAt", nullable = false, insertable = false, columnDefinition = "timestamp default CURRENT_TIMESTAMP")
    private Date createdAt;

    @Column(name = "updatedAt", insertable = false)
    private Date updatedAt;

    @Column(name = "deletedAt", insertable = false)
    private Date deletedAt;
}
