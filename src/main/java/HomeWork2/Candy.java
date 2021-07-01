package HomeWork2;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement (name = "candy")
public class Candy {
    private String color;
    private String taste;
    private String shape;

    public Candy() {
    }

    public Candy(String color, String taste, String shape) {
        this.color = color;
        this.taste = taste;
        this.shape = shape;
    }

    public String getColor() {
        return color;
    }
     @XmlElement(name = "color")
    public void setColor(String color) {
        this.color = color;
    }

    public String getTaste() {
        return taste;
    }
    @XmlElement(name = "taste")
    public void setTaste(String taste) {
        this.taste = taste;
    }

    public String getShape() {
        return shape;
    }
    @XmlElement (name = "shape")
    public void setShape(String shape) {
        this.shape = shape;
    }

    @Override
    public String toString() {
        return "Candy{" +
                "color='" + color + '\'' +
                ", taste='" + taste + '\'' +
                ", shape='" + shape + '\'' +
                '}';
    }
}
