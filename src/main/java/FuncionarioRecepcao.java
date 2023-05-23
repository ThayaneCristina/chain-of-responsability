public class FuncionarioRecepcao extends Funcionario {

    public FuncionarioRecepcao(Funcionario superior) {
        listaProcedimentos.add(TipoProcedimentoAgendamento.getTipoProcedimentoAgendamento());
        setFuncionarioSuperior(superior);
    }

    public String getDescricaoCargo() {
        return "Recepção";
    }

}
