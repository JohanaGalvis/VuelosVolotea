package com.speedup.qa.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Home {

    public static final Target ENTER_COOKIES = Target
            .the("Cookies").located(By.id("onetrust-accept-btn-handler"));

    public static final Target PASSENGER_BTN = Target
            .the("Click on passenger btn").located(By.id("input-text_sf-passenger"));
}
