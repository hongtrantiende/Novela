package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashMap;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: tj9  reason: default package */
/* loaded from: classes.dex */
public final class tj9 {
    public final mz6 a;
    public final jt1 b;
    public final Object c = new Object();

    public tj9(mz6 mz6Var, jt1 jt1Var) {
        this.a = mz6Var;
        this.b = jt1Var;
    }

    public final i97 a(h97 h97Var) {
        i97 i97Var;
        i97 i97Var2;
        synchronized (this.c) {
            try {
                xj9 xj9Var = (xj9) ((LinkedHashMap) ((ju0) this.a.c).c).get(h97Var);
                i97 i97Var3 = null;
                if (xj9Var != null) {
                    i97Var = new i97(xj9Var.a, xj9Var.b);
                } else {
                    i97Var = null;
                }
                if (i97Var == null) {
                    jt1 jt1Var = this.b;
                    ArrayList arrayList = (ArrayList) ((LinkedHashMap) jt1Var.c).get(h97Var);
                    if (arrayList != null) {
                        int size = arrayList.size();
                        int i = 0;
                        while (true) {
                            if (i >= size) {
                                break;
                            }
                            zj9 zj9Var = (zj9) arrayList.get(i);
                            ml5 ml5Var = (ml5) zj9Var.a.get();
                            if (ml5Var != null) {
                                i97Var2 = new i97(ml5Var, zj9Var.b);
                            } else {
                                i97Var2 = null;
                            }
                            if (i97Var2 != null) {
                                i97Var3 = i97Var2;
                                break;
                            }
                            i++;
                        }
                        jt1Var.d();
                    }
                    i97Var = i97Var3;
                }
                if (i97Var != null && !i97Var.a.g()) {
                    b(h97Var);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return i97Var;
    }

    public final void b(h97 h97Var) {
        synchronized (this.c) {
            ju0 ju0Var = (ju0) this.a.c;
            Object remove = ((LinkedHashMap) ju0Var.c).remove(h97Var);
            if (remove != null) {
                ju0Var.b = ju0Var.d() - ju0Var.k(h97Var, remove);
                ju0Var.c(h97Var, remove, null);
            }
            if (remove != null) {
            }
            if (((LinkedHashMap) this.b.c).remove(h97Var) != null) {
            }
        }
    }

    public final void c(h97 h97Var, i97 i97Var) {
        synchronized (this.c) {
            long f = i97Var.a.f();
            if (f >= 0) {
                this.a.d(h97Var, i97Var.a, i97Var.b, f);
            } else {
                throw new IllegalStateException(("Image size must be non-negative: " + f).toString());
            }
        }
    }

    public final void d(long j) {
        synchronized (this.c) {
            ju0 ju0Var = (ju0) this.a.c;
            ju0Var.a = j;
            ju0Var.m(j);
        }
    }
}
