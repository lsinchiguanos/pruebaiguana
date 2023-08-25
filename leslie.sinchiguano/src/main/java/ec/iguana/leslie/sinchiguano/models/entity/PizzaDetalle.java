package ec.iguana.leslie.sinchiguano.models.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.ColumnDefault;

import java.math.BigDecimal;

public class PizzaDetalle {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idPizzaDetalle")
    private Integer idPizzaDetalle;

    @ManyToOne
    @JoinColumn(name = "idIngrediente", nullable = false)
    private Ingrediente ingrediente;

    @Column(name = "dobleIngrediente", nullable = false, insertable = false, columnDefinition = "boolean default false")
    /* *
    false -> no
    true -> si
    * */
    private boolean dobleIngrediente;

    @Column(name = "valorIngrediente", nullable = false, precision = 8, scale = 4)
    private BigDecimal valorPizzaDetalle;

    @Column(name = "valorTotalIngrediente", nullable = false, precision = 8, scale = 4)
    private BigDecimal valorTotalIngrediente;
}
