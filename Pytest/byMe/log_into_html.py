#To log the errors/logs in our report.html
import logging
import inspect

class LogIntoHtml:
    #as per the testing rules everything should be wrapped under methods/functions
    def getLogs(self):
        #__name__ will print the file name of test case so we we do it like this
        #logger = logging.getLogger(__name__) log_into_html will be printed
        #but we need the file name where this method was called
        loggerName = inspect.stack()[1][3] #this will get the name of that method/test case
        logger = logging.getLogger(loggerName)

        #filehandler object - we have to pass it to logger handler
        file_handler = logging.FileHandler('logfile.log')
        #in what format we want our logs in
        log_format = logging.Formatter("%(asctime)s || %(levelname)s - %(name)s : %(message)s")
        file_handler.setFormatter(log_format) #we can pass format to addhandler like this

        logger.addHandler(file_handler) #file handler object

        logger.setLevel(logging.DEBUG)
        return logger


      