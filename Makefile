build: jni-bomb.c JniBomb.java
	gcc -shared -I"$$JAVA_HOME/include" -I"$$JAVA_HOME/include/linux" -o libjni-bomb.so -fPIC jni-bomb.c
	javac JniBomb.java

clean:
	-rm -f *.so
	-rm -f *.class
