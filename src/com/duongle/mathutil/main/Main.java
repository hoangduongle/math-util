/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.duongle.mathutil.main;

import com.duongle.mathutil.MathUtility;


/**
 *
 * @author ASUS
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //tui muốn test 5! có bằng 120 hay không
        int n = 5; //5! coi bằng mấy
        long expected = 120; // tui kì vọng, hy vọng bạn tính ra 120
        long actual = 0;
        System.out.println("5! expected: " + expected + "; actual " + actual);
        
        //xét trường hợp thứ 2 0!= mấy;
        
        n = 0; //0! coi bằng mấy
        expected = 1; // tui kì vọng, hy vọng bạn tính ra 1
        actual = MathUtility.getFactorial(n);
        System.out.println("0! expected: " + expected + "; actual " + actual);
        
    }

}
/*
  trong quy trình làm phần mềm dân dev phải có trải nghiệm test 
  từng hàm từng class mà mình viết ra trước khi đóng gói gửi qua bên QA,QC
ĐỘC LẬP. TỪNG HÀM TỪNG CLASS PHẢI ĐƯỢC TEST CẦN THẬN TRƯỚC KHI CHÚNG ĐƯỢC DÙNG ĐỂ PHỐI HỢP VỚI CÁC CLASS KHÁC
TEST NGAY MỨC HÀM, MỨC CLASS
VỪA HOÀN THIỆN, CHƯA THÈM BÀN VỀ UI, THÌ MÚC ĐỘ TEST SỚM NÀY GỌI LÀ
UNIT TEST LEVEL - TEST TỪNG ĐƠN THỂ, ĐƠN VỊ CODE

Vậy làm sao để test từng hàm, từng class???
có nhiều cách để test từng hàm từng class
1. Cách 1: Dùng sout để in ra giá trị xử lí của hàm
dùng trong môn oop

2. Cách 2: dùng JoptionPane của môn java Desktop để pop-up một cửa sổ
in kết quả xử lý của hàm để kiểm tra coi hàm chạy đúng hay sai

3. Cách 3: dùng LOG FILE, trang Web in ra kết quả xử lý của hàm (Java Web)

dù là cách nào thì ta cũng cần phải in ra giá trị hàm đã xử lí
gọi là ACTUAL VALUE
rồi ta đi so sánh cái giá trị trả về cùa hàm có giống như ta tính toàn trước đó hay không, cái ta hy vọng hàm sẽ trả về - gọi là EXPECTED VALUE

nếu ACTUAL VALUE == EXPECTED VALUE -> HÀM CHẠY NGON
                    khác          ->  HÀM CHẠY SAI
Nguyên tắc của việc test: so sánh ACTUAL vối EXPECTED

3 CÁCH NÀY ĐỀU CÙNG 1 NGUYÊN TẮC:
GỌI HÀM ĐỂ XEM HÀM XỬ LÝ RA KẾT QUẢ MẤY
SAU ĐÓ DÙNG MẮT ĐỂ SO SÁNH ACTUAL VÀ EXPECTED RỒI TA TỰ KẾT LUẬN
CÁCH NÀY TIỀM ẨN SAI SÓT KHI TA PHẢI XEM CÓ QUÁ NHIỀU CẶP VALUE
VÍ DỤ HÀM GIAITHUA() PHẢI TEST TRƯỜNG HỢP <0, = 0, =1, 18, 19, 20

MỖI N ĐỂ TEST TA GỌI LÀ MỘT TÌNH HUỐNG TEST XÀI HÀM, 1 TÍNH HUỐNG TEST
TEST CASE

4. Cách 4: không thèm nhìn bằng mắt từng trường hợp expected và actual
nhờ máy nhìn luôn, dư sức biết cách so sánh
máy quét qua tất cả các cặp expected và actual 
nếu tất cả điều khớp nhau báo màu xanh- ĐƯỜNG THÔNG CODE TỐT
nếu xuất hiện ít nhất 1 tk không khớp actual và expected
báo màu đỏ, đường KẸT, do code có trục trặc tính toán
muốn làm được ta phải nhờ thư viện phụ trợ
//Java: JUnit, TestNG
//C#: NUnit, MSTest, xUnit
//PHP: PHPUnit
//... mọi ngôn ngữ đều có thư viện xanh xanh đỏ đỏ đi kèm giúp cảnh báo code tốt hay không

 */
