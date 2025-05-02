
package virtualstore.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "cupom_desc")
@SequenceGenerator(name = "seq_cupom_desc", sequenceName = "seq_cupom_desc", allocationSize = 1, initialValue = 1)
public class CupomDesconto implements serizalizable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_cupom_desc")
    private long id;

    private String codDesconto;

    @Temporal(TemporalType.DATE)
    private Date dataValidade;

    private Bigdecimal valorRealDesconto;

    private Bigdecimal valorPorcentagemDesconto;


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
        Acesso other = (Acesso) obj;
        if (id != other.id)
            return false;
        return true;
    }
}