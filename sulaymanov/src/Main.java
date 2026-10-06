import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //практическая работа 2
        //студент группы 255 Сулайманов
        System.out.println("Начало работы");
        Pgf f=new Pgf();
        f.Vvod();
        f.Vivod();
        f.Perem();
        f.Vivod();
        f.IzmRaz();
        f.Vivod();
        f.Vrash();
        f.Vivod();
        System.out.println("Конец работы");
    }

    }
    class Pgf {
    private double cx, cy;
    private double r;
    private double ax, ay;
    private double a;
    private double k;
    private double dx, dy;
    public void Vvod() {
        Scanner in= new Scanner(System.in);
        System.out.println("Введите параметры круга");
        System.out.print("cx=");
        cx=in.nextDouble();
        System.out.print("cy=");
        cy=in.nextDouble();
        System.out.print("r=");
        r=in.nextDouble();

    }
    public void Vivod() {
        System.out.println("Параметры фигуры");
        System.out.print("cx="+cx+"cy="+cy+"r="+r);
    }
    public void Perem() {
        Scanner in=new Scanner(System.in);
        System.out.println("Введите координаты смещенной фигуры");
        System.out.print("Смещение по X=");
        dx=in.nextDouble();
        System.out.print("Смещение по Y=");
        dy=in.nextDouble();
        cx=cx+dx;
        cy=cy+dy;
    }
    public void IzmRaz(){
        Scanner in=new Scanner(System.in);
        System.out.print("Коэффицент изменения радиуса круга");
        k=in.nextDouble();
        r=r*k;
    }
    public void Vrash(){
        Scanner in=new Scanner(System.in);
        System.out.print("Угол поворота фигуры");
        a=in.nextDouble();
    }
    public Pgf() {
        this.cx=0;
        this.cy=0;
        this.r=3;
        this.ax=0;
        this.ay=0;
        this.a=0;
        this.k=1;
        this.dx=0;
        this.dy=0;

    }
    public Pgf(double cs,double cy,double r){
        this.cx=cx;
        this.cy=cy;
        this.r=r;
        this.ax=0;
        this.ay=0;
        this.a=0;
        this.k=1;
        this.dx=0;
        this.dy=0;
    }
}

//Начало работы
//Введите параметры круга
//cx=0
//cy=0
//r=3
//Параметры фигуры
//cx=0.0cy=0.0r=3.0Введите координаты смещенной фигуры
//Смещение по X=2
//Смещение по Y=3
//Параметры фигуры
//cx=2.0cy=3.0r=3.0Коэффицент изменения радиуса круга2
//Параметры фигуры
//cx=2.0cy=3.0r=6.0Угол поворота фигуры6
//Параметры фигуры
//cx=2.0cy=3.0r=6.0Конец работы

