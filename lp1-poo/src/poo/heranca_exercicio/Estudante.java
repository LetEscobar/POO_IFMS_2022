package poo.heranca_exercicio;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Estudante extends Pessoa {
    private String ra;
    private String curso;
    private LocalDate dataInicio;

    public String getRa() {
        return this.ra;
    }

    public void setRa(String ra) {
        this.ra = ra;
    }

    public String getCurso() {
        return this.curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public LocalDate getDataInicio() {
        return this.dataInicio;
    }

    public void setDataInicio(LocalDate dataInicio) {
        this.dataInicio = dataInicio;
    }

    // -------------------------- Outros métodos --------------------------

    // Exibir dados:
    public String toString() {
        return (super.toString() +
                "\nRA do estudante: " + this.ra +
                "\nCurso: " + this.curso +
                "\nData de ingresso: " + this.dataInicio);
    }

    // Cadastrar estudante:
    public static Estudante cadastrarEstudante() {
        Estudante novoEstudante = new Estudante();

        // Nome, endereço e data de nascimento:
        novoEstudante.cadastrarPessoa();

        Scanner in = new Scanner(System.in);

        // RA do estudante:
        System.out.println("Digite o RA do estudante: ");
        String ra = in.nextLine();
        novoEstudante.setRa(ra);

        // Curso do estudante:
        System.out.println("Digite o curso do estudante: ");
        String curso = in.nextLine();
        novoEstudante.setCurso(curso);

        // Data de ingresso do estudante no curso:
        System.out.println("Digite a data de ingresso do estudante (dd/mm/yyyy): ");
        String dataAdmissao = in.next();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate dataInicio = LocalDate.parse(dataAdmissao, formatter);
        novoEstudante.setDataInicio(dataInicio);

        return novoEstudante;
    }
}