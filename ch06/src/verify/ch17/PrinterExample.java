package verify.ch17;

public class PrinterExample {
	public static void main(String[] args) {

    	Printer.println(10);
		Printer.println(true);
		Printer.println(5.7);
		Printer.println("ȫ�浿");
	}
}
//�޼ҵ� �����ε�
class Printer{
static void println(int x) {System.out.println(x);}	
static void println(boolean x) {System.out.println(x);}	
static void println(double x) {System.out.println(x);}	
static void println(String x) {System.out.println(x);}		
}
