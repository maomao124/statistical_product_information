import java.util.Scanner;

/**
 * Project name(项目名称)：统计商品信息 statistical_product_information
 * Package(包名): PACKAGE_NAME
 * Author(作者）: mao
 * Author QQ：1296193245
 * Date(创建日期)： 2021/9/27
 * Time(创建时间)： 19:50
 * Version(版本): 1.0
 * Description(描述)：
 * 在一个货架上有 5 件商品，编写程序，在输入商品价格之后输出最高价格、总价格和平均价格。
 * 首先要创建一个包含 5 个空元素的价格数组，然后使用 for 循环使用户从控制台录入商品的价格，
 * 并将价格保存至数组中，再使用一个 for 循环来遍历该数组，求出最高价格和总价格。最后用总价格除以商品数量算出平均价格。
 */

public class test
{
    public static void main(String[] args)
    {
        int[] prices = new int[5];
        int maxprice = 0;
        int avgprice = 0;
        int sumprice = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("请输入5件商品的价格：");
        for (int i = 0; i < prices.length; i++)
        {
            prices[i] = input.nextInt();
        }
        maxprice = prices[0];
        for (int i = 0; i < prices.length; i++)
        {
            sumprice = sumprice + prices[i];
            if (maxprice < prices[i])
            {
                maxprice = prices[i];
            }
        }
        avgprice = sumprice / prices.length;
        System.out.println("商品总价格：" + sumprice);
        System.out.println("最高价格：" + maxprice);
        System.out.println("平均价格：" + avgprice);
    }
}
