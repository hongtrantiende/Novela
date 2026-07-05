package defpackage;

import android.os.Bundle;
import java.util.Arrays;
import java.util.LinkedHashMap;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ny9  reason: default package */
/* loaded from: classes.dex */
public abstract class ny9 {
    public static final iv8 a = new iv8(2);
    public static final tw8 b = new tw8(2);
    public static final u28 c = new u28(3);

    public static final ky9 a(ru7 ru7Var) {
        oy9 oy9Var;
        ru7Var.getClass();
        LinkedHashMap linkedHashMap = ru7Var.a;
        ty9 ty9Var = (ty9) linkedHashMap.get(a);
        Bundle bundle = null;
        if (ty9Var != null) {
            sdd sddVar = (sdd) linkedHashMap.get(b);
            if (sddVar != null) {
                Bundle bundle2 = (Bundle) linkedHashMap.get(c);
                String str = (String) linkedHashMap.get(ndd.a);
                if (str != null) {
                    ry9 y = ty9Var.j().y("androidx.lifecycle.internal.SavedStateHandlesProvider");
                    if (y instanceof oy9) {
                        oy9Var = (oy9) y;
                    } else {
                        oy9Var = null;
                    }
                    if (oy9Var != null) {
                        LinkedHashMap linkedHashMap2 = c(sddVar).b;
                        ky9 ky9Var = (ky9) linkedHashMap2.get(str);
                        if (ky9Var == null) {
                            oy9Var.b();
                            Bundle bundle3 = oy9Var.c;
                            if (bundle3 != null && bundle3.containsKey(str)) {
                                Bundle bundle4 = bundle3.getBundle(str);
                                if (bundle4 == null) {
                                    bundle4 = jsc.v((yk8[]) Arrays.copyOf(new yk8[0], 0));
                                }
                                bundle3.remove(str);
                                if (bundle3.isEmpty()) {
                                    oy9Var.c = null;
                                }
                                bundle = bundle4;
                            }
                            ky9 d = zve.d(bundle, bundle2);
                            linkedHashMap2.put(str, d);
                            return d;
                        }
                        return ky9Var;
                    }
                    vs.k("enableSavedStateHandles() wasn't called prior to createSavedStateHandle() call");
                    return null;
                }
                vs.m("CreationExtras must have a value by `VIEW_MODEL_KEY`");
                return null;
            }
            vs.m("CreationExtras must have a value by `VIEW_MODEL_STORE_OWNER_KEY`");
            return null;
        }
        vs.m("CreationExtras must have a value by `SAVED_STATE_REGISTRY_OWNER_KEY`");
        return null;
    }

    public static final void b(ty9 ty9Var) {
        kn6 kn6Var = ty9Var.k().h;
        if (kn6Var != kn6.b && kn6Var != kn6.c) {
            hfd.m("Failed to enable `SavedStateHandle` for `", ty9Var, "`. The `Lifecycle.State` must be `INITIALIZED` or `CREATED`, but was `", kn6Var, "`. You must call `enableSavedStateHandles()` before the `Lifecycle.State` moves to `STARTED`.");
        } else if (ty9Var.j().y("androidx.lifecycle.internal.SavedStateHandlesProvider") == null) {
            oy9 oy9Var = new oy9(ty9Var.j(), (sdd) ty9Var);
            ty9Var.j().L("androidx.lifecycle.internal.SavedStateHandlesProvider", oy9Var);
            ty9Var.k().a(new qk9(oy9Var, 4));
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, ldd] */
    public static final py9 c(sdd sddVar) {
        pb2 pb2Var;
        ?? obj = new Object();
        if (sddVar instanceof y35) {
            pb2Var = ((y35) sddVar).f();
        } else {
            pb2Var = ob2.b;
        }
        pb2Var.getClass();
        qdd i = sddVar.i();
        i.getClass();
        return (py9) new odd(i, (ldd) obj, pb2Var).a(cm9.a(py9.class), "androidx.lifecycle.internal.SavedStateHandlesVM");
    }
}
