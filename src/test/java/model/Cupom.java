package model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table (name = "tb_cupom" )
public class Cupom {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Column(name = "id_cliente")
    private Long idCliente;

    @NotNull
    @Column(name ="dt_venda")
    private String dtVenda;

    @Column(name = "vl_venda")
    private BigDecimal vlVenda;

    @Column(name ="vl_produto")
    private BigDecimal vlProduto;



}
