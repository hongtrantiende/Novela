package defpackage;

import android.os.Looper;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: xn6  reason: default package */
/* loaded from: classes.dex */
public final class xn6 {
    public final boolean a;
    public ij1 b;
    public final g99 c;
    public int d;
    public boolean e;
    public boolean f;
    public final ArrayList g;
    public kn6 h;
    public final cza i;

    public xn6(un6 un6Var, boolean z) {
        new AtomicReference(null);
        this.a = z;
        this.b = new ij1(28);
        this.c = new g99(un6Var);
        this.g = new ArrayList();
        kn6 kn6Var = kn6.b;
        this.h = kn6Var;
        this.i = dza.a(kn6Var);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, wn6] */
    public final void a(tn6 tn6Var) {
        rn6 yfVar;
        wn6 wn6Var;
        un6 un6Var;
        jn6 jn6Var;
        tn6Var.getClass();
        c("addObserver");
        kn6 kn6Var = this.h;
        kn6 kn6Var2 = kn6.a;
        if (kn6Var != kn6Var2) {
            kn6Var2 = kn6.b;
        }
        ?? obj = new Object();
        obj.a = kn6Var2;
        HashMap hashMap = ho6.a;
        boolean z = tn6Var instanceof rn6;
        boolean z2 = tn6Var instanceof dv2;
        boolean z3 = false;
        if (z && z2) {
            yfVar = new yf((dv2) tn6Var, (rn6) tn6Var);
        } else if (z2) {
            yfVar = new yf((dv2) tn6Var, null);
        } else if (z) {
            yfVar = (rn6) tn6Var;
        } else {
            Class<?> cls = tn6Var.getClass();
            if (ho6.b(cls) == 2) {
                Object obj2 = ho6.b.get(cls);
                obj2.getClass();
                List list = (List) obj2;
                if (list.size() != 1) {
                    int size = list.size();
                    bw4[] bw4VarArr = new bw4[size];
                    if (size <= 0) {
                        yfVar = new qk9(bw4VarArr, 2);
                    } else {
                        ho6.a((Constructor) list.get(0), tn6Var);
                        throw null;
                    }
                } else {
                    ho6.a((Constructor) list.get(0), tn6Var);
                    throw null;
                }
            } else {
                yfVar = new yf(tn6Var);
            }
        }
        obj.b = yfVar;
        ij1 ij1Var = this.b;
        ij1Var.getClass();
        tv7 tv7Var = (tv7) ij1Var.b;
        ua4 ua4Var = (ua4) tv7Var.g(tn6Var);
        if (ua4Var != null) {
            wn6Var = ua4Var.b;
        } else {
            ua4 ua4Var2 = new ua4(tn6Var, obj);
            tv7Var.n(tn6Var, ua4Var2);
            ua4 ua4Var3 = (ua4) ij1Var.d;
            if (ua4Var3 == null) {
                ij1Var.c = ua4Var2;
                ij1Var.d = ua4Var2;
            } else {
                ua4Var3.c = ua4Var2;
                ua4Var2.d = ua4Var3;
                ij1Var.d = ua4Var2;
            }
            wn6Var = null;
        }
        if (wn6Var != null || (un6Var = (un6) ((WeakReference) this.c.b).get()) == null) {
            return;
        }
        if (this.d != 0 || this.e) {
            z3 = true;
        }
        kn6 b = b(tn6Var);
        this.d++;
        while (obj.a.compareTo(b) < 0) {
            ij1 ij1Var2 = this.b;
            ij1Var2.getClass();
            if (!((tv7) ij1Var2.b).c(tn6Var)) {
                break;
            }
            kn6 kn6Var3 = obj.a;
            ArrayList arrayList = this.g;
            arrayList.add(kn6Var3);
            hn6 hn6Var = jn6.Companion;
            kn6 kn6Var4 = obj.a;
            hn6Var.getClass();
            kn6Var4.getClass();
            int ordinal = kn6Var4.ordinal();
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal != 3) {
                        jn6Var = null;
                    } else {
                        jn6Var = jn6.ON_RESUME;
                    }
                } else {
                    jn6Var = jn6.ON_START;
                }
            } else {
                jn6Var = jn6.ON_CREATE;
            }
            if (jn6Var != null) {
                obj.a(un6Var, jn6Var);
                xl1.S(arrayList);
                b = b(tn6Var);
            } else {
                xk5.j(obj.a, "no event up from ");
                return;
            }
        }
        if (!z3) {
            h();
        }
        this.d--;
    }

    public final kn6 b(tn6 tn6Var) {
        ua4 ua4Var;
        kn6 kn6Var;
        ij1 ij1Var = this.b;
        ij1Var.getClass();
        tn6Var.getClass();
        ua4 ua4Var2 = (ua4) ((tv7) ij1Var.b).g(tn6Var);
        kn6 kn6Var2 = null;
        if (ua4Var2 != null) {
            ua4Var = ua4Var2.d;
        } else {
            ua4Var = null;
        }
        if (ua4Var != null) {
            kn6Var = ua4Var.b.a;
        } else {
            kn6Var = null;
        }
        ArrayList arrayList = this.g;
        if (!arrayList.isEmpty()) {
            kn6Var2 = (kn6) nk2.n(1, arrayList);
        }
        kn6 kn6Var3 = this.h;
        if (kn6Var == null || kn6Var.compareTo(kn6Var3) >= 0) {
            kn6Var = kn6Var3;
        }
        if (kn6Var2 != null && kn6Var2.compareTo(kn6Var) < 0) {
            return kn6Var2;
        }
        return kn6Var;
    }

    public final void c(String str) {
        if (this.a) {
            bz.R().d.getClass();
            if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
                return;
            }
            cy7.a(hl5.n("Method ", str, " must be called on the main thread"));
        }
    }

    public final void d(jn6 jn6Var) {
        jn6Var.getClass();
        c("handleLifecycleEvent");
        e(jn6Var.a());
    }

    public final void e(kn6 kn6Var) {
        if (this.h != kn6Var) {
            un6 un6Var = (un6) ((WeakReference) this.c.b).get();
            kn6 kn6Var2 = this.h;
            kn6 kn6Var3 = kn6.b;
            kn6 kn6Var4 = kn6.a;
            if (kn6Var2 == kn6Var3 && kn6Var == kn6Var4) {
                throw new IllegalStateException(("State must be at least '" + kn6.c + "' to be moved to '" + kn6Var + "' in component " + un6Var).toString());
            } else if (kn6Var2 == kn6Var4 && kn6Var2 != kn6Var) {
                throw new IllegalStateException(("State is '" + kn6Var4 + "' and cannot be moved to `" + kn6Var + "` in component " + un6Var).toString());
            } else {
                this.h = kn6Var;
                if (!this.e && this.d == 0) {
                    this.e = true;
                    h();
                    this.e = false;
                    if (this.h == kn6Var4) {
                        this.b = new ij1(28);
                        return;
                    }
                    return;
                }
                this.f = true;
            }
        }
    }

    public final void f(tn6 tn6Var) {
        tn6Var.getClass();
        c("removeObserver");
        ij1 ij1Var = this.b;
        ij1Var.getClass();
        ua4 ua4Var = (ua4) ((tv7) ij1Var.b).l(tn6Var);
        if (ua4Var == null) {
            return;
        }
        ua4 ua4Var2 = ua4Var.d;
        ua4 ua4Var3 = ua4Var.c;
        if (ua4Var2 == null) {
            ij1Var.c = ua4Var3;
        } else {
            ua4Var2.c = ua4Var3;
        }
        ua4 ua4Var4 = ua4Var.c;
        if (ua4Var4 == null) {
            ij1Var.d = ua4Var2;
        } else {
            ua4Var4.d = ua4Var2;
        }
        ua4Var.e = true;
    }

    public final void g(kn6 kn6Var) {
        kn6Var.getClass();
        c("setCurrentState");
        e(kn6Var);
    }

    public final void h() {
        Object obj = ((WeakReference) this.c.b).get();
        if (obj != null) {
            final un6 un6Var = (un6) obj;
            while (true) {
                ij1 ij1Var = this.b;
                if (((tv7) ij1Var.b).e == 0) {
                    break;
                }
                ua4 ua4Var = (ua4) ij1Var.c;
                if (ua4Var != null) {
                    kn6 kn6Var = ua4Var.b.a;
                    ua4 ua4Var2 = (ua4) ij1Var.d;
                    if (ua4Var2 != null) {
                        kn6 kn6Var2 = ua4Var2.b.a;
                        if (kn6Var == kn6Var2 && this.h == kn6Var2) {
                            break;
                        }
                        this.f = false;
                        kn6 kn6Var3 = this.h;
                        if (ua4Var != null) {
                            if (kn6Var3.compareTo(kn6Var) < 0) {
                                ij1 ij1Var2 = this.b;
                                xt4 xt4Var = new xt4(this) { // from class: vn6
                                    public final /* synthetic */ xn6 b;

                                    {
                                        this.b = this;
                                    }

                                    @Override // defpackage.xt4
                                    public final Object invoke(Object obj2) {
                                        jn6 jn6Var;
                                        jn6 jn6Var2;
                                        int i = r3;
                                        pvc pvcVar = pvc.a;
                                        un6 un6Var2 = un6Var;
                                        xn6 xn6Var = this.b;
                                        Map.Entry entry = (Map.Entry) obj2;
                                        switch (i) {
                                            case 0:
                                                entry.getClass();
                                                tn6 tn6Var = (tn6) entry.getKey();
                                                wn6 wn6Var = (wn6) entry.getValue();
                                                while (true) {
                                                    kn6 kn6Var4 = wn6Var.a;
                                                    kn6 kn6Var5 = xn6Var.h;
                                                    ArrayList arrayList = xn6Var.g;
                                                    if (kn6Var4.compareTo(kn6Var5) > 0 && !xn6Var.f) {
                                                        ij1 ij1Var3 = xn6Var.b;
                                                        ij1Var3.getClass();
                                                        tn6Var.getClass();
                                                        if (((tv7) ij1Var3.b).c(tn6Var)) {
                                                            hn6 hn6Var = jn6.Companion;
                                                            kn6 kn6Var6 = wn6Var.a;
                                                            hn6Var.getClass();
                                                            kn6Var6.getClass();
                                                            int ordinal = kn6Var6.ordinal();
                                                            if (ordinal != 2) {
                                                                if (ordinal != 3) {
                                                                    if (ordinal != 4) {
                                                                        jn6Var = null;
                                                                    } else {
                                                                        jn6Var = jn6.ON_PAUSE;
                                                                    }
                                                                } else {
                                                                    jn6Var = jn6.ON_STOP;
                                                                }
                                                            } else {
                                                                jn6Var = jn6.ON_DESTROY;
                                                            }
                                                            if (jn6Var != null) {
                                                                arrayList.add(jn6Var.a());
                                                                wn6Var.a(un6Var2, jn6Var);
                                                                xl1.S(arrayList);
                                                            } else {
                                                                cy7.c(wn6Var.a, "no event down from ");
                                                                return null;
                                                            }
                                                        } else {
                                                            return pvcVar;
                                                        }
                                                    } else {
                                                        return pvcVar;
                                                    }
                                                }
                                                break;
                                            default:
                                                entry.getClass();
                                                tn6 tn6Var2 = (tn6) entry.getKey();
                                                wn6 wn6Var2 = (wn6) entry.getValue();
                                                while (true) {
                                                    kn6 kn6Var7 = wn6Var2.a;
                                                    kn6 kn6Var8 = xn6Var.h;
                                                    ArrayList arrayList2 = xn6Var.g;
                                                    if (kn6Var7.compareTo(kn6Var8) < 0 && !xn6Var.f) {
                                                        ij1 ij1Var4 = xn6Var.b;
                                                        ij1Var4.getClass();
                                                        tn6Var2.getClass();
                                                        if (((tv7) ij1Var4.b).c(tn6Var2)) {
                                                            arrayList2.add(wn6Var2.a);
                                                            hn6 hn6Var2 = jn6.Companion;
                                                            kn6 kn6Var9 = wn6Var2.a;
                                                            hn6Var2.getClass();
                                                            kn6Var9.getClass();
                                                            int ordinal2 = kn6Var9.ordinal();
                                                            if (ordinal2 != 1) {
                                                                if (ordinal2 != 2) {
                                                                    if (ordinal2 != 3) {
                                                                        jn6Var2 = null;
                                                                    } else {
                                                                        jn6Var2 = jn6.ON_RESUME;
                                                                    }
                                                                } else {
                                                                    jn6Var2 = jn6.ON_START;
                                                                }
                                                            } else {
                                                                jn6Var2 = jn6.ON_CREATE;
                                                            }
                                                            if (jn6Var2 != null) {
                                                                wn6Var2.a(un6Var2, jn6Var2);
                                                                xl1.S(arrayList2);
                                                            } else {
                                                                cy7.c(wn6Var2.a, "no event up from ");
                                                                return null;
                                                            }
                                                        } else {
                                                            return pvcVar;
                                                        }
                                                    } else {
                                                        return pvcVar;
                                                    }
                                                }
                                                break;
                                        }
                                    }
                                };
                                ij1Var2.getClass();
                                for (ua4 ua4Var3 = (ua4) ij1Var2.d; ua4Var3 != null; ua4Var3 = ua4Var3.d) {
                                    if (!ua4Var3.e) {
                                        xt4Var.invoke(ua4Var3);
                                    }
                                }
                            }
                            ua4 ua4Var4 = (ua4) this.b.d;
                            if (!this.f && ua4Var4 != null && this.h.compareTo(ua4Var4.b.a) > 0) {
                                ij1 ij1Var3 = this.b;
                                xt4 xt4Var2 = new xt4(this) { // from class: vn6
                                    public final /* synthetic */ xn6 b;

                                    {
                                        this.b = this;
                                    }

                                    @Override // defpackage.xt4
                                    public final Object invoke(Object obj2) {
                                        jn6 jn6Var;
                                        jn6 jn6Var2;
                                        int i = r3;
                                        pvc pvcVar = pvc.a;
                                        un6 un6Var2 = un6Var;
                                        xn6 xn6Var = this.b;
                                        Map.Entry entry = (Map.Entry) obj2;
                                        switch (i) {
                                            case 0:
                                                entry.getClass();
                                                tn6 tn6Var = (tn6) entry.getKey();
                                                wn6 wn6Var = (wn6) entry.getValue();
                                                while (true) {
                                                    kn6 kn6Var4 = wn6Var.a;
                                                    kn6 kn6Var5 = xn6Var.h;
                                                    ArrayList arrayList = xn6Var.g;
                                                    if (kn6Var4.compareTo(kn6Var5) > 0 && !xn6Var.f) {
                                                        ij1 ij1Var32 = xn6Var.b;
                                                        ij1Var32.getClass();
                                                        tn6Var.getClass();
                                                        if (((tv7) ij1Var32.b).c(tn6Var)) {
                                                            hn6 hn6Var = jn6.Companion;
                                                            kn6 kn6Var6 = wn6Var.a;
                                                            hn6Var.getClass();
                                                            kn6Var6.getClass();
                                                            int ordinal = kn6Var6.ordinal();
                                                            if (ordinal != 2) {
                                                                if (ordinal != 3) {
                                                                    if (ordinal != 4) {
                                                                        jn6Var = null;
                                                                    } else {
                                                                        jn6Var = jn6.ON_PAUSE;
                                                                    }
                                                                } else {
                                                                    jn6Var = jn6.ON_STOP;
                                                                }
                                                            } else {
                                                                jn6Var = jn6.ON_DESTROY;
                                                            }
                                                            if (jn6Var != null) {
                                                                arrayList.add(jn6Var.a());
                                                                wn6Var.a(un6Var2, jn6Var);
                                                                xl1.S(arrayList);
                                                            } else {
                                                                cy7.c(wn6Var.a, "no event down from ");
                                                                return null;
                                                            }
                                                        } else {
                                                            return pvcVar;
                                                        }
                                                    } else {
                                                        return pvcVar;
                                                    }
                                                }
                                                break;
                                            default:
                                                entry.getClass();
                                                tn6 tn6Var2 = (tn6) entry.getKey();
                                                wn6 wn6Var2 = (wn6) entry.getValue();
                                                while (true) {
                                                    kn6 kn6Var7 = wn6Var2.a;
                                                    kn6 kn6Var8 = xn6Var.h;
                                                    ArrayList arrayList2 = xn6Var.g;
                                                    if (kn6Var7.compareTo(kn6Var8) < 0 && !xn6Var.f) {
                                                        ij1 ij1Var4 = xn6Var.b;
                                                        ij1Var4.getClass();
                                                        tn6Var2.getClass();
                                                        if (((tv7) ij1Var4.b).c(tn6Var2)) {
                                                            arrayList2.add(wn6Var2.a);
                                                            hn6 hn6Var2 = jn6.Companion;
                                                            kn6 kn6Var9 = wn6Var2.a;
                                                            hn6Var2.getClass();
                                                            kn6Var9.getClass();
                                                            int ordinal2 = kn6Var9.ordinal();
                                                            if (ordinal2 != 1) {
                                                                if (ordinal2 != 2) {
                                                                    if (ordinal2 != 3) {
                                                                        jn6Var2 = null;
                                                                    } else {
                                                                        jn6Var2 = jn6.ON_RESUME;
                                                                    }
                                                                } else {
                                                                    jn6Var2 = jn6.ON_START;
                                                                }
                                                            } else {
                                                                jn6Var2 = jn6.ON_CREATE;
                                                            }
                                                            if (jn6Var2 != null) {
                                                                wn6Var2.a(un6Var2, jn6Var2);
                                                                xl1.S(arrayList2);
                                                            } else {
                                                                cy7.c(wn6Var2.a, "no event up from ");
                                                                return null;
                                                            }
                                                        } else {
                                                            return pvcVar;
                                                        }
                                                    } else {
                                                        return pvcVar;
                                                    }
                                                }
                                                break;
                                        }
                                    }
                                };
                                ij1Var3.getClass();
                                for (ua4 ua4Var5 = (ua4) ij1Var3.c; ua4Var5 != null; ua4Var5 = ua4Var5.c) {
                                    if (!ua4Var5.e) {
                                        xt4Var2.invoke(ua4Var5);
                                    }
                                }
                            }
                        } else {
                            p1a.l("Collection is empty.");
                            return;
                        }
                    } else {
                        p1a.l("Collection is empty.");
                        return;
                    }
                } else {
                    p1a.l("Collection is empty.");
                    return;
                }
            }
            this.f = false;
            this.i.m(this.h);
            return;
        }
        vs.k("LifecycleOwner of this LifecycleRegistry is already garbage collected. It is too late to change lifecycle state.");
    }
}
