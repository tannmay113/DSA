class oneDarray{
    int array(){
        int [] age = new int[3];
        age[0] = 30;
        age[1] = 40;
        age[2] = 33;

        System.out.println(age[0]);
        System.out.println(age[1]);
        System.out.println(age[2]);

        int [] ages = {20,30,333,44,445,55};

        System.out.println(ages[0]);
        System.out.println(ages[1]);
        System.out.println(ages[2]);
        System.out.println(ages[3]);
        System.out.println(ages[4]);
        System.out.println(ages[5]);
        return 0;
    }
}
public class singleDarray {
    public static void main(String[] args) {

        oneDarray umar = new oneDarray();
        umar.array();



    }
}
