package test.java.com.test.demo;

import org.testng.annotations.Test;

public class TestDemo {
    public int add(int i,int j){
        int m;
        m=i+j;
        return m/0;
    }
    @Test
    public   void testadd(){

        if(2==add(1,1)){
            System.out.println("1校验通过");
        }
        else{
            System.out.println("2校验失败");
        }

    }
}
