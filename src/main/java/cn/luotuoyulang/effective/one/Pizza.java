package cn.luotuoyulang.effective.one;

import java.util.EnumSet;
import java.util.Objects;
import java.util.Set;

/**
 * @Description TODO
 * @Classname Pizza
 * @Date 2020/9/18 11:11
 * @Author by liuyuhu
 * @Contact 17600520726@163.com 微信 aa249890950-5
 */
public class Pizza {

    public enum Topping {
        HAM,
        MUSHROOM,
        ONION,
        PERRER,
        SAUSAGE,
        ;
    }
    final Set<Topping> toppings;

    abstract static  class Builder<T extends Builder<T>> {

        EnumSet<Topping> toppings = EnumSet.noneOf(Topping.class);

        public T addTopping (Topping topping) {
            toppings.add(Objects.requireNonNull(topping));
            return self ();
        }

        abstract Pizza build();

        protected abstract T self();
    }

    public Pizza(Builder<?> builder) {
        this.toppings = builder.toppings.clone();
    }
}