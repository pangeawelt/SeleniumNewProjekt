### SeleniumNewProjekt
=============
##WAS IST SELENIUM?

Selenium ist ein Werkzeug zur Automatisierung von Webbrowsern.
Selenium ermöglicht es, bestimmte Vorgänge in Webbrowsern zu automatisieren,
so dass Sie Tests automatisieren oder bestimmte Aufgaben auf Webseiten automatisieren können. 
Selenium arbeitet wie der Webbrowser selbst und kopiert die im Browser durchgeführten Aktionen, 
verhält sich also wie ein echter Benutzer.

##WAS SIND SOFTWARETESTS?

Unter Softwaretests versteht man das Testen der Leistung, Korrektheit,
Zuverlässigkeit und anderer Merkmale einer Software. Testen ist eine Methode,
um das erwartete Verhalten von Software zu überprüfen und unerwartetes Verhalten
zu erkennen. Testen ist sehr wichtig, um die Qualität von Software zu verbessern,
und wird normalerweise als Teil des Softwareentwicklungsprozesses durchgeführt. 
Das Testen hilft zu verstehen, wie die Software von den Benutzern wahrgenommen und 
verwendet wird, und trägt somit zur Verbesserung der Software bei.

##WAS IST TESTAUTOMATISIERUNG?

Testautomatisierung ist der Prozess der Automatisierung von Testverfahren.
Die Testautomatisierung ist eine Methode zur wiederholten Durchführung von Tests
und zur Gewährleistung ihrer Genauigkeit. Die Testautomatisierung ermöglicht eine schnellere
und genauere Durchführung von Tests und verbessert so die Softwarequalität. Testautomatisierung 
trägt auch zur Verbesserung von Software bei, indem sie die Wiederholbarkeit und Vergleichbarkeit von Tests erhöht.

##WARUM BRAUCHEN SIE SELENIUM?

Selenium wird verwendet, um automatisierte Vorgänge im Webbrowser auszuführen. 
So können Sie beispielsweise das Testen einer Website automatisieren,
ein Webformular automatisch ausfüllen oder den Inhalt einer Webseite automatisch scannen.
Auf diese Weise spart man Zeit und Mühe und erhöht die Genauigkeit der Vorgänge. 
Darüber hinaus können Sie dank Selenium bestimmte Aufgaben im Webbrowser automatisieren 
und wiederholen und so Ihre Arbeit effizienter gestalten.

##WAS SIND DIE KOMPONENTEN VON SELENIUM?

Selenium besteht aus den folgenden Komponenten:
Selenium WebDriver: Dies ist die wichtigste Komponente von Selenium und
wird zur Steuerung des Webbrowsers verwendet. Der WebDriver arbeitet 
wie der Webbrowser selbst und kopiert die im Browser ausgeführten Aktionen,
verhält sich also wie ein echter Benutzer.

#Selenium Grid: Dies ist ein Werkzeug zur Ausführung von Tests 
auf mehreren Computern und Webbrowsern. Mit Selenium Grid können Tests schneller
und effizienter ausgeführt werden.

#Selenium IDE: Hierbei handelt es sich um ein Firefox-Add-on zum Aufzeichnen,
Bearbeiten und Abspielen von Selenium-Tests. Selenium IDE bietet einen schnellen
und einfachen Weg zur Testautomatisierung.
ID-Lokator: Dieser verwendet die "id" -Attribute des Elements.
WebElement searchBox = driver.findElement(By.id("element_id"));
=============
Name Locator: Dieser verwendet das "name" -Attribut des Elements.
WebElement searchBox = driver.findElement(By.name("element_name"));
=============
Class Name Locator: Dieser verwendet den Klassennamen des Elements.
WebElement searchBox = driver.findElement(By.className("class_name"));
=============
Tag Name Locator: Dies verwendet den Namen des HTML-Tags des Elements.
WebElement searchBox = driver.findElement(By.tagName("tag_name"));
=============
Link Text Locator: Dies wird verwendet, um Links anhand ihres sichtbaren Textes zu finden.
WebElement link = driver.findElement(By.linkText("link_text"));
=============
Partial Link Text Locator: Dies wird verwendet, um Links anhand eines Teiltextes ihres sichtbaren Textes zu finden.
WebElement link = driver.findElement(By.partialLinkText("partial_link_text"));
=============
CSS Selector Locator: Dies verwendet ein CSS-Selektor-Syntaxmuster zur Identifizierung des Elements.
search_box = driver.find_element_by_css_selector("css_selector")
=============
XPath Locator: Dies verwendet die XPath-Syntax zur Identifizierung des Elements.
search_box = driver.find_element_by_xpath("xpath_query")
=============

##XPath Relative
// //input[@type='text'] oder //input[@type='text'][1]
1. Xpathsweg
(//*[class='size-base a-color-base'])[11] --> Unique
2. Xpathsweg
//*[.='size-base a-color-base']
3. Xpathsweg
//*[text()='Rennräder'] ohne Attribute
4. Xpathsweg
//input
5.Xpathsweg
//*[@type='text']
5. Xpathsweg
//input[@type]
6. Xpathsweg OR UND AND
//div[@id='log'] or/and class='flec-col logo'
7. 
##Contains
//*[contains(@name,'q')]
//*[contains(@title,'Ara')] 
//*[contains(@maxlength,'2048')]
//*[contains(@maxlength,'20')]


//NOTE: mit CSSSELECTOR darfs du nicht mit Index nehmen
//NOTE: statt id kannst du # zeichnen benutzen
##CSSSELECTOR
1.
By.cssSelector("button[onclick='addElement()']
2.
input[name='session[password]']
3.
input#session_password
4.
.form-control



//searchbox.isSelected(); //checkbox    Ist es wählbar?
//searchbox.isDisplayed();//bild        Ist es sichtbar?
//searchbox.isEnabled();// funktional   ist es zugänglich?



# SeleniumNewProjekt
![image](https://github.com/pangeawelt/SeleniumNewProjekt/assets/72691811/42a1f436-d9dc-4c2a-8f75-a90ee6f68666)
