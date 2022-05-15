package controller;

import model.Funcionario;
import model.FuncionarioIntegral;

public class FuncionarioFactoryIntegral extends FuncionarioFactory{

    public Funcionario contratacao(Funcionario f) {
        if (f.getId() == 1) {
            FuncionarioIntegral f1 = new FuncionarioIntegral();
            f1.setId(1);
            f1.setNome("Antônio Gavião");
            f1.setSalario(5000);
            f1.setBancoHoras(40);
            return f1;
        }
        return null;
    }
}
