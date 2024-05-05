//Variable Arguments

class HelloWorld {
    public static int calc(int... arger){
        System.out.println(arger.getClass().getSimpleName());
        int tot=0;
        for(int num :arger){
            tot+=num;
        }
        return tot;
    }
    public static void main(String[] args) {
      int arg1=calc(6,8,89,7,99);
      int arg2=calc(55,78,9,5,8,999,456,788);
      System.out.println(arg1);
      System.out.println(arg2);
    }
    
    
}
