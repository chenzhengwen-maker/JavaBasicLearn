package InheritanceLearn.bottomLearn;

public class SingletonLazy {
    private SingletonLazy(){

    }
    private static SingletonLazy singletonLazy;
    public static SingletonLazy getInstance(){
        if(singletonLazy == null){
            return new SingletonLazy();
        }else{
            return singletonLazy;
        }
    }
}
