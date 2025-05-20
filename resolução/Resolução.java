package resolução;

import java.awt.Dimension;
import java.awt.Toolkit;

public class Resolução {
    public static void main(String[] args) {
        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension d = tk.getScreenSize();
        System.out.println("A resolução é: " + d.width + " x " + d.height);
    }
}
