public class typecasting {
    public static void main(String[] args) {
        String contactName = "Revanth";
        System.out.println(contactName.toLowerCase());
        Object obj1 = contactName; // upcasting
        // downcasting part
        System.out.println(obj1);
        obj1 = 12.5;
        System.out.println(obj1);
        Object obj2 = false;
        Boolean data = (Boolean) obj2; // down cating
        System.out.println(data);

        // type conversation between data types
        long zeta = 88L;
        char alpha = '0';
        alpha = (char) zeta;
        System.out.println(alpha);
        short micro = 92;
        int fella = 0;
        fella = micro;
        float seek = 0.0F;
        seek = micro;
        byte sigma = 0;
        sigma = (byte) micro;
        System.out.println("Type cast values: " + fella + ", " + seek + ", " + sigma);

        char check = 'R', match = 'a';
        check = (char) (check ^ match);
        match = (char) (check ^ match);
        check = (char) (check ^ match);
        System.out.println(check + " " + match);

    }
}