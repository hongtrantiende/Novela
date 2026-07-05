package defpackage;

import android.os.Bundle;
import android.os.Parcel;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: vee  reason: default package */
/* loaded from: classes.dex */
public final class vee extends ftd implements yee {
    @Override // defpackage.yee
    public final void beginAdUnitExposure(String str, long j) {
        Parcel S = S();
        S.writeString(str);
        S.writeLong(j);
        T(S, 23);
    }

    @Override // defpackage.yee
    public final void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        Parcel S = S();
        S.writeString(str);
        S.writeString(str2);
        wbe.b(S, bundle);
        T(S, 9);
    }

    @Override // defpackage.yee
    public final void endAdUnitExposure(String str, long j) {
        Parcel S = S();
        S.writeString(str);
        S.writeLong(j);
        T(S, 24);
    }

    @Override // defpackage.yee
    public final void generateEventId(hfe hfeVar) {
        Parcel S = S();
        wbe.c(S, hfeVar);
        T(S, 22);
    }

    @Override // defpackage.yee
    public final void getCachedAppInstanceId(hfe hfeVar) {
        Parcel S = S();
        wbe.c(S, hfeVar);
        T(S, 19);
    }

    @Override // defpackage.yee
    public final void getConditionalUserProperties(String str, String str2, hfe hfeVar) {
        Parcel S = S();
        S.writeString(str);
        S.writeString(str2);
        wbe.c(S, hfeVar);
        T(S, 10);
    }

    @Override // defpackage.yee
    public final void getCurrentScreenClass(hfe hfeVar) {
        Parcel S = S();
        wbe.c(S, hfeVar);
        T(S, 17);
    }

    @Override // defpackage.yee
    public final void getCurrentScreenName(hfe hfeVar) {
        Parcel S = S();
        wbe.c(S, hfeVar);
        T(S, 16);
    }

    @Override // defpackage.yee
    public final void getGmpAppId(hfe hfeVar) {
        Parcel S = S();
        wbe.c(S, hfeVar);
        T(S, 21);
    }

    @Override // defpackage.yee
    public final void getMaxUserProperties(String str, hfe hfeVar) {
        Parcel S = S();
        S.writeString(str);
        wbe.c(S, hfeVar);
        T(S, 6);
    }

    @Override // defpackage.yee
    public final void getUserProperties(String str, String str2, boolean z, hfe hfeVar) {
        Parcel S = S();
        S.writeString(str);
        S.writeString(str2);
        ClassLoader classLoader = wbe.a;
        S.writeInt(z ? 1 : 0);
        wbe.c(S, hfeVar);
        T(S, 5);
    }

    @Override // defpackage.yee
    public final void initialize(yj5 yj5Var, xge xgeVar, long j) {
        Parcel S = S();
        wbe.c(S, yj5Var);
        wbe.b(S, xgeVar);
        S.writeLong(j);
        T(S, 1);
    }

    @Override // defpackage.yee
    public final void initializeWithElapsedTime(yj5 yj5Var, xge xgeVar, long j, long j2) {
        Parcel S = S();
        wbe.c(S, yj5Var);
        wbe.b(S, xgeVar);
        S.writeLong(j);
        S.writeLong(j2);
        T(S, 60);
    }

    @Override // defpackage.yee
    public final void logEventWithElapsedTime(String str, String str2, Bundle bundle, boolean z, boolean z2, long j, long j2) {
        Parcel S = S();
        S.writeString(str);
        S.writeString(str2);
        wbe.b(S, bundle);
        S.writeInt(1);
        S.writeInt(1);
        S.writeLong(j);
        S.writeLong(j2);
        T(S, 59);
    }

    @Override // defpackage.yee
    public final void logHealthData(int i, String str, yj5 yj5Var, yj5 yj5Var2, yj5 yj5Var3) {
        Parcel S = S();
        S.writeInt(5);
        S.writeString("Error with data collection. Data lost.");
        wbe.c(S, yj5Var);
        wbe.c(S, yj5Var2);
        wbe.c(S, yj5Var3);
        T(S, 33);
    }

    @Override // defpackage.yee
    public final void onActivityCreatedByScionActivityInfo(ahe aheVar, Bundle bundle, long j) {
        Parcel S = S();
        wbe.b(S, aheVar);
        wbe.b(S, bundle);
        S.writeLong(j);
        T(S, 53);
    }

    @Override // defpackage.yee
    public final void onActivityDestroyedByScionActivityInfo(ahe aheVar, long j) {
        Parcel S = S();
        wbe.b(S, aheVar);
        S.writeLong(j);
        T(S, 54);
    }

    @Override // defpackage.yee
    public final void onActivityPausedByScionActivityInfo(ahe aheVar, long j) {
        Parcel S = S();
        wbe.b(S, aheVar);
        S.writeLong(j);
        T(S, 55);
    }

    @Override // defpackage.yee
    public final void onActivityResumedByScionActivityInfo(ahe aheVar, long j) {
        Parcel S = S();
        wbe.b(S, aheVar);
        S.writeLong(j);
        T(S, 56);
    }

    @Override // defpackage.yee
    public final void onActivitySaveInstanceStateByScionActivityInfo(ahe aheVar, hfe hfeVar, long j) {
        Parcel S = S();
        wbe.b(S, aheVar);
        wbe.c(S, hfeVar);
        S.writeLong(j);
        T(S, 57);
    }

    @Override // defpackage.yee
    public final void onActivityStartedByScionActivityInfo(ahe aheVar, long j) {
        Parcel S = S();
        wbe.b(S, aheVar);
        S.writeLong(j);
        T(S, 51);
    }

    @Override // defpackage.yee
    public final void onActivityStoppedByScionActivityInfo(ahe aheVar, long j) {
        Parcel S = S();
        wbe.b(S, aheVar);
        S.writeLong(j);
        T(S, 52);
    }

    @Override // defpackage.yee
    public final void registerOnMeasurementEventListener(age ageVar) {
        Parcel S = S();
        wbe.c(S, ageVar);
        T(S, 35);
    }

    @Override // defpackage.yee
    public final void retrieveAndUploadBatches(sfe sfeVar) {
        Parcel S = S();
        wbe.c(S, sfeVar);
        T(S, 58);
    }

    @Override // defpackage.yee
    public final void setConditionalUserProperty(Bundle bundle, long j) {
        Parcel S = S();
        wbe.b(S, bundle);
        S.writeLong(j);
        T(S, 8);
    }

    @Override // defpackage.yee
    public final void setCurrentScreenByScionActivityInfo(ahe aheVar, String str, String str2, long j) {
        Parcel S = S();
        wbe.b(S, aheVar);
        S.writeString(str);
        S.writeString(str2);
        S.writeLong(j);
        T(S, 50);
    }

    @Override // defpackage.yee
    public final void setDataCollectionEnabled(boolean z) {
        throw null;
    }

    @Override // defpackage.yee
    public final void setUserId(String str, long j) {
        Parcel S = S();
        S.writeString(str);
        S.writeLong(j);
        T(S, 7);
    }

    @Override // defpackage.yee
    public final void setUserProperty(String str, String str2, yj5 yj5Var, boolean z, long j) {
        Parcel S = S();
        S.writeString("fcm");
        S.writeString("_ln");
        wbe.c(S, yj5Var);
        S.writeInt(1);
        S.writeLong(j);
        T(S, 4);
    }
}
