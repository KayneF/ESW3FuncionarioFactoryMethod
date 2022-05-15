package view;

import controller.*;
import model.Funcionario;
import model.FuncionarioIntegral;

public class TesteFuncionario {

    public static void main(String[] args) {

        Funcionario funcionario = new FuncionarioIntegral();
        funcionario.setId(1);
//        funcionario.setId(2);
//        funcionario.setId(3);
//        funcionario.setId(4);

        Funcionario contratar = null;
        FuncionarioFactory ff1 = new FuncionarioFactoryIntegral();
        FuncionarioFactory ff2 = new FuncionarioFactoryParcial();
        FuncionarioFactory ff3 = new FuncionarioFactoryTemporario();
        FuncionarioFactory ff4 = new FuncionarioFactoryEstagiario();

        if(funcionario.getId() == 1) {
            contratar = ff1.contratacao(funcionario);
            ff1.iniciarContratacao(contratar);
        }
        if(funcionario.getId() == 2) {
            contratar = ff2.contratacao(funcionario);
            ff2.iniciarContratacao(contratar);
        }
        if(funcionario.getId() == 3) {
            contratar = ff3.contratacao(funcionario);
            ff3.iniciarContratacao(contratar);
        }
        if(funcionario.getId() == 4) {
            contratar = ff4.contratacao(funcionario);
            ff4.iniciarContratacao(contratar);
        }

        System.out.println(contratar.toString());

    }
}
