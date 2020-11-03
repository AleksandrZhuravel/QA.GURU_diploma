package tests;

import io.qameta.allure.Link;
import io.qameta.allure.Owner;
import io.qameta.allure.Story;
import io.qameta.allure.junit4.DisplayName;
import org.junit.jupiter.api.Test;

@Owner("zhuravel")
public class WGTests {

    @Test
    @Story("")
    @DisplayName("1) Проверка работы открывающегося баннера 'Подробнее' на главной странице")
    @Link(value = "Wargaming", url = "https://wargaming.com/ru/")
    public void first() {
    }

    @Test
    @Story("")
    @DisplayName("2) Проверка работы слайдера на главной странице")
    @Link(value = "Wargaming", url = "https://wargaming.com/ru/")
    public void second() {

    }

    @Test
    @Story("")
    @DisplayName("3) Проверка открытия документа 'ПОЛИТИКА КОНФИДЕНЦИАЛЬНОСТИ WARGAMING'")
    @Link(value = "Wargaming", url = "https://wargaming.com/ru/")
    public void third() {

    }

    @Test
    @Story("")
    @DisplayName("4) Проверка открытия страницы 'FAQ'")
    @Link(value = "Wargaming", url = "https://wargaming.com/ru/")
    public void fourth() {

    }

    @Test
    @Story("")
    @DisplayName("5) Проверка открытия страницы 'Gods & Glory'")
    @Link(value = "Wargaming", url = "https://wargaming.com/ru/")
    public void fifth() {

    }
}
