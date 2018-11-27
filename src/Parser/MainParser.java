package Parser;

/*
    Поддерживаемые операции
    sin(x)   - синус
    cos(x)   - косинус
    tan(x)   - тангенс
    ctg(x)   - котангенс
    sinh(x)  - гиперболический синус
    cosh(x)  - гиперболический косинус
    tanh(x)  - гиперболический тангенс
    sec(x)   - секанс
    cosec(x) - косеканс
    abs(x)   - модуль числа
    sqrt(x)  - квадратный корень
    ln(x)    - натуральный логарифм
    lg(x)    - десятичный логарифм
    log(x,y) - логарифм x по основанию y
    xor(x,y) - побитовое исключающее ИЛИ

Побитовое И            &
Побитовое ИЛИ          |
Побитовое НЕ           ~
Сложение               +
Вычитание              -
Умножение              *
Деление                /
Остаток от деления     %
Целочисленное деление  \
Возведение в степень   ^
 */

public class MainParser {
    public static void main(String[] args){
        Parser parser = new Parser();
        String[] expressions = {"2+4*3-8^3",
                "4*sin(0.5)+2*cos(2*0.5)",
                "log(64,2)*lg(100)",
                "xor(65,83)",
                "63 & 95",
                "2*(5-7",
                "x*5",
                "",
                "2*pi*50",
                "e^2+1",
                "6.78.-7"};

        for(String expression:expressions){
            System.out.print(expression+"  ");
            try{
                System.out.print(parser.Parse(expression)+"\n");
            } catch(Exception e){
                System.out.println(e.getMessage());
            }
        }
    }
}


