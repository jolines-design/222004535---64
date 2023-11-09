interface MyInterface {
    void myMethod();
}

class ClassA implements MyInterface {
    public void myMethod() {
        System.out.println("Im Keza FROM Bit Department");
    }
}

class ClassB implements MyInterface {
    public void myMethod() {
        System.out.println("Im Karabo FROM Finance Department");
    }
}

class ClassD implements MyInterface {
    public void myMethod() {
        System.out.println("Im Karina FROM Marketing Department");
    }
}


class ClassE implements MyInterface {
    public void myMethod() {
        System.out.println("Im Kariza FROM Statistic Department");
    }
}

class ClassC {
    public void callMyMethod(MyInterface obj) {
        obj.myMethod();
    }
}

