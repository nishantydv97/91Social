package src.main;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import src.model.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ForkJoinPool;

public class CalculateBiCyclePrice {
    public static void main(String[] args) throws FileNotFoundException, JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
/*
        Bicycle bicycle = new Bicycle();
        ChainAssembly chainAssembly = new ChainAssembly("avon","avon","avon");
        Frame frame = new Frame("avon","local","avon");
        HandleBarSet handleBarSet = new HandleBarSet("avon","local","avon","avon");
        Seating seating = new Seating("avon", "local");
        Wheel wheel = new Wheel("avon","local","avon","local");
        bicycle.setChainAssembly(chainAssembly);
        bicycle.setFrame(frame);
        bicycle.setHandleBarSet(handleBarSet);
        bicycle.setSeating(seating);
        bicycle.setWheel(wheel);
        bicycle.setBicycleName("newBicycle");



        try {
            mapper.writeValue(new File("JSONExample.json"), bicycle);
            System.out.println(mapper.writeValueAsString(bicycle));
        } catch (Exception e) {
            e.printStackTrace();
        }



 */

        if(args.length>0){
            System.out.println(args[0]);
        }


        try {
            Bicycle[] bicycle= mapper.readValue(new File("JSONExample.json"), Bicycle[].class);
            List<FinalBicyclePrice> finalBicyclePriceList = new ArrayList<FinalBicyclePrice>();
            ForkJoinPool myPool = new ForkJoinPool(10);
            Arrays.stream(bicycle).parallel().forEach(bicycle1-> {
                FinalBicyclePrice finalBicyclePrice = new FinalBicyclePrice();
                finalBicyclePrice.setBicycleName(bicycle1.getBicycleName());
                PriceCalculation priceCalculation = new PriceCalculation();
                Integer wheelComponentPricePrice = priceCalculation.calculateWheelComponentPrice(bicycle1.getWheel());
                finalBicyclePrice.setWheelComponentPricePrice(wheelComponentPricePrice);

                Integer frameComponentPrice = priceCalculation.calculateFrameComponentPrice(bicycle1.getFrame());

                finalBicyclePrice.setFrameComponentPrice(frameComponentPrice);
                Integer handleBarSetComponentPrice = priceCalculation.calculateHandleBarSetComponentPrice(bicycle1.getHandleBarSet());

                finalBicyclePrice.setHandleBarSetComponentPrice(handleBarSetComponentPrice);
                Integer seatComponentPrice = priceCalculation.calculateSeatComponentPrice(bicycle1.getSeating());

                finalBicyclePrice.setSeatComponentPrice(seatComponentPrice);
                Integer chainComponentPrice = priceCalculation.calculateChainComponentPrice(bicycle1.getChainAssembly());


                finalBicyclePrice.setChainComponentPrice(chainComponentPrice);
                Integer totalCostOfBicycle = frameComponentPrice + wheelComponentPricePrice +
                        handleBarSetComponentPrice + seatComponentPrice + chainComponentPrice;
                finalBicyclePrice.setFinalTotalPrice(totalCostOfBicycle);
                finalBicyclePriceList.add(finalBicyclePrice);
            });
            for (FinalBicyclePrice  finalBicyclePrices : finalBicyclePriceList){
                System.out.println(finalBicyclePrices);
            }
        } catch (Exception e) {

            e.printStackTrace();

        }

    }
}
