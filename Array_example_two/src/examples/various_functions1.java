


package examples;

public class various_functions1 {

   //int array[];





    public static void add(int index, int element) {

        int[] array = new int[10];


        if (index > array.length || index < 0) {

            System.out.println("ArrayIndexOutOfBoundsException : index is out of range (index < 0 || index > size())");
        }

        int[] temp = new int[array.length + 1]; // здесь надо было увеличить размер массива, ты же добавляешь


        // здесь у тебя неправильное условие итератора i<=index;, отсюда и нули в окончание массива

        for (int i = 0; i < array.length; i++) {

            if (i < index) { // если текущий элемент меньше индекса вставки
                temp[i] = array[i];  // то просто копируем

            } else { //иначе копируем с сдвигом
                temp[i + 1] = array[i];
            }
        }


    }
}
