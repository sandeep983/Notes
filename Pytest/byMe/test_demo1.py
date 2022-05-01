#Rules to Follow
''' 
1. File name should always start with 'test_' or end with '_test'
2. Everything/Everyline of code, should be in Methods/Functions
3. Method/Function names should start with 'test', for example- test_firstMethod():
4. We can not run this file directly like we used to run our python files, it will work but
   we wont get what we needed.
5. Every method/function is treated as one test case.
6. We can't have same method/function name in pytest, if we do that it will override the
   first method with second. We can't even have the same function/method name in different
   test file.
'''

#How to Run Tests
'''
1. To run pytest using terminal/cmd we have to first be in that directory (copy path
   of that folder and use 'cd' command to enter that directory in cmd).
2. If we want to run all the tests available in the directory/folder, We can use
   'py.test' command.
3. If we need more details regarding our test we can use 'py.test -v'.
4. If we want to see console logs (which is Printing hello in this example), we have to give -s
   flag in our command, so it will be 'py.test -v -s'.
5. If we want to run a specific test case/file then we have to enter its name in the command,
   like this- 'py.test test_demo1.py -v -s'.
6. If we want to run a group of test methods/function, we have to define them with the same
   partial name. After that we can use the command 'py.test -k 'Greeting' -v -s'.
   for example- check test_demo1.py line-33, test_demo2.py line-5.
   To make a group of tests run we can also use marking, first import pytest then
   mark the test method using '@pytest.mark.first'.
7. To skip a test method we can mark it by using @pytest.mark.skip and then when we run all the
   tests it will get skiped.
8. If we want to run all the test and we know first test method on test_second file is going to
   fail but we don't want it in our report then we can use '@pytest.mark.xfail'
9. file --> conftest.py
'''
# -v = more info /metadata, -s = logs in output, -k = methods name(partial match) execution
# -m = mark tags/only execute those methods which is marked

import pytest

@pytest.mark.first
def test_firstProgram():
    print('Hello')

@pytest.mark.skip
def test_secondProgramGreeting():
    print('Good Morning')
