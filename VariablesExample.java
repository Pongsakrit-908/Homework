public class VariablesExample {
    public static void main(String[] args) {
        // 1.1 ตัวแปรที่จะใช้เก็บค่าของขนาดของเสื้อผ้า ('s', 'm', หรือ 'l')
        char clothingSize = 's';

        // 1.2 ตัวแปรที่ใช้เก็บค่าของจำนวนคนที่เข้ามาชมเว็บไซต์
        int websiteVisitors = 8;

        // 1.3 ตัวแปรที่ใช้เก็บเกรดของนักศึกษา (A, B, C, D, F)
        char studentGrade = 'A';

        // 1.4 ตัวแปรที่ใช้เก็บเกรดเฉลี่ยของนักศึกษา
        double studentGPA = 4.0;

        // 1.5 ตัวแปรที่ใช้เก็บค่าของ Pi (ค่าคงที่)
        final double PI = 3.14159;

        // 1.6 ตัวแปรที่ใช้เก็บค่าใช้จ่ายรายปีของนักศึกษา
        float annualExpenses = 15888.00f;

        // 1.7 ตัวแปรที่ใช้เก็บจำนวนของเดือนในหนึ่งปี (ค่าคงที่)
        final int MONTHS_IN_YEAR = 12;

        // ตัวอย่างการแสดงผลค่าตัวแปร
        System.out.println("Clothing Size: " + clothingSize);
        System.out.println("Website Visitors: " + websiteVisitors);
        System.out.println("Student Grade: " + studentGrade);
        System.out.println("Student GPA: " + studentGPA);
        System.out.println("Value of Pi: " + PI);
        System.out.println("Annual Expenses: " + annualExpenses);
        System.out.println("Months in a Year: " + MONTHS_IN_YEAR);
    }
}