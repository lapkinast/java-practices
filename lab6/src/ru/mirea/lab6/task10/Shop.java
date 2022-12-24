package ru.mirea.lab6.task10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Shop implements Inputable {

    private final List<Computer> computers;

    public Shop() {

        this.computers = new ArrayList<>();

        computers.add(new Computer(new Processor("Apple M1", 8, 3.2),
                new Memory("SSD", 512),
                new Monitor("IPS", 13.3),
                Brand.APPLE));
        computers.add(new Computer(new Processor("AMD Ryzen 9", 8, 4.9),
                new Memory("SSD", 1000),
                new Monitor("IPS", 16),
                Brand.ASUS));
        computers.add(new Computer(new Processor("Intel Core i7", 4, 2.8),
                new Memory("SSD", 512),
                new Monitor("IPS", 14),
                Brand.LENOVO));
    }

    public void addComputer() {
        String choice;
        System.out.println("Select brand");
        for (int i = 0; i < Brand.values().length; i++) {
            System.out.println(i + 1 + ". " + Brand.values()[i].getName());
        }
        System.out.print("Your choice: ");
        choice = input();
        Brand brand = Brand.values()[Integer.parseInt(choice) - 1];
        System.out.print("Processor name: ");
        String processorName = input();
        System.out.print("Number of Cores: ");
        int cores = Integer.parseInt(input());
        System.out.print("Clock rate: ");
        double clockRate = Double.parseDouble(input());
        System.out.print("Memory type: ");
        String memoryType = input();
        System.out.print("Storage capacity: ");
        int diskSpace = Integer.parseInt(input());
        System.out.print("Matrix type: ");
        String matrixType = input();
        System.out.print("Screen size: ");
        double screenSize = Double.parseDouble(input());

        computers.add(new Computer(new Processor(processorName, cores, clockRate),
                new Memory(memoryType, diskSpace),
                new Monitor(matrixType, screenSize),
                brand));
    }

    public void deleteComputer() {
        System.out.println("Select computer");
        for (int i = 0; i < computers.size(); i++) {
            System.out.println(i + 1 + ". " + computers.get(i));
        }
        System.out.print("Your choice: ");
        computers.remove(Integer.parseInt(input()) - 1);
    }

    public Set<Computer> searchComputer() throws IOException {
        Set<Computer> computerSet = new HashSet<>();
        System.out.print("Search query: ");
        String choice = input();
        System.out.println(choice);
        for (Computer computer : computers) {
            if (computer.getBrand().getName().toLowerCase().contains(choice.toLowerCase())) {
                computerSet.add(computer);
            }
            if (computer.getProcessor().matchInComponents(choice.toLowerCase())){
                computerSet.add(computer);
            }
            if (computer.getMemory().matchInComponents(choice.toLowerCase())){
                computerSet.add(computer);
            }
            if (computer.getMonitor().matchInComponents(choice.toLowerCase())){
                computerSet.add(computer);
            }
        }


        return computerSet;
    }

    public List<Computer> showAll() {
        return computers;
    }

    public static void main(String[] args) throws IOException {
        Shop shop = new Shop();
//        shop.addComputer();
//        shop.deleteComputer();
        shop.searchComputer().forEach(System.out::println);
//        shop.showAll().forEach(System.out::println);
    }

    @Override
    public String input() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            return reader.readLine();
        } catch (IOException e) {
            return "";
        }
    }
}
