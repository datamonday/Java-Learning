// Scanner类定义在java.util包中
import java.util.Scanner;

public class Calendar_OnlyUseScanner {
    // 定义基姆拉尔森计算公式
    public static int WeekDay(int year, int month, int day){
        // W = [D + 2M + 3(M+1)/5 + Y + Y/4 – Y/100 + Y/400] mod 7

        return (
                day +
                2 * month +
                3 * (month + 1)/5 +
                year + year/4 - year/100 + year/400
        ) % 7;
    }

    public static void main(String[] args) {
        class DateCurrent{
            int year;
            int month = 1;
            int day = 1;
            boolean is_leap = true;

            // 判断是否为闰年
            public boolean isLeap(){
                is_leap = year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
                return is_leap;
            }
        }


        while (true) {
            Scanner user_input = new Scanner(System.in);
            DateCurrent user_date = new DateCurrent();
            // 输出功能选择提示
            System.out.println("Please Choose Function:\n" +
                    "1. input year return calendar;\n" +
                    "2. input date return weekday;\n" +
                    "3. exit.\n");
            // 接收用户的选择
            int user_choose = user_input.nextInt();
            // 如果用户选择选项1，则进行如下处理：
            if (user_choose == 1) {
                System.out.println("Please input year (such as 2021):");
                // 接收用户输入的年份，月份和日期为默认项
                user_date.year = user_input.nextInt();
                user_date.month = 1;
                user_date.day = 1;

                for (int month = 1; month <= 12; month++) {

                    int weekday;
                    // 打印日历的每月信息
                    System.out.printf("%33d 月\n", month);
                    // 打印日历的星期信息
                    System.out.println("  Mon  Tue  Wed  Tur  Fri  Sat  Sun");
                    // 保证公式可用，需要对一二月份进行特殊处理
                    if (month == 1 || month == 2) {
                        int tmp_month = month + 12;
                        int tmp_year = user_date.year - 1;
                        weekday = WeekDay(tmp_year, tmp_month, 1);
                    }
                    else {
                        weekday = WeekDay(user_date.year, month, 1);
                    }

//                    System.out.printf("month:%d, first day is weekday of:%d\n", month, weekday+1);

                    // 遍历输出
                    // 每个月一号之前输出空格占位符(每天5个占位符)
                    for (int i = 1; i <= weekday; i++) {
                            System.out.print("     ");
                    }

                    // case1:每月为31天的月份输出
                    if ((month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12)) {
                        for (int day = 1; day <= 31; day++) {
                            System.out.printf("%5d", day);
                            // 每月中星期换行
                            if ((day + weekday) % 7 == 0)
                                System.out.print("\n");
                        }
                        // 每月输出结束后换行
                        System.out.print("\n");
                    }

                    // case2:闰年二月有29天，打印到29，终止输出
                    if (month == 2 && user_date.isLeap()) {
                        for (int leap_day = 1; leap_day <= 29; leap_day++) {
                            System.out.printf("%5d", leap_day);
                            // 每月中星期换行
                            if ((leap_day + weekday) % 7 == 0)
                                System.out.print("\n");
                        }
                        // 每月输出结束后换行
                        System.out.print("\n");
                    }

                    // case3:平年二月有28天，打印到28，终止输出
                    if (month == 2 && !user_date.isLeap()) {
                        for (int day = 1; day <= 28; day++) {
                            System.out.printf("%5d", day);
                            // 每月中星期换行
                            if ((day + weekday) % 7 == 0)
                                System.out.print("\n");
                        }
                        // 每月输出结束后换行
                        System.out.print("\n");
                    }
                    // case4:每月为30天的月份输出
                    if (month == 4 || month == 6 || month == 9 || month == 11){
                        for (int day = 1; day <= 30; day++) {
                            System.out.printf("%5d", day);
                            // 每月中星期换行
                            if ((day + weekday) % 7 == 0)
                                System.out.print("\n");
                        }
                        // 每月输出结束后换行
                        System.out.print("\n");
                    }
                }

            } else if (user_choose == 2) {
                System.out.println("Please input year (such as 2021):");
                int in_year = user_input.nextInt();
                System.out.println("Please input month (such as 12):");
                int in_month = user_input.nextInt();
                System.out.println("Please input day (such as 11):");
                int in_day = user_input.nextInt();

                if (in_month == 1) {
                    in_month = 13;
                    in_year = in_year - 1;
                }
                if (in_month == 2) {
                    in_month = 14;
                    in_year = in_year - 1;
                }
                int weekday = WeekDay(in_year, in_month, in_day);
//                if (weekday == 0) {
//                    weekday = 7;
//                }
                // 基姆拉尔森公式0表示星期一
                int new_weekday = weekday + 1;
                System.out.println("This day is weekday of: " + new_weekday);

            } else if (user_choose == 3) {
                System.out.println("Now is Exiting···");
                user_input.close();
                break;
            } else {
                System.out.println("You must choose 1,2 or 3!");
            }

        }
    }
}