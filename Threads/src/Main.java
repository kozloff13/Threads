public class Main {

    public static void main(String[] args) {

        System.out.println("Посчитались нах!");

        ThreadOne f = new ThreadOne("первый нах");
        f.start();

        ThreadTwo s = new ThreadTwo();
        s.second.start();
        try {
            s.second.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(s.second.getName());
    }
}
