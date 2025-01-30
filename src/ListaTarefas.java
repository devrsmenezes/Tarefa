import java.util.ArrayList;

public class ListaTarefas {
    private ArrayList<Tarefa> tarefas;

    public ListaTarefas() {
        this.tarefas = new ArrayList<>();
    }

    public void adicionarTarefa(Tarefa tarefa) {
        tarefas.add(tarefa);
        System.out.println("Tarefa adicionada: " + tarefa.getTitulo());
    }

    public void removerTarefa(Tarefa tarefa) {
        if (tarefas.remove(tarefa)) {
            System.out.println("Tarefa removida: " + tarefa.getTitulo());
        } else {
            System.out.println("Tarefa não encontrada: " + tarefa.getTitulo());
        }
    }

    public void listarTarefas() {
        if (tarefas.isEmpty()) {
            System.out.println("Não há tarefas na lista.");
        } else {
            System.out.println("Lista de Tarefas:");
            for (Tarefa tarefa : tarefas) {
                System.out.println(tarefa);
            }
        }
    }
}
