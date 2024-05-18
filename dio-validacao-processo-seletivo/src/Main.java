import java.util.ArrayList;
import java.util.Random;
import java.text.DecimalFormat;


public class Main {
    public static void main(String[] args) {
        var marcos = new Candidato("Marcos");
        var natalia = new Candidato("Natalia");
        var joao = new Candidato("João");
        var vitor = new Candidato("Vitor");
        var carlos = new Candidato("Carlos");
        var gustavo = new Candidato("Gustavo");
        var camila = new Candidato("Camila");
        var bruna = new Candidato("Bruna");
        double salarioBase = 2000.0;
        

        ArrayList<Candidato> candidatos = new ArrayList<>();
        ArrayList<Candidato> candidatosEntrevista = new ArrayList<>();
        candidatos.add(marcos);
        candidatos.add(natalia);
        candidatos.add(joao);
        candidatos.add(vitor);
        candidatos.add(carlos);
        candidatos.add(gustavo);
        candidatos.add(camila);
        candidatos.add(bruna);
        DecimalFormat formatoDecimal = new DecimalFormat("#.##");
        
        for (Candidato candidatoAtual : candidatos) {
            double salarioPre = candidatoAtual.salarioPretendido();
            String salarioFormatado = formatoDecimal.format(salarioPre);
            System.out.println("Candidato " + candidatoAtual + ", salario pretendido: " + salarioFormatado);
            if (salarioBase > salarioPre){
                System.out.println("LIGAR PARA O CANDIDATO\n");
                if(candidatosEntrevista.size() <= 5){
                    candidatosEntrevista.add(candidatoAtual);
                }
            } else if(salarioBase == candidatoAtual.salarioPretendido()){
                System.out.println("LIGAR PARA O CANDIDATO, COM CONTRA PROPOSTA\n");
                if(candidatosEntrevista.size() <= 5){
                    candidatosEntrevista.add(candidatoAtual);
                }
            } else {
                System.out.println("AGUARDANDO RESULTADO DOS DEMAIS CANDIDATOS\n");
            }
        }

        System.out.println("Candidatos: " + candidatos);
        System.out.println("Candidatos chamados para a entrevista: " + candidatosEntrevista);

        for (Candidato candidatoAtual : candidatos){
            int ligacoes = 1;
            boolean atendeu = false;

            while(ligacoes <= 3 && !atendeu){
                atendeu = new Random().nextInt(3)==1;
                System.out.println("Candidato: " + candidatoAtual);
                System.out.println("Tentativa: " + ligacoes);
                if(atendeu){
                    System.out.println("Conseguimos contato com " + candidatoAtual + ", apos " + ligacoes + " tentativas\n");
                } else{
                    System.out.println("Não conseguimos contato\n");
                }
                ligacoes++;
            }
        }
    } 
}
