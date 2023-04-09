package funcionario;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class FuncionarioTest {

    private Funcionario func;
    @Test
    public void testarContrutorPagamentoInvalido(){
    String entradaNomeConstrutor = "Juraci";
    int horasTrabalhadas = 50;
    double valorHora = 130.00;

    Assertions.assertThrows(IllegalArgumentException.class, () ->func = new Funcionario(entradaNomeConstrutor, horasTrabalhadas, valorHora));

}

}