public class MegaBytesConverter {

    public static void printMegaBytesAndKiloBytes (int kiloBytes){
        if (kiloBytes < 0 ){
            System.out.println("Invalid Value");
        }else{
            //1MB = 1024KB
            int megabytes = kiloBytes / 1024;
            int remainingKb = kiloBytes % 1024;
            System.out.println(kiloBytes + " KB = " + megabytes + " MB and " + remainingKb +" KB");

        }

    }
}
