#greencart veg shoping
from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.support.wait import WebDriverWait
from selenium.webdriver.support import expected_conditions as EC
import time

browser = webdriver.Chrome(executable_path="C:\\Users\\sande\\Desktop\\Programs\\Python Selenium\\chromedriver.exe")
browser.get('https://rahulshettyacademy.com/seleniumPractise/#/')
browser.maximize_window()

#explicit wait
wait = WebDriverWait(browser, 10)

#searching for ber in search box
browser.find_element(By.CSS_SELECTOR, "input.search-keyword").send_keys("ber")
time.sleep(4)

list1 = []
list2 =[]
#getting search result and putting all the items in list 1 and adding them to cart
product_names = browser.find_elements(By.XPATH, "//h4[@class='product-name']")
for product in product_names:
    list1.append(product.text)
    #going to add to cart button and click it
    product.find_element(By.XPATH, "parent::div/div/button").click()
browser.find_element(By.CSS_SELECTOR, "img[alt='Cart']").click()
browser.find_element(By.XPATH, "//button[text()='PROCEED TO CHECKOUT']").click()
time.sleep(3)

#getting all the items in cart page and storing them in list 2 after that matching them with list 1
veggies = browser.find_elements(By.CSS_SELECTOR, "p.product-name")
for veg in veggies:
    list2.append(veg.text)
assert list1 == list2

#total amount before discount
total_amt = int(browser.find_element(By.CSS_SELECTOR, ".discountAmt").text)

#applying discount
wait.until(EC.presence_of_element_located((By.CSS_SELECTOR, ".promoCode")))
browser.find_element(By.CSS_SELECTOR, ".promoCode").send_keys("rahulshettyacademy")
browser.find_element(By.CSS_SELECTOR, ".promoBtn").click()
wait.until(EC.presence_of_element_located((By.CSS_SELECTOR, "span.promoinfo")))

#discount amount after applying the discount code
total_after_disc = float(browser.find_element(By.CSS_SELECTOR, ".discountAmt").text)
#checking if the discounted price is less than total price
assert total_after_disc < total_amt

#printing the text to terminal which we get after the discounted code is applied
print(browser.find_element(By.CSS_SELECTOR, "span.promoinfo").text)

#getting all the price of items in cart page and doing summation of all the prices
price_list_veggies = browser.find_elements(By.XPATH, "//tr/td[5]/p")
sum = 0
for item in price_list_veggies:
    sum = sum + int(item.text)

#getting total price and matching it with sum of price of all items
total_price = int(browser.find_element(By.CSS_SELECTOR, ".totAmt").text)
assert total_price == sum

browser.quit()