public class CadastrosEscola {

    public static void main(String[] args) {

        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Dudis");
        pessoa.setIdade (19);





        
        pessoa.setDataNascimento("18/05/2007");
        pessoa.setCep(6658954);

        pessoa.Falar();
        pessoa.Conversar();
        pessoa.Ouvir();

        String mensagem = "\nNome: "+pessoa.getNome()+
                          "\nIdade: "+pessoa.getIdade()+
                          "\nData de nascimento: "+pessoa.getDataNascimento()+
                          "\nCEP: "+pessoa.getCep();

        System.out.println("  " );
        System.out.println("Pessoa "+ mensagem);

        System.out.println("  " );
        System.out.println("--------------------" );
        System.out.println("  " );

        // Aluno
        Aluno aluno = new Aluno();
        aluno.setNome("Antoniela");
        aluno.setIdade (20);
        aluno.setDataNascimento("06/08/2004");
        aluno.setCep(8985398);
        aluno.setCurso ("Artes visuais");
        aluno.setTurma("3AC");
        aluno.setTurno("Matutino");

        System.out.println("  " );

        aluno.Falar();
        aluno.Conversar();
        aluno.Ouvir();
        aluno.Estudar();


        String mensagem1 = "\nNome: "+aluno.getNome()+
                          "\nIdade: "+aluno.getIdade()+
                          "\nData de nascimento: "+aluno.getDataNascimento()+
                          "\nCEP: "+aluno.getCep()+
                          "\nCurso: "+aluno.getCurso()+
                          "\nTurma: "+aluno.getTurma()+
                          "\nTurno: "+aluno.getTurno();

        System.out.println("  " );
        System.out.println("Dados do Aluno "+ mensagem1);

        System.out.println("  " );
        System.out.println("--------------------" );
        System.out.println("  " );

        // Professor
        Professor professor = new Professor();
        professor.setNome("Arthur");
        professor.setIdade (29);
        professor.setDataNascimento("04/08/2006");
        professor.setCep(8912398);
        professor.setMateria ("Ingles");
        professor.setAnosTrabalhados(8);
        professor.setNrAulaPorDia(9);

        System.out.println("  " );

        professor.Falar();
        professor.Conversar();
        professor.Ouvir();
        professor.Explicar();


        String mensagem2 = "\nNome: "+professor.getNome()+
                          "\nIdade: "+professor.getIdade()+
                          "\nData de nascimento: "+professor.getDataNascimento()+
                          "\nCEP: "+professor.getCep()+
                          "\nMateria: "+professor.getMateria()+
                          "\nTempo de sala de aula: "+professor.getAnosTrabalhados()+" anos"+
                          "\nTurmas por dia: "+professor.getNrAulaPorDia();

        System.out.println("  " );
        System.out.println("Dados do Professor "+ mensagem2);

    }
}