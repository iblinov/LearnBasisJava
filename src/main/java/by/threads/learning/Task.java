package by.bsu.learning;

public class Task {
    private long idTask;
    private boolean isReady;
    private int mark;

    public Task(Integer idTask){
        this.idTask = idTask;
    }

    public long getIdTask() {
        return idTask;
    }

    public boolean isReady() {
        return isReady;
    }

    public void setReady(boolean ready) {
        isReady = ready;
    }

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }
}
