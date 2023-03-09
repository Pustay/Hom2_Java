/*  Реализуйте алгоритм сортировки пузырьком числового массива (введён вами),
*   результат после каждой итерации (после перемещения числа) запишите в лог-файл.
*/

import java.util.Arrays;
import java.io.FileWriter;
import java.io.IOException;

public class task1 {
    public static void fileWriter (String inputString) {
        try {
        String pathProject = System.getProperty("user.dir");
        String pathFile = pathProject.concat("/HW1_task1.txt");
        FileWriter x = new FileWriter(pathFile, true);
        x.append(inputString+"\n");
        x.flush();
        x.close();
        } catch (IOException ex) {
        System.out.println(ex.getMessage());
        }}

    public static void main(String[] args) {

        System.out.flush();        
        Integer[] array = { 12, 1, 5, 47, 32, 72, 64, 59, 51 };
        boolean isSorted = false;
        int temp;
        while(!isSorted) {
            isSorted = true;
            String stringlogger = Arrays.toString(array);
            fileWriter(stringlogger);                               
            for (int i = 0; i < array.length-1; i++) {
                if(array[i] > array[i+1]){
                    isSorted = false;
 
                    temp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = temp;
                }     
            }
        }
        System.out.println(Arrays.toString(array));
    }
}