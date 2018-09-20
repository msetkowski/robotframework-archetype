class PythonKeywordsLibrary:
    ROBOT_LIBRARY_SCOPE = 'TEST CASE'
    __version__ = '0.1'
 
 
    def __init__(self):
        print "Object constructed"
 
 
    def do_calculations(self, arg1, arg2):
        return int(arg1)+int(arg2), int(arg1)*int(arg2)