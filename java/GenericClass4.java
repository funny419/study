public class GenericClass4<E> {
    private E element;

    void set(E element) {
        this.element = element;
    }

    E get() {
        return element;
    }

    // 아래 메소드의 E타입은 제네릭 클래스의 E타입과 다른 독립적인 타입이다.
    static <E> E genericMethod1(E obj) {
        return obj;
    }

    static <T> T genericMethod2(T obj) {
        return obj;
    }
}


class Process4 {
    public static void main(String[] args) {
        GenericClass4<String> clazz1 = new GenericClass4<>();
        GenericClass4<Integer> clazz2 = new GenericClass4<>();

        clazz1.set("10");
        clazz2.set(10);

        System.out.println("clazz1 data : " + clazz1.get());
        System.out.println("clazz1 E Type : " + clazz1.get().getClass().getName());

        System.out.println("clazz2 data : " + clazz2.get());
        System.out.println("clazz2 T Type : " + clazz2.get().getClass().getName());

        System.out.println("<E> return Type : " + GenericClass4.genericMethod1(3).getClass().getName());
        System.out.println("<E> return Type : " + GenericClass4.genericMethod1("ABCD").getClass().getName());

        System.out.println("<T> return Type : " + GenericClass4.genericMethod2(5).getClass().getName());
        System.out.println("<T> return Type : " + GenericClass4.genericMethod2("EFGH").getClass().getName());
    }
}
