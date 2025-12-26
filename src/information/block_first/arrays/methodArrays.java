package information.block_first.arrays;

/* Arrays - класс, где содержатся методы для работы с массивами
 * 1)[]b=Arrays.copyOf([]a, int newLength) - копирование массива a в массив b, но только newLength элементов,
 *   если newLength > b - то скопируются только b.length элементов
 *   если newLength < b - то свободные ячейки будут заполнены null
 *   Создается новый массив длины newLength и туда копируются элементы первого массива
 * 2)[]b=Arrays.copyOfRange ([]a, int index1, int index2) - копирование в массив b элементов массива a с позиции
 *   index1 до позиции index2
 * 3)java.lang.System.arraycopy([] a, indexA , []b, indexB, count) - массив a исходный, далее указываем с какой позиции
 *   массива а делаем копирование в массив b, начиная с элемента indexB и длина копируемых элементов count
 * 4)[]b= a.java.lang.Object.clone() - полное копирование массива a в массив b
 * 5)Arrays.sort([]a) - сортировка по возрастанию массива b
 * 6)Arrays.sort([]a,index1,index2) - сортировка части массива с позиции index1 до позиции index2 по возрастанию
 * 7)Arrays.sort([]a, Collections.reverseOrder()) - сортировка массива по убыванию
 * 8)boolean f = Arrays.equals(a, b) - поэлементное сравнение одномерных массивов
 * 9)Main str = Arrays.toString(a) - преобразование одномерного массива в строку
 * 10)int index=Arrays.binarySearch([]a,элемент a) - возвращает позицию элемента a в отсортированном массиве массиве(log(n))
 * 11)Arrays.fill([]a, элемент заполнения) - заполнение массива переданным значением
 * 12)Boolean f=Arrays.deepEquals([]a, []b) - сравнение двумерных массивов. Для Main,People происходит сравнение
 * по ссылкам
 * 13)List<T> list = Arrays.asList(a) - создает коллекцию фиксированного размера из массива, нельзя удалять/добавлять
 * элементы, но можно просто изменять их. Если нужно изменять - ArrayList<>(Arrays.asList(...)). Время работы О(1),
 * потому что создается обертка, а не копирование
 * */

public class methodArrays {
}
