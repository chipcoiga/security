package click.botay.filestream.no;

class B{}

class A extends B{
    int a = 0;
    void c(int a){
        this.a = a;
    }
    void cc(){
        System.out.println(a);
    }
}

public class ClassClass{
    public static void main(String[] args) {
        A a1 = new A();
        a1.c(2);

        B b = (B)a1;
        A a2 = (A)b;
        a2.cc();
    }
}



