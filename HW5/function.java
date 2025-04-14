package Hw;

public class function {
    public static void main(String[] args) {
        try{
            int[] array = {1,2,3};
            System.out.println(array[4]);
        } catch (Exception e){
            System.out.println("!!!!!!!You have made an error be careful!!!!!!!"+ e.getMessage());
            e.printStackTrace();
        }
    }
}
