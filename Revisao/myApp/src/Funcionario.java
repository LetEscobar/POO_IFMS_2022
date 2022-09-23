import java.time.format.DateTimeFormatter;

public class Funcionario extends Pessoa {
    private String matricula;
    private boolean status; //ativo ou inativo

    // Construtor da classe Estudante:
    public Funcionario(String _matricula, String _nome) {
        this.matricula = _matricula;
        this.nome = _nome;
        this.status = true;
    }

    // Getters and Setter
    public String getMatricula(){
        return this.matricula;
    }

    public void setMatricula(String _matricula){
        this.matricula = _matricula;
    }
    
    public String isStatus(){
        return this.status ? "Ativo" : "Inativo";
        // if(this.status) return "Ativo"; else return "Inativo";
    }

    public void setStatus(boolean _status){
        this.status = _status;
    }

    public String toString(){
        DateTimeFormatter formatDate = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return "Nome: " + this.nome +
                "\nMatrícula: " + this.matricula +
                "\nStatus: " + this.isStatus() + 
                "\nData de nascimento: " + this.dataNascimento.format(formatDate);
    }
}