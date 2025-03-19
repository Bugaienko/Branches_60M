package kvasha;

public class Task1 {
    private String name;

    public Task1() {
        this.name = "Виталий";
    }

    @Override
    public String toString() {
        return "Task1{" +
                "name='" + name + '\'' +
                '}';
    }

    public static void main(String[] args) {

        Task1 defaultTask = new Task1();
        System.out.println(defaultTask);

    }
}

