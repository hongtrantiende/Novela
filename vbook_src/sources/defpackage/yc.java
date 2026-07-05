package defpackage;

import android.os.Bundle;
import android.util.Log;
import java.util.ArrayList;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: yc  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class yc implements tu0, ad, fz2 {
    public final /* synthetic */ zc a;

    public /* synthetic */ yc(zc zcVar) {
        this.a = zcVar;
    }

    @Override // defpackage.tu0
    public void b(l92 l92Var) {
        zc zcVar = this.a;
        synchronized (zcVar) {
            try {
                if (((tu0) zcVar.c) instanceof m73) {
                    ((ArrayList) zcVar.a).add(l92Var);
                }
                ((tu0) zcVar.c).b(l92Var);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [s6f, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v5, types: [mu9, java.lang.Object] */
    @Override // defpackage.fz2
    public void f(l99 l99Var) {
        zc zcVar = this.a;
        ox9 ox9Var = ox9.E;
        ox9Var.n("AnalyticsConnector now available.");
        wc wcVar = (wc) l99Var.get();
        fz4 fz4Var = new fz4(wcVar);
        ?? obj = new Object();
        xc xcVar = (xc) wcVar;
        lh9 b = xcVar.b("clx", obj);
        if (b == null) {
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", "Could not register AnalyticsConnectorListener with Crashlytics origin.", null);
            }
            b = xcVar.b("crash", obj);
            if (b != null) {
                Log.w("FirebaseCrashlytics", "A new version of the Google Analytics for Firebase SDK is now available. For improved performance and compatibility with Crashlytics, please update to the latest version.", null);
            }
        }
        if (b != null) {
            ox9Var.n("Registered Firebase Analytics listener.");
            ?? obj2 = new Object();
            ij1 ij1Var = new ij1(fz4Var);
            synchronized (zcVar) {
                try {
                    ArrayList arrayList = (ArrayList) zcVar.a;
                    int size = arrayList.size();
                    int i = 0;
                    while (i < size) {
                        Object obj3 = arrayList.get(i);
                        i++;
                        obj2.b((l92) obj3);
                    }
                    obj.b = obj2;
                    obj.a = ij1Var;
                    zcVar.c = obj2;
                    zcVar.b = ij1Var;
                } catch (Throwable th) {
                    throw th;
                }
            }
            return;
        }
        ox9Var.D("Could not register Firebase Analytics listener; a listener is already registered.", null);
    }

    @Override // defpackage.ad
    public void i(Bundle bundle) {
        ((ad) this.a.b).i(bundle);
    }
}
