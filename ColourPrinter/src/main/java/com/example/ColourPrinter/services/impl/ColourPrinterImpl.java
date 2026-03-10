package com.example.ColourPrinter.services.impl;

import com.example.ColourPrinter.services.BluePrinter;
import com.example.ColourPrinter.services.ColourPrinter;
import com.example.ColourPrinter.services.GreenPrinter;
import com.example.ColourPrinter.services.RedPrinter;
import org.springframework.stereotype.Component;

@Component
public class ColourPrinterImpl implements ColourPrinter {

    private RedPrinter redPrinter;
    private GreenPrinter greenPrinter;
    private BluePrinter bluePrinter;


    public ColourPrinterImpl(RedPrinter redPrinter, GreenPrinter greenPrinter, BluePrinter bluePrinter ) {
        this.redPrinter=redPrinter;
        this.bluePrinter=bluePrinter;
        this.greenPrinter=greenPrinter;

    }



    @Override
    public String print() {
        return redPrinter.print() + " " + greenPrinter.print() + " " + bluePrinter.print();
    }




}
