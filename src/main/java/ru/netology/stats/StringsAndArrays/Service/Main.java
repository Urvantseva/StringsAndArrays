package ru.netology.stats.StringsAndArrays.Service;

public class Main {
    public static void main(String[] args) {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18}; // Продажи

        System.out.println(service.salesAmount(sales)); // сумма продаж
        System.out.println(service.averageМonthlySales(sales)); //средня сумма продаж в месяц
        System.out.println(service.numberOfTheMonthOfSaleForTheMaximumAmount(sales)); //номер месяца продажи на максимальную сумму
        System.out.println(service.numberOfTheMonthOfSaleForTheMinimumAmount(sales)); //номер месяца продажи на минимальную сумму
        System.out.println(service.numberOfMonthsBelowAverage(sales)); // количество месяцев ниже среднего
        System.out.println(service.numberOfMonthsAboveAverage(sales)); // количество месяцев выше среднего


    }
}
