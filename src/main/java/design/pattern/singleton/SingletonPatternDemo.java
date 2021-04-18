package design.pattern.singleton;

public class SingletonPatternDemo {
    public static void main(String[] args) {
        // 获取唯一可用的对象
        SingleObject object = SingleObject.getInstance();

        // 显示对象
        object.showMsg();
    }
}
