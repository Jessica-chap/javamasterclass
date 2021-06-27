public class EqualSumChecker {
    public static boolean hasEqualSum (int myFirstNum, int mySecNum, int myThirdNum){
        int sumFirstSec = myFirstNum + mySecNum;

        if(sumFirstSec == myThirdNum){
            return true;
        }else{
            return false;
        }
    }
}
