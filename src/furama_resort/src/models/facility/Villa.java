package src.models.facility;

import src.models.facility.Facility;

public class Villa extends Facility {
    private String promotionService;

    public Villa(){
    }
    public Villa(String code,String name, int area, int price, int capacity, String rentalType, String promotionService) {
        super(code, name, area, price, capacity, rentalType);
        this.promotionService = promotionService;
    }

    public String getPromotionService() {
        return promotionService;
    }

    public void setPromotionService(String promotionService) {
        this.promotionService = promotionService;
    }

    @Override
    public String toString() {
        return "Villa{" +
                super.toString() +
                "promotionService='" + promotionService + '\'' +
                '}';
    }

    @Override
    public String getDataWrite() {
        return super.getDataWrite() +
                promotionService + "\n";
    }
}
