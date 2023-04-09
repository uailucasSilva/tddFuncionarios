package funcionario;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class FuncionarioTest {

    private Funcionario func;

    @Test
    @DisplayName("Testar se o metodo de pagamento para um valor de pagamento inválido (abaixo do salário minimo)")
    public void testarContrutorPagamentoInvalido() {
        String entradaNomeConstrutor = "Juraci";
        int horasTrabalhadas = 10;
        double valorHora = 59.00;
        func = new Funcionario(entradaNomeConstrutor, horasTrabalhadas, valorHora);
        Assertions.assertThrows(IllegalArgumentException.class, () -> func.calcularPagamento());
    }

    @Test
    @DisplayName("Testar o construtor para o valor da hora com uma entrada inválida, superior a 10%")
    public void testarConstrutorEntradaValorHoraInvalida() {
        String entradaNomeConstrutor = "Juraci";
        int horasTrabalhadas = 40;
        double valorHora = 150.00;

        Assertions.assertThrows(IllegalArgumentException.class, () -> func = new Funcionario(entradaNomeConstrutor, horasTrabalhadas, valorHora));
    }

    @Test
    @DisplayName("Testar o construtor para a entrada de horas trabalhadas inválidas superior a horas")
    public void testarConstrutorEntradaHorasInvalida(){
        String entradaNomeConstrutor = "Juraci";
        int horasTrabalhadas = 50;
        double valorHora = 120.00;

        Assertions.assertThrows(IllegalArgumentException.class, () -> func = new Funcionario(entradaNomeConstrutor, horasTrabalhadas, valorHora));
    }

    @Test
    @DisplayName("Testar o construtor para entradas validas")
    public void testarConstrutorEntradasValidas(){
        String entradaNomeConstrutor = "Juraci";
        int horasTrabalhadas = 40;
        double valorHora = 120.00;
        double resultadoEsperado = 4800;

        func = new Funcionario(entradaNomeConstrutor, horasTrabalhadas, valorHora);
        double resultadoObtido = func.calcularPagamento();
        Assertions.assertEquals(resultadoEsperado, resultadoObtido);
    }

    @Test
    @DisplayName("Testar modificar as horas trabalhadas com um valor inválido")
    public void testarModificarHorasInvalida(){
        String entradaNomeConstrutor = "Juraci";
        int horasTrabalhadas = 40;
        double valorHora = 120.00;
        func = new Funcionario(entradaNomeConstrutor, horasTrabalhadas, valorHora);
        Assertions.assertThrows(IllegalArgumentException.class, () -> func.setHorasTrabalhadas(50));
    }

    @Test
    @DisplayName("Testar modificar valor hora com um valor inválido")
    public void testarModificarValorHora(){
        String entradaNomeConstrutor = "Juraci";
        int horasTrabalhadas = 40;
        double valorHora = 120.00;
        func = new Funcionario(entradaNomeConstrutor, horasTrabalhadas, valorHora);
        Assertions.assertThrows(IllegalArgumentException.class, () -> func.setValorHora(190.00));
    }

    @Test
    @DisplayName("Testar modificar as horas trabalhadas com um valor valido")
    public void testarModificarHorasValida(){
        String entradaNomeConstrutor = "Juraci";
        int horasTrabalhadas = 40;
        double valorHora = 120.00;
        int resultadoEsperado = 30;

        func = new Funcionario(entradaNomeConstrutor, horasTrabalhadas, valorHora);
        func.setHorasTrabalhadas(30);
        int resultadoObtido = func.getHorasTrabalhadas();
        Assertions.assertEquals(resultadoEsperado, resultadoObtido);
    }

    @Test
    @DisplayName("Testar modificar valor hora por um valor valido")
    public void testarModificarValorHoraValido(){
        String entradaNomeConstrutor = "Juraci";
        int horasTrabalhadas = 40;
        double valorHora = 120.00;
        double resultadoEsperado = 130.00;
        double novoValorHora = 130.00;

        func = new Funcionario(entradaNomeConstrutor, horasTrabalhadas, valorHora);
        func.setValorHora(novoValorHora);
        double resultadoObtido = func.getValorHora();
        Assertions.assertEquals(resultadoEsperado, resultadoObtido);
    }

    @Test
    @DisplayName("Testar modificar o nome com sucesso")
    public  void testarModificarNomeSucesso(){
        String entradaNomeConstrutor = "Juraci";
        int horasTrabalhadas = 40;
        double valorHora = 120.00;
        String novoNome = "Jurassi";
        String resultadoEsperado = "Jurassi";

        func = new Funcionario(entradaNomeConstrutor, horasTrabalhadas, valorHora);
        func.setNome(novoNome);
        String resultadoObtido = func.getNome();
        Assertions.assertEquals(resultadoEsperado, resultadoObtido);
    }

    @Test
    @DisplayName("Testar modificação de valor hora válida com calculo de pagamento")
    public  void testarModificacaoValorHoraPagamentoValido(){
        String entradaNomeConstrutor = "Juraci";
        int horasTrabalhadas = 40;
        double valorHora = 120.00;
        double novoValorHora = 130.00;
        double resultadoEsperado = 5200.00;

        func = new Funcionario(entradaNomeConstrutor, horasTrabalhadas, valorHora);
        func.setValorHora(novoValorHora);
        double resultadoObtido = func.calcularPagamento();
        Assertions.assertEquals(resultadoEsperado, resultadoObtido);
    }







}