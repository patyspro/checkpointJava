package cadastroEscolar;

import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        //Inserindo os cursos
        Curso ingles = new Curso(Disciplina.INGLES,700.00);
        Curso informatica= new Curso(Disciplina.INFORMATICA,800.00);
        Curso administracao= new Curso(Disciplina.ADMINISTRACAO,850.00);

        //Inserindo os endereços
        Endereco endereco1= new Endereco("Rua das Margarinas",574,"Paraíso","São Paulo","SP");
        Endereco endereco2= new Endereco("Rua das Oliveiras",494,"Olivardo","São Paulo","SP");
        Endereco endereco3= new Endereco("Rua das Rosas",729,"Roseira","São Paulo","SP");
        Endereco endereco4= new Endereco("Rua das Rosas",105,"Ipiranga","São Paulo","SP");
        Endereco endereco5= new Endereco("Rua das Gaivotas",207,"Sacomã","São Paulo","SP");
        Endereco endereco6 =new Endereco("Rua do Bosque",89,"Vila Mariana","São Paulo","SP");
        Endereco endereco7 =new Endereco("Rua da Paz",792,"Vila Mariana","São Paulo","SP");
        Endereco endereco8 =new Endereco("Rua da Alegria",459,"Olivardo","São Paulo","SP");
        Endereco endereco9 =new Endereco("Rua da Esperança",721,"Saúde","São Paulo","SP");
        Endereco endereco10 =new Endereco("Rua da Fé",309,"Saúde","São Paulo","SP");
        Endereco endereco11 =new Endereco("Rua da Resiliência",05,"Fé","São Paulo","SP");
        Endereco endereco12 =new Endereco("Rua da Abundância",47,"Natureza","São Paulo","SP");

        //Inserindo os telefones
        Telefone telefone1= new Telefone(11,99896746);
        Telefone telefone2= new Telefone(11,99789749);
        Telefone telefone3= new Telefone(11,89789779);
        Telefone telefone4= new Telefone(11,79879485);
        Telefone telefone5= new Telefone(11,97982972);
        Telefone telefone6= new Telefone(11,95789287);
        Telefone telefone7= new Telefone(11,97895289);
        Telefone telefone8= new Telefone(11,95895249);
        Telefone telefone9= new Telefone(11,97892592);
        Telefone telefone10= new Telefone(11,94552682);
        Telefone telefone11= new Telefone(11,93752672);
        Telefone telefone12= new Telefone(11,95452634);

        // Inserindo os alunos
        Aluno aluno1= new Aluno("Jorge Habibs","555.820.333-79","jorge@hotmail.com",endereco1,telefone1);
        Aluno aluno2= new Aluno("Giorgina Abadia","455.420.333-99","giorgina@hotmail.com",endereco2,telefone2);
        Aluno aluno3= new Aluno("Abdala Hosana","555.420.497-79","abdala@hotmail.com",endereco3,telefone3);
        Aluno aluno4= new Aluno("Samuel Barbosa","597.369.487-95","samuel@gmail.com",endereco7,telefone7);
        Aluno aluno5= new Aluno("Patricia Silva","397.369.487-94","patricia@gmail.com",endereco8,telefone8);
        Aluno aluno6= new Aluno("Felipe Barbosa","797.369.487-95","felipe@gmail.com",endereco9,telefone9);
        Aluno aluno7=new Aluno("Luna Sampaio","577.369.487-95","luna@gmail.com",endereco10,telefone10);
        Aluno aluno8=new Aluno("Henrique Santiago","589.369.493-45","felipe@gmail.com",endereco11,telefone11);
        Aluno aluno9=new Aluno("Otávio Gonçalves","457.137.594-95","felipe@gmail.com",endereco12,telefone12);

        // Adicionando os professores
        Professor professor1= new Professor(01,"Mateus Silva","5974.222.700-99","mateus@gmail.com",endereco4,telefone4,25.00,Formacao.MESTRADO);
        Professor professor2= new Professor(02,"Paula Sampaio","555.900.574-54","paula@gmail.com",endereco5,telefone5,20.00, Formacao.ESPECIALIZACAO);
        Professor professor3= new Professor(03,"Saulo Farias","455.500.474-64","saulo@hotmail.com",endereco6,telefone6,49.00,Formacao.DOUTORADO);


        // Criando a lista de alunos
        List<Aluno> alunoList= new ArrayList<>();
        alunoList.add(aluno1);
        alunoList.add(aluno2);
        alunoList.add(aluno3);
        alunoList.add(aluno4);
        alunoList.add(aluno5);
        alunoList.add(aluno6);

        // Adicionando na sala 1 o turno, professor, nome da Sala, disciplina e alunos
        Turma sala1= new Turma(Turno.MANHA,professor1,"Sala 01",ingles);
        sala1.insereAluno(aluno1);
        sala1.insereAluno(aluno2);
        sala1.insereAluno(aluno3);

        // Adicionando na sala 2 o turno, professor, nome da Sala, disciplina e alunos
        Turma sala2= new Turma(Turno.TARDE,professor3,"Sala 02",administracao);
        sala2.insereAluno(aluno4);
        sala2.insereAluno(aluno5);
        sala2.insereAluno(aluno6);

        // Adicionando na sala 3 o turno, professor, nome da Sala, disciplina e alunos
        Turma sala3= new Turma(Turno.NOITE,professor2,"Sala 03",informatica);
        sala3.insereAluno(aluno7);
        sala3.insereAluno(aluno8);
        sala3.insereAluno(aluno9);


        // Mostra na tela  todas as salas que foram criadas
        System.out.println(sala1);
        System.out.println(sala2);
        System.out.println(sala3);


    }
}
