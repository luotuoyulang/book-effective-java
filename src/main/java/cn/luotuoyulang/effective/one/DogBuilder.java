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
@NoArgsConstructor
@Data
public class DogBuilder {

    private String name;

    private String color;

    public static class Builder {
        private String name;
        private String color;

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder color(String color) {
            this.color = color;
            return this;
        }

        public DogBuilder build () {
            return new DogBuilder (this);
        }
    }

    public DogBuilder(Builder builder) {
        this.name = builder.name;
        this.color = builder.color;
    }

    public static void main(String[] args) {
        DogBuilder build = new Builder()
                .color("红色")
                .name("小刘")
                .build();
        System.out.println(build);
    }

//    缺点
//    最明显的一点，在生成Card实例之前，实际上是先创建了一个Card.CardBuilder实例,这样很明显额外占用了内存。
//
//    额外
//    @Builder(toBuilder = true)
//    这个选项允许你将一个实例化好的Card更新字段生成新的Card实例。
//
//    public Card.CardBuilder toBuilder() {
//        return (new Card.CardBuilder()).id(this.id).name(this.name).sex(this.sex);
//    }
}