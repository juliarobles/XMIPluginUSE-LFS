/* DO NOT EDIT THIS FILE - it is machine generated */
#include <jni.h>
/* Header for class org_tzi_use_monitor_adapter_clr_CLRAdapter */

#ifndef _Included_org_tzi_use_monitor_adapter_clr_CLRAdapter
#define _Included_org_tzi_use_monitor_adapter_clr_CLRAdapter
#ifdef __cplusplus
extern "C" {
#endif
#undef org_tzi_use_monitor_adapter_clr_CLRAdapter_SETTING_PID
#define org_tzi_use_monitor_adapter_clr_CLRAdapter_SETTING_PID 0L
#undef org_tzi_use_monitor_adapter_clr_CLRAdapter_SETTING_MAXINSTANCES
#define org_tzi_use_monitor_adapter_clr_CLRAdapter_SETTING_MAXINSTANCES 1L
/*
 * Class:     org_tzi_use_monitor_adapter_clr_CLRAdapter
 * Method:    getInstances
 * Signature: (Lorg/tzi/use/plugins/monitor/vm/mm/clr/CLRType;)Ljava/util/Set;
 */
JNIEXPORT jobject JNICALL Java_org_tzi_use_monitor_adapter_clr_CLRAdapter_getInstances
  (JNIEnv *, jobject, jobject);

/*
 * Class:     org_tzi_use_monitor_adapter_clr_CLRAdapter
 * Method:    getCLRType
 * Signature: (Ljava/lang/String;)Lorg/tzi/use/plugins/monitor/vm/mm/clr/CLRType;
 */
JNIEXPORT jobject JNICALL Java_org_tzi_use_monitor_adapter_clr_CLRAdapter_getCLRType
  (JNIEnv *, jobject, jstring);

/*
 * Class:     org_tzi_use_monitor_adapter_clr_CLRAdapter
 * Method:    attachToCLR
 * Signature: (J)I
 */
JNIEXPORT jint JNICALL Java_org_tzi_use_monitor_adapter_clr_CLRAdapter_attachToCLR
  (JNIEnv *, jobject, jlong);

/*
 * Class:     org_tzi_use_monitor_adapter_clr_CLRAdapter
 * Method:    resumeCLR
 * Signature: ()I
 */
JNIEXPORT jint JNICALL Java_org_tzi_use_monitor_adapter_clr_CLRAdapter_resumeCLR
  (JNIEnv *, jobject);

/*
 * Class:     org_tzi_use_monitor_adapter_clr_CLRAdapter
 * Method:    suspendCLR
 * Signature: ()I
 */
JNIEXPORT jint JNICALL Java_org_tzi_use_monitor_adapter_clr_CLRAdapter_suspendCLR
  (JNIEnv *, jobject);

/*
 * Class:     org_tzi_use_monitor_adapter_clr_CLRAdapter
 * Method:    stopCLR
 * Signature: ()I
 */
JNIEXPORT jint JNICALL Java_org_tzi_use_monitor_adapter_clr_CLRAdapter_stopCLR
  (JNIEnv *, jobject);

/*
 * Class:     org_tzi_use_monitor_adapter_clr_CLRAdapter
 * Method:    getFieldByName
 * Signature: (Lorg/tzi/use/plugins/monitor/vm/mm/clr/CLRType;Ljava/lang/String;)Lorg/tzi/use/plugins/monitor/vm/mm/clr/CLRField;
 */
JNIEXPORT jobject JNICALL Java_org_tzi_use_monitor_adapter_clr_CLRAdapter_getFieldByName
  (JNIEnv *, jobject, jobject, jstring);

/*
 * Class:     org_tzi_use_monitor_adapter_clr_CLRAdapter
 * Method:    getWrappedField
 * Signature: (Lorg/tzi/use/plugins/monitor/vm/mm/clr/CLRType;Lorg/tzi/use/plugins/monitor/vm/mm/clr/CLRObject;Lorg/tzi/use/plugins/monitor/vm/mm/clr/CLRField;)Lorg/tzi/use/plugins/monitor/vm/wrap/clr/CLRFieldWrapBase;
 */
JNIEXPORT jobject JNICALL Java_org_tzi_use_monitor_adapter_clr_CLRAdapter_getWrappedField
  (JNIEnv *, jobject, jobject, jobject, jobject);

/*
 * Class:     org_tzi_use_monitor_adapter_clr_CLRAdapter
 * Method:    isCLRAdapterInitialized
 * Signature: ()Z
 */
JNIEXPORT jboolean JNICALL Java_org_tzi_use_monitor_adapter_clr_CLRAdapter_isCLRAdapterInitialized
  (JNIEnv *, jobject);

/*
 * Class:     org_tzi_use_monitor_adapter_clr_CLRAdapter
 * Method:    getNumOfInstances
 * Signature: ()I
 */
JNIEXPORT jint JNICALL Java_org_tzi_use_monitor_adapter_clr_CLRAdapter_getNumOfInstances
  (JNIEnv *, jobject);

/*
 * Class:     org_tzi_use_monitor_adapter_clr_CLRAdapter
 * Method:    getNumOfTypes
 * Signature: ()I
 */
JNIEXPORT jint JNICALL Java_org_tzi_use_monitor_adapter_clr_CLRAdapter_getNumOfTypes
  (JNIEnv *, jobject);

/*
 * Class:     org_tzi_use_monitor_adapter_clr_CLRAdapter
 * Method:    getNumOfModules
 * Signature: ()I
 */
JNIEXPORT jint JNICALL Java_org_tzi_use_monitor_adapter_clr_CLRAdapter_getNumOfModules
  (JNIEnv *, jobject);

#ifdef __cplusplus
}
#endif
#endif
