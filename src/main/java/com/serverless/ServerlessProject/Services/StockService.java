package com.serverless.ServerlessProject.Services;

import com.serverless.ServerlessProject.Models.Stock;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StockService {
    private List<Stock> Stocks = new ArrayList<>();

    public List<Stock> findAll (){
        return Stocks;
    }

    public void createStock(int id, String name, String ticker, Double open, Double high, Double close, Double low){
        Stocks.add(new Stock(id, name, ticker, open, close, high, low));
    }

    public void create(String name){
        Stock newstock = new Stock();
        newstock.setName(name);
        Stocks.add(newstock);
    }

}
