package my.homework.Task43;

public class Main {
    public static void main(String[] args) {
       Names names = new Names();



       try{
           names.lengthName();
       }catch (NullPointerException e){
           System.out.println("Error!!!.One of the name has NULL value");;
       }

    }
}
