import java.util.LinkedList;
import java.util.List;

public class Laptop {
    
    private String brand;
    private String model;
    private String cpu;
    private int ram;
    private int rom;
    private String color;
    private int price;

    public Laptop(String brand, String model, String cpu, int ram, int rom, String color, int price){
        this.brand = brand;
        this.model = model;
        this.cpu = cpu;
        this.ram = ram;
        this.rom = rom;
        this.color = color;
        this.price = price;
    }

    @Override
    public String toString(){
        return "(" + brand + ", " + model + ", " + cpu + ", " + ram + ", " + rom + ", " + color + ", " + price + ")";
    }

    public String getBrand(){
        return brand;
    }

    public String getModel(){
        return model;
    }

    public String getCpu(){
        return cpu;
    }
    
    public int getRam(){
        return ram;
    }

    public int getRom(){
        return rom;
    }

    public String getColor(){
        return color;
    }

    public int getPrice(){
        return price;
    }

    public List <Object> listLaptop(){
        List<Object> list = new LinkedList<>();
        list.add(brand);
        list.add(model);
        list.add(cpu);
        list.add(ram);
        list.add(rom);
        list.add(color);
        list.add(price);
        return list;
    }
}
