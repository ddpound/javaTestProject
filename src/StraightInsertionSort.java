import java.util.ArrayList;

public class StraightInsertionSort {

    public ArrayList<Integer> straightInsertionSort(ArrayList<Integer> arrayList){

        int targetIndexNum = 0;

        for(int i=0; i < arrayList.size();i++){

            if(targetIndexNum==0){
                targetIndexNum++;
            }else {
                int temp = arrayList.get(targetIndexNum);
                for(int j =1; j < i; j++){
                    // target index
                    if(targetIndexNum-j < 0){
                        break;
                    }
                    // 타겟 인덱스의 값이 더 작으면 왼쪽으로 교환해줘야함
                    if(arrayList.get(targetIndexNum-j) > temp){
                        int chtemp = arrayList.get(targetIndexNum-j);
                        arrayList.set(targetIndexNum-j, temp);
                        arrayList.set(targetIndexNum, chtemp);
                    }else {
                        break;
                    }
                    targetIndexNum++;
                }
            }

        }
        return arrayList;
    }



}
