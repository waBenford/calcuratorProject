public class Display {

    // แสดงผลระหว่างการคำนวณ
    public void operate( Process process) {
        System.out.println("ผลลัพธ์ปัจจุบัน = " + process.getFinalResult() + " " + process.getCurrentOp());
    }

    // แสดงผลลัพธ์สุดท้าย
    public void total( Process process ) {
        System.out.println("=========================");
        System.out.println("ผลลัพธ์สุดท้าย " + process.getFinalResult());
        System.out.println("=========================");
    }
}
