import java.util.Scanner;

public class Estagiario extends Funcionarios{

    //super(getano,getcpf,getdepartamento,getdia,getmes,getnome,getsalario);

    Scanner scanner = new Scanner(System.in);

    public Estagiario (String nome, String sobrenome, Double salario, String departamento, String cpf, int dia, int mes, int ano){
        super(nome, sobrenome, salario, departamento, cpf, dia, mes, ano); 
    }

    void fazerTarefa(Funcionarios funcionarios){
        System.out.println("Qual tarefa deseja que ele faça? ");
        String tarefa = scanner.next();
        System.out.println(funcionarios.getnome() + " agora está a " + tarefa);
    }

    @Override
    void mostrarDados (Funcionarios funcionarios){
        System.out.println("Nome: " + funcionarios.getnome());
        System.out.println("Sobrenome: " + funcionarios.getsobrenome());
        System.out.println("Data de nascimento: " + funcionarios.getdia() + "/" + funcionarios.getmes() + "/" + funcionarios.getano());
        System.out.println("Salário: " + funcionarios.getsalario());
        System.out.println("Departamento: " + funcionarios.getdepartamento());
        System.out.println("Posição na empresa: estagiario");
    }
}
