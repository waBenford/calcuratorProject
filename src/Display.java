public class Display {

    // แสดงผลระหว่างการคำนวณ
    public void operate() {
        Process process = new Process();
        System.out.println("ผลลัพธ์ปัจจุบัน = " + process.getFinalResult());
    }

    // แสดงผลลัพธ์สุดท้าย
    public void total() {
        Process process = new Process();
        System.out.println("====================");
        System.out.println("ผลลัพธ์สุดท้าย = " + process.getFinalResult());
        System.out.println("====================");
    }
}
