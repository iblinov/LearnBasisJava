package by.bsu2.java8.copyonwritearray;
class SubScriber {

    private String name;

    public SubScriber(String name) {
        this.name = name;
    }

    public void receive(String score) {
        System.out.printf("[%s] Event received : %s %n", name, score);
    }
}