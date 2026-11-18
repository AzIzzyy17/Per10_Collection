import java.util.ArrayList;

public class ArrayStack<T> {
    private final int maxsize;
    private final ArrayList<T> items;

    public ArrayStack(int maxsize) {
        if (maxsize <= 0)
            throw new ArrayStackException(
                "Stack size must be positive");
        this.maxsize = maxsize;
        this.items = new ArrayList<>();
    }

    public void push(T item) {
        if (items.size() == maxsize)
            throw new ArrayStackException("Overflow Error");
        items.add(item);
    }

    public T pop() {
        if (isEmpty())
            throw new ArrayStackException("Underflow Error");
        return items.remove(items.size() - 1);
    }

    public boolean isEmpty() {
        return items.isEmpty();
    }

    public static class ArrayStackException
            extends RuntimeException {
        public ArrayStackException(String message) {
            super(message);
        }
    }

    public static void main(String[] args) {
        // // Uji tipe data 1: Integer
        // ArrayStack<Integer> numbers = new ArrayStack<>(3);
        // numbers.push(1);
        // numbers.push(2);
        // numbers.push(3);
        // System.out.println(numbers.pop());
        // System.out.println(numbers.pop());
        // System.out.println(numbers.pop());

        // // Uji tipe data 2: String
        // ArrayStack<String> texts = new ArrayStack<>(2);
        // texts.push("PBO");
        // texts.push("Collection");
        // System.out.println(texts.pop());
        // System.out.println(texts.pop());

        // 1. Uji tipe Integer & Overflow Error
        ArrayStack<Integer> numbers = new ArrayStack<>(3);
        numbers.push(1);
        numbers.push(2);
        numbers.push(3);

        try {
            numbers.push(4);
        } catch (ArrayStackException e) {
            System.out.println("Uji Overflow: " + e);
        }

        // 2. Pastikan behavior LIFO tetap terlihat dari urutan pop
        System.out.println("Pop 1: " + numbers.pop());
        System.out.println("Pop 2: " + numbers.pop());
        System.out.println("Pop 3: " + numbers.pop());

        // 3. Uji Underflow Error saat stack kosong 
        try {
            numbers.pop(); // Pop saat stack kosong
        } catch (ArrayStackException e) {
            System.out.println("Uji Underflow: " + e);
        }

        // 4. Uji tipe String
        ArrayStack<String> texts = new ArrayStack<>(2);
        texts.push("PBO");
        texts.push("Collection");
        System.out.println("Pop String 1: " + texts.pop());
        System.out.println("Pop String 2: " + texts.pop());

    }
}