public class Aluno extends Pessoa {

    private String curso;
    private String turma;
    private String turno;

 // método construtor filho
    Aluno(){}

    Aluno           (String nome, 
                    int idade, 
                    String dataNascimento, 
                    int cep, 
                    String curso,
                    String turma,
                    String turno){
 // acesso ao método construtor pai (*pessoa)
        super(nome, idade, dataNascimento, cep);
        this.curso = curso;
        this.turma = turma;
        this.turno = turno;
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

    public void setCurso(String curso){
        this.curso = curso;
    }
    public void setTurma(String turma){
        this.turma = turma;
    }
    public void setTurno(String turno){
        this.turno = turno;
    }

    @Override
    public void Falar(){
        System.out.println("Estou falando com o colega...");
    }

    @Override
    public void Conversar(){
        System.out.println("Estou conversando com o colega..");
    }

    @Override
    public void Ouvir(){
        System.out.println("Estou ouvindo o professor...");
    }

    
    public void Estudar(){
        System.out.println("Estou estudando...");
    }
}

