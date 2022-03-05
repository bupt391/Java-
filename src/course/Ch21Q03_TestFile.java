package course;// Ch21Q03 Test File

// public static void main
public class Ch21Q03_TestFile {
    public static void main(String[] args) {
        System.out.println("a public class Test" + new String("hello") + " long value.");
        String[] t = new String[4];
       // t.test();
    }

    /* this is a class */
    void Test(){
        int i;
        /* this is a class */
        int j = 3;
        /* another comment with keywords static */
        int k=3;
        for(i = 0;i<1000;i++){ // for loop
            System.out.println(i);
            i += j;
        }
        System.out.println("I am an instanceof Test");
    }
}
