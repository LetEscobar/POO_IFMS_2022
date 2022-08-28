package poo.heranca_exercicio;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Funcionario extends Pessoa {
    private String matricula;
    private LocalDate dataAdmissao;
    private String cargo;

    public String getMatricula() {
        return this.matricula;
    }

    public void setMatricula(String matricula) {
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

    public String toString() {
        return (super.toString() +
                "Matrícula: " + this.matricula +
                "\nData de admissão: " + this.dataAdmissao +
                "\nCargo: " + this.cargo);
    }

    public static Funcionario cadastrarFuncionario() {
        Scanner in = new Scanner(System.in);

        Funcionario novoFuncionario = new Funcionario();

        // Nome do funcionário:
        System.out.print("Digite o nome do funcionário: ");
        String nome = in.next();

        // Data de nascimento do funcionário:
        System.out.print("Digite a data de nascimento (dd/mm/yyyy): ");
        String dataNascimento = in.next();
        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate novaDataNascimento = LocalDate.parse(dataNascimento, formatter1);
        novoFuncionario.setDataNascimento(novaDataNascimento);

        // Endereço do funcionário:
        System.out.print("Digite o endereço: ");
        String endereco = in.next();

        // Matricula do funcionário:
        System.out.print("Digite a matrícula: ");
        String matricula = in.next();

        // Data de admissão do funcionário:
        System.out.print("Digite a data de admissão (dd/mm/yyyy): ");
        String dataAdmissao = in.next();
        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate novaDataAdmissao = LocalDate.parse(dataAdmissao, formatter2);
        novoFuncionario.setDataAdmissao(novaDataNascimento);

        // Cargo do funcionário:
        System.out.print("Digite o cargo que o funcionário ocupa: ");
        String cargo = in.next();

        return novoFuncionario;
    }
}
