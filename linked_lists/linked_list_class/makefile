test: test.o
	g++ -o test test.o
test.o: test.cpp node.h
	g++ -c test.cpp node.h
clean:
	rm test *.o
