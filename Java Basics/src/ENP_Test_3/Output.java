package ENP_Test_3;

import ENP_OOPS_TEST_$.test;

class Output {
    public static void main(String args[])
    {
        test obj = new test();
        obj.a = 10;
        obj.b = 20;             
        obj.meth(a , b);
        System.out.println(a + " " + b);        
    } 
}
