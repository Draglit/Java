public class Moto extends Transport {
    public Moto() {
        super (120);
    }
    public Moto(Moto x){
        super(x.getVelocity());
    }
    public Moto(int x){
        super(x);
    }
    public void test(){
        System.out.println(getVelocity());
    }
}
