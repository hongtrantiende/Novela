package com.google.android.gms.measurement.api;

import android.content.Context;
import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.NetworkOnMainThreadException;
import android.os.RemoteException;
import android.util.Log;
import android.util.Pair;
import java.util.ArrayList;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes.dex */
public class AppMeasurementSdk {
    public final qke a;

    public AppMeasurementSdk(qke qkeVar) {
        this.a = qkeVar;
    }

    public static AppMeasurementSdk getInstance(Context context) {
        return qke.c(context, null).b;
    }

    public final void a(jge jgeVar) {
        qke qkeVar = this.a;
        ArrayList arrayList = qkeVar.c;
        synchronized (arrayList) {
            for (int i = 0; i < arrayList.size(); i++) {
                try {
                    if (jgeVar.equals(((Pair) arrayList.get(i)).first)) {
                        Log.w("FA", "OnEventListener already registered.");
                        return;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            bke bkeVar = new bke(jgeVar);
            arrayList.add(new Pair(jgeVar, bkeVar));
            if (qkeVar.f != null) {
                try {
                    qkeVar.f.registerOnMeasurementEventListener(bkeVar);
                    return;
                } catch (BadParcelableException | NetworkOnMainThreadException | RemoteException | IllegalArgumentException | IllegalStateException | NullPointerException | SecurityException | UnsupportedOperationException unused) {
                    Log.w("FA", "Failed to register event listener on calling thread. Trying again on the dynamite thread.");
                }
            }
            qkeVar.a(new fhe(qkeVar, bkeVar, 4));
        }
    }

    public void beginAdUnitExposure(String str) {
        qke qkeVar = this.a;
        qkeVar.a(new qhe(qkeVar, str, 1));
    }

    public void endAdUnitExposure(String str) {
        qke qkeVar = this.a;
        qkeVar.a(new qhe(qkeVar, str, 2));
    }

    public long generateEventId() {
        return this.a.d();
    }

    public String getAppInstanceId() {
        ree reeVar = new ree();
        qke qkeVar = this.a;
        qkeVar.a(new mie(qkeVar, reeVar, 1));
        return (String) ree.f(reeVar.e(50L), String.class);
    }

    public String getGmpAppId() {
        ree reeVar = new ree();
        qke qkeVar = this.a;
        qkeVar.a(new mie(qkeVar, reeVar, 0));
        return (String) ree.f(reeVar.e(500L), String.class);
    }

    public void logEvent(String str, String str2, Bundle bundle) {
        qke qkeVar = this.a;
        qkeVar.a(new khe(qkeVar, str, str2, bundle, 1));
    }
}
