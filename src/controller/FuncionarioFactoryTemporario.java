package controller;

import model.Funcionario;
import model.FuncionarioTemporario;

public class FuncionarioFactoryTemporario extends FuncionarioFactory{

    public Funcionario contratacao(Funcionario f) {
        if (f.getId() == 3) {
            FuncionarioTemporario f3 = new FuncionarioTemporario();
            f3.setId(3);
            f3.setNome("Gaviáion");
            f3.setSalario(1800);
            f3.setDia(5);
            f3.setMes(3);
            f3.setAno(2022);
            return f3;
        }
        return null;
    }
}
