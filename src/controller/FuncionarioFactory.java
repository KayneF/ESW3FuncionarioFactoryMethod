package controller;

import model.*;

public abstract class FuncionarioFactory {

    public void iniciarContratacao(Funcionario f){

        System.out.println("# Contratação do Funcionario " + f.getNome() + " #");

    }

    public abstract Funcionario contratacao(Funcionario f);

}
