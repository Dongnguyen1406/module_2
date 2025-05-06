package service;

import entity.Promotion;
import repository.IPromotionRepository;
import repository.PromotionRepository;

import java.util.*;

public class PromotionService implements IPromotionService {
    private final IPromotionRepository promotionRepo = new PromotionRepository();
    private final Queue<Promotion> promotionQueue = new LinkedList<>();
    private final Scanner sc = new Scanner(System.in);

    @Override
    public void giveVoucher(int voucher10, int voucher20, int voucher50) {
        List<Promotion> allPromotions = getPromotionsFromBookingMonth();
        for (Promotion promotion : allPromotions) {
            promotionQueue.offer(promotion);
        }

        distributeVoucher(voucher10, voucher20, voucher50);
    }

    private void distributeVoucher(int voucher10, int voucher20, int voucher50) {
        while (!promotionQueue.isEmpty()) {
            Promotion promotion = promotionQueue.poll();
            if (voucher10 > 0) {
                promotionRepo.add(new Promotion(promotion.getCustomerId(), promotion.getCustomerName(), 10));
                voucher10--;
            } else if (voucher20 > 0) {
                promotionRepo.add(new Promotion(promotion.getCustomerId(), promotion.getCustomerName(), 20));
                voucher20--;
            } else if (voucher50 > 0) {
                promotionRepo.add(new Promotion(promotion.getCustomerId(), promotion.getCustomerName(), 50));
                voucher50--;
            }
        }
    }

    private List<Promotion> getPromotionsFromBookingMonth() {
        List<Promotion> promotions = new ArrayList<>();
        return promotions;
    }

    @Override
    public void displayCustomerUseServiceInYear(int year) {
        List<Promotion> customerList = promotionRepo.getAll();
        for (Promotion promotion : customerList) {
            System.out.println(promotion);
        }
    }
}
