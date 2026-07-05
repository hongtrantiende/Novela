package com.google.android.gms.measurement.internal;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes.dex */
public class AppMeasurementDynamiteService extends xee {
    public lte a;
    public final yz b;

    /* JADX WARN: Type inference failed for: r0v2, types: [yz, jla] */
    public AppMeasurementDynamiteService() {
        super("com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
        this.a = null;
        this.b = new jla(0);
    }

    @Override // defpackage.yee
    public void beginAdUnitExposure(String str, long j) {
        e();
        gge ggeVar = this.a.J;
        lte.j(ggeVar);
        ggeVar.Y(j, str);
    }

    @Override // defpackage.yee
    public void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        e();
        yze yzeVar = this.a.I;
        lte.l(yzeVar);
        yzeVar.l0(str, str2, bundle);
    }

    @Override // defpackage.yee
    public void clearMeasurementEnabled(long j) {
        e();
        yze yzeVar = this.a.I;
        lte.l(yzeVar);
        yzeVar.Y();
        ete eteVar = ((lte) yzeVar.a).C;
        lte.m(eteVar);
        eteVar.g0(new bv4(yzeVar, false, null, 25));
    }

    public final void e() {
        if (this.a != null) {
            return;
        }
        vs.k("Attempting to perform action before initialize.");
    }

    @Override // defpackage.yee
    public void endAdUnitExposure(String str, long j) {
        e();
        gge ggeVar = this.a.J;
        lte.j(ggeVar);
        ggeVar.Z(j, str);
    }

    public final void f(String str, hfe hfeVar) {
        e();
        l6f l6fVar = this.a.E;
        lte.k(l6fVar);
        l6fVar.L0(str, hfeVar);
    }

    @Override // defpackage.yee
    public void generateEventId(hfe hfeVar) {
        e();
        l6f l6fVar = this.a.E;
        lte.k(l6fVar);
        long W0 = l6fVar.W0();
        e();
        l6f l6fVar2 = this.a.E;
        lte.k(l6fVar2);
        l6fVar2.M0(hfeVar, W0);
    }

    @Override // defpackage.yee
    public void getAppInstanceId(hfe hfeVar) {
        e();
        ete eteVar = this.a.C;
        lte.m(eteVar);
        eteVar.g0(new fte(this, hfeVar, 0));
    }

    @Override // defpackage.yee
    public void getCachedAppInstanceId(hfe hfeVar) {
        e();
        yze yzeVar = this.a.I;
        lte.l(yzeVar);
        f((String) yzeVar.C.get(), hfeVar);
    }

    @Override // defpackage.yee
    public void getConditionalUserProperties(String str, String str2, hfe hfeVar) {
        e();
        ete eteVar = this.a.C;
        lte.m(eteVar);
        eteVar.g0(new sid(this, hfeVar, str, str2, 8, false));
    }

    @Override // defpackage.yee
    public void getCurrentScreenClass(hfe hfeVar) {
        String str;
        e();
        yze yzeVar = this.a.I;
        lte.l(yzeVar);
        b1f b1fVar = ((lte) yzeVar.a).H;
        lte.l(b1fVar);
        s0f s0fVar = b1fVar.c;
        if (s0fVar != null) {
            str = s0fVar.b;
        } else {
            str = null;
        }
        f(str, hfeVar);
    }

    @Override // defpackage.yee
    public void getCurrentScreenName(hfe hfeVar) {
        String str;
        e();
        yze yzeVar = this.a.I;
        lte.l(yzeVar);
        b1f b1fVar = ((lte) yzeVar.a).H;
        lte.l(b1fVar);
        s0f s0fVar = b1fVar.c;
        if (s0fVar != null) {
            str = s0fVar.a;
        } else {
            str = null;
        }
        f(str, hfeVar);
    }

    @Override // defpackage.yee
    public void getGmpAppId(hfe hfeVar) {
        e();
        yze yzeVar = this.a.I;
        lte.l(yzeVar);
        f(yzeVar.m0(), hfeVar);
    }

    @Override // defpackage.yee
    public void getMaxUserProperties(String str, hfe hfeVar) {
        e();
        yze yzeVar = this.a.I;
        lte.l(yzeVar);
        am8.p(str);
        ((lte) yzeVar.a).getClass();
        e();
        l6f l6fVar = this.a.E;
        lte.k(l6fVar);
        l6fVar.N0(hfeVar, 25);
    }

    @Override // defpackage.yee
    public void getSessionId(hfe hfeVar) {
        e();
        yze yzeVar = this.a.I;
        lte.l(yzeVar);
        ete eteVar = ((lte) yzeVar.a).C;
        lte.m(eteVar);
        eteVar.g0(new bv4(yzeVar, hfeVar));
    }

    @Override // defpackage.yee
    public void getTestFlag(hfe hfeVar, int i) {
        e();
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            return;
                        }
                        l6f l6fVar = this.a.E;
                        lte.k(l6fVar);
                        yze yzeVar = this.a.I;
                        lte.l(yzeVar);
                        AtomicReference atomicReference = new AtomicReference();
                        ete eteVar = ((lte) yzeVar.a).C;
                        lte.m(eteVar);
                        l6fVar.P0(hfeVar, ((Boolean) eteVar.h0(atomicReference, 15000L, "boolean test flag value", new sxe(yzeVar, atomicReference, 0))).booleanValue());
                        return;
                    }
                    l6f l6fVar2 = this.a.E;
                    lte.k(l6fVar2);
                    yze yzeVar2 = this.a.I;
                    lte.l(yzeVar2);
                    AtomicReference atomicReference2 = new AtomicReference();
                    ete eteVar2 = ((lte) yzeVar2.a).C;
                    lte.m(eteVar2);
                    l6fVar2.N0(hfeVar, ((Integer) eteVar2.h0(atomicReference2, 15000L, "int test flag value", new sxe(yzeVar2, atomicReference2, 3))).intValue());
                    return;
                }
                l6f l6fVar3 = this.a.E;
                lte.k(l6fVar3);
                yze yzeVar3 = this.a.I;
                lte.l(yzeVar3);
                AtomicReference atomicReference3 = new AtomicReference();
                ete eteVar3 = ((lte) yzeVar3.a).C;
                lte.m(eteVar3);
                double doubleValue = ((Double) eteVar3.h0(atomicReference3, 15000L, "double test flag value", new sxe(yzeVar3, atomicReference3, 4))).doubleValue();
                Bundle bundle = new Bundle();
                bundle.putDouble("r", doubleValue);
                try {
                    hfeVar.D(bundle);
                    return;
                } catch (RemoteException e) {
                    ppe ppeVar = ((lte) l6fVar3.a).f;
                    lte.m(ppeVar);
                    ppeVar.E.f(e, "Error returning double value to wrapper");
                    return;
                }
            }
            l6f l6fVar4 = this.a.E;
            lte.k(l6fVar4);
            yze yzeVar4 = this.a.I;
            lte.l(yzeVar4);
            AtomicReference atomicReference4 = new AtomicReference();
            ete eteVar4 = ((lte) yzeVar4.a).C;
            lte.m(eteVar4);
            l6fVar4.M0(hfeVar, ((Long) eteVar4.h0(atomicReference4, 15000L, "long test flag value", new sxe(yzeVar4, atomicReference4, 2))).longValue());
            return;
        }
        l6f l6fVar5 = this.a.E;
        lte.k(l6fVar5);
        yze yzeVar5 = this.a.I;
        lte.l(yzeVar5);
        AtomicReference atomicReference5 = new AtomicReference();
        ete eteVar5 = ((lte) yzeVar5.a).C;
        lte.m(eteVar5);
        l6fVar5.L0((String) eteVar5.h0(atomicReference5, 15000L, "String test flag value", new sxe(yzeVar5, atomicReference5, 1)), hfeVar);
    }

    @Override // defpackage.yee
    public void getUserProperties(String str, String str2, boolean z, hfe hfeVar) {
        e();
        ete eteVar = this.a.C;
        lte.m(eteVar);
        eteVar.g0(new gne(this, hfeVar, str, str2, z));
    }

    @Override // defpackage.yee
    public void initForTests(Map map) {
        e();
    }

    @Override // defpackage.yee
    public void initialize(yj5 yj5Var, xge xgeVar, long j) {
        lte lteVar = this.a;
        if (lteVar == null) {
            Context context = (Context) n78.U(yj5Var);
            am8.s(context);
            this.a = lte.s(context, xgeVar, Long.valueOf(j), null);
            return;
        }
        ppe ppeVar = lteVar.f;
        lte.m(ppeVar);
        ppeVar.E.e("Attempting to initialize multiple times");
    }

    @Override // defpackage.yee
    public void initializeWithElapsedTime(yj5 yj5Var, xge xgeVar, long j, long j2) {
        lte lteVar = this.a;
        if (lteVar == null) {
            Context context = (Context) n78.U(yj5Var);
            am8.s(context);
            this.a = lte.s(context, xgeVar, Long.valueOf(j), Long.valueOf(j2));
            return;
        }
        ppe ppeVar = lteVar.f;
        lte.m(ppeVar);
        ppeVar.E.e("Attempting to initialize multiple times");
    }

    @Override // defpackage.yee
    public void isDataCollectionEnabled(hfe hfeVar) {
        e();
        ete eteVar = this.a.C;
        lte.m(eteVar);
        eteVar.g0(new fte(this, hfeVar, 1));
    }

    @Override // defpackage.yee
    public void logEvent(String str, String str2, Bundle bundle, boolean z, boolean z2, long j) {
        e();
        yze yzeVar = this.a.I;
        lte.l(yzeVar);
        yzeVar.c0(str, str2, bundle, z, z2, j, 0L);
    }

    @Override // defpackage.yee
    public void logEventAndBundle(String str, String str2, Bundle bundle, hfe hfeVar, long j) {
        String str3;
        Bundle bundle2;
        e();
        am8.p(str2);
        if (true != this.a.d.i0(null, yme.f1)) {
            str3 = "app";
        } else {
            str3 = "auto";
        }
        String str4 = str3;
        if (bundle != null) {
            bundle2 = new Bundle(bundle);
        } else {
            bundle2 = new Bundle();
        }
        bundle2.putString("_o", str4);
        ibe ibeVar = new ibe(str2, new dbe(bundle), str4, j, 0L);
        ete eteVar = this.a.C;
        lte.m(eteVar);
        eteVar.g0(new sid(this, hfeVar, ibeVar, str, 2, false));
    }

    @Override // defpackage.yee
    public void logEventWithElapsedTime(String str, String str2, Bundle bundle, boolean z, boolean z2, long j, long j2) {
        e();
        yze yzeVar = this.a.I;
        lte.l(yzeVar);
        yzeVar.c0(str, str2, bundle, z, z2, j, j2);
    }

    @Override // defpackage.yee
    public void logHealthData(int i, String str, yj5 yj5Var, yj5 yj5Var2, yj5 yj5Var3) {
        Object U;
        Object U2;
        e();
        Object obj = null;
        if (yj5Var == null) {
            U = null;
        } else {
            U = n78.U(yj5Var);
        }
        if (yj5Var2 == null) {
            U2 = null;
        } else {
            U2 = n78.U(yj5Var2);
        }
        if (yj5Var3 != null) {
            obj = n78.U(yj5Var3);
        }
        Object obj2 = obj;
        ppe ppeVar = this.a.f;
        lte.m(ppeVar);
        ppeVar.g0(i, true, false, str, U, U2, obj2);
    }

    @Override // defpackage.yee
    public void onActivityCreated(yj5 yj5Var, Bundle bundle, long j) {
        e();
        Activity activity = (Activity) n78.U(yj5Var);
        am8.s(activity);
        onActivityCreatedByScionActivityInfo(ahe.c(activity), bundle, j);
    }

    @Override // defpackage.yee
    public void onActivityCreatedByScionActivityInfo(ahe aheVar, Bundle bundle, long j) {
        e();
        yze yzeVar = this.a.I;
        lte.l(yzeVar);
        gb4 gb4Var = yzeVar.c;
        if (gb4Var != null) {
            yze yzeVar2 = this.a.I;
            lte.l(yzeVar2);
            yzeVar2.q0();
            gb4Var.j(aheVar, bundle);
        }
    }

    @Override // defpackage.yee
    public void onActivityDestroyed(yj5 yj5Var, long j) {
        e();
        Activity activity = (Activity) n78.U(yj5Var);
        am8.s(activity);
        onActivityDestroyedByScionActivityInfo(ahe.c(activity), j);
    }

    @Override // defpackage.yee
    public void onActivityDestroyedByScionActivityInfo(ahe aheVar, long j) {
        e();
        yze yzeVar = this.a.I;
        lte.l(yzeVar);
        gb4 gb4Var = yzeVar.c;
        if (gb4Var != null) {
            yze yzeVar2 = this.a.I;
            lte.l(yzeVar2);
            yzeVar2.q0();
            gb4Var.k(aheVar);
        }
    }

    @Override // defpackage.yee
    public void onActivityPaused(yj5 yj5Var, long j) {
        e();
        Activity activity = (Activity) n78.U(yj5Var);
        am8.s(activity);
        onActivityPausedByScionActivityInfo(ahe.c(activity), j);
    }

    @Override // defpackage.yee
    public void onActivityPausedByScionActivityInfo(ahe aheVar, long j) {
        e();
        yze yzeVar = this.a.I;
        lte.l(yzeVar);
        gb4 gb4Var = yzeVar.c;
        if (gb4Var != null) {
            yze yzeVar2 = this.a.I;
            lte.l(yzeVar2);
            yzeVar2.q0();
            gb4Var.l(aheVar);
        }
    }

    @Override // defpackage.yee
    public void onActivityResumed(yj5 yj5Var, long j) {
        e();
        Activity activity = (Activity) n78.U(yj5Var);
        am8.s(activity);
        onActivityResumedByScionActivityInfo(ahe.c(activity), j);
    }

    @Override // defpackage.yee
    public void onActivityResumedByScionActivityInfo(ahe aheVar, long j) {
        e();
        yze yzeVar = this.a.I;
        lte.l(yzeVar);
        gb4 gb4Var = yzeVar.c;
        if (gb4Var != null) {
            yze yzeVar2 = this.a.I;
            lte.l(yzeVar2);
            yzeVar2.q0();
            gb4Var.m(aheVar);
        }
    }

    @Override // defpackage.yee
    public void onActivitySaveInstanceState(yj5 yj5Var, hfe hfeVar, long j) {
        e();
        Activity activity = (Activity) n78.U(yj5Var);
        am8.s(activity);
        onActivitySaveInstanceStateByScionActivityInfo(ahe.c(activity), hfeVar, j);
    }

    @Override // defpackage.yee
    public void onActivitySaveInstanceStateByScionActivityInfo(ahe aheVar, hfe hfeVar, long j) {
        e();
        yze yzeVar = this.a.I;
        lte.l(yzeVar);
        gb4 gb4Var = yzeVar.c;
        Bundle bundle = new Bundle();
        if (gb4Var != null) {
            yze yzeVar2 = this.a.I;
            lte.l(yzeVar2);
            yzeVar2.q0();
            gb4Var.n(aheVar, bundle);
        }
        try {
            hfeVar.D(bundle);
        } catch (RemoteException e) {
            ppe ppeVar = this.a.f;
            lte.m(ppeVar);
            ppeVar.E.f(e, "Error returning bundle value to wrapper");
        }
    }

    @Override // defpackage.yee
    public void onActivityStarted(yj5 yj5Var, long j) {
        e();
        Activity activity = (Activity) n78.U(yj5Var);
        am8.s(activity);
        onActivityStartedByScionActivityInfo(ahe.c(activity), j);
    }

    @Override // defpackage.yee
    public void onActivityStartedByScionActivityInfo(ahe aheVar, long j) {
        e();
        yze yzeVar = this.a.I;
        lte.l(yzeVar);
        if (yzeVar.c != null) {
            yze yzeVar2 = this.a.I;
            lte.l(yzeVar2);
            yzeVar2.q0();
        }
    }

    @Override // defpackage.yee
    public void onActivityStopped(yj5 yj5Var, long j) {
        e();
        Activity activity = (Activity) n78.U(yj5Var);
        am8.s(activity);
        onActivityStoppedByScionActivityInfo(ahe.c(activity), j);
    }

    @Override // defpackage.yee
    public void onActivityStoppedByScionActivityInfo(ahe aheVar, long j) {
        e();
        yze yzeVar = this.a.I;
        lte.l(yzeVar);
        if (yzeVar.c != null) {
            yze yzeVar2 = this.a.I;
            lte.l(yzeVar2);
            yzeVar2.q0();
        }
    }

    @Override // defpackage.yee
    public void performAction(Bundle bundle, hfe hfeVar, long j) {
        e();
        hfeVar.D(null);
    }

    @Override // defpackage.yee
    public void registerOnMeasurementEventListener(age ageVar) {
        Object obj;
        e();
        yz yzVar = this.b;
        synchronized (yzVar) {
            try {
                obj = (rwe) yzVar.get(Integer.valueOf(ageVar.zzf()));
                if (obj == null) {
                    obj = new a7f(this, ageVar);
                    yzVar.put(Integer.valueOf(ageVar.zzf()), obj);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        yze yzeVar = this.a.I;
        lte.l(yzeVar);
        yzeVar.Y();
        if (!yzeVar.e.add(obj)) {
            ppe ppeVar = ((lte) yzeVar.a).f;
            lte.m(ppeVar);
            ppeVar.E.e("OnEventListener already registered");
        }
    }

    @Override // defpackage.yee
    @Deprecated
    public void resetAnalyticsData(long j) {
        e();
        yze yzeVar = this.a.I;
        lte.l(yzeVar);
        yzeVar.C.set(null);
        ete eteVar = ((lte) yzeVar.a).C;
        lte.m(eteVar);
        eteVar.g0(new oxe(yzeVar, j, 1));
    }

    @Override // defpackage.yee
    public void resetAnalyticsDataWithElapsedTime(long j, long j2) {
        e();
        yze yzeVar = this.a.I;
        lte.l(yzeVar);
        yzeVar.C.set(null);
        ete eteVar = ((lte) yzeVar.a).C;
        lte.m(eteVar);
        eteVar.g0(new oxe(yzeVar, j, 1));
    }

    @Override // defpackage.yee
    public void retrieveAndUploadBatches(sfe sfeVar) {
        int i;
        m0f m0fVar;
        e();
        yze yzeVar = this.a.I;
        lte.l(yzeVar);
        yzeVar.Y();
        lte lteVar = (lte) yzeVar.a;
        ete eteVar = lteVar.C;
        lte.m(eteVar);
        if (!eteVar.d0()) {
            ete eteVar2 = lteVar.C;
            lte.m(eteVar2);
            if (Thread.currentThread() == eteVar2.d) {
                ppe ppeVar = lteVar.f;
                lte.m(ppeVar);
                ppeVar.f.e("Cannot retrieve and upload batches from analytics network thread");
                return;
            }
            boolean b = jf8.b();
            ppe ppeVar2 = lteVar.f;
            if (!b) {
                lte.m(ppeVar2);
                ppeVar2.J.e("[sgtm] Started client-side batch upload work.");
                boolean z = false;
                boolean z2 = false;
                int i2 = 0;
                int i3 = 0;
                while (!z2) {
                    ppe ppeVar3 = lteVar.f;
                    lte.m(ppeVar3);
                    ppeVar3.J.e("[sgtm] Getting upload batches from service (FE)");
                    AtomicReference atomicReference = new AtomicReference();
                    ete eteVar3 = lteVar.C;
                    lte.m(eteVar3);
                    eteVar3.h0(atomicReference, 10000L, "[sgtm] Getting upload batches", new sxe(yzeVar, atomicReference, 6, z));
                    d5f d5fVar = (d5f) atomicReference.get();
                    if (d5fVar == null) {
                        break;
                    }
                    List list = d5fVar.a;
                    if (list.isEmpty()) {
                        break;
                    }
                    ppe ppeVar4 = lteVar.f;
                    lte.m(ppeVar4);
                    ppeVar4.J.f(Integer.valueOf(list.size()), "[sgtm] Retrieved upload batches. count");
                    i2 += list.size();
                    Iterator it = list.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            w4f w4fVar = (w4f) it.next();
                            try {
                                URL url = new URI(w4fVar.c).toURL();
                                AtomicReference atomicReference2 = new AtomicReference();
                                joe r = ((lte) yzeVar.a).r();
                                r.Y();
                                am8.s(r.C);
                                String str = r.C;
                                lte lteVar2 = (lte) yzeVar.a;
                                ppe ppeVar5 = lteVar2.f;
                                lte.m(ppeVar5);
                                s56 s56Var = ppeVar5.J;
                                i = i2;
                                Long valueOf = Long.valueOf(w4fVar.a);
                                s56Var.h("[sgtm] Uploading data from app. row_id, url, uncompressed size", valueOf, w4fVar.c, Integer.valueOf(w4fVar.b.length));
                                if (!TextUtils.isEmpty(w4fVar.C)) {
                                    ppe ppeVar6 = lteVar2.f;
                                    lte.m(ppeVar6);
                                    ppeVar6.J.g(valueOf, w4fVar.C, "[sgtm] Uploading data from app. row_id");
                                }
                                HashMap hashMap = new HashMap();
                                Bundle bundle = w4fVar.d;
                                for (String str2 : bundle.keySet()) {
                                    String string = bundle.getString(str2);
                                    if (!TextUtils.isEmpty(string)) {
                                        hashMap.put(str2, string);
                                    }
                                }
                                h0f h0fVar = lteVar2.K;
                                lte.m(h0fVar);
                                byte[] bArr = w4fVar.b;
                                jje jjeVar = new jje(yzeVar, atomicReference2, w4fVar, 6);
                                h0fVar.Z();
                                am8.s(url);
                                am8.s(bArr);
                                ete eteVar4 = ((lte) h0fVar.a).C;
                                lte.m(eteVar4);
                                eteVar4.j0(new aqe(h0fVar, str, url, bArr, hashMap, jjeVar));
                                try {
                                    l6f l6fVar = lteVar2.E;
                                    lte.k(l6fVar);
                                    lte lteVar3 = (lte) l6fVar.a;
                                    lteVar3.G.getClass();
                                    long currentTimeMillis = System.currentTimeMillis() + 60000;
                                    synchronized (atomicReference2) {
                                        for (long j = 60000; atomicReference2.get() == null && j > 0; j = currentTimeMillis - System.currentTimeMillis()) {
                                            atomicReference2.wait(j);
                                            lteVar3.G.getClass();
                                        }
                                    }
                                } catch (InterruptedException unused) {
                                    ppe ppeVar7 = ((lte) yzeVar.a).f;
                                    lte.m(ppeVar7);
                                    ppeVar7.E.e("[sgtm] Interrupted waiting for uploading batch");
                                }
                                if (atomicReference2.get() == null) {
                                    m0fVar = m0f.UNKNOWN;
                                } else {
                                    m0fVar = (m0f) atomicReference2.get();
                                }
                            } catch (MalformedURLException | URISyntaxException e) {
                                i = i2;
                                ppe ppeVar8 = ((lte) yzeVar.a).f;
                                lte.m(ppeVar8);
                                ppeVar8.f.h("[sgtm] Bad upload url for row_id", w4fVar.c, Long.valueOf(w4fVar.a), e);
                                m0fVar = m0f.FAILURE;
                            }
                            if (m0fVar == m0f.SUCCESS) {
                                i3++;
                            } else if (m0fVar == m0f.BACKOFF) {
                                z2 = true;
                                i2 = i;
                                break;
                            }
                            i2 = i;
                        } else {
                            z2 = false;
                            break;
                        }
                    }
                    z = false;
                }
                ppe ppeVar9 = lteVar.f;
                lte.m(ppeVar9);
                ppeVar9.J.g(Integer.valueOf(i2), Integer.valueOf(i3), "[sgtm] Completed client-side batch upload work. total, success");
                try {
                    sfeVar.zze();
                    return;
                } catch (RemoteException e2) {
                    lte lteVar4 = this.a;
                    am8.s(lteVar4);
                    ppe ppeVar10 = lteVar4.f;
                    lte.m(ppeVar10);
                    ppeVar10.E.f(e2, "Failed to call IDynamiteUploadBatchesCallback");
                    return;
                }
            }
            lte.m(ppeVar2);
            ppeVar2.f.e("Cannot retrieve and upload batches from main thread");
            return;
        }
        ppe ppeVar11 = lteVar.f;
        lte.m(ppeVar11);
        ppeVar11.f.e("Cannot retrieve and upload batches from analytics worker thread");
    }

    @Override // defpackage.yee
    public void setConditionalUserProperty(Bundle bundle, long j) {
        e();
        lte lteVar = this.a;
        if (bundle == null) {
            ppe ppeVar = lteVar.f;
            lte.m(ppeVar);
            ppeVar.f.e("Conditional user property must not be null");
            return;
        }
        yze yzeVar = lteVar.I;
        lte.l(yzeVar);
        yzeVar.k0(bundle, j);
    }

    @Override // defpackage.yee
    public void setConsentThirdParty(Bundle bundle, long j) {
        e();
        yze yzeVar = this.a.I;
        lte.l(yzeVar);
        yzeVar.r0(bundle, -20, j);
    }

    @Override // defpackage.yee
    public void setCurrentScreen(yj5 yj5Var, String str, String str2, long j) {
        e();
        Activity activity = (Activity) n78.U(yj5Var);
        am8.s(activity);
        setCurrentScreenByScionActivityInfo(ahe.c(activity), str, str2, j);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0087, code lost:
        if (r2 > 500) goto L27;
     */
    @Override // defpackage.yee
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void setCurrentScreenByScionActivityInfo(defpackage.ahe r5, java.lang.String r6, java.lang.String r7, long r8) {
        /*
            r4 = this;
            r4.e()
            lte r4 = r4.a
            b1f r4 = r4.H
            defpackage.lte.l(r4)
            java.lang.Object r8 = r4.a
            lte r8 = (defpackage.lte) r8
            t7e r9 = r8.d
            boolean r9 = r9.m0()
            if (r9 != 0) goto L23
            ppe r4 = r8.f
            defpackage.lte.m(r4)
            s56 r4 = r4.G
            java.lang.String r5 = "setCurrentScreen cannot be called while screen reporting is disabled."
            r4.e(r5)
            return
        L23:
            s0f r9 = r4.c
            if (r9 != 0) goto L34
            ppe r4 = r8.f
            defpackage.lte.m(r4)
            s56 r4 = r4.G
            java.lang.String r5 = "setCurrentScreen cannot be called while no activity active"
            r4.e(r5)
            return
        L34:
            java.util.concurrent.ConcurrentHashMap r0 = r4.f
            int r1 = r5.a
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Object r2 = r0.get(r1)
            if (r2 != 0) goto L4f
            ppe r4 = r8.f
            defpackage.lte.m(r4)
            s56 r4 = r4.G
            java.lang.String r5 = "setCurrentScreen must be called with an activity in the activity lifecycle"
            r4.e(r5)
            return
        L4f:
            if (r7 != 0) goto L57
            java.lang.String r7 = r5.b
            java.lang.String r7 = r4.c0(r7)
        L57:
            java.lang.String r2 = r9.b
            java.lang.String r9 = r9.a
            boolean r2 = java.util.Objects.equals(r2, r7)
            boolean r9 = java.util.Objects.equals(r9, r6)
            if (r2 == 0) goto L74
            if (r9 == 0) goto L74
            ppe r4 = r8.f
            defpackage.lte.m(r4)
            s56 r4 = r4.G
            java.lang.String r5 = "setCurrentScreen cannot be called with the same class and name"
            r4.e(r5)
            return
        L74:
            r9 = 500(0x1f4, float:7.0E-43)
            if (r6 == 0) goto L9e
            int r2 = r6.length()
            if (r2 <= 0) goto L89
            int r2 = r6.length()
            t7e r3 = r8.d
            r3.getClass()
            if (r2 <= r9) goto L9e
        L89:
            ppe r4 = r8.f
            defpackage.lte.m(r4)
            s56 r4 = r4.G
            int r5 = r6.length()
            java.lang.String r6 = "Invalid screen name length in setCurrentScreen. Length"
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r4.f(r5, r6)
            return
        L9e:
            int r2 = r7.length()
            if (r2 <= 0) goto Lda
            int r2 = r7.length()
            t7e r3 = r8.d
            r3.getClass()
            if (r2 <= r9) goto Lb0
            goto Lda
        Lb0:
            ppe r9 = r8.f
            defpackage.lte.m(r9)
            s56 r9 = r9.J
            if (r6 != 0) goto Lbc
            java.lang.String r2 = "null"
            goto Lbd
        Lbc:
            r2 = r6
        Lbd:
            java.lang.String r3 = "Setting current screen to name, class"
            r9.g(r2, r7, r3)
            s0f r9 = new s0f
            l6f r8 = r8.E
            defpackage.lte.k(r8)
            long r2 = r8.W0()
            r9.<init>(r2, r6, r7)
            r0.put(r1, r9)
            java.lang.String r5 = r5.b
            r6 = 1
            r4.f0(r5, r9, r6)
            return
        Lda:
            ppe r4 = r8.f
            defpackage.lte.m(r4)
            s56 r4 = r4.G
            int r5 = r7.length()
            java.lang.String r6 = "Invalid class name length in setCurrentScreen. Length"
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r4.f(r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.AppMeasurementDynamiteService.setCurrentScreenByScionActivityInfo(ahe, java.lang.String, java.lang.String, long):void");
    }

    @Override // defpackage.yee
    public void setDataCollectionEnabled(boolean z) {
        e();
        yze yzeVar = this.a.I;
        lte.l(yzeVar);
        yzeVar.Y();
        ete eteVar = ((lte) yzeVar.a).C;
        lte.m(eteVar);
        eteVar.g0(new h00(yzeVar, z));
    }

    @Override // defpackage.yee
    public void setDefaultEventParameters(Bundle bundle) {
        Bundle bundle2;
        e();
        yze yzeVar = this.a.I;
        lte.l(yzeVar);
        if (bundle == null) {
            bundle2 = new Bundle();
        } else {
            bundle2 = new Bundle(bundle);
        }
        ete eteVar = ((lte) yzeVar.a).C;
        lte.m(eteVar);
        eteVar.g0(new bye(yzeVar, bundle2, 2));
    }

    @Override // defpackage.yee
    public void setEventInterceptor(age ageVar) {
        e();
        boolean z = false;
        rwa rwaVar = new rwa(this, false, ageVar, 27);
        ete eteVar = this.a.C;
        lte.m(eteVar);
        boolean d0 = eteVar.d0();
        lte lteVar = this.a;
        if (d0) {
            yze yzeVar = lteVar.I;
            lte.l(yzeVar);
            yzeVar.W();
            yzeVar.Y();
            rwa rwaVar2 = yzeVar.d;
            if (rwaVar != rwaVar2) {
                if (rwaVar2 == null) {
                    z = true;
                }
                am8.u("EventInterceptor already set.", z);
            }
            yzeVar.d = rwaVar;
            return;
        }
        ete eteVar2 = lteVar.C;
        lte.m(eteVar2);
        eteVar2.g0(new bv4(this, false, rwaVar, 27));
    }

    @Override // defpackage.yee
    public void setInstanceIdProvider(uge ugeVar) {
        e();
    }

    @Override // defpackage.yee
    public void setMeasurementEnabled(boolean z, long j) {
        e();
        yze yzeVar = this.a.I;
        lte.l(yzeVar);
        Boolean valueOf = Boolean.valueOf(z);
        yzeVar.Y();
        ete eteVar = ((lte) yzeVar.a).C;
        lte.m(eteVar);
        eteVar.g0(new bv4(yzeVar, false, valueOf, 25));
    }

    @Override // defpackage.yee
    public void setMinimumSessionDuration(long j) {
        e();
    }

    @Override // defpackage.yee
    public void setSessionTimeoutDuration(long j) {
        e();
        yze yzeVar = this.a.I;
        lte.l(yzeVar);
        ete eteVar = ((lte) yzeVar.a).C;
        lte.m(eteVar);
        eteVar.g0(new oxe(yzeVar, j, 0));
    }

    @Override // defpackage.yee
    public void setSgtmDebugInfo(Intent intent) {
        e();
        yze yzeVar = this.a.I;
        lte.l(yzeVar);
        lte lteVar = (lte) yzeVar.a;
        Uri data = intent.getData();
        if (data == null) {
            ppe ppeVar = lteVar.f;
            lte.m(ppeVar);
            ppeVar.H.e("Activity intent has no data. Preview Mode was not enabled.");
            return;
        }
        String queryParameter = data.getQueryParameter("sgtm_debug_enable");
        if (queryParameter != null && queryParameter.equals("1")) {
            String queryParameter2 = data.getQueryParameter("sgtm_preview_key");
            if (!TextUtils.isEmpty(queryParameter2)) {
                ppe ppeVar2 = lteVar.f;
                lte.m(ppeVar2);
                ppeVar2.H.f(queryParameter2, "[sgtm] Preview Mode was enabled. Using the sgtmPreviewKey: ");
                lteVar.d.c = queryParameter2;
                return;
            }
            return;
        }
        ppe ppeVar3 = lteVar.f;
        lte.m(ppeVar3);
        ppeVar3.H.e("[sgtm] Preview Mode was not enabled.");
        lteVar.d.c = null;
    }

    @Override // defpackage.yee
    public void setUserId(String str, long j) {
        e();
        yze yzeVar = this.a.I;
        lte.l(yzeVar);
        lte lteVar = (lte) yzeVar.a;
        if (str != null && TextUtils.isEmpty(str)) {
            ppe ppeVar = lteVar.f;
            lte.m(ppeVar);
            ppeVar.E.e("User ID must be non-empty or null");
            return;
        }
        ete eteVar = lteVar.C;
        lte.m(eteVar);
        eteVar.g0(new bv4(29, yzeVar, str));
        yzeVar.h0(null, "_id", str, true, j);
    }

    @Override // defpackage.yee
    public void setUserProperty(String str, String str2, yj5 yj5Var, boolean z, long j) {
        e();
        Object U = n78.U(yj5Var);
        yze yzeVar = this.a.I;
        lte.l(yzeVar);
        yzeVar.h0(str, str2, U, z, j);
    }

    @Override // defpackage.yee
    public void unregisterOnMeasurementEventListener(age ageVar) {
        Object obj;
        e();
        yz yzVar = this.b;
        synchronized (yzVar) {
            obj = (rwe) yzVar.remove(Integer.valueOf(ageVar.zzf()));
        }
        if (obj == null) {
            obj = new a7f(this, ageVar);
        }
        yze yzeVar = this.a.I;
        lte.l(yzeVar);
        yzeVar.Y();
        if (!yzeVar.e.remove(obj)) {
            ppe ppeVar = ((lte) yzeVar.a).f;
            lte.m(ppeVar);
            ppeVar.E.e("OnEventListener had not been registered");
        }
    }

    @Override // defpackage.yee
    public void setConsent(Bundle bundle, long j) {
    }
}
