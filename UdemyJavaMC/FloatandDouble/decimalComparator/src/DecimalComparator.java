public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces (double numOne, double numTwo){
        int numOneInt = (int) (numOne * 1000);
        int numTwoInt = (int) (numTwo * 1000);

        if (numOneInt == numTwoInt){
            return true;
        }else {
            return false;
        }
    }
}
