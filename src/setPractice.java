import java.util.*;

class Mydata{
    int v;

    public Mydata(int v) {
        this.v = v;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Mydata mydata = (Mydata) o;
        return v == mydata.v;
    }

    @Override
    public int hashCode() {
        return Objects.hash(v);
    }
}

public class setPractice {
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();
        if(!list.contains(1)) list.add(1);

        Set<Mydata> set = new HashSet<>();
        set.add(new Mydata(1));
        set.add(new Mydata(2));
        set.add(new Mydata(3));
        set.add(new Mydata(1));
        set.add(new Mydata(2));
        set.add(new Mydata(3));

    }
}
