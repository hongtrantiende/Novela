package defpackage;

import android.content.Intent;
import android.os.Bundle;
import android.os.IInterface;
import java.util.Map;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: yee  reason: default package */
/* loaded from: classes.dex */
public interface yee extends IInterface {
    void beginAdUnitExposure(String str, long j);

    void clearConditionalUserProperty(String str, String str2, Bundle bundle);

    void clearMeasurementEnabled(long j);

    void endAdUnitExposure(String str, long j);

    void generateEventId(hfe hfeVar);

    void getAppInstanceId(hfe hfeVar);

    void getCachedAppInstanceId(hfe hfeVar);

    void getConditionalUserProperties(String str, String str2, hfe hfeVar);

    void getCurrentScreenClass(hfe hfeVar);

    void getCurrentScreenName(hfe hfeVar);

    void getGmpAppId(hfe hfeVar);

    void getMaxUserProperties(String str, hfe hfeVar);

    void getSessionId(hfe hfeVar);

    void getTestFlag(hfe hfeVar, int i);

    void getUserProperties(String str, String str2, boolean z, hfe hfeVar);

    void initForTests(Map map);

    void initialize(yj5 yj5Var, xge xgeVar, long j);

    void initializeWithElapsedTime(yj5 yj5Var, xge xgeVar, long j, long j2);

    void isDataCollectionEnabled(hfe hfeVar);

    void logEvent(String str, String str2, Bundle bundle, boolean z, boolean z2, long j);

    void logEventAndBundle(String str, String str2, Bundle bundle, hfe hfeVar, long j);

    void logEventWithElapsedTime(String str, String str2, Bundle bundle, boolean z, boolean z2, long j, long j2);

    void logHealthData(int i, String str, yj5 yj5Var, yj5 yj5Var2, yj5 yj5Var3);

    void onActivityCreated(yj5 yj5Var, Bundle bundle, long j);

    void onActivityCreatedByScionActivityInfo(ahe aheVar, Bundle bundle, long j);

    void onActivityDestroyed(yj5 yj5Var, long j);

    void onActivityDestroyedByScionActivityInfo(ahe aheVar, long j);

    void onActivityPaused(yj5 yj5Var, long j);

    void onActivityPausedByScionActivityInfo(ahe aheVar, long j);

    void onActivityResumed(yj5 yj5Var, long j);

    void onActivityResumedByScionActivityInfo(ahe aheVar, long j);

    void onActivitySaveInstanceState(yj5 yj5Var, hfe hfeVar, long j);

    void onActivitySaveInstanceStateByScionActivityInfo(ahe aheVar, hfe hfeVar, long j);

    void onActivityStarted(yj5 yj5Var, long j);

    void onActivityStartedByScionActivityInfo(ahe aheVar, long j);

    void onActivityStopped(yj5 yj5Var, long j);

    void onActivityStoppedByScionActivityInfo(ahe aheVar, long j);

    void performAction(Bundle bundle, hfe hfeVar, long j);

    void registerOnMeasurementEventListener(age ageVar);

    void resetAnalyticsData(long j);

    void resetAnalyticsDataWithElapsedTime(long j, long j2);

    void retrieveAndUploadBatches(sfe sfeVar);

    void setConditionalUserProperty(Bundle bundle, long j);

    void setConsent(Bundle bundle, long j);

    void setConsentThirdParty(Bundle bundle, long j);

    void setCurrentScreen(yj5 yj5Var, String str, String str2, long j);

    void setCurrentScreenByScionActivityInfo(ahe aheVar, String str, String str2, long j);

    void setDataCollectionEnabled(boolean z);

    void setDefaultEventParameters(Bundle bundle);

    void setEventInterceptor(age ageVar);

    void setInstanceIdProvider(uge ugeVar);

    void setMeasurementEnabled(boolean z, long j);

    void setMinimumSessionDuration(long j);

    void setSessionTimeoutDuration(long j);

    void setSgtmDebugInfo(Intent intent);

    void setUserId(String str, long j);

    void setUserProperty(String str, String str2, yj5 yj5Var, boolean z, long j);

    void unregisterOnMeasurementEventListener(age ageVar);
}
