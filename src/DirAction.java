public class DirAction <T, K extends Director>{
    private T key;
    private K obj;

    public DirAction(T key, K obj) {
        this.key = key;
        this.obj = obj;
    }

    public T getKey() {
        return key;
    }

    public void setKey(T key) {
        this.key = key;
    }

    public K getObj() {
        return obj;
    }

    public void setObj(K obj) {
        this.obj = obj;
    }

    @Override
    public String toString() {
        return "DirAction{" +
                "key=" + key + "; keyType=" + key.getClass().getName() +
                ", obj=" + obj +
                "} objType=" + obj.getClass().getName();
    }
}
