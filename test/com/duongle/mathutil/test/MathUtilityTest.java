/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.duongle.mathutil.test;

import com.duongle.mathutil.MathUtility;
import java.sql.SQLException;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ASUS
 */
public class MathUtilityTest {
    
    //đặt tên hàm theo chuẩn của dân Test phần mềm, QA/QC
    
    @Test //biến hàm này thành main(). Shift F6 để chạy
    public void testFactorialGivenRightArgumentReturnGoodResult(){
        int n = 5;
        long expected = 120;
        long actual = MathUtility.getFactorial(n);
        
        assertEquals(expected, actual);
        assertEquals(720, MathUtility.getFactorial(6));//6! có = 720
        assertEquals(24, MathUtility.getFactorial(4));
        assertEquals(6, MathUtility.getFactorial(3));
        assertEquals(2, MathUtility.getFactorial(2));
        assertEquals(1, MathUtility.getFactorial(1));
        assertEquals(1, MathUtility.getFactorial(0));
        /*
        màu đỏ đến theo 2 nghĩa:
        1.hàm tính đúng kì vọng sai
        2.hàm tính sai kì vọng đúng
        
        mỗi lời gọi hàm ở trên được gọi là 1 Test Case
        1 tình huống test, với 1 đầu vào, và nhận đầu ra
        */
    }
    
    /*
    test ngoại lệ thì test như thế nào???
    vì khi ngoại lệ xảy ra app dừng liền, màu đỏ vì có điều ko ổn
    thêm nữa ngoại lệ ko phải là 1 value để so sánh, không biết nó là số mấy
    ngoại lệ chỉ có thể ước lượng nó, chạm nó khi nó xảy ra
    test ngoại lệ nên đc đọc như sau:
    tui đưa vào các tình huống dữ liệu cà chớn, VD -5
    VD 22,40
    tui muốn nhìn xem ngoại lệ nó xảy ra hay không, trong tình huống này hay ko
    nếu có xảy ra thì mừng lắm luôn, vì app/hàm chạy đúng như thiết kế.
    tức là nếu getFactorial(-5) mà ném ra ngoại lệ
    IllegalArgumentException, có nghĩa là hàm đúng
    CÓ NGHĨA LÀ MÀU XANH (đừng bối rối khi có exception mà lại xanh)
    XANH vì thiết kế nói rằng tình huống -5 phải có ngoại lệ
    và nếu ngoại lệ xanh, thì hàm đúng
    */
    @Test(expected = IllegalArgumentException.class)
    public  void testFactorialGivenWrongArgumentThrowException(){
        MathUtility.getFactorial(-5); //chạy hàm thôi chứ chưa test
        MathUtility.getFactorial(21); //biết thừa hàm ném ra exception
        MathUtility.getFactorial(-1); //ta phải chụp lại cái exception
        MathUtility.getFactorial(40); //nếu có thật, hàm đúng, XANH
    }
}
/*
Việc test dùng màu sắc, dùng thư viện Unit Test có quy ước 
nếu tất cả các cặp expected và actual = nhau (Equals)
thì coi như hàm chạy đúng mọi tình huống ta đã test -> xanh
nếu trong tất cả các cặp mà ta test, có ít nhất 1 cặp không khợp nhau
ít nhất 1 cái màu đỏ - coi như hàm không ổn -> đỏ chung
điều này để đảm bảo rằng, phàm hàm đã test các tình huống
thì phải đúng hết các tình huống đã test
nói cách khác, những gì ta chủ động liệt kê, thì ta phải thấy đúng
*/