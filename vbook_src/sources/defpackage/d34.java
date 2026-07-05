package defpackage;

import java.util.ArrayList;
import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: d34  reason: default package */
/* loaded from: classes.dex */
public abstract class d34 {
    public static List b(d34 d34Var, fvb fvbVar, int i, int i2) {
        boolean z;
        float g;
        float h;
        fvbVar.getClass();
        it7 it7Var = fvbVar.b;
        if (i == i2) {
            return ks3.a;
        }
        int d = it7Var.d(i);
        int d2 = it7Var.d(i2);
        if (it7Var.h(k4b.b0(fvbVar.a.a)) == oq9.a) {
            z = true;
        } else {
            z = false;
        }
        ArrayList arrayList = new ArrayList((d2 - d) + 1);
        if (d <= d2) {
            int i3 = d;
            while (true) {
                float f = it7Var.f(i3);
                float b = it7Var.b(i3);
                if (i3 == d) {
                    g = fvbVar.f(i, z);
                } else {
                    g = fvbVar.g(i3);
                }
                if (i3 == d2) {
                    h = fvbVar.f(i2, z);
                } else {
                    h = fvbVar.h(i3);
                }
                arrayList.add(new rk9(g, f, h, b));
                if (i3 == d2) {
                    break;
                }
                i3++;
            }
        }
        return arrayList;
    }

    public abstract qf2 a(fvb fvbVar);
}
