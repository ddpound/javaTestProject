
import java.util.ArrayList;
import java.util.Random;

public class BubbleSort {
    Random random = new Random();
    RandomList randomList = new RandomList();

    // 리스트를  그대로 받아와서 정렬해주는 부분

    // ArrayList 형식을 받아내 정렬해주는 버블 리스트 정렬
    // Integer 형만 받아낸다
    public ArrayList<Integer> bubbleSort(ArrayList<Integer> arrayList){
        int repetitionNum = 0;
        for (int t: arrayList){
            for(int i=0; i < arrayList.size()-repetitionNum;i++){
                if(i+1 == arrayList.size()-repetitionNum){

                }else {
                    // 여기서 값을 대체하는것도 따로 다루어야 하지만 현재 bubble sort만 있기 때문에 놔두도록 하자
                    if(arrayList.get(i) > arrayList.get(i+1)){
                        int tmp = arrayList.get(i);
                        arrayList.set(i, arrayList.get(i+1));
                        arrayList.set(i+1, tmp);
                    }


                }

            }
            repetitionNum++;
        }

        return arrayList;
    }








}
