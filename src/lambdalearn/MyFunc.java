package lambdalearn;
@FunctionalInterface
public interface MyFunc<T> {
    public T getValue(T t);
}
