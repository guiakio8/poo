package lista1.atividade3;
import java.util.ArrayList;


public class Estoque {
    private ArrayList<Item> itens = new ArrayList<>();

    public void adicionarItem(Item item) {
        itens.add(item);
    }

    public void removerItem(Item item) {
        itens.remove(item);
    }

    public void atualizarQuantidade(Item item, int novaQuantidade) {
        item.setQuantidade(novaQuantidade);
    }

    public ArrayList<Item> listarItems() {
        return itens;
    }
}
