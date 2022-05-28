import pytest
from log_into_html import LogIntoHtml

@pytest.mark.usefixtures("dataLoad")
class TestExample2(LogIntoHtml): #inhereting the LogIntoHtml class
    
    def test_editProfile(self, dataLoad):
        log = self.getLogs()
        log.info(dataLoad[0]) #this will print out dataLoad[0] which is sandeep in logfile.log
        log.info(dataLoad)
        print(dataLoad)