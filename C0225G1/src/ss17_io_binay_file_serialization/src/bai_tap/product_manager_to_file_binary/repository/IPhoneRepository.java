package bai_tap.product_manager_to_file_binary.repository;

import bai_tap.product_manager_to_file_binary.entity.Phone;

import java.util.List;

public interface IPhoneRepository {
    List<Phone> findAll();
    void addPhone(Phone phone);
}
