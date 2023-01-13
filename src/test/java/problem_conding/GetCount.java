package problem_conding;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.*;

public class GetCount {


    public static WebDriver driver;
    public static void main(String[] args) {
        String player = "sanjeev kumar";
        if(player == null || player.isEmpty())
            return;
        String[] arr = player.split(" ");
        String result = "";

        for(String word: arr) {
            result += Character.toUpperCase(word.charAt(0)) + word.substring(1)+" ";
        }
        System.out.println("Result: "+ result);

//        Collections.sort();
    }

    public static void displayDuplicateWord() {
        String s ="I love coding I love eating I"; // I I I love love coding eating

        String[] arr = s.split(" ");
        Map<String,Integer> map = new HashMap<>();

        for(int i=0; i<arr.length; i++) {
            if(map.containsKey(arr[i]))
                map.put(arr[i],map.get(arr[i])+1);
            else
                map.put(arr[i],1);
        }
        Set<String> set = map.keySet();
        Iterator<String> itr = set.iterator();
        while (itr.hasNext()) {
            String key = itr.next();
            int count = map.get(key);
            if (count > 1)
                System.out.println(key + " " + map.get(key));
        }
    }

    public static int getRankingOfPlayer(String player) {
        System.setProperty("webdriver.chrome.driver","C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe");
        driver = null;

        if(player == null || player.isEmpty())
            return 0;
       String[] arr = player.split(" ");
       String result = "";

       for(String word: arr) {
            result += Character.toUpperCase(word.charAt(0)) + word.substring(1);
       }
        System.out.println("Result: "+ result);

        String path = "(//a[contains(.,'"+ player +"')])[1]/parent::div/parent::div/preceding-sibling::div";
        String rankText = driver.findElement(By.xpath(path)).getText();
        return Integer.parseInt(rankText);
    }
}
