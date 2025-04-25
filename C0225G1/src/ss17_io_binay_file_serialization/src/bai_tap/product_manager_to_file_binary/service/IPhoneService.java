package bai_tap.product_manager_to_file_binary.service;

import bai_tap.product_manager_to_file_binary.entity.Phone;

import java.util.List;

public interface IPhoneService {
    List<Phone> findAll();
    void add(Phone phone);
}
