public class Test {
    public static void main(String[] args) {
        father father = new father();
        System.out.println("the a of father is " + father.a);
        father.hello();


        father f = new child();
        System.out.println(f.a);
        f.hello();

    }
}

class father {
    int a = 20;

    public void hello() {
        System.out.println("father");
    }
}

class child extends father {
    int a = 10;

    public void hello() {
        System.out.println("child");
    }
}