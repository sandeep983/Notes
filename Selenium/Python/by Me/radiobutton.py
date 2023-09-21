from selenium import webdriver
from selenium.webdriver.common.by import By

browser = webdriver.Chrome(executable_path="C:\\Users\\sande\\Desktop\\Programs\\chromedriver.exe")

browser.get('https://rahulshettyacademy.com/AutomationPractice/')
radiobuttons = browser.find_elements(By.XPATH, "//input[@type='radio']")

#for clicking specific radiobutton
for radiobutton in radiobuttons:
    if radiobutton.get_attribute("value") == "radio2":
        radiobutton.click()
        assert radiobutton.is_selected()

browser.close()