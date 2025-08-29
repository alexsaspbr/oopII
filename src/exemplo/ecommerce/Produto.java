package exemplo.ecommerce;

import java.math.BigDecimal;
import java.util.Comparator;

public class Produto implements Comparable<Produto> {

    private Integer id;
    private String descricao;
    private BigDecimal valor;


    public Integer getId() {
        return id;
    }

    public Produto(Integer id, String descricao, BigDecimal valor) {
        this.id = id;
        this.descricao = descricao;
        this.valor = valor;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    @Override
    public int compareTo(Produto produto) {
        if(this.getId() < produto.getId()) {
            return -1;
        }
        if(this.getId() > produto.getId()) {
            return 1;
        }
        return 0;
    }
}
