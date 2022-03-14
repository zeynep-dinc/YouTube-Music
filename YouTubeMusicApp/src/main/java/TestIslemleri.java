import io.appium.java_client.MobileElement;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TestIslemleri extends Driver {

    public TestIslemleri(){
        PageFactory.initElements(appiumDriver,this);
    }


    public void aramaIslemi(){
        MobileElement searchBox= appiumDriver.findElement(By.id("com.google.android.apps.youtube.music:id/action_search_button"));
        searchBox.click();
        System.out.println("search box click");
        System.out.println("Şarkı adınızı giriniz:");
        
        MobileElement searchBoxText=appiumDriver.findElement(By.id("com.google.android.apps.youtube.music:id/search_edit_text"));
        searchBoxText.sendKeys("akşamcı");
        System.out.println("search box text wrote");
        MobileElement firstElement=appiumDriver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.support.v7.widget.RecyclerView/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.LinearLayout[2]/android.widget.TextView"));
        firstElement.click();
        System.out.println("click first element");
        MobileElement mixModeOn=appiumDriver.findElement(By.id("com.google.android.apps.youtube.music:id/queue_shuffle_button"));
        mixModeOn.click();
        System.out.println("Mix mode on");
        MobileElement nextSong=appiumDriver.findElement(By.id("com.google.android.apps.youtube.music:id/player_control_next_button"));
        nextSong.click();
        System.out.println("Next song play");
    }

    @Test
    public void test(){
        driverSettings();
        aramaIslemi();
    }
}
