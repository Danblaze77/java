class Bond {
    public void display() {
        System.out.println("Bond");
    }
}

class ConvertibleBond extends Bond {
    public void display() {
        System.out.println("ConvertibleBond");
    }
}

public class InheritanceJava{
    public static void main(String[] args) {
        Bond[] bonds = new Bond[6];
        bonds[0] = new Bond();
        bonds[1] = new ConvertibleBond();
        bonds[2] = new Bond();
        bonds[3] = new ConvertibleBond();
        bonds[4] = new Bond();
        bonds[5] = new ConvertibleBond();
        for (int i = 0; i < bonds.length; i++) {
            bonds[i].display();
        }
    }
}
