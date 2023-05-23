public class TipoProcedimentoAgendamento implements TipoProcedimento {

    private static TipoProcedimentoAgendamento tipoProcedimentoAgendamento = new TipoProcedimentoAgendamento();

    private TipoProcedimentoAgendamento() {};

    public static TipoProcedimentoAgendamento getTipoProcedimentoAgendamento() {
        return tipoProcedimentoAgendamento;
    }

}
