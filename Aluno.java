public class Aluno extends Pessoa {

    private String curso;
    private String turma;
    private String turno;

 // método construtor filho
    Aluno(){}

    Aluno           (String nome, 
                    int idade, 
                    String dataNascimento, 
                    String raca, 
                    String curso,
                    String turma,
                    String turno){
 // acesso ao método construtor pai (*livro)
        super(nome, idade, dataNascimento, raca);
        this.curso = curso;
        this.turma = turma;
        this.turno = turno;
    }

    public String getNome(){
        return this.nome;
    }
    public int getIdade(){
        return this.idade;
    }
    public String getDataNascimento(){
        return this.dataNascimento;
    }
    public int getCep(){
        return this.cep;
    }
    public String getCurso(){
        return this.curso;
    }
    public String getTurma(){
        return this.turma;
    }
    public String getTurno(){
        return this.turno;
    }

    public void setNome(String nome){
        this.nome = nome;
    }
    public void setIdade(int idade){
        this.idade = idade;
    }
    public void setDataNascimento(String dataNascimento){
        this.dataNascimento = dataNascimento;
    }
    public void setCurso(String curso){
        this.curso = curso;
    }
    public void setTurma(String turma){
        this.turma = turma;
    }
    public void setTurno(String turno){
        this.turno = turno;
    }


    public void Falar(){
        System.out.println("Estou falando...");
    }

    public void Conversar(){
        System.out.println("Estou conversando...");
    }

    public void Ouvir(){
        System.out.println("Estou ouvindo...");
    }

    public void Estudar(){
        System.out.println("Estou estudando...");
    }
}

