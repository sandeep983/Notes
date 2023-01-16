'''
9. Fixture-Teardown: To use the fixture we have to use '@pytest.fixture' tag to mark it
   as fixture, Fixture will get executed at first so it can be used to meet prerequisite like
   open browser etc.
   If we use 'yield' keyword after that everything will be executed at last, it is also called
   teardown, so it can be used to close browser, clear cookies etc.
   If we want to mark a method to be a part of fixture method then we have to pass the name
   of fixture defined method (ex. 'setup') as a argument to normal method (ex. file 
   'test_fixture.py').

   conftest.py
   If we write our fixture in this conftest.py then it is available to every single test file
   in the folder/directory where conftest is defined. We just have to pass fixture defined method
   name (ex. 'setup') as argument in whichever method we need this fixture.

10. If we want to setup this fixture for all the test cases then we have to put all those test
    cases/methods inside a class (ex- file 'test_fixtureClass.py') and mark it using 
    '@pytest.mark.usefixtures("setup")' tag here setup is the name of the fixture.
    If we want to run it once before the class in here 'conftest.py' we have to provide the scope,
    like this '@pytest.fixture(scope="class")'.

11. If we want to send the data from a fixture we can do it by check returning the data as 
    a list, check method 'dataLoad()' we are using this data in 'test_fixtureData.py' file.

12. If we want to run a test case with three different data, we can do it by parameterizing
    (ex- file 'conftest.py' method 'crossBrowser' and 'test_fixtureParam.py')

13. To get the report/logs in html file format first install pytest-html using 
    'pip install pytest-html' then we can use it through command like this- 
    'py.test --html=report.html' here report.html is the file name and it can be anything.

14. To get the logs in logfile.log, check 'test_logging.py' file.

15. Using the LogIntoHtml class to log the logdata in report.html file check 
    'test_fixtureData.py' file.
'''
import pytest

@pytest.fixture(scope='class')
def setup():
    print("I will be executed first")
    yield
    print("I will be executed last")

@pytest.fixture()
def dataLoad():
   print("Giving user data to method from fixture")
   return ['sandeep', 'patel', 'sandeeppatel.resume']

@pytest.fixture(params=['chrome', ('firefox', 'ie'), 'safari'])
def crossBrowser(request):
   return request.param