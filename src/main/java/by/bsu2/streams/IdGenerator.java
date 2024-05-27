package by.bsu2.streams;

public interface IdGenerator {
    // todo как сделать последовательную генерацию id ?
    static int generateId(){
        return 10 + (int)(Math.random() * 90);
    }
}
