package InheritanceLearn.bottomLearn;

public class ProxyServer implements NetWork{
    private NetWork network;
    public ProxyServer(NetWork network){
        this.network = network;
    }
    public void check(){
        System.out.println("检查通过");
    }
    @Override
    public void browse() {
        check();
        network.browse();
    }
}
