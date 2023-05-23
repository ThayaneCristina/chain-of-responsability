public class FuncionarioLaboratorio extends Funcionario {

    public FuncionarioLaboratorio(Funcionario superior) {
        listaProcedimentos.add(TipoProcedimentoDiagnostico.getTipoProcedimentoDiagnostico());
        setFuncionarioSuperior(superior);
    }

    public String getDescricaoCargo() {
        return "Laboratório";
    }

}
