package com.serverless.ServerlessProject.Models;

import java.beans.ConstructorProperties;


public class Stock {
    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    Integer Id;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getTicker() {
        return Ticker;
    }

    public void setTicker(String ticker) {
        Ticker = ticker;
    }

    public Double getOpen() {
        return Open;
    }

    public void setOpen(Double open) {
        Open = open;
    }

    public Double getClose() {
        return Close;
    }

    public void setClose(Double close) {
        Close = close;
    }

    public Double getHigh() {
        return High;
    }

    public void setHigh(Double high) {
        High = high;
    }

    public Double getLow() {
        return Low;
    }

    public void setLow(Double low) {
        Low = low;
    }
    public void setAverage(Double average) {Average = average;}
    public Double getAverage(){return Average;}
    String Name;
    String Ticker;
    Double Open;
    Double Close;
    Double High;
    Double Low;
    Double Average;

    Double Daily_average;


    public Stock(){
        this.Id  = 0;
        this.Name = "Def";
        this.Ticker = "Def";
        this.Open = 0.0;
        this.Close = 0.0;
        this.High = 0.0;
        this.Low = 0.0;
        this.Average = 0.0;
        this.Daily_average = 0.0;
    }
    public Stock(int id, String name, String ticker, Double open, Double close, Double high, Double low, Double average, Double daily_average){
        this.Id  = id;
        this.Name = name;
        this.Ticker = ticker;
        this.Open = open;
        this.Close = close;
        this.High = high;
        this.Low = low;
        this.Average = average;
        this.Daily_average = daily_average;
    }
    @Override
    public String toString(){
        return "Stock with id : "+this.Id+", Name is : "+this.Name+", Has open, close, high, low = "+this.Open+", "+this.Close+", "+this.High+", "+this.Low+", "+this.Average+", "+ this.Daily_average+".";
    }
}
