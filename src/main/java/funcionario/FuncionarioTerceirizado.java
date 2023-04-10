package funcionario;

public class FuncionarioTerceirizado extends Funcionario{
    private double despesasAdicionais;

    public FuncionarioTerceirizado(String nome, int horasTrabalhadas, double valorHora, double despesasAdicionais) {
        super(nome, horasTrabalhadas, valorHora);
        this.despesasAdicionais = validaDespesasAd(despesasAdicionais);
    }

    @Override
    public double calcularPagamento(){
            double salarioMin = 1320;
            if((super.getHorasTrabalhadas()*super.getValorHora())+(1.1*despesasAdicionais)>=salarioMin)
                return (super.getHorasTrabalhadas()*super.getValorHora())+(1.1*despesasAdicionais);
            throw new IllegalArgumentException("O valor do pagamento é inferior ao salário mínimo.");
    }

    public double validaDespesasAd(double despesasAdicionais){
        if(despesasAdicionais>1000.00)
            throw new IllegalArgumentException("O valor das despesas adicionais não pode ser superior a 1000.00");
        return despesasAdicionais;
    }

    public double getDespesasAdicionais() {
        return despesasAdicionais;
    }

    public void setDespesasAdicionais(double despesasAdicionais) {
        this.despesasAdicionais = validaDespesasAd(despesasAdicionais);
    }
}
