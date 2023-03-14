import javax.swing.*;

class HelloJava {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Hello, Java!");
        JLabel label = new JLabel("Hello, Java!", JLabel.CENTER);
        frame.add(label);
        frame.setSize( 500, 300);
        frame.setVisible( true );
        // Hello World!
    }
}


