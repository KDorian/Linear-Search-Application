import java.util.Arrays;

/**
 * Created by Brodull on 03.09.2017.
 */
public class Search {

    int [] a;

    void initializeArray(int n){

        a = new int [n];

        for (int i = 0; i < n; i++){
            a[i] = i*i;
        }
    }

    String printArray(){

        return "Array :" + Arrays.toString(a);
    }

    String serialSearch(int number){

        int flag = -1;
        String str;

        long start = System.nanoTime();

        for(int i = 0; i < a.length; i++){

            if(number == a[i]) {
                flag = 0;
                i = a.length;
            }
        }

        long elapsedTime = System.nanoTime() - start;

        if(flag == -1){
            str = "The message was not found";
        } else {
            str = "The message was found";
        }

        return str + "\nThe time it takes the function to complete: " + elapsedTime + "nanoseconds.";
    }
}
