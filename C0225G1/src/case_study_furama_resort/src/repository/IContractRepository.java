package repository;

import entity.Contract;

import java.util.List;

public interface IContractRepository {
    List<Contract> getAll();
    void add(Contract contract);
    void update(Contract contract);
}
