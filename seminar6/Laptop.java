package seminar_homework.seminar6;

public class Laptop {
    private String name;
    private String ram;
    private String disk;
    private String system;
    private String color;

    public Laptop(String name, String ram, String disk, String system, String color) {
        this.name = name;
        this.ram = ram;
        this.disk = disk;
        this.system = system;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public String getRam() {
        return ram;
    }

    public String getDisk() {
        return disk;
    }

    public String getSystem() {
        return system;
    }

    public String getColor() {
        return color;
    }

    public String toString() {
        return "Laptop name = " + name + ", ram = " + ram + ", disk = " + disk + ", system = "
                + system + ", color = " + color;
    }
}