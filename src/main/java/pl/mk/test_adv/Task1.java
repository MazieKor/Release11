package pl.mk.test_adv;

public class Task1 {
    public static void main(String[] args) {
        int testMethodNumber = -2;
        try {
            System.out.printf("For number %d result is %d", testMethodNumber, calculate(testMethodNumber));
        } catch (TaskOneSpecialException e){
            e.printStackTrace();
        }

    }

    public static int calculate(int index){
        if(index < 0)
            throw new TaskOneSpecialException("Please insert a number which is greater than 0");
        if(index < 3)
            return index;

        int[] array = new int[index+1];
        array[0] = 0;
        array[1] = 1;
        array[2] = 2;
        for (int i = 3; i < array.length; i++) {
            array[i] = array[i-1] + array[i-2] + array[i-3];
        }
        return array[index];

    }

}
