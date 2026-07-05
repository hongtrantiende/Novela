package defpackage;

import android.os.Bundle;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: qk9  reason: default package */
/* loaded from: classes.dex */
public final class qk9 implements rn6 {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ qk9(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.rn6
    public final void C(un6 un6Var, jn6 jn6Var) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ty9 ty9Var = (ty9) obj;
                if (jn6Var == jn6.ON_CREATE) {
                    un6Var.k().f(this);
                    Bundle q = ty9Var.j().q("androidx.savedstate.Restarter");
                    if (q != null) {
                        ArrayList<String> stringArrayList = q.getStringArrayList("classes_to_restore");
                        if (stringArrayList != null) {
                            int size = stringArrayList.size();
                            int i2 = 0;
                            while (i2 < size) {
                                String str = stringArrayList.get(i2);
                                i2++;
                                String str2 = str;
                                try {
                                    Class<? extends U> asSubclass = Class.forName(str2, false, qk9.class.getClassLoader()).asSubclass(qy9.class);
                                    asSubclass.getClass();
                                    try {
                                        Constructor declaredConstructor = asSubclass.getDeclaredConstructor(null);
                                        declaredConstructor.setAccessible(true);
                                        try {
                                            Object newInstance = declaredConstructor.newInstance(null);
                                            newInstance.getClass();
                                            qy9 qy9Var = (qy9) newInstance;
                                            if (ty9Var instanceof sdd) {
                                                qdd i3 = ((sdd) ty9Var).i();
                                                s26 j = ty9Var.j();
                                                LinkedHashMap linkedHashMap = i3.a;
                                                LinkedHashMap linkedHashMap2 = i3.a;
                                                for (Object obj2 : sl1.H0(linkedHashMap.keySet())) {
                                                    gdd gddVar = (gdd) linkedHashMap2.get(obj2);
                                                    if (gddVar != null) {
                                                        ese.s(gddVar, j, ty9Var.k());
                                                    }
                                                }
                                                if (!sl1.H0(linkedHashMap2.keySet()).isEmpty()) {
                                                    j.P();
                                                }
                                            } else {
                                                cy7.c(ty9Var, "Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner. Received owner: ");
                                                return;
                                            }
                                        } catch (Exception e) {
                                            cp8.p(s21.m("Failed to instantiate ", str2), e);
                                            return;
                                        }
                                    } catch (NoSuchMethodException e2) {
                                        throw new IllegalStateException("Class " + asSubclass.getSimpleName() + " must have default constructor in order to be automatically recreated", e2);
                                    }
                                } catch (ClassNotFoundException e3) {
                                    cp8.p(hl5.n("Class ", str2, " wasn't found"), e3);
                                    return;
                                }
                            }
                            return;
                        }
                        vs.k("SavedState with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
                        return;
                    }
                    return;
                }
                vs.j("Next event must be ON_CREATE");
                return;
            case 1:
                bu1 bu1Var = (bu1) obj;
                if (bu1Var.e == null) {
                    wt1 wt1Var = (wt1) bu1Var.getLastNonConfigurationInstance();
                    if (wt1Var != null) {
                        bu1Var.e = wt1Var.a;
                    }
                    if (bu1Var.e == null) {
                        bu1Var.e = new qdd();
                    }
                }
                bu1Var.a.f(this);
                return;
            case 2:
                new HashMap();
                bw4[] bw4VarArr = (bw4[]) obj;
                if (bw4VarArr.length <= 0) {
                    if (bw4VarArr.length <= 0) {
                        return;
                    }
                    bw4 bw4Var = bw4VarArr[0];
                    throw null;
                }
                bw4 bw4Var2 = bw4VarArr[0];
                throw null;
            case 3:
                if (jn6Var == jn6.ON_STOP) {
                    ((rr4) obj).getClass();
                    return;
                }
                return;
            default:
                if (jn6Var == jn6.ON_CREATE) {
                    un6Var.k().f(this);
                    ((oy9) obj).b();
                    return;
                }
                cy7.c(jn6Var, "Next event must be ON_CREATE, it was ");
                return;
        }
    }
}
