package funcionario;

public class Funcionario {
    private String nome;
    private int horasTrabalhadas;
    private double valorHora;

    public Funcionario(String nome, int horasTrabalhadas, double valorHora) {
        this.nome = nome;
        this.horasTrabalhadas = validaHorasTrabalhadas(horasTrabalhadas);
        this.valorHora = validaValorHora(valorHora);
    }

    public void setHorasTrabalhadas(int horasTrabalhadas) {
        this.horasTrabalhadas = validaHorasTrabalhadas(horasTrabalhadas);
    }

    public double validaValorHora(double valorHora) {
        double salarioMin = 1320;
        if (valorHora >= (salarioMin * 0.04) & valorHora <= (salarioMin * 0.1))
            return valorHora;
        throw new IllegalArgumentException("O valor por hora está fora do limite permitido (Entre 4% e 10% do salário mínimo).");
    }

    public void setValorHora(double valorHora) {
        this.valorHora = validaValorHora(valorHora);
    }

    public int validaHorasTrabalhadas(int horasTrabalhadas) {
        if (horasTrabalhadas > 40)
            throw new IllegalArgumentException("O número de horas trabalhadas por funcionários próprios deve ser menor ou igual a 40.");
        return horasTrabalhadas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public double getValorHora() {
        return valorHora;
    }

    public double calcularPagamento(){
        double salarioMin = 1320;
        if(horasTrabalhadas*valorHora>=salarioMin)
            return horasTrabalhadas*valorHora;
        throw new IllegalArgumentException("O valor do pagamento é inferior ao salário mínimo.");
    }
}
