package cn.luotuoyulang.effective.one.singleton;

/**
 * @Description TODO
 * @Classname TreadSingleTon
 * @Date 2020/9/18 15:43
 * @Author by liuyuhu
 * @Contact 17600520726@163.com 微信 aa249890950-5
 */
public class ThreadSingleTon {

    public static ThreadSingleTon threadSingleTon = null;

    public ThreadSingleTon() {}

    public static ThreadSingleTon getInstance() {

        synchronized (ThreadSingleTon.class) {
            if (threadSingleTon == null) {
                threadSingleTon = new ThreadSingleTon();
            }
        }
        return threadSingleTon;
    }
}