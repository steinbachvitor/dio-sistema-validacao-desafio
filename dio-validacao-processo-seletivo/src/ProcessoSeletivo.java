import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) throws Exception {
        System.out.println("Processo seletivo");
        selecaoCandidatos();
        imprimirSelecionados();
       
    }
    static void imprimirSelecionados(){
        String [] candidatos = {"Felipe", "Marcia", "Julia"};
        double salarioBase = 2000.0;
        double salarioPretendido = valorPretendido();
        for(String candidato : candidatos){
            if(salarioBase >= salarioPretendido){
                String[] candidatosSelecionados = {candidato};
                System.out.println(candidatosSelecionados);
            } 
        }
        
    }

    static void selecaoCandidatos(){
        String [] candidatos = {"Felipe", "Marcia", "Julia"};
        int candidatoAtual = 0;
        double salarioBase = 2000.0;
        int contador = 0;
        while(contador < candidatos.length){
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();
            System.out.println("O candidato " + candidato + " solicitou este valor de salario " + salarioPretendido);
            if(salarioBase >= salarioPretendido){
                System.out.println("Candidato selecionado");
            } else{
                System.out.println("Candidato não foi selecionado");
            }
            candidatoAtual++;
            contador++;
            
        }
    }

    static double valorPretendido(){
        return ThreadLocalRandom.current().nextDouble(1800,2200);
    }

    static void analisarCandidato(double salarioPretendido){
        double salarioBase = 2000.00;
        if(salarioBase > salarioPretendido){
            System.out.println("Ligar para o candidato");
        } else if (salarioBase == salarioPretendido){
            System.out.println("Ligar para o candidato com contra proposta");
        } else {
            System.out.println("Aguardando resultado dos demais candidatos");
        }
    }
}

