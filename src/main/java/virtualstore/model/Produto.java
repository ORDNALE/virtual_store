package virtualstore.model;

import java.io.Serializable;
import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "produto")
@SequenceGenerator(name = "produto_seq", sequenceName = "produto_seq", allocationSize = 1, initialValue = 1)
public class Produto implements Serializable{

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(generator = "produto_seq", strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column(nullable = false)
    private String tipoUnidade;

    @Column(nullable = false)
    private String nomeProd;

    @Column(columnDefinition = "TEXT", length = 2000, nullable = false)
    private String descricaoProd;

    @Column(nullable = false)
    private Boolean ativo = Boolean.TRUE;

    //verificar associacao ++nota item produto
    @Column(nullable = false)
    private Double pesoProd;

    @Column(nullable = false)
    private Double largura;

    @Column(nullable = false)
    private Double altura;

    @Column(nullable = false)    
    private Double profundidade;

    @Column(nullable = false)
    private BigDecimal valorVenda = BigDecimal.ZERO;

    @Column(nullable = false)
    private Integer quantidadeEstoque = 0;


    private Integer alertaQtdEstoque = 0;
    private String linkProd;


    private Boolean alertaEstoque = Boolean.FALSE;
    private Integer qtdClique = 0;
    
    
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getTipoUnidade() {
        return tipoUnidade;
    }
    public void setTipoUnidade(String tipoUnidade) {
        this.tipoUnidade = tipoUnidade;
    }
    public String getNomeProd() {
        return nomeProd;
    }
    public void setNomeProd(String nomeProd) {
        this.nomeProd = nomeProd;
    }
    public String getDescricaoProd() {
        return descricaoProd;
    }
    public void setDescricaoProd(String descricaoProd) {
        this.descricaoProd = descricaoProd;
    }
    public Double getPesoProd() {
        return pesoProd;
    }
    public void setPesoProd(Double pesoProd) {
        this.pesoProd = pesoProd;
    }
    public Double getLargura() {
        return largura;
    }
    public void setLargura(Double largura) {
        this.largura = largura;
    }
    public Double getAltura() {
        return altura;
    }
    public void setAltura(Double altura) {
        this.altura = altura;
    }
    public Double getProfundidade() {
        return profundidade;
    }
    public void setProfundidade(Double profundidade) {
        this.profundidade = profundidade;
    }
    public BigDecimal getValorVenda() {
        return valorVenda;
    }
    public void setValorVenda(BigDecimal valorVenda) {
        this.valorVenda = valorVenda;
    }
    public Integer getQuantidadeEstoque() {
        return quantidadeEstoque;
    }
    public void setQuantidadeEstoque(Integer quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }
    public Integer getAlertaQtdEstoque() {
        return alertaQtdEstoque;
    }
    public void setAlertaQtdEstoque(Integer alertaQtdEstoque) {
        this.alertaQtdEstoque = alertaQtdEstoque;
    }
    public String getLinkProd() {
        return linkProd;
    }
    public void setLinkProd(String linkProd) {
        this.linkProd = linkProd;
    }
    public Boolean getAlertaEstoque() {
        return alertaEstoque;
    }
    public void setAlertaEstoque(Boolean alertaEstoque) {
        this.alertaEstoque = alertaEstoque;
    }
    public Integer getQtdClique() {
        return qtdClique;
    }
    public void setQtdClique(Integer qtdClique) {
        this.qtdClique = qtdClique;
    }

    public Boolean getAtivo() {
        return ativo;
    }
    public void setAtivo(Boolean ativo) {
        this.ativo = ativo;
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
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
        Produto other = (Produto) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        return true;
    }
}
