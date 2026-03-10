package com.example.ColourPrinter.services.impl;
import com.example.ColourPrinter.services.GreenPrinter;
import org.springframework.stereotype.Component;

@Component
public class SpanishGreenPrinter implements GreenPrinter {
    @Override
    public String print() {
        return "Verde";
    }
}
