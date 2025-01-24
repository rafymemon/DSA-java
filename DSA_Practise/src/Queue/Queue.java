package Queue;

public interface Queue {
    public void add(Object o);

    public Object first();

    public Object remove();

    public int size();

}