public class FirstClass {

    public static void findSomething(String[] months) {
        int i;
        for ( i = 0; i < months.length; i++) {
            months[i] = ((i + 1) + " = " + months[i]);
            System.out.println(months[i]);
        }
    }

    public static int addition(int firstNumber, int secondNumber){
        int result = firstNumber + secondNumber;
        return result;
    }

    public static void main(String[] args) {
        String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        findSomething(months);
    }
}
