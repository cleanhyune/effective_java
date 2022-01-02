package self_coding.chapter1;

public class Extention {

    int il;
    int ol;

    static class Children extends Extention {

        Children(int il, int ol) {
            this.il = il;
            this.ol = ol;
        }

        public int plus(Children param) {
            return this.il + param.il;
        }

        public int minus(Children param) {
            return this.ol - param.ol;
        }

    }

    public static void main(String[] args) {
        Children children = new Children(1, 2);
        Children children2 = new Children(3, 4);

        int plus = children.plus(children2);
        System.out.println(plus);
    }

}
