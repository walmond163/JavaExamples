import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/* Доска объявлений */

public class Advert {
    private String name;
    private int price;
    private String desc;
    private String condition;
    private String contact;

    public Advert(String name, int price, String desc, String condition, String contact) {
        this.name = name;
        this.price = price;
        this.desc = desc;
        this.condition = condition;
        this.contact = contact;
    }

    public Advert() {
        this.name = "";
        this.price = 0;
        this.desc = "";
        this.condition = "";
        this.contact = "";
    }

    public void save() {
        try (FileWriter file = new FileWriter("advert.txt")) {
            file.write(name + "\n");
            file.write(price + "\n");
            file.write(desc + "\n");
            file.write(condition + "\n");
            file.write(contact + "\n");
        } catch (Exception ex) {

        }
    }

    public String[] loadNote(String filename) {
        String[] text = new String[100];
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            int index = 0;
            while ((line = reader.readLine()) != null) {
                text[index] = line;
                index++;
                System.out.println(line);
            }
            return text;
            
        } catch (IOException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
        return null;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
        public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public void print() {
        System.out.println("--------------------------------------");
        System.out.println("          NAME: " + name + "\n          PRICE: " + price + "\n          DESCRIPTION: " 
        + desc + "\n          CONDITION: " + condition + "\n          CONTACT: " + contact);
        System.out.println("--------------------------------------");
        for (int i = 0; i < contact.length(); i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(contact.charAt(i) + " | ");
            }
            System.out.println();
        }
    }

}
