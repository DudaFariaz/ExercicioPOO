public class Professor extends Pessoa {

    private String materia;
    private int anosTrabalhados;
    private int nrAulaPorDia;

 // método construtor filho
    Professor(){}

    Professor       (String nome, 
                    int idade, 
                    String dataNascimento, 
                    int cep, 
                    String materia,
                    int anosTrabalhados,
                    int nrAulaPorDia){
 // acesso ao método construtor pai (*pessoa)
        super(nome, idade, dataNascimento, cep);
        this.materia = materia;
        this.anosTrabalhados = anosTrabalhados;
        this.nrAulaPorDia = nrAulaPorDia;
    }

    public String getMateria(){
        return this.materia;
    }
    public int getAnosTrabalhados(){
        return this.anosTrabalhados;
    }
    public int getNrAulaPorDia(){
        return this.nrAulaPorDia;
    }

    public void setMateria(String materia){
        this.materia = materia;
    }
    public void setAnosTrabalhados(int anosTrabalhados){
        this.anosTrabalhados = anosTrabalhados;
    }
    public void setNrAulaPorDia(int nrAulaPorDia){
        this.nrAulaPorDia = nrAulaPorDia;
    }

    @Override
    public void Falar(){
        System.out.println("Estou falando com a classe...");
    }

    @Override
    public void Conversar(){
        System.out.println("Estou conversando com a coordenação...");
    }

    @Override
    public void Ouvir(){
        System.out.println("Estou ouvindo o questionamento do aluno...");
    }

    public void Explicar(){
        System.out.println("Estou explicando a materia...");
    }
}
