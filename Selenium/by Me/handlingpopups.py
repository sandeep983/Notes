from optparse import Option
from selenium import webdriver
from selenium.webdriver.common.by import By

browser = webdriver.Chrome(executable_path="C:\\Users\\sande\\Desktop\\Programs\\chromedriver.exe")

validation_text = "Option3"
browser.get('https://rahulshettyacademy.com/AutomationPractice/')
browser.find_element(By.CSS_SELECTOR, "input[name='enter-name']").send_keys(validation_text)
browser.find_element(By.CSS_SELECTOR, "input[value='Alert']").click()

alert = browser.switch_to.alert
alert_msg = alert.text
assert validation_text in alert_msg
alert.accept()


# browser.close()




