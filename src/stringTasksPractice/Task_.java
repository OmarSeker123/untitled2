package stringTasksPractice;

import java.util.Scanner;

public interface Task_ {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println(" Enter the search Keyword");
        String searchKey = scan.nextLine();
        String tabTitle = searchKey + "-Google Search";
        System.out.println("tabTitle = " + tabTitle);


        if (tabTitle.startsWith(searchKey) && tabTitle.endsWith("Google search")) {
            System.out.println("Test passed");
        } else {
            System.out.println("test failed");
        }
    }
}

