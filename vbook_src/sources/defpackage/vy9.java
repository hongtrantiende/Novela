package defpackage;

import android.app.Application;
import android.os.Bundle;
import java.lang.reflect.Constructor;
import java.util.LinkedHashMap;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: vy9  reason: default package */
/* loaded from: classes.dex */
public final class vy9 implements ldd {
    public final Application a;
    public final kdd b;
    public final Bundle c;
    public final xn6 d;
    public final s26 e;

    public vy9(Application application, ty9 ty9Var, Bundle bundle) {
        kdd kddVar;
        this.e = ty9Var.j();
        this.d = ty9Var.k();
        this.c = bundle;
        this.a = application;
        if (application != null) {
            if (kdd.c == null) {
                kdd.c = new kdd(application);
            }
            kddVar = kdd.c;
            kddVar.getClass();
        } else {
            kddVar = new kdd(null);
        }
        this.b = kddVar;
    }

    @Override // defpackage.ldd
    public final gdd a(Class cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return d(cls, canonicalName);
        }
        vs.m("Local and anonymous classes can not be ViewModels");
        return null;
    }

    @Override // defpackage.ldd
    public final gdd b(Class cls, ru7 ru7Var) {
        Constructor a;
        LinkedHashMap linkedHashMap = ru7Var.a;
        String str = (String) linkedHashMap.get(ndd.a);
        if (str != null) {
            if (linkedHashMap.get(ny9.a) != null && linkedHashMap.get(ny9.b) != null) {
                Application application = (Application) linkedHashMap.get(kdd.d);
                boolean isAssignableFrom = mp.class.isAssignableFrom(cls);
                if (isAssignableFrom && application != null) {
                    a = wy9.a(cls, wy9.a);
                } else {
                    a = wy9.a(cls, wy9.b);
                }
                if (a == null) {
                    return this.b.b(cls, ru7Var);
                }
                if (isAssignableFrom && application != null) {
                    return wy9.b(cls, a, application, ny9.a(ru7Var));
                }
                return wy9.b(cls, a, ny9.a(ru7Var));
            } else if (this.d != null) {
                return d(cls, str);
            } else {
                vs.k("SAVED_STATE_REGISTRY_OWNER_KEY andVIEW_MODEL_STORE_OWNER_KEY must be provided in the creation extras tosuccessfully create a ViewModel.");
                return null;
            }
        }
        vs.k("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
        return null;
    }

    @Override // defpackage.ldd
    public final gdd c(gi1 gi1Var, ru7 ru7Var) {
        return b(nmd.B(gi1Var), ru7Var);
    }

    /* JADX WARN: Type inference failed for: r7v13, types: [java.lang.Object, mdd] */
    public final gdd d(Class cls, String str) {
        Constructor a;
        gdd b;
        xn6 xn6Var = this.d;
        if (xn6Var != null) {
            boolean isAssignableFrom = mp.class.isAssignableFrom(cls);
            Application application = this.a;
            if (isAssignableFrom && application != null) {
                a = wy9.a(cls, wy9.a);
            } else {
                a = wy9.a(cls, wy9.b);
            }
            if (a == null) {
                if (application != null) {
                    return this.b.a(cls);
                }
                if (mdd.a == null) {
                    mdd.a = new Object();
                }
                mdd.a.getClass();
                return sxd.h(cls);
            }
            s26 s26Var = this.e;
            s26Var.getClass();
            ky9 d = zve.d(s26Var.q(str), this.c);
            ly9 ly9Var = new ly9(str, d);
            ly9Var.S(s26Var, xn6Var);
            kn6 kn6Var = xn6Var.h;
            if (kn6Var != kn6.b && kn6Var.compareTo(kn6.d) < 0) {
                xn6Var.a(new yf(2, xn6Var, s26Var));
            } else {
                s26Var.P();
            }
            if (isAssignableFrom && application != null) {
                b = wy9.b(cls, a, application, d);
            } else {
                b = wy9.b(cls, a, d);
            }
            b.a("androidx.lifecycle.savedstate.vm.tag", ly9Var);
            return b;
        }
        xk5.q("SavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
        return null;
    }
}
