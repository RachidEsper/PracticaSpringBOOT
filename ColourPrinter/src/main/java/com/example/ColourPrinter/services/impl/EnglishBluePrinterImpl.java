package com.example.ColourPrinter.services.impl;

import com.example.ColourPrinter.services.BluePrinter;
import org.springframework.stereotype.Component;

@Component
public class EnglishBluePrinterImpl implements BluePrinter {
    @Override
    public String print() {
        return "Blue";
    }
}
