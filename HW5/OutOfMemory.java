package Hw;

public class OutOfMemory {
    public static void main(String[] args) {
        try{
            int[] bigArray = new int[Integer.MAX_VALUE];
        } catch (OutOfMemoryError e){
            System.out.println("Out of Memory Error has occured!!!");
        }
    }
}
