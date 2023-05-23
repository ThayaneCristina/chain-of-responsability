public class FuncionarioEspecialista extends Funcionario {

    public FuncionarioEspecialista(Funcionario superior) {
        listaProcedimentos.add(TipoProcedimentoTratamento.getTipoProcedimentoTratamento());
        setFuncionarioSuperior(superior);
    }

    public String getDescricaoCargo() {
        return "Médico Especialista";
    }

}
