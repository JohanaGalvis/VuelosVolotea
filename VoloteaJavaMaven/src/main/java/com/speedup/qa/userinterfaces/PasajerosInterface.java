package com.speedup.qa.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PasajerosInterface {

    public static final Target ENTER_CHILD = Target
            .the("Validate passenger quantity").located(By.xpath("(//*[@class='v7-btn-circle v7-btn-circle--sm v7-u-cursor-pointer'])[2]"));

    public static final Target GROUP_LINK = Target
            .the("Validate group reservation link").located(By.xpath("//span[@class='v7-rounded__text v7-rounded__text--xs']"));
}
