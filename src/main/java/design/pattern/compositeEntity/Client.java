package design.pattern.compositeEntity;

public class Client {
    private CompositeEntity compositeEntity = new CompositeEntity();

    public void printData() {
        for (String str : compositeEntity.getData()) {
            System.out.println("Data: " + str);
        }
    }

    public void setData(String data1, String data2) {
        compositeEntity.setData(data1, data2);
    }
}
