import java.util.ArrayList;

public class HiJava {

    public static void main(String[] args) {

        BubbleSort bubbleSort = new BubbleSort();
        RandomList randomList = new RandomList();
        StraightSelectionSort straightSelectionSort = new StraightSelectionSort();
        StraightInsertionSort straightInsertionSort = new StraightInsertionSort();


        ArrayList<Integer> noDuplicateList = new ArrayList<Integer>();
        ArrayList<Integer> duplicateList = new ArrayList<Integer>();
        // 숫자 범위보다 길이다 더 커지면 무한 반복에 빠지니 예외처리해주자

        System.out.println("\n\n-------------------------중복이 없는 리스트------------------------- ");
        noDuplicateList = randomList.NoDuplicateList(50,100);
        System.out.println("정렬 전 : "+noDuplicateList);
        System.out.println("버블  정렬 후 : "+bubbleSort.bubbleSort(noDuplicateList));
        System.out.println("단순 선택 정렬 후 : "+straightSelectionSort.straightselectionSort(noDuplicateList));
        System.out.println("단순 삽입 정렬 후: "+ straightInsertionSort.straightInsertionSort(noDuplicateList));
        System.out.println("\n\n-------------------------중복이 있는 리스트------------------------- ");
        duplicateList = randomList.duplicatesList(50,100);
        System.out.println("정렬 전 : "+duplicateList);
        System.out.println("버블  정렬 후 : "+bubbleSort.bubbleSort(duplicateList));
        System.out.println("단순 선택 정렬 후 : "+straightSelectionSort.straightselectionSort(duplicateList));
        System.out.println("단순 삽입 정렬 후: "+ straightInsertionSort.straightInsertionSort(duplicateList));


    }

}
