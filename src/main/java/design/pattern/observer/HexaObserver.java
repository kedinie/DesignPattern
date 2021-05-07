package design.pattern.observer;

public class HexaObserver extends Observer {
    public HexaObserver(Subject subject) {
        this.subject = subject;
        subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Hexa String: " + Integer.toHexString(subject.getState()).toUpperCase());
    }
}
