#greencart veg shoping- also explicit wait example
from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.support.wait import WebDriverWait
from selenium.webdriver.support import expected_conditions as EC
import time

browser = webdriver.Chrome(executable_path="C:\\Users\\sande\\Desktop\\Programs\\chromedriver.exe")
browser.get('https://rahulshettyacademy.com/seleniumPractise/#/')
browser.maximize_window()
wait = WebDriverWait(browser, 10)

#search for "ber"
browser.find_element(By.CSS_SELECTOR, "input.search-keyword").send_keys("ber")
time.sleep(4)

#count all the elements/products found
count = len(browser.find_elements(By.XPATH, "//div[@class='products']/div"))
assert count == 3

#add to cart button
buttons = browser.find_elements(By.XPATH, "//div[@class='product-action']/button")
for button in buttons:
    button.click()

#clicking on cart
browser.find_element(By.CSS_SELECTOR, "img[alt='Cart']").click()
#clicking on proceed to cart
browser.find_element(By.XPATH, "//button[text()='PROCEED TO CHECKOUT']").click()

#waiting until the element is located, max wait time is 10secs 
wait.until(EC.presence_of_element_located((By.CSS_SELECTOR, ".promoCode")))
#entering promocode
browser.find_element(By.CSS_SELECTOR, ".promoCode").send_keys("rahulshettyacademy")
#clicking apply button
browser.find_element(By.CSS_SELECTOR, ".promoBtn").click()

#waiting for the successful message
wait.until(EC.presence_of_element_located((By.CSS_SELECTOR, "span.promoinfo")))
print(browser.find_element(By.CSS_SELECTOR, "span.promoinfo").text) 

browser.close()