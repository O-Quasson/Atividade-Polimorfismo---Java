public class Gerente extends Funcionarios {

    public Gerente (String nome, String sobrenome, Double salario, String departamento, String cpf, int dia, int mes, int ano){
        super(nome, sobrenome, salario, departamento, cpf, dia, mes, ano); 
    }

    void realizarReuniao(int id, Funcionarios... funcionarios){
        if(id>1){
            System.out.println("Você realizou uma reunião com: ");
            for(int i = 0; i < id;i++){
                System.out.println(funcionarios[i].getnome());
            }
        }else{
            System.out.println("Não há funcionários o suficiente para realizar uma reunião");
        }
    }

    //eu sequer posso fazer desse jeito?
    @Override
    void mostrarDados (Funcionarios funcionarios){
        System.out.println("Nome: " + funcionarios.getnome());
        System.out.println("Sobrenome: " + funcionarios.getsobrenome());
        System.out.println("Data de nascimento: " + funcionarios.getdia() + "/" + funcionarios.getmes() + "/" + funcionarios.getano());
        System.out.println("Salário: " + funcionarios.getsalario());
        System.out.println("Departamento: " + funcionarios.getdepartamento());
        System.out.println("Posição na empresa: gerente");
    }
}
