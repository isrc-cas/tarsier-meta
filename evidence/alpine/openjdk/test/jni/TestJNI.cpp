#include "JNITest.h"
#include <iostream>

JNIEXPORT void JNICALL Java_JNITest_testHello
  (JNIEnv *, jobject) {
      std::cout << "this is C++ print" << std::endl;
}
