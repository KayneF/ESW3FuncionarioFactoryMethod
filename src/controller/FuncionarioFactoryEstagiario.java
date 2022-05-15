package controller;

import model.Funcionario;
import model.FuncionarioEstagiario;

public class FuncionarioFactoryEstagiario extends FuncionarioFactory{

    public Funcionario contratacao(Funcionario f) {
        if (f.getId() == 4) {
            FuncionarioEstagiario f4 = new FuncionarioEstagiario();
            f4.setId(4);
            f4.setNome("Estagiáion");
            f4.setSalario(1000);
            f4.setInstituicaoParceira("Herbert Richards");
            return f4;
        }
        return null;
    }
}
