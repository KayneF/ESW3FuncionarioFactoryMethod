package controller;

import model.Funcionario;
import model.FuncionarioParcial;

public class FuncionarioFactoryParcial extends FuncionarioFactory{

    public Funcionario contratacao(Funcionario f) {
        if (f.getId() == 2) {
            FuncionarioParcial f2 = new FuncionarioParcial();
            f2.setId(2);
            f2.setNome("Lion");
            f2.setSalario(3000);
            f2.setHoraEntrada(8);
            f2.setHoraSaida(14);
            return f2;
        }
        return null;
    }
}
