package com.serverless.ServerlessProject.Functions;

import com.serverless.ServerlessProject.Models.Stock;
import com.serverless.ServerlessProject.Services.StockService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Supplier;

import static java.lang.Double.parseDouble;
import static java.lang.Integer.parseInt;

@Configuration
public class Stocks {
    private final StockService stockServices;

    public Stocks(StockService stockServices) {
        this.stockServices = stockServices;
    }
    @Bean
    public Supplier<List<Stock>> findAll()
    {
        return () -> stockServices.findAll();
    }

    @Bean
    public Supplier<String> portfolio(){
        return () -> stockServices.portfolio();
    }

    @Bean
    public Consumer<String> create()
    {
        return (args) -> {
            String[] arg_list = args.split(",");
            int id = parseInt(arg_list[0]);
            String name = arg_list[1];
            String ticker = arg_list[2];
            Double open = parseDouble(arg_list[3]);
            Double close = parseDouble(arg_list[4]);
            Double high = parseDouble(arg_list[5]);
            Double low = parseDouble(arg_list[6]);
            stockServices.create(id, name, ticker, open, close, high, low);
        };


    }
}
