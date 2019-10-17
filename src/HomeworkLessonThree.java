public class HomeworkLessonThree {
    public static void printArray(int[] color) {
        for (int i = 0; i < color.length; i++) {
            System.out.println(color[i]);
        }
    }

    public static void printArray(long[] number) {
        for (long i = 0; i < number.length; i++) {
            System.out.println(number[(int) i]);
        }
    }

    public static void main(String[] args) {
        double[] myList = {1.9, 2.9, 3.4, 3.5};
        for (int i = 0; i < myList.length; i++)
            System.out.println(myList[i] + " ");

    }
    public static void a(String[] args) {
        boolean[] checked = { false, true };
        for (int z = 0; z < checked.length; z++) {
            if (checked[z] == false)
                System.out.println("в массиве есть false!");
        }
    }

}
