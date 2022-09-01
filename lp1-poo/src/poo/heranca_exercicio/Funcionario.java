package poo.heranca_exercicio;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Funcionario extends Pessoa {
    private int matricula;
    private LocalDate dataAdmissao;
    private String cargo;

    // -------------------------- Getters e Setters --------------------------
    public int getMatricula() {
        return this.matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public LocalDate getDataAdmissao() {
        return this.dataAdmissao;
    }

    public void setDataAdmissao(LocalDate dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }

    public String getCargo() {
        return this.cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    // -------------------------- Outros métodos --------------------------

    // Exibir dados:
    public String toString() {
        return (super.toString() +
                "\nMatrícula: " + this.matricula +
                "\nData de admissão: " + this.dataAdmissao +
                "\nCargo: " + this.cargo);
    }

    // Cadastrar funcionário:
    public Funcionario cadastrarFuncionario() {

        Funcionario novoFuncionario = new Funcionario();

        // Nome, endereço e data de nascimento:
        novoFuncionario.cadastrarPessoa();
        // Usar get e set

        Scanner in = new Scanner(System.in);

        // Cargo do funcionário:
        System.out.print("Digite o cargo que o funcionário ocupa: ");
        String cargo = in.nextLine();
        novoFuncionario.setCargo(cargo);

        // Matricula do funcionário:
        System.out.print("Digite a matrícula: ");
        int matricula = in.nextInt();
        novoFuncionario.setMatricula(matricula);

        // Data de admissão do funcionário:
        System.out.print("Digite a data de admissão (dd/mm/yyyy): ");
        String dataAdmissao = in.next();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate novaDataAdmissao = LocalDate.parse(dataAdmissao, formatter);
        novoFuncionario.setDataAdmissao(novaDataAdmissao);

        return novoFuncionario;
    }
}
