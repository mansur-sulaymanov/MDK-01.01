public class Main {
    public static void main(String[] args) {
        //практическая работа 1
        //студент гр. 255 Сулайманов
        Krug krug = new Krug();
        Krug krug2 = new Krug(1, 1, 8);
        Krug krug3 = new Krug(255);

        krug.print();
        krug2.print();
        krug3.print();
    }
}

class Krug {
    private double x, y;
    private double r;

    public Krug() {
        this.x = 0;
        this.y = 0;
        this.r = 5;
    }

    public Krug(double x, double y, double r) {
        this.x = x;
        this.y = y;
        this.r = r;
    }

    public Krug(double r) {
        this(4, 5, r);
    }

    //создадим функцию (метод) с именем print
    void print() {
        System.out.println("х=" + x + "y=" + y + "r=" + r);
    }
}
//Результат выполнения программы
//х=0.0y=0.0r=5.0
//х=1.0y=1.0r=8.0
//х=4.0y=5.0r=255.0