package basis;

public class control_6_break {
    public static void main(String[] args) {
        // 直接结束当前for循环
        // 打印单数，注意continue和break区别
//        for (int i = 1; i < 10; i++) {
//            if (0 == i%2)
//                break;  // break后直接跳出for循环了，不再打印单数
//            System.out.println(i);

        // ex1: 百万富翁
        // 假设你月收入是3000，除开平时花销，每个月留下1000块钱进行投资。
        //
        //然后你认真的钻研了 《股票和基金 21天从入门到精通》，达到了每年20%的投资回报率。
        //
        //那么问题来了，以每个月投资1000块钱的节奏，持续投资多少年，总收入达到100万
        //（复利计算按照每年12000投入计算，不按照每月计息）
        //
        //复利公式：
        //F = p* ( (1+r)^n );
        //F 最终收入
        //p 本金
        //r 年利率
        //n 存了多少年
        //
        //假设情景一：
        //p = 10000
        //r = 0.05
        //n = 1
        //
        //解读：
        //本金是10000
        //年利率是5%
        //存了一年 1次
        //复利收入 10000*( (1+0.05)^1 ) = 10500
        //
        //假设情景二：
        //p = 10000
        //r = 0.05
        //n = 2
        //
        //解读：
        //本金是10000
        //年利率是5%
        //存了两年
        //复利收入 10000*( (1+0.05)^2 ) = 11025
        double p = 0;
        double f;

        for (int year = 1; year < 100; year++) {
            p += 12000;
            f = 1.2 * p;
            p = f;
            if (f > 1000000) {
                System.out.println(year);
                System.out.println(p);
                break;
            }
        }
    }
}
