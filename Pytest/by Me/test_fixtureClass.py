import pytest

@pytest.mark.usefixtures("setup")
class TestFixture:
    def test_fixtureDemo1(self):
        print("I will be executed inside the fixture method.")

    def test_fixtureDemo2(self):
        print("I will be executed inside the fixture method.")

    def test_fixtureDemo3(self):
        print("I will be executed inside the fixture method.")

    def test_fixtureDemo4(self):
        print("I will be executed inside the fixture method.")
