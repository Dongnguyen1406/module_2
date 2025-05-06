package repository;

import entity.Promotion;
import utils.FileUtils;

import java.util.ArrayList;
import java.util.List;

public class PromotionRepository implements IPromotionRepository{
    private static final String FILE_PATH = "src/data/promotion.csv";
    private static final List<Promotion> promotions = new ArrayList<>();

    static {
        List<String> lines = FileUtils.readFile(FILE_PATH);
        for (String line : lines) {
            String[] arr = line.split(",");
            promotions.add(new Promotion(arr[0], arr[1], Double.parseDouble(arr[2])));
        }
    }
    
    @Override
    public void add(Promotion promotion) {
        promotions.add(promotion);
        FileUtils.writeFile(FILE_PATH, promotion.getCustomerId() + "," + promotion.getCustomerName() + "," + promotion.getDiscount(), true);
    }

    @Override
    public List<Promotion> getAll() {
        return promotions;
    }
}
