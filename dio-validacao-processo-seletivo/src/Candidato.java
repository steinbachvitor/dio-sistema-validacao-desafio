import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.concurrent.ThreadLocalRandom;

public class Candidato {
    public String nome;
    NumberFormat formatter = new DecimalFormat("#0,00");

    Candidato(String nome){
        this.nome = nome;
    }

    double salarioPretendido(){
        return ThreadLocalRandom.current().nextDouble(1800,2200);

    }

    @Override
    public String toString() {
        return nome;
    }
}
