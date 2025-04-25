package bai_tap.product_manager_to_file_binary.repository;

import bai_tap.product_manager_to_file_binary.entity.Phone;
import bai_tap.product_manager_to_file_binary.util.ReadAndWriteToBinaryFile;

import java.util.ArrayList;
import java.util.List;

public class PhoneRepository implements IPhoneRepository{
    private final String PHONE_FILE = "src/bai_tap/product_manager_to_file_binary/data/phone.txt";
    private final boolean APPEND = true;
    private final boolean NOT_APPEND = false;
    
    @Override
    public List<Phone> findAll() {
        List<Phone> phones = new ArrayList<>();
        List<String> stringList = ReadAndWriteToBinaryFile.readFile(PHONE_FILE);
        String[] array;
        for (int i = 0; i < stringList.size(); i++) {
            array = stringList.get(i).split(",");
            Phone phone = new Phone(Integer.parseInt(array[0]), array[1], Double.parseDouble(array[2]), array[3], array[4], array[5]);
            phones.add(phone);
        }
        return phones;
    }

    @Override
    public void addPhone(Phone phone) {
        List<String> stringList = new ArrayList<>();
        stringList.add(phone.getPhoneOS());
        ReadAndWriteToBinaryFile.writeFile(PHONE_FILE, stringList, APPEND);
    }
}
