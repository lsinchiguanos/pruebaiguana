package ec.iguana.leslie.sinchiguano.models.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.ColumnDefault;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "pizza")
public class Pizza {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idPizza")
    private Integer idPizza;

    @ManyToOne
    @JoinColumn(name = "idPedido", insertable = false)
    private Pedido pedido;

    @ManyToOne
    @JoinColumn(name = "idTipoBase", nullable = false)
    private TipoBase tipoBase;

    @Column(name = "nombrePizza", nullable = false, length = 200, unique = true)
    private String nombrePizza;

    @Min(value = 0)
    @Column(name = "valorTipoBasePizza", nullable = false, precision = 8, scale = 4)
    private BigDecimal valorTipoBasePizza;

    @Column(name = "valorIngredientePizza", nullable = false, precision = 8, scale = 4)
    private BigDecimal valorIngredientePizza;

    @Column(name = "subTotalPizza", nullable = false, precision = 8, scale = 4)
    private BigDecimal subTotalPizza;

    @Column(name = "valorPizza", nullable = false, precision = 8, scale = 4)
    private BigDecimal valorPizza;
}
