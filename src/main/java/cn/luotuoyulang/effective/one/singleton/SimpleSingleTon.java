package cn.luotuoyulang.effective.one.singleton;

import java.lang.reflect.AccessibleObject;

/**
 * @Description TODO
 * @Classname SimpleSingleTon
 * @Date 2020/9/18 15:34
 * @Author by liuyuhu
 * @Contact 17600520726@163.com 微信 aa249890950-5
 */
public class SimpleSingleTon {

    private static final SimpleSingleTon simpleSingleTon = new SimpleSingleTon();

    private SimpleSingleTon () {}

    public static SimpleSingleTon getInstance() {

        return simpleSingleTon;
    }

    public static void main(String[] args) {
        System.out.println(SimpleSingleTon.getInstance());
    }
}