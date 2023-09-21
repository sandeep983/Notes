#frame, iframe, frameset - Mousehover
from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver import ActionChains

browser = webdriver.Chrome(executable_path="C:\\Users\\sande\\Desktop\\Programs\\Python Selenium\\chromedriver.exe")
browser.get('https://rahulshettyacademy.com/AutomationPractice/')

action = ActionChains(browser)
action.move_to_element(browser.find_element(By.ID, "mousehover")).perform()
action.move_to_element(browser.find_element(By.LINK_TEXT, "Top")).click().perform()

browser.quit()