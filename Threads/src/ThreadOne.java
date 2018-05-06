public class ThreadOne implements Runnable{

    Thread first;
    private String name;

    public ThreadOne(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println("Старт");
        for (int i = 0; i < 4; i++) {
            System.out.println(i);
            System.out.println(name);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("Прерван");
            }
        }
    }

    public void start() {
        System.out.println("Поехал");
        if (first == null) {
            first = new Thread(this, name);
            first.start();

        }
    }
}
