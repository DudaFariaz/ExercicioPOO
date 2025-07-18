public class CadastrosEscola {

    public static void main(String[] args) {

        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Chico Bento");
        pessoa.setIdade (25);
        pessoa.setDataNascimento("10/05/2000");
        pessoa.setCep(8906398);

        pessoa.Falar();
        pessoa.Conversar();
        pessoa.Ouvir();

        String mensagem = "\nNome: "+pessoa.getNome()+
                          "\nIdade: "+pessoa.getIdade()+
                          "\nData de nascimento: "+pessoa.getDataNascimento()+
                          "\nCEP: "+pessoa.getCep();

        System.out.println("  " );
        System.out.println("Pessoa "+ mensagem);

        // Aluno
        Aluno aluno = new Aluno();
        aluno.setNome("Antoniela");
        aluno.setIdade (20);
        aluno.setDataNascimento("06/08/2004");
        aluno.setCep(8985398);
        aluno.setCurso ("Artes visuais");
        aluno.setTurma("3AC");
        aluno.setNoturno("Matutino");

        aluno.Falar();
        aluno.Conversar();
        aluno.Ouvir();
        aluno.Estudar();


        String mensagem = "\nNome: "+aluno.getNome()+
                          "\nIdade: "+aluno.getIdade()+
                          "\nData de nascimento: "+aluno.getDataNascimento()+
                          "\nCEP: "+aluno.getCep()+
                          "\nCurso: "+aluno.getCurso()+
                          "\nTurma: "+aluno.getTurma()+
                          "\nTurno: "+aluno.getTurno();

        System.out.println("  " );
        System.out.println("Dados do aluno "+ mensagem);

    }
}