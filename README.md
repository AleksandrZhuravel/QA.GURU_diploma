### Тестовое задание на вакансию "QA Automation Engineer (World of Tanks, Web)" компании "Wargaming".
#### Проведение автоматизации тестирования ресурса "wargaming.com".
**Тестируемая функциональность:** функционирование элементов интерфейса.
                                  

Позитивное функциональное тестирование

**Количество автоматизированных тестов:** 5


##### 1. Перечень автоматизируемых сценариев:

 *1) Проверка работы открывающегося баннера "Подробнее" на главной странице:*

    a) Открыть стартовую страницу сайта "https://wargaming.com/ru/";

    b) Нажать на заголовок баннера "Подробнее" с правого края страницы;

    c) Проверить переход на страницу "https://wargaming.com/ru/banner/";

    d) Проверить, что заголовок страницы содержит текст "Подчини себе Вселенную!".

*2) Проверка работы слайдера на главной странице:*

    a) Открыть стартовую страницу сайта "https://wargaming.com/ru/";
    
    b) Нажать на кнопку перелистывания слайдера вправо 3 раза;
    
    c) Проверить, что заголовок слайдера содержит текст "Начни свою историю с нами";
    
    d) Проверить, что счетчик страниц слайдера показывает значение "4/4".

*3) Проверка открытия документа "ПОЛИТИКА КОНФИДЕНЦИАЛЬНОСТИ WARGAMING":*

    a) Открыть стартовую страницу сайта "https://wargaming.com/ru/";
    
    b) Нажать на ссылку "Защита данных" с левого края страницы;
    
    c) Нажать на ссылку "Политикой конфиденциальности" в верхнем обзаце параграфа 
       "Защита данных";
    
    d) Проверить переход на страницу "https://legal.ru.wargaming.net/ru/privacy-policy/";
    
    e) Проверить, что заголовок страницы содержит текст "ПОЛИТИКА КОНФИДЕНЦИАЛЬНОСТИ WARGAMING". 

*4) Проверка открытия страницы "FAQ":*

    a) Открыть стартовую страницу сайта "https://wargaming.com/ru/";
    
    b) Нажать на ссылку "Карьера" с левого края страницы;
    
    c) Нажать на ссылку "FAQ" с левого края страницы;
    
    d) Проверить переход на страницу "https://wargaming.com/ru/faq/";
    
    e) Проверить, что заголовок страницы содержит текст "FAQ".

*5) Проверка открытия страницы "Gods & Glory":*

    a) Открыть стартовую страницу сайта "https://wargaming.com/ru/";
    
    b) Нажать на ссылку "Игры" с левого края страницы;
    
    c) Нажать на ссылку "Gods & Glory" с левого края страницы;
    
    d) Нажать на кнопку "Вступить в Бой";
    
    e) Проверить переход на страницу "https://godsandglory.com/1957_ru1";
    
    f) Проверить, что заголовок страницы содержит текст "Стань правителем великой империи".
    
##### 2. Перечень используемых инструментов:
       * IntelliJ IDEA -  интегрированная среда разработки программного обеспечения.
       * Java 8 - язык написания авто-тестов.
       * GitHub - система для хостинга проекта тестирования и его совместной разработки.
       * JUnit - платформа для написания автотестов и их запуска. 
       * Gradle - система управления зависимостями.
       * Selenide - фреймворк для автоматизированного тестирования веб-приложений.
       * Allure - фреймворк для составления отчетности при проведении автоматизированного тестирования.
       * Docker - система контейнеризации приложений.
       * Selenoid - сервер, запускающий изолированные браузеры в Docker контейнерах.
       * Jenkins - программная система, обеспечивающая процесс непрерывной интеграции программного обеспечения.