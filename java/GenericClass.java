public class GenericClass<E> {
    private E element;

    void set(E element) {
        this.element = element;
    }

    E get() {
        return element;
    }
}

class Main {
    public static void main(String[] args) {
        GenericClass<String> a = new GenericClass<String>();
        GenericClass<Integer> b = new GenericClass<Integer>();

        a.set("10");
        b.set(10);

        System.out.println("a data : " + a.get());
        System.out.println("a E Type : " + a.get().getClass().getName());

        System.out.println("b data : " + b.get());
        System.out.println("b E Type : " + b.get().getClass().getName());
    }
}
