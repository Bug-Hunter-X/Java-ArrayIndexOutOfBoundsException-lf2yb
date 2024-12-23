public class MyClass {
    public static void main(String[] args) {
        int[] array = new int[5];
        if (5 < array.length && 5 >= 0) { // Check index boundaries
            array[4] = 10; 
            System.out.println(array[4]);
        } else {
            System.out.println("Index out of bounds");
        }
    }
}