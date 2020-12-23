package me.spoofer.factory;

public abstract class Pizza {
    String name;
    Clams clam;
    Cheese cheese;
    Veggies veggies[];

    abstract void prepare();

    void bake() {
        System.out.println("Bake " + name + " for 25 minutes as 350");
    }

    void cut() {
        System.out.println("Cutting the " + name + " into diagonal slices");
    }

    void box() {
        System.out.println("Place " + name + " in official PizzaStore box");
    }
    public String getName() {
        return name;
    }

    public String getIngredient() {
        StringBuilder vs = new StringBuilder("使用原料: ");
        if (veggies != null) {
            for(Veggies v: veggies) {
                vs.append(v.getName());
                vs.append(", ");
            }
        }

        if (cheese != null) {
            vs.append(cheese.getName());
            vs.append(", ");
        }

        if (clam != null) {
            vs.append(clam.getName());
        }

        return vs.toString();
    }
}
