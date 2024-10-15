package org.example;

interface  A {
    public void sayHi1();
}

interface B {
    public void sayHi();
}

class MyCLass implements A,B{
    public static void main(String[] args) {

        MyCLass print=new MyCLass();
        print.sayHi1();
        print.sayHi();

    }

    @Override
    public void sayHi1() {
        System.out.println("fa");
    }

    @Override
    public void sayHi() {
        System.out.println("dsgfsdgsg");
    }


}

