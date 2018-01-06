public class Transport {

    private int velocity;
    static String name = "Just Car";


    Transport(){
        this.velocity = 0;
        name = "Just Car 1";
    }

    Transport(int velocity){
        this.velocity = velocity;
    }

    protected int getVelocity() {
        return this.velocity;
    }

}
