import java.util.Scanner;

public class Main {
    public static void printPrices(String[] products, int[] prices){
        for (int i = 0; i < products.length; i++) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(i+1);
            stringBuilder.append(". ");
            stringBuilder.append(products[i]);
            stringBuilder.append(" ");
            stringBuilder.append(prices[i]);
            stringBuilder.append(" руб/шт");
            System.out.println(stringBuilder.toString());
        }
    }

    public static void printProductBasketLine(String[] line){
        System.out.printf("%-22s%-12s%-12s%s", line[0], line[1], line[2], line[3]);
        System.out.println();
    }

    public static void printProductBasket(String[] products, int[] prices, int[] purchased, int sum){
        System.out.println("Ваша корзина:");
        printProductBasketLine(new String[]{"Наименование товара", "Количество", "Цена/за.ед", "Общая стоимость"});
        for(int i = 0; i < products.length; ++i){
            if (0 == purchased[i]){
                continue;
            }
            printProductBasketLine(new String[]{products[i], Integer.toString(purchased[i]),
                    Integer.toString(prices[i]), Integer.toString(purchased[i]*prices[i])});
        }
        printProductBasketLine(new String[]{"", "", "Итого", Integer.toString(sum)});
    }

    public static void main(String[] args) {
        String[] products = {"Молоко", "Хлеб", "Гречневая крупа"};
        int[] prices = {50, 14, 80};
        printPrices(products, prices);

        int[] purchased = new int[products.length];
        int sumProducts = 0;

        while (true){
            System.out.println("Выберите товар и количество или введите `end`");
            Scanner scanner = new Scanner(System.in);
            String line = scanner.nextLine();
            if (line.equals("end")){
                break;
            }
            String[] splitLine = line.split(" ");
            if (splitLine.length != 2){
                System.out.println("Введена не верная команда");
                continue;
            }
            int productNumber = Integer.parseInt(splitLine[0])-1;
            if (productNumber >= products.length){
                System.out.println("Не верный номер товара");
                continue;
            }
            int productCount = Integer.parseInt(splitLine[1]);
            int currentPrice = prices[productNumber];

            purchased[productNumber] += productCount;
            sumProducts += currentPrice * productCount;
        }
        printProductBasket(products, prices, purchased, sumProducts);
    }
}
