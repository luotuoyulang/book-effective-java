package cn.luotuoyulang.effective.one.singleton;

/**
 * @Description TODO
 * @Classname SimpleSingleTon
 * @Date 2020/9/18 15:34
 * @Author by liuyuhu
 * @Contact 17600520726@163.com 微信 aa249890950-5
 */
public class PublicSingleTon {

    public static final PublicSingleTon simpleSingleTon = new PublicSingleTon();

    private PublicSingleTon() {}

    public static void main(String[] args) {
        System.out.println(PublicSingleTon.simpleSingleTon);
    }
}