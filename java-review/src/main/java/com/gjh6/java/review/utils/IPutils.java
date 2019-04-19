package com.gjh6.java.review.utils;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: gjh
 * Date: 2019-04-19
 * Time: 3:55 PM
 */
public class IPutils {

    public static void main(String[] args) {
        String ip = "192.168.31.61";
        Integer i = ipToInteger(ip);
        System.out.println(i);
        String s = IntegerToIp(i);
        System.out.println(s);

        System.out.println(0<<8|11);
    }


    /**
     *
     * (Ip转Integer)
     * 方法名：ipToInteger
     * 创建人：Liwenbin
     * 时间：2017年5月2日-下午5:06:47  void
     * @exception
     * @since  1.0.0
     */
    public static int ipToInteger(String ip){
        String[] ips = ip.split("\\.");
        int ipFour = 0;
        //因为每个位置最大255，刚好在2进制里表示8位
        for(String ip4: ips){
            Integer ip4a = Integer.parseInt(ip4);
            //这里应该用+也可以,但是位运算更快
            ipFour = (ipFour << 8) | ip4a;
        }
        return ipFour;
    }

    /**
     *
     * (Integer转IP)
     * 方法名：IntegerToIp
     * 创建人：Liwenbin
     * 时间：2017年5月2日-下午5:23:32
     * @param ip
     * @return String
     * @exception
     * @since  1.0.0
     */
    public static String IntegerToIp(Integer ip){
        //思路很简单，每8位拿一次，就是对应位的IP
        StringBuilder sb = new StringBuilder();
        for(int i = 3; i >= 0; i--){
            int ipa = (ip >> (8 * i)) & (0xff);
            sb.append(ipa + ".");
        }
        sb.delete(sb.length() - 1, sb.length());
        return sb.toString();
    }
}
