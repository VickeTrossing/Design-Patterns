public class Developer extends Job{

    @Override
    void startWork() {
        System.out.println("Developer starts coding");
    }

    @Override
    void breakTime() {
        System.out.println("Developer takes a break");
    }

    @Override
    void stopWork() {
        System.out.println("Developer stops coding");
    }
}


