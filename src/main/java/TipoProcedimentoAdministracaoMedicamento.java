public class TipoProcedimentoAdministracaoMedicamento implements TipoProcedimento {

    private static TipoProcedimentoAdministracaoMedicamento tipoProcedimentoAdministracaoMedicamento = new TipoProcedimentoAdministracaoMedicamento();

    private TipoProcedimentoAdministracaoMedicamento() {};

    public static TipoProcedimentoAdministracaoMedicamento getTipoProcedimentoAdministracaoMedicamento() {
        return tipoProcedimentoAdministracaoMedicamento;
    }

}
