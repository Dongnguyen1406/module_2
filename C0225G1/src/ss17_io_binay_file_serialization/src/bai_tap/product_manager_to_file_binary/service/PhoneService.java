package bai_tap.product_manager_to_file_binary.service;

import bai_tap.product_manager_to_file_binary.entity.Phone;
import bai_tap.product_manager_to_file_binary.repository.IPhoneRepository;
import bai_tap.product_manager_to_file_binary.repository.PhoneRepository;

import java.util.List;

public class PhoneService implements IPhoneService{
    private IPhoneRepository phoneRepository = new PhoneRepository();
    
    @Override
    public List<Phone> findAll() {
        return phoneRepository.findAll();
    }

    @Override
    public void add(Phone phone) {
        phoneRepository.addPhone(phone);
    }
}
