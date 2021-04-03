// Scanner类定义在java.util包中
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.*;

import java.nio.file.Paths;

public class BasicExercise {
    public static void main(String [] args) throws FileNotFoundException, UnsupportedEncodingException {

//        // 字符串修改
//        String greeting = "Help!";
//        greeting = greeting.substring(0,3) + "p!!!";
//
//        String s = "hello";
//        String t = "java";
//
//        // 区分大小写比较字符串
//        s.equals(t);
//        // 不区分大小写
//        s.equalsIgnoreCase(t);
//
//        // 比较空串与Null串
//        String str = "world";
//        if(str != null && str.length() != 0){
//            System.out.println('!');
//        }
//
//        // 构建字符串
//        // 字符串构建器
//        StringBuilder builder = new StringBuilder();
//        // 需要添加内容时，使用append() 方法
//        builder.append(s);
//        builder.append(t);
//        // 转换为字符串
//        String completeString = builder.toString();

//        // 读取输入
//        // step1: 构造一个Scanner对象，并与标准输入流 System.in 关联
//        Scanner in = new Scanner(System.in);
//        // step2: 使用Scanner类的各种方法实现输入操作
//        System.out.println("What's your last name?");
//        // 使用该方法是因为在输入行中可能包含空格
//        String name = in.nextLine();
//        System.out.println("What's your first name?");
//        // 读取一个单词（以空格作为分隔符）
//        String firstName = in.next();
//        System.out.println("How old are u?");
//        // 读取一个整数
//        int age = in.nextInt();
//        System.out.println("What‘s your height?");
//        // 读取浮点数
//        Double height = in.nextDouble();
//        // 输出结果
//        System.out.println(name + ", " + firstName + ", " + age + ", " + height);


//        // 格式化输出
//        float f1 = 3.1415926535f;
//        double f2 = 3.1415926535;
//        // printf 与 c语言相同
//        System.out.printf("%8.4f", f1);
//
//        // 使用多个参数
//        String name = "Neo";
//        int age = 23;
//        System.out.printf("Hello, %s. Next year, you'll be %d!", name, age);

//        // 文件输入输出
//        Scanner in = new Scanner(Paths.get("d:\\Java Project\\test.txt"), "UTF-8");
//        // 读取
//        PrintWriter out = new PrintWriter("d:\\Java Project\\test.txt", "UTF-8");
//        System.out.println(out);
//
//        // 大数值
//        BigInteger a = BigInteger.valueOf(100);
//        BigDecimal b = BigDecimal.valueOf(50);
//        // 运算
//        BigInteger c = a.add(a);
//        BigInteger d = c.multiply(BigInteger.valueOf(2));
//
//        // 数组
//        int[] names = new int [10];
//        for(int i = 0; i < 10; i++){
//            names[i] = i;
//        }

//        // 增强循环 for each
//        int[] arry = {1,2,3,4,5,6,7,8,9,10};
//        // 重新初始化数组 arry
//        arry = new int[] {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
//        for (int ele:arry){
//            System.out.println(ele);
//        }

//        // 数组拷贝
//        int[] anonymous = {21,22,23,24,25};
//        arry = anonymous;
//
//        int[] luckyNumbers = arry;
//        luckyNumbers[0] = 12; // 修改数组元素
//
//        // copyOf方法
//        // 第二个位置参数指定新数组的长度，通常用来改变数组的大小，多于元素用0填充
//        int[] copiedLuckyNumbers = Arrays.copyOf(luckyNumbers, 2 * luckyNumbers.length);
//
//        int[] y = new int[100];
//
//        // 数组排序
//        Arrays.sort(luckyNumbers);

//        // 多维数组
//        double [][] balences;
//        int years = 12; salary = 25;
//        balences = new double[years][salary];
//
//        int [][] magicSquare = {
//                {16, 3, 2, 13},
//                {5, 10, 11, 8},
//                {9, 6, 7, 12},
//                {4, 15, 14, 1}
//        };



















    }
}
