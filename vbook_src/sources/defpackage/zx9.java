package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: zx9  reason: default package */
/* loaded from: classes.dex */
public final class zx9 implements xx9 {
    public final xt4 a;
    public final tv7 b;
    public tv7 c;

    public zx9(Map map, xt4 xt4Var) {
        tv7 tv7Var;
        this.a = xt4Var;
        if (map != null && !map.isEmpty()) {
            tv7Var = new tv7(map.size());
            for (Map.Entry entry : map.entrySet()) {
                tv7Var.n(entry.getKey(), entry.getValue());
            }
        } else {
            tv7Var = null;
        }
        this.b = tv7Var;
    }

    @Override // defpackage.xx9
    public final wx9 a(String str, vt4 vt4Var) {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            if (!nqe.y(str.charAt(i))) {
                tv7 tv7Var = this.c;
                if (tv7Var == null) {
                    long[] jArr = tz9.a;
                    tv7Var = new tv7();
                    this.c = tv7Var;
                }
                Object g = tv7Var.g(str);
                if (g == null) {
                    g = new ArrayList();
                    tv7Var.n(str, g);
                }
                ((List) g).add(vt4Var);
                return new yx9(0, tv7Var, str, vt4Var);
            }
        }
        vs.m("Registered key is empty or blank");
        return null;
    }

    @Override // defpackage.xx9
    public final boolean c(Object obj) {
        return ((Boolean) this.a.invoke(obj)).booleanValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x009a  */
    @Override // defpackage.xx9
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.Map d() {
        /*
            Method dump skipped, instructions count: 345
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zx9.d():java.util.Map");
    }

    @Override // defpackage.xx9
    public final Object e(String str) {
        List list;
        tv7 tv7Var = this.b;
        if (tv7Var != null) {
            list = (List) tv7Var.l(str);
        } else {
            list = null;
        }
        if (list == null || list.isEmpty()) {
            return null;
        }
        if (list.size() > 1 && tv7Var != null) {
            List subList = list.subList(1, list.size());
            int f = tv7Var.f(str);
            if (f < 0) {
                f = ~f;
            }
            Object[] objArr = tv7Var.c;
            Object obj = objArr[f];
            tv7Var.b[f] = str;
            objArr[f] = subList;
            List list2 = (List) obj;
        }
        return list.get(0);
    }
}
