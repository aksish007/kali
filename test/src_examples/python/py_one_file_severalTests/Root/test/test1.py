from Root import application
import unittest
class test1(unittest.TestCase):
	def test_one(self):
		self.assertEqual(application.foo(),1)
	def test_two(self):
		self.assertEqual(application.foo(),2)
	def test_three(self):
		self.assertEqual(application.foo(),1)
if __name__ == '__main__':
	unittest.main()
