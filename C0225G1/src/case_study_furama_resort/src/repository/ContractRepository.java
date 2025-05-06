package repository;

import entity.Contract;
import utils.FileUtils;

import java.util.ArrayList;
import java.util.List;

public class ContractRepository implements IContractRepository {
    private static final String FILE_PATH = "src/data/contract.csv";
    private static final List<Contract> contracts = new ArrayList<>();

    static {
        List<String> lines = FileUtils.readFile(FILE_PATH);
        for (String line : lines) {
            String[] arr = line.split(",");
            contracts.add(new Contract(arr[0], arr[1], Double.parseDouble(arr[2]), Double.parseDouble(arr[3])));
        }
    }

    @Override
    public List<Contract> getAll() {
        return contracts;
    }

    @Override
    public void add(Contract contract) {
        contracts.add(contract);
        FileUtils.writeFile(FILE_PATH, contract.getInfo(), true);
    }

    @Override
    public void update(Contract updated) {
        for (int i = 0; i < contracts.size(); i++) {
            if (contracts.get(i).getInfo().equals(updated.getInfo())) {
                contracts.set(i, updated);
                break;
            }
        }
        FileUtils.writeFile(FILE_PATH, "", false); // Ghi lại toàn bộ
        for (Contract c : contracts) {
            FileUtils.writeFile(FILE_PATH, c.getInfo(), true);
        }
    }
}
