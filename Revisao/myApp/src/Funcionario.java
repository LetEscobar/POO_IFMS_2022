import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Funcionario extends Pessoa {
    private String matricula;
    private boolean status; // ativo ou inativo

    // Construtor
    public Funcionario(String _matricula, String _nome) {
        this.matricula = _matricula;
        this.nome = _nome;
        this.status = true;
        this.dataNascimento = LocalDate.of(1999, 12, 23);
    }

    // toString - para exibir os dados na tela
    public String toString() {
        DateTimeFormatter formatDate = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return "Nome: " + this.nome +
                "\nMatrícula: " + this.matricula +
                "\nStatus: " + this.isStatus() +
                "\nData de nascimento: " + this.dataNascimento.format(formatDate);
    }

    // Getters and Setter
    public String getMatricula() {
        return this.matricula;
    }

    public void setMatricula(String _matricula) {
        this.matricula = _matricula;
    }

    public String isStatus() {
        return this.status ? "Ativo" : "Inativo";
        // Outra forma de fazer:
        // return if(this.status) return "Ativo"; else return "Inativo";
    }

    public void setStatus(boolean _status) {
        this.status = _status;
    }

    public static Funcionario lerFuncionario() {

        // Lendo os dados do usuário
        Scanner in = new Scanner(System.in);
        System.out.print("Digite o nome: ");
        String nome = in.nextLine();

        System.out.print("Digite a matrícula do funcionário: ");
        String matricula = in.nextLine();

        // Criando um funcionário a partir dos dados informados:
        Funcionario objetoFuncionario = new Funcionario(matricula, nome);

        return objetoFuncionario;
    }
}