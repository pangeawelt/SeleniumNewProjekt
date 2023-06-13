### SeleniumNewProjekt
=============
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
