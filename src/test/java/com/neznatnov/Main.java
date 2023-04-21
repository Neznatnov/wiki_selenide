package com.neznatnov;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.exist;
import static com.codeborne.selenide.Selenide.*;

public class Main {
    @Test
    public void wikiCheck(){
        open("https://github.com/selenide/selenide");
        $("#wiki-tab").click();
        $("#wiki-pages-filter").setValue("SoftAssertions");
        $("div.d-flex a.Truncate-text[href='/selenide/selenide/wiki/SoftAssertions']").click();
        $(By.cssSelector("a[href='#3-using-junit5-extend-test-class']")).should(exist);
    }
}
