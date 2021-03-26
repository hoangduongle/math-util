/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.duongle.mathutil;

/**
 *
 * @author ASUS
 */
public class MathUtility {

    /*ta sẽ tạo các hàm trong class này fake y chang class Math của JDK
      các hàm sẽ xài chung ở nhiều nơi, làm tiện ích dùng chung
      phàm cái gì dùng chung thì ta suy nghĩ đến STATIC
     */
    public static final double PI = 3.1415; //y chang Math.PI
    //lát hồi MathUtility.PI

    /*hàm tính n! = 1.2.3.4.5.6...n
        Quy ước: 0! = 1! = 1;
        vì giai thừa tăng cực nhanh về giá trị, 21 tràn kiểu long 
        ta sẽ khống chế n đầu vào của hàm từ 0..20
        kiểu long: 10^18, 18 con số 0 tối đa */
    
//    public static long getFactorial(int n) {
//        if (n < 0 || n > 20) {
//            throw new IllegalArgumentException("Ivalid argument. "
//                    + "n must between 0..20");
//        }
//        if (n == 0 || n == 1) {
//            return 1; //0! = 1! = 1;
//        }
//        //n từ 2 -> 20
//        long result = 1; //hết cố tình
//        for (int i = 2; i <= n; i++) {
//            result = result * i;
//
//        }
//        return result;
//    }
    
    public static long getFactorial(int n) {
        if (n < 0 || n > 20) {
            throw new IllegalArgumentException("Ivalid argument. "
                    + "n must between 0..20");
        }
        if (n == 0 || n == 1) {
            return 1; //0! = 1! = 1;
        }
        /*mình thừa biết n! = n * (n-1)!*/
        return n * getFactorial(n - 1);
    }

}
