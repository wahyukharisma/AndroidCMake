#include <jni.h>
#include <string>

std::string getKey() {
    std::string app_secret = "my_secret_keys";
    return app_secret;
}

extern "C" jstring
Java_id_wahyukharisma_adroidcmake_MainActivity_getKey(
        JNIEnv *env,
        jobject) {
    std::string app_keys = getKey();
    return env->NewStringUTF(app_keys.c_str());
}