#include <stdio.h>
#include "jni.h"
#include "Native_Input.h"
JNIEXPORT jboolean JNICALL Java_Native_Input_check(JNIEnv *xx, jobject obj, jint num)
{
  int x, y, sum = 0;
  x = num;
  while (x > 0)
  {
    y = x % 10;
    sum = sum + (y * y * y);
    x = x / 10;
  }
  if (sum == num)
  {
    return 1;
  }
  else
  {
    return 0;
  }
}
