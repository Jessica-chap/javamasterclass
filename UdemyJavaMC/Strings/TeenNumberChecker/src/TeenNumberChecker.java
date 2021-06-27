public class TeenNumberChecker {
    public static boolean hasTeen (int myFirstNum, int mySecNum, int myThirdNum){
        if ((myFirstNum >= 13 && myFirstNum <= 19)  || (mySecNum >= 13 && mySecNum <= 19) ||
                myThirdNum >= 13 && myThirdNum <= 19){
            return true;
        }else{
            return false;
        }
        }
        public static boolean isTeen (int myFirstNum){
        if (myFirstNum >= 13 && myFirstNum <= 19){
            return true;
        }else{
            return false;
        }
        }
    }

