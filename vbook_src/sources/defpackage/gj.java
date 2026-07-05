package defpackage;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: gj  reason: default package */
/* loaded from: classes.dex */
public final class gj implements ComponentCallbacks2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ gj(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        switch (this.a) {
            case 0:
                return;
            default:
                vz0 vz0Var = (vz0) this.b;
                synchronized (vz0Var) {
                    if (((rj9) ((WeakReference) vz0Var.b).get()) == null) {
                        vz0Var.b();
                    }
                }
                return;
        }
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        switch (this.a) {
            case 0:
                return;
            default:
                onTrimMemory(80);
                return;
        }
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        tj9 d;
        long d2;
        switch (this.a) {
            case 0:
                if (i >= 40) {
                    ij.d((ij) this.b);
                    return;
                }
                return;
            default:
                vz0 vz0Var = (vz0) this.b;
                synchronized (vz0Var) {
                    try {
                        rj9 rj9Var = (rj9) ((WeakReference) vz0Var.b).get();
                        if (rj9Var != null) {
                            pj9 pj9Var = rj9Var.a;
                            if (i >= 40) {
                                tj9 d3 = rj9Var.d();
                                if (d3 != null) {
                                    synchronized (d3.c) {
                                        ((ju0) d3.a.c).m(-1L);
                                        jt1 jt1Var = d3.b;
                                        jt1Var.b = 0;
                                        ((LinkedHashMap) jt1Var.c).clear();
                                    }
                                }
                            } else if (i >= 20) {
                                ((sm) vz0Var.c).a(pj9Var.a);
                            } else if (i >= 10 && (d = rj9Var.d()) != null) {
                                synchronized (d.c) {
                                    d2 = ((ju0) d.a.c).d();
                                }
                                long j = d2 / 2;
                                synchronized (d.c) {
                                    ((ju0) d.a.c).m(j);
                                }
                            }
                        } else {
                            vz0Var.b();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
        }
    }

    private final void b() {
    }

    private final void a(Configuration configuration) {
    }
}
