package by.bsu2.forksimple;

import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.RecursiveTask;

/**
 * Created by Ihar_Blinou on 5/22/2015.
 */
public class ValueSumCounter extends RecursiveTask<Long> {
private final NodeImpl node;

public ValueSumCounter(NodeImpl node) {
        this.node = node;
        }

@Override
protected Long compute() {
        long sum = node.getValue();
        List<ValueSumCounter> subTasks = new LinkedList<>();

        for(NodeImpl child : node.getChildren()) {
        ValueSumCounter task = new ValueSumCounter(child);
        task.fork(); // запустим асинхронно
        subTasks.add(task);
        }

        for(ValueSumCounter task : subTasks) {
        sum += task.join(); // дождёмся выполнения задачи и прибавим результат
        }

        return sum;
        }

        }