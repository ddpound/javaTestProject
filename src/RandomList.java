import java.util.ArrayList;
import java.util.Random;


public class RandomList {
    Random random = new Random();
    //중복되는 숫자가 없도록 만들어주기
    public ArrayList<Integer> NoDuplicateList(int ListLength , int NumericRange){
        ArrayList<Integer> randomIntList = new ArrayList<Integer>();
        boolean tf , checkboolean = false, same =true;

        // 중복되는 숫자가 없도록 짜주자
        for(int i=0; i< ListLength; i++){
            tf = true;

            if(i==0){
                randomIntList.add(random.nextInt(NumericRange));
            }else {

                // 중복성 검사  중복 값이 있으면 다시 주입
                int randnum;
                while (tf) {
                    randnum = random.nextInt(NumericRange);
                    // System.out.println("try Input Number : "+randnum);

                    //중복성 검사 부분
                    for (Integer integer : randomIntList) {
                        //System.out.println("already numberList: "+integer.intValue());
                        if (randnum == integer) {
                            // 같은 값이 있다면 당장 break; 시키고 다시 값 넣어주기
                            same = false;
                            break;
                        }

                        same =true;
                    }

                    if(same){
                        randomIntList.add(randnum);
                        tf = false;
                        break;
                    }


                }


            }

        }

        return randomIntList;
    }

    //중복이 있는 리스트
    public ArrayList<Integer> duplicatesList(int length, int NumericRange){
        ArrayList<Integer> arrayList = new ArrayList<Integer>();

        for ( int i =0; i < length; i++) {
            arrayList.add(randomNum(NumericRange));
        }


        return arrayList;
    }


    public int randomNum(int inputrange){
        return random.nextInt(inputrange);
    }


}
