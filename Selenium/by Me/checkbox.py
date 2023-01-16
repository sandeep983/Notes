#checkbox
from selenium import webdriver
from selenium.webdriver.common.by import By

browser = webdriver.Chrome(executable_path="C:\\Users\\sande\\Desktop\\Programs\\chromedriver.exe")

browser.get('https://rahulshettyacademy.com/AutomationPractice/')
checkboxes = browser.find_elements(By.XPATH, "//input[@type='checkbox']")

#for clicking all the checkboxes
# for checkbox in checkboxes:
#     checkbox.click()
#     assert checkbox.is_selected()

#for clicking specific checkbox
for checkbox in checkboxes:
    if checkbox.get_attribute("name") == "checkBoxOption2":
        checkbox.click()
        assert checkbox.is_selected()

browser.close()


