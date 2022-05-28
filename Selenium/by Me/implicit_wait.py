#greencart veg shoping - #implicit wait example
from selenium import webdriver
from selenium.webdriver.common.by import By
import time

browser = webdriver.Chrome(executable_path="C:\\Users\\sande\\Desktop\\Programs\\chromedriver.exe")
browser.get('https://rahulshettyacademy.com/seleniumPractise/#/')

#when the element is not found it will wait for 5 secs - applies to every element on page
browser.implicitly_wait(5)
browser.maximize_window()

#searching for "ber"
browser.find_element(By.CSS_SELECTOR, "input.search-keyword").send_keys("ber")
time.sleep(4)

#counting showing products/elements
count = len(browser.find_elements(By.XPATH, "//div[@class='products']/div"))
assert count == 3

#clicking add to cart button - for all the elements found it search
buttons = browser.find_elements(By.XPATH, "//div[@class='product-action']/button")
for button in buttons:
    button.click()

#clicking cart button
browser.find_element(By.CSS_SELECTOR, "img[alt='Cart']").click()
#clicking proceed to checkout button
browser.find_element(By.XPATH, "//button[text()='PROCEED TO CHECKOUT']").click()

#applying promocode and clicking apply
browser.find_element(By.CSS_SELECTOR, ".promoCode").send_keys("rahulshettyacademy")
browser.find_element(By.CSS_SELECTOR, ".promoBtn").click()

#matching the message which is being displayed on site after the apply click
assert browser.find_element(By.CSS_SELECTOR, ".promoinfo").text == "Code applied ..!"

browser.close()