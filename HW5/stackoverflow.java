package Hw;

public class stackoverflow {
    public static void recurse(){
        recurse();
    }
    public static void main(String[] args) {
        try{
            recurse();
        } catch (StackOverflowError e){
            System.out.println("!!!Stack overflow error has occured!!!");
        }
    }


}
