package cn.luotuoyulang.effective.one;

import java.util.concurrent.Semaphore;

/**
 * @Description TODO
 * @Classname Test
 * @Date 2020/9/17 18:32
 * @Author by liuyuhu
 * @Contact 17600520726@163.com 微信 aa249890950-5
 */
public class Test {

    public static void main(String[] args) {
        Integer a = 2;
        Integer b = null;
        int i = ((Integer) b).intValue();
        System.out.println("i = " + i);
//        System.out.println("a.compareTo(1) = " + a.equals(null));
    }
}