package virtualstore.enums;

public enum StatusContaPagar {

    COBRANCA("Pagar"),
    VENCIDA("Vencida"),
    ABERTA("Aberta"),
    ALUGUEL("Aluguel"),
    FUNCIONARIO("Funcionário"),
    QUITADA("Quitada"),
    RENEGOCIADA("Renegociada");

    private String descricao;

    private StatusContaPagar(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return this.descricao;
    }
    
}
