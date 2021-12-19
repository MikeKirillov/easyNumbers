package JavaCore.Module12.ProducerConsumerStack;

import java.util.Deque;

public class Boss {
    private Deque toDoDequeue;// у босса тоже есть ссылка на очередь из заданий

    public Boss(Deque toDoQueue) {
        this.toDoDequeue = toDoQueue;// даем ссылку на очередь в конструкторе
    }

    public void giveTask(String task) {
        toDoDequeue.add(task); // кладем задание в очередь
        System.out.println("Дал задачу " + task);
    }
}
