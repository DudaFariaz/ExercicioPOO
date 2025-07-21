public class Pessoa {

    private String nome;
    private int idade;
    private String dataNascimento;
    private int cep;

    // método construtor (construir objetos com valores default)
    
    Pessoa(){
        this.nome = "";
        this.idade = 0;
        this.dataNascimento = "";
        this.cep = 0;
    
    }

    Pessoa(String nome, int idade, String dataNascimento, int cep){
        this.nome = nome;
        this.idade = idade;
        this.dataNascimento = dataNascimento;
        this.cep = cep;
    }

    // métodos
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

    public void setNome(String nome){
        this.nome = nome;
    }
    public void setIdade(int idade){
        this.idade = idade;
    }
    public void setDataNascimento(String dataNascimento){
        this.dataNascimento = dataNascimento;
    }
    public void setCep(int cep){
        this.cep = cep;
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
}

    
