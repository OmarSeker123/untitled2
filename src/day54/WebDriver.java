package day54;

public  interface WebDriver {

    //adding  abstract behavior
    void openBrowser();

    void navigateTo(String url);

    void maximize();

    void closeBrowser();


}
