package ro.selectors;

import org.openqa.selenium.By;

/**
 * Created by Istvan on 06.04.2015.
 */
public interface CategoriesSelectors {
    By categories = By.cssSelector("nav#emg-mega-menu > ul > li[class='']");
    By categoryTitle = By.tagName("a");
    By subCategories = By.cssSelector("div.emg-menu-box > div.emg-menu-list > ul > li a");
}
