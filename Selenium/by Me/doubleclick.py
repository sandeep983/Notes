#Double clicking
from selenium import webdriver
from selenium.webdriver.chrome.service import Service
from selenium.webdriver.common.by import By
from selenium.webdriver import ActionChains

browser = webdriver.Chrome(service=Service("C:\\Users\\sande\\Desktop\\Programs\\Python Selenium\\chromedriver.exe"))
browser.get('https://chercher.tech/practice/practice-pop-ups-selenium-webdriver')

action = ActionChains(browser)
action.double_click(browser.find_element(By.ID, "double-click")).perform()

alert = browser.switch_to.alert
assert "You double clicked me!!!, You got to be kidding me" == alert.text

browser.quit()