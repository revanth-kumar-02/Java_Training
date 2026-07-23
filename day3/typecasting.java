package day3;

public class typecasting {
    public static void main(String[] args) {
        String contactName = "Revanth";
        System.out.println(contactName.toLowerCase());
        Object obj1 = contactName; //upcasting
        //downcasting part
        System.out.println(obj1);
        obj1 = 12.5;
        System.out.println(obj1);
        Object obj2 = false;
        Boolean data = (Boolean) obj2; //down cating 
        System.out.println(data);










    }    
}