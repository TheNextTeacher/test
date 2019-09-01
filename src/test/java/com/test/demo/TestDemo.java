package test.java.com.test.demo;

import org.testng.annotations.Test;

public class TestDemo {
    public int add(int i,int j){
        int m;
        m=i+j;

        return m;
    }
    @Test
    public   void testadd(){

        if(2==add(1,1)){
            System.out.println("校验通过");
        }
        else{
            System.out.println("校验失败");
        }

    }
}
