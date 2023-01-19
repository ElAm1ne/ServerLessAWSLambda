package com.serverless.ServerlessProject.Functions;

import com.serverless.ServerlessProject.Models.Stock;
import com.serverless.ServerlessProject.Services.StockService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

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
    public Consumer<String> create()
    {
        //return (args) -> stockServices.createStock(parseInt(args.split(",")[0]),args.split(",")[0],args.split(",")[0],parseDouble(args.split(",")[0]),parseDouble(args.split(",")[0]),parseDouble(args.split(",")[0]),parseDouble(args.split(",")[0]));
        return (args) -> stockServices.create(args);

    }
}
