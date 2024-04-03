public class Main {

    public static void main(String[] args) {

        //  Look at how this works right now. Then, change ClassOne, ClassTwo, and Main so that the output
        //  is the following:
        //  ClassOneSingleArgConstructor
        //  ClassTwoSingleArgConstructor
        //  ClassTwoMyMethod
        //  ClassOneMyMethod

        ClassOne c = new ClassTwo();
        c.myMethod();

    }

}