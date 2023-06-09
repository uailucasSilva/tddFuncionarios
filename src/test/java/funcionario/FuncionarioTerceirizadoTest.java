package funcionario;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;



class FuncionarioTerceirizadoTest {
    private FuncionarioTerceirizado funcTer;

    @Test
    @DisplayName("Testar construtor com entradas de despesas invalidas")
    public void testarConstrutorInvalido(){
        String entradaNomeConstrutor = "Juca";
        int horasTrabalhadas = 10;
        double valorHora = 59.00;
        double despesaAd = 1500.00;
        Assertions.assertThrows(IllegalArgumentException.class, () -> funcTer = new FuncionarioTerceirizado(entradaNomeConstrutor, horasTrabalhadas, valorHora, despesaAd));
    }

    @Test
    @DisplayName("Testar construtor com entradas de despesas validas")
    public void testarConstrutorValido(){
        String entradaNomeConstrutor = "Juca";
        int horasTrabalhadas = 40;
        double valorHora = 120.00;
        double despesaAd = 1000.00;
        double resultadoEsperado = 5900.00;
        funcTer = new FuncionarioTerceirizado(entradaNomeConstrutor, horasTrabalhadas, valorHora, despesaAd);

        double resultaObtido = funcTer.calcularPagamento();

        Assertions.assertEquals(resultaObtido, resultadoEsperado);

    }

    @Test
    @DisplayName("Testar modificação das despesas com uma entrada inválida")
    public void testarModificarDespesaInvalida(){
        String entradaNomeConstrutor = "Juca";
        int horasTrabalhadas = 40;
        double valorHora = 120.00;
        double despesaAd = 1000.00;
        funcTer = new FuncionarioTerceirizado(entradaNomeConstrutor, horasTrabalhadas, valorHora, despesaAd);
        double novaValorDespesaAd = 1400.00;

        Assertions.assertThrows(IllegalArgumentException.class, () -> funcTer.setDespesasAdicionais(novaValorDespesaAd));
    }

    @Test
    @DisplayName("Testar modificação das despesas com uma entrada valida")
    public void testarModificacaoDespesaValida(){
        String entradaNomeConstrutor = "Juca";
        int horasTrabalhadas = 40;
        double valorHora = 120.00;
        double despesaAd = 700.00;
        funcTer = new FuncionarioTerceirizado(entradaNomeConstrutor, horasTrabalhadas, valorHora, despesaAd);
        double novaValorDespesaAd = 1000.00;
        double resultadoEsperado = 1000.00;

        funcTer.setDespesasAdicionais(novaValorDespesaAd);
        double resultadoObtido = funcTer.getDespesasAdicionais();

        Assertions.assertEquals(resultadoObtido, resultadoEsperado);
    }




}