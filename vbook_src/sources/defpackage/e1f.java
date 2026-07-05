package defpackage;

import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: e1f  reason: default package */
/* loaded from: classes.dex */
public final class e1f implements Runnable {
    public final /* synthetic */ Object C;
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;
    public final /* synthetic */ d8f d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ w2f f;

    public e1f(w2f w2fVar, String str, String str2, d8f d8fVar, boolean z, hfe hfeVar) {
        this.b = str;
        this.c = str2;
        this.d = d8fVar;
        this.e = z;
        this.C = hfeVar;
        this.f = w2fVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        l6f l6fVar;
        lne lneVar;
        lte lteVar;
        AtomicReference atomicReference;
        w2f w2fVar;
        lne lneVar2;
        switch (this.a) {
            case 0:
                String str = this.c;
                String str2 = this.b;
                hfe hfeVar = (hfe) this.C;
                w2f w2fVar2 = this.f;
                Bundle bundle = new Bundle();
                try {
                    try {
                        lneVar = w2fVar2.d;
                        lteVar = (lte) w2fVar2.a;
                    } catch (RemoteException e) {
                        e = e;
                    }
                    if (lneVar == null) {
                        ppe ppeVar = lteVar.f;
                        lte.m(ppeVar);
                        ppeVar.f.g(str2, str, "Failed to get user properties; not connected to service");
                        l6fVar = lteVar.E;
                        lte.k(l6fVar);
                        l6fVar.Q0(hfeVar, bundle);
                        return;
                    }
                    List<g6f> d = lneVar.d(str2, str, this.e, this.d);
                    Bundle bundle2 = new Bundle();
                    if (d != null) {
                        for (g6f g6fVar : d) {
                            String str3 = g6fVar.e;
                            String str4 = g6fVar.b;
                            if (str3 != null) {
                                bundle2.putString(str4, str3);
                            } else {
                                Long l = g6fVar.d;
                                if (l != null) {
                                    bundle2.putLong(str4, l.longValue());
                                } else {
                                    Double d2 = g6fVar.C;
                                    if (d2 != null) {
                                        bundle2.putDouble(str4, d2.doubleValue());
                                    }
                                }
                            }
                        }
                    }
                    try {
                        w2fVar2.k0();
                        l6f l6fVar2 = lteVar.E;
                        lte.k(l6fVar2);
                        l6fVar2.Q0(hfeVar, bundle2);
                        return;
                    } catch (RemoteException e2) {
                        e = e2;
                        bundle = bundle2;
                        ppe ppeVar2 = ((lte) w2fVar2.a).f;
                        lte.m(ppeVar2);
                        ppeVar2.f.g(str2, e, "Failed to get user properties; remote exception");
                        l6fVar = ((lte) w2fVar2.a).E;
                        lte.k(l6fVar);
                        l6fVar.Q0(hfeVar, bundle);
                        return;
                    } catch (Throwable th) {
                        th = th;
                        bundle = bundle2;
                        l6f l6fVar3 = ((lte) w2fVar2.a).E;
                        lte.k(l6fVar3);
                        l6fVar3.Q0(hfeVar, bundle);
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            default:
                AtomicReference atomicReference2 = (AtomicReference) this.C;
                synchronized (atomicReference2) {
                    try {
                        w2fVar = this.f;
                        lneVar2 = w2fVar.d;
                    } catch (RemoteException e3) {
                        ppe ppeVar3 = ((lte) this.f.a).f;
                        lte.m(ppeVar3);
                        ppeVar3.f.h("(legacy) Failed to get user properties; remote exception", null, this.b, e3);
                        ((AtomicReference) this.C).set(Collections.EMPTY_LIST);
                        atomicReference = (AtomicReference) this.C;
                    }
                    if (lneVar2 == null) {
                        ppe ppeVar4 = ((lte) w2fVar.a).f;
                        lte.m(ppeVar4);
                        ppeVar4.f.h("(legacy) Failed to get user properties; not connected to service", null, this.b, this.c);
                        atomicReference2.set(Collections.EMPTY_LIST);
                        atomicReference2.notify();
                        return;
                    }
                    if (TextUtils.isEmpty(null)) {
                        atomicReference2.set(lneVar2.d(this.b, this.c, this.e, this.d));
                    } else {
                        atomicReference2.set(lneVar2.r(null, this.e, this.b, this.c));
                    }
                    w2fVar.k0();
                    atomicReference = (AtomicReference) this.C;
                    atomicReference.notify();
                    return;
                }
        }
    }

    public e1f(w2f w2fVar, AtomicReference atomicReference, String str, String str2, d8f d8fVar, boolean z) {
        this.C = atomicReference;
        this.b = str;
        this.c = str2;
        this.d = d8fVar;
        this.e = z;
        this.f = w2fVar;
    }
}
