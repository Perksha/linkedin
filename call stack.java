//CALL STACK

class HelloWorld {
    public static void main(String[] args) {
        int x=9;
        System.out.println("Main method argument "+x);
        first();
    }
    static void first(){
        int x=89;
        System.out.println("First method argument  "+x);
        second();
    }
    static void  second(){
        int x=99;
        System.out.println("Second method argument"+x);
        third();
        
    }
    static void third(){
        int x=66;
        System.out.println("Third method argument"+ x);
    }
    
    
}
