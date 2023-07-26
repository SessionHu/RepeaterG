/*

MIT License

Copyright (c) 2023 SessionHu

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.

*/


import java.util.Scanner;

public class RepeaterG {
	public static void main(String[] args) {
		// 初始化
		Scanner scan = new Scanner(System.in);
		String input = "";
		// 输出软件信息
		System.out.println("复读姬 v0.1.0");
		System.out.println("(C) 2023 SessionHu");
		System.out.println("按下 Ctrl+C 退出");
		System.out.println("-----------------------");
		// 运行
		while(true) {	// 循环
			System.out.print("你:     ");
			input = scan.nextLine();
			System.out.println("复读姬: "+input);
		}
	}
}