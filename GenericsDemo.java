
class Box<T> {
    private T value;

   
    public Box(T value) {
        this.value = value;
    }

   
    public T getValue() {
        return value;
    }


    public void setValue(T value) {
        this.value = value;
    }
}

public class GenericsDemo {
    public static void main(String[] args) {
       
        Box<Integer> intBox = new Box<>(123);
        System.out.println("Integer value: " + intBox.getValue());

        Box<String> strBox = new Box<>("Hello Generics");
        System.out.println("String value: " + strBox.getValue());

        Box<Double> dblBox = new Box<>(99.99);
        System.out.println("Double value: " + dblBox.getValue());
    }
}