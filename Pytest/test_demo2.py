import pytest

@pytest.mark.first
def test_firstProgramAssert():
    msg = "hello"
    assert msg == "hi", "Test Fail: Strings doesn't match"

@pytest.mark.xfail
def test_secondGreeting():
    print('hey i ran')
    assert 1==2