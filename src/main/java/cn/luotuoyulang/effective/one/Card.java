package cn.luotuoyulang.effective.one;

/**
 * @Description TODO
 * @Classname Card
 * @Date 2020/9/18 10:26
 * @Author by liuyuhu
 * @Contact 17600520726@163.com 微信 aa249890950-5
 */
public class Card {
    private int id;
    private String name;
    private boolean sex;

    Card(int id, String name, boolean sex) {
        this.id = id;
        this.name = name;
        this.sex = sex;
    }

    public static Card.CardBuilder builder() {
        return new Card.CardBuilder();
    }

    public static class CardBuilder {
        private int id;
        private String name;
        private boolean sex;

        CardBuilder() {
        }

        public Card.CardBuilder id(int id) {
            this.id = id;
            return this;
        }

        public Card.CardBuilder name(String name) {
            this.name = name;
            return this;
        }

        public Card.CardBuilder sex(boolean sex) {
            this.sex = sex;
            return this;
        }

        public Card build() {
            return new Card(this.id, this.name, this.sex);
        }

        @Override
        public String toString() {
            return "Card.CardBuilder(id=" + this.id + ", name=" + this.name + ", sex=" + this.sex + ")";
        }
    }
}