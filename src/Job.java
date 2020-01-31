public abstract class Job {

    abstract void startWork();
    abstract void breakTime();
    abstract void stopWork();

    public final void work(){
        //Start working
        startWork();

        //Take a break
        breakTime();

        //Stop working
        stopWork();
    }

}
