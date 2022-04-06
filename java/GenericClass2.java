public class GenericClass2<K,V> {
    private K first;
    private V second;


    void set(K first,V second) {
        this.first = first;
        this.second = second;
    }

    K getFirst() {
        return first;
    }

    V getSecond() {
        return second;
    }
}

class Main {
    public static void main(String[] args) {
        GenericClass2<String,Integer> a = new GenericClass2<String,Integer>();
        a.set("10",10);

        System.out.println("a K data : " + a.getFirst());
        System.out.println("a K Type : " + a.getFirst().getClass().getName());

        System.out.println("a V data : " + a.getSecond());
        System.out.println("a V Type : " + a.getSecond().getClass().getName());
    }
}
