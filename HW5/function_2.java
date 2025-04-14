package Hw;

public class function2 {
    public static void main(String[] args) {
        try{
            int result = 10/0;
        } catch (Exception e){
            System.out.println("!!!You are dividing by zero be careful with your operations!!!" + e.getMessage());
            e.printStackTrace();
        }

    }
}
