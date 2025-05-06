package repository;

import entity.Promotion;

import java.util.List;

public interface IPromotionRepository {
    void add(Promotion promotion);
    List<Promotion> getAll();
}
