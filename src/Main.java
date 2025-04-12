import java.util.Arrays;

public class Main {

    //TODO: Задача 1: Сравнение массивов
    // Напишите обобщенный метод, который сравнивает два массива одного типа и возвращает true,
    // если они равны (имеют одинаковые значения в одном и том же порядке) и false в противном случае.
    public static <T> boolean compareArrays(T[] arrayFirst, T[] arraysSecond) {
        return Arrays.equals(arrayFirst, arraysSecond);
    }

    //TODO: Задача 2: Слияние массивов
    // Напишите обобщенный метод для слияния двух массивов одного типа в один.
    public static <T> T[] mergingArrays(T[] arrayFirst, T[] arraysSecond) {
        T[] result = Arrays.copyOf(arrayFirst, arrayFirst.length + arraysSecond.length);

        System.arraycopy(arraysSecond, 0, result, arrayFirst.length, arraysSecond.length);

        return result;
    }

    //TODO: Задача 3: Поиск элемента
    // Напишите обобщенный метод для поиска элемента в массиве. Метод должен принимать массив и элемент для поиска,
    // а затем возвращать индекс этого элемента в массиве. Если элемент не найден, вернуть -1.
    public static <T, U> int searchElement(T[] array, U element) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == element) {
                return i;
            }
        }
        return -1;
    }


    public static void main(String[] args) {
        String[] stringsArrayFirst = {"1", "2", "3", "4", "5", "6"};
        String[] stringsArraySecond = {"7", "8", "9", "10"};

        Integer[] intArrayFirst = {1, 2, 3};
        Integer[] intArraySecond = {1, 2, 3};

        //Задача 1
        System.out.println(compareArrays(stringsArrayFirst, stringsArraySecond));
        System.out.println(compareArrays(intArrayFirst, intArraySecond));

        //Задача 2
        System.out.println(Arrays.toString(mergingArrays(stringsArrayFirst, stringsArraySecond)));
        System.out.println(Arrays.toString(mergingArrays(intArrayFirst, intArraySecond)));

        //Задача 3
        System.out.println(searchElement(stringsArrayFirst, "1"));
        System.out.println(searchElement(intArrayFirst, 6));
    }
}