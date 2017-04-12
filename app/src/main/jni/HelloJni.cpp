//
// Created by 76dgs02 on 2017/4/11.
//
#include "com_ucpaas_hellojni_HelloJni"
JNIEXPORT jstring JNICALL Java_com_ucpaas_hellojni_HelloJni_getFromCString
  (JNIEnv *, jclass){
  return env->NewStringUTF("I'm from C++ String");
  };

