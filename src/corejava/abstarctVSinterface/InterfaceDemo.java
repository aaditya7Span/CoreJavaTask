package corejava.abstarctVSinterface;

public interface InterfaceDemo {
    int i = 0;

    void Hellyeah();

    class HellDemo implements InterfaceDemo {

        @Override
        public void Hellyeah() {
            System.out.println("Hello yeah");
        }

        public static void main(String[] args) {
            HellDemo hellDemo = new HellDemo();
            hellDemo.Hellyeah();
        }
    }
}