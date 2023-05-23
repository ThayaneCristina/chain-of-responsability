import java.util.ArrayList;

public abstract class Funcionario {

    protected ArrayList listaProcedimentos = new ArrayList();
    private Funcionario funcionarioSuperior;

    public Funcionario getFuncionarioSuperior() {
        return funcionarioSuperior;
    }

    public void setFuncionarioSuperior(Funcionario funcionarioSuperior) {
        this.funcionarioSuperior = funcionarioSuperior;
    }

    public abstract String getDescricaoCargo();

    public String executarProcedimento(Procedimento procedimento) {
        if (listaProcedimentos.contains(procedimento.getTipoProcedimento())) {
            return getDescricaoCargo();
        }
        else {
            if (funcionarioSuperior != null) {
                return funcionarioSuperior.executarProcedimento(procedimento);
            }
            else
            {
                return "Procedimento não realizado";
            }
        }
    }

}
