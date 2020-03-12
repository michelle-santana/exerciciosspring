package model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tb_cupom_item")
public class CupomItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_cupom_item;

    @Column(name = "id_cupom")
    private Long idCupom;

    @Column(name = "id_produto")
    private Long isProduto;

    @Column(name="qt_produto")
    private Long qtProduto;


}
