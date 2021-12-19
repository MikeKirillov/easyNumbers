package JavaCore.Module12.ProducerConsumerStack;

import java.util.Deque;

public class Worker {
    private Deque toDoDequeue; // у рабочего есть ссылка на очередь из заданий

    public Worker(Deque toDoQueue) {
        this.toDoDequeue = toDoQueue; // даем ссылку на очередь в конструкторе
    }

    public void takeTask() {
        Object task = toDoDequeue.pollLast(); // вынимаем задание из очереди, начиная с верхнего,
        // т.е. последнего добавленного
        if (task != null) {
            System.out.println("Выполняю задачу: " + task);
        } else {
            System.out.println("Нет работы! Можно идти домой");
        }
    }
}