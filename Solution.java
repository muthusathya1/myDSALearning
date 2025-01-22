
public class Solution {
    static int bar(int x, int y){
        if(y==0) return 0;
        return (x + bar(x,y-1));
    }
    static int foo(int x, int y){
        if(y==0) return 1;

        return bar(x, foo(x, y-1));
    }
    public static void main(String[] args) {
        System.out.println(foo(3, 5));
    }
}

// bar(x,y)= x+ bar(x,y-1)= 2x+ bar(x,y-2)= 3x+ bar(x,y-3)= yx

// foo(x,y) = x* foo(y-1)= x*x*foo(y-2)=.... =x^y 

// 3 ^ 5 = 243



// fun(2,10)= fun(4,5)=4*fun(16,2)=4*fun(256,1)=4*256*1;