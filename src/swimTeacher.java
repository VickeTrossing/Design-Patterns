public class swimTeacher extends Job{

    @Override
    void startWork() {
        System.out.println("Swim teacher starts working");
    }

    @Override
    void breakTime() {
        System.out.println("Swin teacher takes a break");
    }

    @Override
    void stopWork() {
        System.out.println("Swim teacher stops working");
    }
}
