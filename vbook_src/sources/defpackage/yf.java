package defpackage;

import android.os.Bundle;
import com.reader.android.MainActivity;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: yf  reason: default package */
/* loaded from: classes.dex */
public final class yf implements rn6 {
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;

    public yf(tn6 tn6Var) {
        this.a = 4;
        this.b = tn6Var;
        ni1 ni1Var = ni1.c;
        Class<?> cls = tn6Var.getClass();
        li1 li1Var = (li1) ni1Var.a.get(cls);
        this.c = li1Var == null ? ni1Var.a(cls, null) : li1Var;
    }

    @Override // defpackage.rn6
    public final void C(un6 un6Var, jn6 jn6Var) {
        int i = this.a;
        Object obj = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                MainActivity mainActivity = (MainActivity) obj2;
                xn6 xn6Var = mainActivity.a;
                int i2 = xf.a[jn6Var.ordinal()];
                if (i2 != 1) {
                    if (i2 == 2) {
                        xn6Var.f(this);
                        return;
                    }
                    return;
                }
                zf zfVar = (zf) obj;
                cza czaVar = zfVar.e;
                final b6 b6Var = new b6(5);
                czaVar.getClass();
                final d89 d89Var = new d89(czaVar, 6);
                final zt1 zt1Var = mainActivity.E;
                zt1Var.getClass();
                final String str = "activity_rq#" + mainActivity.D.getAndIncrement();
                LinkedHashMap linkedHashMap = zt1Var.c;
                if (xn6Var.h.compareTo(kn6.d) < 0) {
                    zt1Var.d(str);
                    n6 n6Var = (n6) linkedHashMap.get(str);
                    if (n6Var == null) {
                        n6Var = new n6(xn6Var);
                    }
                    rn6 rn6Var = new rn6() { // from class: l6
                        @Override // defpackage.rn6
                        public final void C(un6 un6Var2, jn6 jn6Var2) {
                            jn6 jn6Var3 = jn6.ON_START;
                            zt1 zt1Var2 = zt1.this;
                            String str2 = str;
                            if (jn6Var3 == jn6Var2) {
                                LinkedHashMap linkedHashMap2 = zt1Var2.e;
                                Bundle bundle = zt1Var2.g;
                                LinkedHashMap linkedHashMap3 = zt1Var2.f;
                                d89 d89Var2 = d89Var;
                                linkedHashMap2.put(str2, new m6(d89Var2, b6Var));
                                if (linkedHashMap3.containsKey(str2)) {
                                    Object obj3 = linkedHashMap3.get(str2);
                                    linkedHashMap3.remove(str2);
                                    d89Var2.e(obj3);
                                }
                                z5 z5Var = (z5) oc2.D(bundle, str2, z5.class);
                                if (z5Var != null) {
                                    bundle.remove(str2);
                                    d89Var2.e(new z5(z5Var.b, z5Var.a));
                                }
                            } else if (jn6.ON_STOP == jn6Var2) {
                                zt1Var2.e.remove(str2);
                            } else if (jn6.ON_DESTROY == jn6Var2) {
                                zt1Var2.e(str2);
                            }
                        }
                    };
                    n6Var.a.a(rn6Var);
                    n6Var.b.add(rn6Var);
                    linkedHashMap.put(str, n6Var);
                    zfVar.b = new k6(new o6(zt1Var, str, b6Var, 0), czaVar);
                    return;
                }
                StringBuilder sb = new StringBuilder("LifecycleOwner ");
                sb.append(mainActivity);
                kn6 kn6Var = xn6Var.h;
                sb.append(" is attempting to register while current state is ");
                sb.append(kn6Var);
                sb.append(". LifecycleOwners must call register before they are STARTED.");
                throw new IllegalStateException(sb.toString().toString());
            case 1:
                dv2 dv2Var = (dv2) obj;
                switch (ev2.a[jn6Var.ordinal()]) {
                    case 1:
                        dv2Var.getClass();
                        break;
                    case 2:
                        dv2Var.q(un6Var);
                        break;
                    case 3:
                        dv2Var.Q(un6Var);
                        break;
                    case 4:
                        dv2Var.getClass();
                        break;
                    case 5:
                        dv2Var.o(un6Var);
                        break;
                    case 6:
                        dv2Var.G(un6Var);
                        break;
                    case 7:
                        vs.m("ON_ANY must not been send by anybody");
                        return;
                    default:
                        xk5.o();
                        return;
                }
                rn6 rn6Var2 = (rn6) obj2;
                if (rn6Var2 != null) {
                    rn6Var2.C(un6Var, jn6Var);
                    return;
                }
                return;
            case 2:
                if (jn6Var == jn6.ON_START) {
                    ((xn6) obj).f(this);
                    ((s26) obj2).P();
                    return;
                }
                return;
            case 3:
                ob8 ob8Var = (ob8) obj;
                int i3 = sb8.a[jn6Var.ordinal()];
                if (i3 != 1) {
                    if (i3 != 2) {
                        if (i3 == 3) {
                            ob8Var.h();
                            ((xn6) obj2).f(this);
                            return;
                        }
                        return;
                    }
                    ob8Var.j(false);
                    return;
                }
                ob8Var.j(true);
                return;
            default:
                HashMap hashMap = ((li1) obj2).a;
                li1.a((List) hashMap.get(jn6Var), un6Var, jn6Var, obj);
                li1.a((List) hashMap.get(jn6.ON_ANY), un6Var, jn6Var, obj);
                return;
        }
    }

    public yf(dv2 dv2Var, rn6 rn6Var) {
        this.a = 1;
        dv2Var.getClass();
        this.b = dv2Var;
        this.c = rn6Var;
    }

    public /* synthetic */ yf(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    public yf(ob8 ob8Var, tb8 tb8Var, xn6 xn6Var) {
        this.a = 3;
        this.b = ob8Var;
        this.c = xn6Var;
    }
}
