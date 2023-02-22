public class InstanceInitializationBlock {
    private int x;
    {
        System.out.println("Instance");
    }
    static {
        System.out.println("static");
    }
    public InstanceInitializationBlock(){
        this.x=0;
        System.out.println(x);
        System.out.println("constructor");
    }

    public static void main(String[] args) {
        InstanceInitializationBlock intance = new InstanceInitializationBlock();
    }
}
