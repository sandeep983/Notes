import logging

#as per the testing rules everything should be wrapped under methods/functions
def test_loggingDemo():
    #__name__ will print the file name of test case
    logger = logging.getLogger(__name__) 

    #filehandler object - we have to pass it to logger handler
    file_handler = logging.FileHandler('logfile.log')
    #in what format we want our logs in
    log_format = logging.Formatter("%(asctime)s || %(levelname)s - %(name)s : %(message)s")
    file_handler.setFormatter(log_format) #we can pass format to addhandler like this

    logger.addHandler(file_handler)

    #When we set level, we only get logs for that issue and everything which comes after it
    logger.setLevel(logging.DEBUG)

    logger.debug('a debug statement is executed')
    logger.info('information statement') #logs will be saved in file from here only
    logger.warning('something is in warning mode')
    logger.error('a major error has happened')
    logger.critical('critical issue')