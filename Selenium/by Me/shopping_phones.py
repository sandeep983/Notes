#shopping_phones
from selenium import webdriver
from selenium.webdriver.chrome.service import Service
from selenium.webdriver.common.by import By
from selenium.webdriver.support.wait import WebDriverWait
from selenium.webdriver.support import expected_conditions as EC


browser = webdriver.Chrome(service=Service("C:\\Users\\sande\\Desktop\\Programs\\chromedriver.exe"))
browser.get('https://rahulshettyacademy.com/angularpractice/')
wait = WebDriverWait(browser, 10)

#click shop button
browser.find_element(By.CSS_SELECTOR, "a[href*=shop]").click()

#getting all the products in page
products = browser.find_elements(By.XPATH, "//div[@class='card h-100']")
for product in products:
    if product.find_element(By.XPATH, "div/h4/a").text == 'Blackberry':
        product.find_element(By.XPATH, "div/button").click()

#checkout button
browser.find_element(By.CSS_SELECTOR, "a[class*='btn-primary']").click()
browser.find_element(By.CSS_SELECTOR, "button[class*='btn-success']").click()

#input box - entering "ind"
browser.find_element(By.CSS_SELECTOR, "#country").send_keys('ind')

#wait till the link text India is present and then click on it
wait.until(EC.presence_of_element_located((By.LINK_TEXT, "India")))
browser.find_element(By.LINK_TEXT, "India").click()

#click on t&c checkbox and then on purchase button
browser.find_element(By.XPATH, "//div[@class='checkbox checkbox-primary']").click()
browser.find_element(By.CSS_SELECTOR, "[type='submit']").click()

#get the success msg printed on webpage verify it if it's matching
success_text = browser.find_element(By.CLASS_NAME, "alert-success").text
assert "Success! Thank you!" in success_text

#taking a screenshot of the page
browser.get_screenshot_as_file('ss.png')

browser.quit()