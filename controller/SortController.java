package SortNSearch.controller;

import java.util.Scanner;

import SortNSearch.model.Element;
import SortNSearch.view.Menu;

public class SortController extends Menu {
    Scanner sc = new Scanner(System.in);
    static String[] mc = { "Sort", "Search", "Exit" };

    protected Library library = new Library();
    protected Argorithm algorithm = new Argorithm();
    protected int[] array;
    protected int size_array;

    public SortController(Element element) {
        super("programming", mc);
        size_array = element.getSizeArray();
        array = element.getArrays();
    }

    public void execute(int n) {
        switch (n) {
            case 1:
                sort();
                break;
            case 2:
                search();
                break;
            case 3:
                System.exit(0);
                break;
        }
    }

    public void search() {
        final String[] mcSearch = { "Linear Search", "Binary Search", "Exit" };
        class SearchMenu extends Menu<String> {
            public SearchMenu() {
                super("Search Option", mcSearch);
            }

            @Override
            public void execute(int n) {
                algorithm.buddleSort(array);
                switch (n) {
                    case 1:
                        System.out.println("Enter your number to search");
                        int num1 = Integer.parseInt(sc.nextLine());
                        System.out.println(algorithm.linearSearch(array, num1));
                        break;
                    case 2:
                        System.out.println("Enter your number to search");
                        int num = Integer.parseInt(sc.nextLine());
                        System.out.println(algorithm.binarySerach(array, num, 0, array.length - 1));
                        break;
                    case 3:
                        System.exit(0);
                    default:
                        break;
                }
            }

        }
        SearchMenu searchMenu = new SearchMenu();
        searchMenu.run();
    }

    public void sort() {
        final String[] mcSort = { "Buddle Sort", "Quick Sort", "Exit" };
        class SortMenu extends Menu<String> {

            public SortMenu() {
                super("Sort Option", mcSort);
            }

            @Override
            public void execute(int n) {
                System.out.println("Unsorted array: ");
                library.display(array);
                switch (n) {
                    case 1:
                        algorithm.buddleSort(array);
                        System.out.println("\nSorted array by Buddle Sort: ");
                        library.display(array);
                        System.out.println("");
                        break;
                    case 2:
                        algorithm.quickSort(array, 0, size_array - 1);
                        System.out.println("\nSorted array by Quick Sort: ");
                        library.display(array);
                        System.out.println("");
                        break;
                    case 3:
                        System.exit(0);
                        break;
                }
            }
        }
        SortMenu sm = new SortMenu();
        sm.run();
    }

}
