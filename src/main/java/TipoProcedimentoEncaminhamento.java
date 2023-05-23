public class TipoProcedimentoEncaminhamento implements TipoProcedimento {

    private static TipoProcedimentoEncaminhamento tipoProcedimentoEncaminhamento = new TipoProcedimentoEncaminhamento();

    private TipoProcedimentoEncaminhamento() {};

    public static TipoProcedimentoEncaminhamento getTipoProcedimentoEncaminhamento() {
        return tipoProcedimentoEncaminhamento;
    }

}
