public class ClassTwo extends ClassOne {

    public ClassTwo() {
        System.out.println("ClassTwoNoArgConstructor");
    }

    public ClassTwo(String s) {
        System.out.println("ClassTwoSingleArgConstructor:" + s);
    }

    public void myMethod() {
        System.out.println("ClassTwoMyMethod");
    }

}
