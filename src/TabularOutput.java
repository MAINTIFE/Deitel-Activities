public class TabularOutput {
    public static void main(String[] args) {
        int tableSize = 5;

        System.out.printf("%-4s %-4s %-4s %-4s%n", "N", "N2", "N3", "N4");

        for (int i = 1; i <= tableSize; i++){
            System.out.printf("%-4d %-4d %-4d %-4d%n", i, (i*i), (i*i*i), (i*i*i*i));
        }

    }
}

//System.out.println(Math.pow(N,4)); this is how to raise a number to the power of another number.