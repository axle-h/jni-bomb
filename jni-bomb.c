#include <jni.h>
 
JNIEXPORT void JNICALL Java_JniBomb_sayHello (JNIEnv *env, jobject thisObj) {
    printf("Hello World!\n");
    return;
}

JNIEXPORT void JNICALL Java_JniBomb_doBadStuff (JNIEnv *env, jobject thisObj) {
    int * crash = NULL;
    *crash = 1; // use after free argggghhhhh.
    return;
}
