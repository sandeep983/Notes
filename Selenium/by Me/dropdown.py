from selenium import webdriver
from selenium.webdriver.common.by import By
import time

browser = webdriver.Chrome(executable_path="C:\\Users\\sande\\Desktop\\Programs\\chromedriver.exe")

#working with dropdown
browser.get('https://rahulshettyacademy.com/dropdownsPractise/')

browser.find_element(By.ID, "autosuggest").send_keys("aus")
time.sleep(2)

countries = browser.find_elements(By.CSS_SELECTOR, "li[class=ui-menu-item] a")
for country in countries:
    if country.text == "Austria":
        country.click()
        break

print(browser.find_element(By.ID, "autosuggest").get_attribute('value'))
browser.close()
