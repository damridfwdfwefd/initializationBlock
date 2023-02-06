package example2;

public class ArrayInitExample {
    private int[] array;
    {
        System.out.println("Перед конструктором:");
        array = new int[10];
        for(int i = 0; i < array.length; i++) {
            array[i] = i * i;
        }
        printInit(array);
    }
    // блок инициализации instance initialization
    public ArrayInitExample() {
        System.out.println("\nВ конструкторе:");
        array = new int[10];
        for(int i = 0; i < array.length; i++) {
            array[i] = i + i;
        }
    }

    public void print() {
        for (int num : array) {
            // Вариант с printf
            System.out.printf("%d ", num);
            //System.out.println(String.format("%d ", num)); // Вариант с String.format
        }
    }
    public void printInit(int[] array) {
        for (int num : array) {
            System.out.printf("%d ", num);
        }
    }
}
