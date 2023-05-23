public class FuncionarioEnfermeiro extends Funcionario {

    public FuncionarioEnfermeiro(Funcionario superior) {
        listaProcedimentos.add(TipoProcedimentoAdministracaoMedicamento.getTipoProcedimentoAdministracaoMedicamento());
        setFuncionarioSuperior(superior);
    }

    public String getDescricaoCargo() {
        return "Enfermeiro";
    }

}
