public class GenericClass3<E> {
    private E element;

    void set(E element) {
        this.element = element;
    }

    E get() {
        return element;
    }

    <T> T genericMethod(T obj) {
        return obj;
    }
}

class Main {
    public static void main(String[] args) {
        GenericClass3<String> a = new GenericClass3<String>();
        GenericClass3<Integer> b = new GenericClass3<Integer>();

        a.set("10");
        b.set(10);

        System.out.println("a data : " + a.get());
        System.out.println("a E Type : " + a.get().getClass().getName());

        System.out.println("b data : " + b.get());
		System.out.println("b E Type : " + b.get().getClass().getName());
		
		System.out.println("<T> returnType : " + a.genericMethod(3).getClass().getName());
		System.out.println("<T> returnType : " + a.genericMethod("ABCD").getClass().getName());
		System.out.println("<T> returnType : " + a.genericMethod(b).getClass().getName());
    }
}
