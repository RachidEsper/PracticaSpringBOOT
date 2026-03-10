package com.example.ColourPrinter.services.impl;

import com.example.ColourPrinter.services.RedPrinter;
import org.springframework.stereotype.Component;


@Component
public class EnglishRedPrinterImpl implements RedPrinter {

    @Override
    public String print() {
        return "Red";
    }
}
