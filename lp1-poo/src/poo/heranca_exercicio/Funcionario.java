package poo.heranca_exercicio;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class Funcionario extends Pessoa {
    private int matricula;
    private LocalDate dataAdmissao;
    private String cargo;

    private static ArrayList<Funcionario> funcionarios = new ArrayList<Funcionario>();

    // ---------------------------- Métodos ----------------------------

    // Exibir dados:
    public String toString() {
        return (super.toString() +
                "\nMatrícula: " + this.matricula +
                "\nData de admissão: " + this.dataAdmissao +
                "\nCargo: " + this.cargo);
    }

    // Construtor:
    public Funcionario() {
        super();

        Scanner inString = new Scanner(System.in);
        Scanner inInt = new Scanner(System.in);

        System.out.print("Digite o número da matrícula: ");
        this.matricula = inInt.nextInt();

        System.out.print("Digite o cargo: ");
        this.cargo = inString.nextLine();

        System.out.print("Digite a data de admissão (dd/mm/yyyy): ");
        String data = inString.nextLine();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        this.dataAdmissao = LocalDate.parse(data, formatter);
    }

    // ------------------ Métodos Getters and Setters ------------------
    public static ArrayList<Funcionario> getFuncionario() {
        return funcionarios;
    }

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
}
