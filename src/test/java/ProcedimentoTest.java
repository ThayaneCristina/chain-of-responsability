import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProcedimentoTest {

    FuncionarioEspecialista especialista;
    FuncionarioClinicoGeral clinicoGeral;
    FuncionarioLaboratorio tecnicoLaboratorial;
    FuncionarioEnfermeiro enfermeiro;
    FuncionarioRecepcao recepcionista;

    @BeforeEach
    void setUp() {
        especialista = new FuncionarioEspecialista(null);
        clinicoGeral = new FuncionarioClinicoGeral(especialista);
        tecnicoLaboratorial = new FuncionarioLaboratorio(clinicoGeral);
        enfermeiro = new FuncionarioEnfermeiro(clinicoGeral);
        recepcionista = new FuncionarioRecepcao(clinicoGeral);
    }

    @Test
    void deveRetornarRecepcaoParaprocedimentoAgendamentoConsulta() {
        assertEquals("Recepção", recepcionista.executarProcedimento(new Procedimento(TipoProcedimentoAgendamento.getTipoProcedimentoAgendamento())));
    }

    @Test
    void deveRetornarMedicoClinicoGeralParaProcedimentoEncaminhamento() {
        assertEquals("Médico Clínico Geral", recepcionista.executarProcedimento(new Procedimento(TipoProcedimentoEncaminhamento.getTipoProcedimentoEncaminhamento())));
    }

    @Test
    void deveRetornarEnfermeiroParaProcedimentoAdministracaoMedicamento() {
        assertEquals("Enfermeiro", recepcionista.executarProcedimento(new Procedimento(TipoProcedimentoAdministracaoMedicamento.getTipoProcedimentoAdministracaoMedicamento())));
    }

    @Test
    void deveRetornarLaboratorioParaProcedimentoDiagnostico() {
        assertEquals("Laboratório", recepcionista.executarProcedimento(new Procedimento(TipoProcedimentoDiagnostico.getTipoProcedimentoDiagnostico())));
    }

    @Test
    void deveRetornarMedicoEspecialistaParaProcedimentoTratamento() {
        assertEquals("Médico Especialista", recepcionista.executarProcedimento(new Procedimento(TipoProcedimentoTratamento.getTipoProcedimentoTratamento())));
    }

    @Test
    void deveRetornarProcedimentoNaoRealizadoParaprocedimentoAgendamento() {
        assertEquals("Procedimento não realizado", recepcionista.executarProcedimento(new Procedimento(TipoProcedimentoAgendamento.getTipoProcedimentoAgendamento())));
    }

}
