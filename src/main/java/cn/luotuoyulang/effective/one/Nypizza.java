package cn.luotuoyulang.effective.one;

import lombok.ToString;

import java.util.Objects;

/**
 * @Description TODO
 * @Classname Nypizza
 * @Date 2020/9/18 11:24
 * @Author by liuyuhu
 * @Contact 17600520726@163.com 微信 aa249890950-5
 */
@ToString
public class Nypizza extends Pizza {

    public enum Size {
        SMALL,
        MEDINUM,
        LARGE
    }

    private final Size size;

    public static class Builder extends Pizza.Builder<Builder> {

        private final Size size;

        public Builder (Size size) {
            this.size = Objects.requireNonNull(size);
        }

        @Override
        Nypizza build() {
            return new Nypizza(this);
        }

        @Override
        protected Builder self() {
            return this;
        }
    }

    public Nypizza(Builder builder) {
        super(builder);
        size = builder.size;
    }

    public static void main(String[] args) {
        Nypizza build = new Builder(Size.SMALL).addTopping(Topping.HAM).build();
        System.out.println("build = " + build);;
    }
}