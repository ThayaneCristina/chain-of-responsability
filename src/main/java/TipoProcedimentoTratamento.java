public class TipoProcedimentoTratamento implements TipoProcedimento {

    private static TipoProcedimentoTratamento tipoProcedimentoTratamento = new TipoProcedimentoTratamento();

    private TipoProcedimentoTratamento() {};

    public static TipoProcedimentoTratamento getTipoProcedimentoTratamento() {
        return tipoProcedimentoTratamento;
    }

}
