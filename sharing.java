import java.util.ArrayList;

class Contact {
    String username;
    String email;
    boolean isBorrower;

    public Contact(String u, String e) {
        username = u;
        email = e;
        isBorrower = false;
    }
}

class Dimensions {
    String width, height, length;

    public Dimensions(String w, String h, String l) {
        width = w;
        height = h;
        length = l;
    }
}

class Item {
    String name;
    boolean available;
    Contact borrower;
    Dimensions dimensions;

    public Item(String name, Dimensions d) {
        this.name = name;
        this.dimensions = d;
        this.available = true;
    }

    public void borrow(Contact c) {
        available = false;
        borrower = c;
        c.isBorrower = true;
    }

    public void returnItem() {
        available = true;
        if (borrower != null) borrower.isBorrower = false;
        borrower = null;
    }
}

class ItemList {
    ArrayList<Item> items = new ArrayList<>();

    public void addItem(Item item) {
        items.add(item);
    }
}

public class Sharing {
    public static void main(String[] args) {

        Contact c1 = new Contact("john", "john@email.com");

        Dimensions d = new Dimensions("10", "20", "30");
        Item item = new Item("Laptop", d);

        item.borrow(c1);

        System.out.println("Borrowed by: " + c1.username);
    }
}
