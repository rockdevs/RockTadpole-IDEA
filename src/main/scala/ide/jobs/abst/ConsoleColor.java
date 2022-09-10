package az.rock.ide.jobs.abst;

public enum ConsoleColor {
    RESET("\u001B[0m"),
    RED("\u001B[31m"),
    GREEN("\u001B[32m"),
    CYAN("\u001B[36m"),
    WHITE("\u001B[37m"),
    YELLOW("\u001B[33m"),
    B_YELLOW("\u001B[43m");

    private String color;

    ConsoleColor(String color){
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}
