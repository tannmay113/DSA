class multiarray{

    void collectionofArray(){

        int [][] age = new int[5][3];
        age[0][0] = 44;
        age[0][1] = 55;

        int [][] agess = {{44,45,666} , {55,66,77} , {33,22,11}};
        System.out.println(agess[0][2]);
        System.out.println(agess.length);
     }
}

public class multiDarray {
    public static void main(String[] args) {
        multiarray umar  = new multiarray();
        umar.collectionofArray();

    }
}
