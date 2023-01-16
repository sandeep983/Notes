#using javascript in selenium - we need to use js when selenium can not find the element
#or to scroll down in page, because selenium dont support that
from selenium import webdriver
from selenium.webdriver.chrome.service import Service
from selenium.webdriver.common.by import By

browser = webdriver.Chrome(service=Service("C:\\Users\\sande\\Desktop\\Programs\\chromedriver.exe"))
browser.get('https://rahulshettyacademy.com/angularpractice/')

#using selenium
browser.find_element(By.NAME, "name").send_keys("ramesh")
# print(browser.find_element(By.NAME, "name").get_attribute("value"))
#using javascript
print(browser.execute_script("return document.getElementsByName('name')[0].value"))

#using selenium
# browser.find_element(By.CSS_SELECTOR, "a[href*='shop']").click()
#using javascript
shopbutton = browser.find_element(By.CSS_SELECTOR, "a[href*='shop']")
browser.execute_script("arguments[0].click();", shopbutton)

#for scroll down - selenium does not have this feature but we can use javascript for it
#taking time - fix
browser.execute_script("window.scrollTo(0,document.body.scrollHeight);")

browser.quit()