package cn.luotuoyulang.effective.one;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Description TODO
 * @Classname Builder
 * @Date 2020/9/17 17:38
 * @Author by liuyuhu
 * @Contact 17600520726@163.com 微信 aa249890950-5
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class DogBuilder {

    private String name;

    private String color;

    public static class Builder {
        private String name;
        private String color;

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setColor(String color) {
            this.color = color;
            return this;
        }

        public DogBuilder build () {
            return new DogBuilder (name,color);
        }
    }

    public static void main(String[] args) {
        DogBuilder build = new Builder().setColor("红色").setName("小刘").build();
        a();
        System.out.println(build);
    }

    private static void a(){
        System.out.println("a");
    }
}