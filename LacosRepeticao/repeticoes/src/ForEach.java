public class ForEach {
    public static void main(String[] args) {
        String alunos[] = {"Felipe", "Pedro", "Gustavo", "Marcos"};
        for(String aluno : alunos){
            System.out.println(aluno);
            
            //uso do continue dentro do forEach
            if (aluno == "Pedro"){
                continue;
            }
            
            System.out.println(aluno + " depois do continue");
            //Ele interrompe o processo, e não efetua os próximos comandos


            //uso do break dentro do forEach
            if (aluno == "Gustavo"){
                System.out.println("Entrei no " + aluno + " vou dar break e não executar o Marcos");
                break;
            }
        }
    }
}
