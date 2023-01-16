#dealing with multiple windows(new tabs), popups
from selenium import webdriver
from selenium.webdriver.common.by import By

browser = webdriver.Chrome(executable_path="C:\\Users\\sande\\Desktop\\Programs\\Python Selenium\\chromedriver.exe")
browser.get('http://the-internet.herokuapp.com/windows')

browser.find_element(By.LINK_TEXT, "Click Here").click()

childwindow = browser.window_handles[1]
browser.switch_to.window(childwindow)

print(browser.find_element(By.TAG_NAME, 'h3').text)
browser.close()

browser.switch_to.window(browser.window_handles[0])
print(browser.find_element(By.TAG_NAME, 'h3').text)