package src.main;

import src.model.*;


public class PriceCalculation {
    Integer calculateWheelComponentPrice(Wheel wheel){
        Integer spockPrice = PriceList.spockPriceList.get(wheel.getSpock());
        Integer rimPrice = PriceList.rimPriceList.get(wheel.getRim());
        Integer tubePrice = PriceList.tubePriceList.get(wheel.getTube());
        Integer tyrePriceList = PriceList.tyrePriceList.get(wheel.getTyre());
        return spockPrice + rimPrice + tubePrice + tyrePriceList;
    }

    Integer calculateFrameComponentPrice(Frame frame){
        Integer rearShockPrice = PriceList.rearShockPriceList.get(frame.getRearShock());
        Integer suspensionSock = PriceList.suspensionSockPriceList.get(frame.getSuspensionShock());
        Integer framePrice = PriceList.framePriceList.get(frame.getBodyFrame());
        return rearShockPrice + suspensionSock + framePrice;
    }

    Integer calculateHandleBarSetComponentPrice(HandleBarSet handleBarSet){
        Integer handleBarPrice = PriceList.handleBarPriceList.get(handleBarSet.getHandleBar());
        Integer breakLeaverPrice = PriceList.breakLeaverList.get(handleBarSet.getBreakLeaver());
        Integer handGripPrice = PriceList.handGripList.get(handleBarSet.getHandGrip());
        Integer shifterPrice = PriceList.shifterPriceList.get(handleBarSet.getShifter());
        return handleBarPrice + breakLeaverPrice + handGripPrice + shifterPrice;
    }

    Integer calculateSeatComponentPrice(Seating seating){
        Integer seatPostPrice = PriceList.seatPostPriceList.get(seating.getSeatPost());
        Integer seatCoverPrice = PriceList.seatCoverPriceList.get(seating.getSeatCover());
        return seatPostPrice + seatCoverPrice;
    }
    Integer calculateChainComponentPrice(ChainAssembly chainAssembly){
        Integer chainPrice = PriceList.chainPriceList.get(chainAssembly.getChain());
        Integer cassettePrice = PriceList.cassettePriceList.get(chainAssembly.getCassette());
        Integer chainPaddlePrice = PriceList.chainPaddlePriceList.get(chainAssembly.getPaddle());
        return chainPrice + cassettePrice + chainPaddlePrice;
    }
}
