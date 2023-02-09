package com.app.problems.hackerearth;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public abstract class UniqueSubstring {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.manage().window().minimize();
        driver.get("https://www.google.com/");
        System.out.println(driver.getTitle());
        String s = "ababc";
        fill();
        fill(8);
        fill("Sanjeev");
    }

    public UniqueSubstring() {
        System.out.println("Test");
    }
    static int solve(String S, int K){
        // Write your code here
        int result = 0;
        for(int i=0; i<S.length(); i++) {
            if((i+K)>S.length())
                break;

        }
        return result;

    }

    public static void fill() {
        System.out.println("Fill");
    }

    public final static void fill(int no) {
        System.out.println(no);
    }

    public void fill(Object o) {

    }
    public abstract void fill(int a,int b);
    public static void fill(String name) {
        System.out.println(name);
    }
}



