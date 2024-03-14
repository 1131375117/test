package org.example;

public class SuperMarket {

    private double applePrice = 8.0;
    private double strawberryPrice = 13.0;
    private double mangguo = 20.0;

    //验证函数
    public static void main(String[] args) {

        SuperMarket market = new SuperMarket();

        //验证Title1
        double price1 = market.title1Sum(1, 1);
        System.out.println("Title1= " + price1);

        //验证Title2
        double price2 = market.title2Sum(3, 1, 5);
        System.out.println("Title2= " + price2);

        //验证Title3
        double price3 = market.title3Sum(2, 2, 6);
        System.out.println("Title3= " + price3);

        //验证Title4
        double price4 = market.title3Sum(1, 10, -1);
        System.out.println("Title4= " + price4);

    }


    //题目1
    private double title1Sum(int n1, int n2) {
        if (n1 >= 0 && n2 >= 0) {
            return n1 * applePrice + n2 * strawberryPrice;
        } else {
            System.out.println("提示： n1,n2必须是大于0的整数");
            return 0;
        }

    }

    //题目2
    private double title2Sum(int n1, int n2, int n3) {
        if (n1 >= 0 && n2 >= 0 && n3 >= 0) {
            return n1 * applePrice + n2 * strawberryPrice + n3 * mangguo;
        } else {
            System.out.println("提示： n1,n2,n3必须是大于0的整数");
            return 0;
        }

    }

    //题目3
    private double title3Sum(int n1, int n2, int n3) {
        if (n1 >= 0 && n2 >= 0 && n3 >= 0) {
            return n1 * applePrice + n2 * strawberryPrice * 0.8 + n3 * mangguo;
        } else {
            System.out.println("提示： n1,n2,n3必须是大于0的整数");
            return 0;
        }

    }

    //题目4
    private double title4Sum(int n1, int n2, int n3) {

        if (n1 >= 0 && n2 >= 0 && n3 >= 0) {

            double preSum = n1 * applePrice + n2 * strawberryPrice + n3 * mangguo;
            if (preSum >= 100) {
                preSum = preSum - 10;
            }
            return preSum;

        } else {

            System.out.println("提示： n1,n2,n3必须是大于0的整数");
            return 0;
        }

    }
}