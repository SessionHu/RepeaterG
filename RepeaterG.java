import java.util.Scanner;


public class RepeaterG {
	
	public static final String NAME = "复读姬";
	public static final String VERSION = "v1.0.0";
	public static final String COPYRIGHT = "(C) 2023 SessionHu";
	
	public static void info() {
		System.out.println();
		System.out.println(NAME+" "+VERSION);
		System.out.println(COPYRIGHT);
		System.out.println("输入 \"exit\" 退出");
		System.out.println("-----------------------");
		
	}
	
	public static void run() {
		String input = ""; // 初始化
		try (Scanner scan = new Scanner(System.in)) {
			while(true) {	// 循环
				System.out.print("    你: ");
				input = scan.nextLine();
				switch (input) {
					case "exit":
						// 正常退出
						System.out.println("复读姬: 再见!");
						System.exit(0);
						break;
					default:
						// 正常输出
						System.out.format("复读姬: %s%n", input);
						break;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		info(); // 输出软件信息
		run(); // 运行
	}
	
}
