public class B  extends A implements Comparable<B>, Cloneable{
    int b = 3;

    public B() {
        System.out.println("B çağrıldı");
    }

    public static void ggg() {

    }

    @Override
    void printClass() {
        System.out.println("B printclass");
    }

    public void getB() {

    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public int compareTo(B o) {
        return 0;
    }
}
