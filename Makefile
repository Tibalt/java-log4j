JCC ?= javac
JFLAGS ?= -g -verbose

all: ./HelloWorld.java
	$(JCC) $(JFLAGS) -cp "./:./*" HelloWorld.java 

    
clean:
	rm -f HelloWorld.class 
