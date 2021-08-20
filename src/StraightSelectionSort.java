import java.util.ArrayList;

public class StraightSelectionSort {
    // 로직은 단순하다 순차 검색으로 가장 작은값을 선택해서 해당 인덱스로 보내버리면 끝

    public  ArrayList<Integer> straightselectionSort(ArrayList<Integer> arrayList ){

        // 타겟 인덱스는 처음부터
        int targetIndex =0;
        int minimum = arrayList.get(0); //인덱스 첫번째부터
        int minumumIndex = 0;

        for (int i:arrayList) {

            minimum = arrayList.get(targetIndex);


            // 먼저 가장 작은 값을 구함
            for(int j=targetIndex; j<arrayList.size(); j++){
                if(minimum > arrayList.get(j)){
                    minimum = arrayList.get(j);
                    minumumIndex = j;

                }
            }
            if(targetIndex > arrayList.size()){
                // 교환작업,
                int tmp = arrayList.get(targetIndex);
                arrayList.set(targetIndex, minimum);
                arrayList.set(minumumIndex, tmp);
            }

            targetIndex++;
        }

        return arrayList;
    }



}
