
package virtualstore.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "cupom_desc")
@SequenceGenerator(name = "seq_cupom_desc", sequenceName = "seq_cupom_desc", allocationSize = 1, initialValue = 1)
public class CupomDesconto implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_cupom_desc")
    private long id;

    @Column(nullable = false)
    private String codDesconto;

    @Column(nullable = false)
    @Temporal(TemporalType.DATE)
    private Date dataValidade;

    private BigDecimal valorRealDesconto;

    private BigDecimal valorPorcentagemDesconto;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCodDesconto() {
        return codDesconto;
    }

    public void setCodDesconto(String codDesconto) {
        this.codDesconto = codDesconto;
    }

    public Date getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(Date dataValidade) {
        this.dataValidade = dataValidade;
    }

    public BigDecimal getValorRealDesconto() {
        return valorRealDesconto;
    }

    public void setValorRealDesconto(BigDecimal valorRealDesconto) {
        this.valorRealDesconto = valorRealDesconto;
    }

    public BigDecimal getValorPorcentagemDesconto() {
        return valorPorcentagemDesconto;
    }

    public void setValorPorcentagemDesconto(BigDecimal valorPorcentagemDesconto) {
        this.valorPorcentagemDesconto = valorPorcentagemDesconto;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + (int) (id ^ (id >>> 32));
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        CupomDesconto other = (CupomDesconto) obj;
        if (id != other.id)
            return false;
        return true;
    }

     
}