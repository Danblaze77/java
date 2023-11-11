
import java.util.Arrays;
import java.util.Scanner;
class GenericArrayOperations<T> {
    private Object[] array;
    private int size;

    public GenericArrayOperations(int initialCapacity) {
        array = new Object[initialCapacity];
        size = 0;
    }

    public void addElementAtBeginning(T element) {
        ensureCapacity();
        System.arraycopy(array, 0, array, 1, size);
        array[0] = element;
        size++;
    }

    public void addElementAtMiddle(int position, T element) {
        ensureCapacity();
        System.arraycopy(array, position, array, position + 1, size - position);
        array[position] = element;
        size++;
    }

    public void addElementAtEnd(T element) {
        ensureCapacity();
        array[size] = element;
        size++;
    }

    public void deleteElementAt(int position) {
        if (position < 0 || position >= size) {
            throw new IndexOutOfBoundsException("Invalid position");
        }
        System.arraycopy(array, position + 1, array, position, size - position - 1);
        size--;
    }

    private void ensureCapacity() {
        if (size == array.length) {
            array = Arrays.copyOf(array, size * 2);
        }
    }

    public void printArray() {
        System.out.println(Arrays.toString(Arrays.copyOf(array, size)));
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the initial capacity of the array: ");
        int initialCapacity = scanner.nextInt();
        GenericArrayOperations<Integer> arrayOps = new GenericArrayOperations<>(initialCapacity);

        // Add elements based on user input
        System.out.print("Enter the element to add at the beginning: ");
        int elementAtBeginning = scanner.nextInt();
        arrayOps.addElementAtBeginning(elementAtBeginning);
        arrayOps.printArray();

        System.out.print("Enter the position to add an element in the middle: ");
        int position = scanner.nextInt();
        System.out.print("Enter the element to add in the middle: ");
        int elementAtMiddle = scanner.nextInt();
        arrayOps.addElementAtMiddle(position, elementAtMiddle);
        arrayOps.printArray();

        System.out.print("Enter the element to add at the end: ");
        int elementAtEnd = scanner.nextInt();
        arrayOps.addElementAtEnd(elementAtEnd);
        arrayOps.printArray();

        // Delete element based on user input
        System.out.print("Enter the position to delete an element: ");
        position = scanner.nextInt();
        arrayOps.deleteElementAt(position);
        arrayOps.printArray();

        scanner.close();
    }
}


------------------------------------------------------------------------------------------------------------------------


import java.util.Scanner;

public class MaxValueFinder {

    public static <T extends Comparable<T>> T findMaxValue(T[] array) {
        if (array == null || array.length == 0) {
            return null;
        }

        T maxValue = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i].compareTo(maxValue) > 0) {
                maxValue = array[i];
            }
        }

        return maxValue;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int size = scanner.nextInt();

        if (size <= 0) {
            System.out.println("Invalid size. Exiting program.");
            scanner.close();
            return;
        }

        System.out.println("Enter the elements:");

        // For simplicity, assuming the user will provide elements of the same type.
        System.out.print("Enter element 1: ");
        String elementType = scanner.next();

        switch (elementType.toLowerCase()) {
            case "integer":
                Integer[] intArray = new Integer[size];
                for (int i = 0; i < size; i++) {
                    System.out.print("Enter element " + (i + 1) + ": ");
                    intArray[i] = scanner.nextInt();
                }
                System.out.println("Maximum value: " + findMaxValue(intArray));
                break;
            case "double":
                Double[] doubleArray = new Double[size];
                for (int i = 0; i < size; i++) {
                    System.out.print("Enter element " + (i + 1) + ": ");
                    doubleArray[i] = scanner.nextDouble();
                }
                System.out.println("Maximum value: " + findMaxValue(doubleArray));
                break;
            case "string":
                String[] stringArray = new String[size];
                for (int i = 0; i < size; i++) {
                    System.out.print("Enter element " + (i + 1) + ": ");
                    stringArray[i] = scanner.next();
                }
                System.out.println("Maximum value: " + findMaxValue(stringArray));
                break;
            default:
                System.out.println("Unsupported element type. Exiting program.");
        }

        scanner.close();
    }
}

