public static int indexValueReturn(int[] arr, int i) {
    if (i >= 0 && i < arr.length) {
        return arr[i];
    }
    throw new IllegalArgumentException("Index out of bounds. " +
            "Please provide a valid index between 0 and " + (arr.length - 1) + ".");
}

void main() {
    int[] arr = {24, 25, 26, 27, 28};
    int i = 4;
    int element = indexValueReturn(arr, i);
    IO.println("Element at index " + i + " is: " + element);
}
