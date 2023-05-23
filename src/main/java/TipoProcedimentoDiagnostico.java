public class TipoProcedimentoDiagnostico implements TipoProcedimento {

    private static TipoProcedimentoDiagnostico tipoProcedimentoDiagnostico = new TipoProcedimentoDiagnostico();

    private TipoProcedimentoDiagnostico() {};

    public static TipoProcedimentoDiagnostico getTipoProcedimentoDiagnostico() {
        return tipoProcedimentoDiagnostico;
    }

}
