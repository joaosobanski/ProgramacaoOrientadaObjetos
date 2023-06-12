package modelo;

import java.util.ArrayList;
import java.util.HashMap;

public class Garagem {
    int max;
    HashMap<Integer, Veiculo> vaga;

    public Garagem(int max) {
        this.max = max;
        this.vaga = new HashMap<>();
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public HashMap<Integer, Veiculo> getVaga() {
        return vaga;
    }

    public void setVaga(HashMap<Integer, Veiculo> vaga) {
        this.vaga = vaga;
    }

    @Override
    public String toString() {
        return "Garagem [max=" + max + ", vaga=" + vaga + "]";
    }

    public void estacionar(Veiculo veiculo) {
        if (vaga.size() >= max) {
            System.out.println("Garagem está cheia, não tem vaga para o " + veiculo);
            return;
        }

        for (int i = 0; i < max; i++) {
            if (vaga.get(i) == null) {
                vaga.put(i, veiculo);
                return;
            }
        }
    }

    public void retirar(int nVaga) {
        vaga.remove(nVaga);
    }

    public ArrayList<Veiculo> filtro(String filtro) {
        ArrayList<Veiculo> filtrados = new ArrayList<>();
        for (int i = 0; i < max; i++) {
            if (vaga.get(i).getModelo().contains(filtro)) {
                filtrados.add(vaga.get(i));
            }
        }
        return filtrados;
    }
}
