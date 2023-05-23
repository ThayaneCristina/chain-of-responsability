public class FuncionarioClinicoGeral extends Funcionario {

    public FuncionarioClinicoGeral(Funcionario superior) {
        listaProcedimentos.add(TipoProcedimentoEncaminhamento.getTipoProcedimentoEncaminhamento());
        setFuncionarioSuperior(superior);
    }

    public String getDescricaoCargo() {
        return "Médico Clínico Geral";
    }

}
