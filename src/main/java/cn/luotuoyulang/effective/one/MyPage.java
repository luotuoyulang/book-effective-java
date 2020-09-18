package cn.luotuoyulang.effective.one;

import lombok.ToString;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * @Description TODO
 * @Classname MyPage
 * @Date 2020/9/18 17:05
 * @Author by liuyuhu
 * @Contact 17600520726@163.com 微信 aa249890950-5
 */
@ToString
public class MyPage<T> {

    private Integer pageNum;
    private Integer pageSize;
    private Integer total;
    private List<T> data;

    public static<T> PageBuilder builder () {
        return new PageBuilder<T>();
    }

    public static class PageBuilder<T> {
        private Integer pageNum;
        private Integer pageSize;
        private Integer total;
        private List<T> data;

        public PageBuilder pageNum(Integer pageNum) {
            this.pageNum = pageNum;
            return this;
        }

        public PageBuilder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        public PageBuilder total(Integer total) {
            this.total = total;
            return this;
        }

        public PageBuilder data(List data) {
            this.data = data;
            return this;
        }

//        public <R> PageBuilder data(Function<T,R> fun) {
//            List<R> collect = data.stream().map(fun).collect(Collectors.toList());
//            this.data = collect;
//            return this;
//        }

        public MyPage build () {
            return new MyPage(this);
        }
    }

    public MyPage(PageBuilder builder) {
        this.pageNum = builder.pageNum;
        this.pageSize = builder.pageSize;
        this.total = builder.total;
        this.data = builder.data;
    }

    public MyPage(Integer pageNum, Integer pageSize, Integer total, List<T> data) {
        this.pageNum = pageNum;
        this.pageSize = pageSize;
        this.total = total;
        this.data = data;
    }

    public static void main(String[] args) {
        MyPage build = MyPage.builder().total(10).build();
        System.out.println(build);
    }
}