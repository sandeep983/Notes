#chrome options - using these will help save memory or bypass certificate issues
from selenium import webdriver
from selenium.webdriver.chrome.service import Service
from selenium.webdriver.common.by import By

chrome_options = webdriver.ChromeOptions()

#it will not open the browser in foreground, it will work in background
chrome_options.add_argument('headless')
#will click on visit anyway and accept the risk when the site is having issue with the ssl
chrome_options.add_argument('--ignore-certificate-errors')

browser = webdriver.Chrome(service=Service("C:\\Users\\sande\\Desktop\\Programs\\chromedriver.exe"), options=chrome_options)
browser.get('https://rahulshettyacademy.com/angularpractice/')
print(browser.title)

browser.quit()