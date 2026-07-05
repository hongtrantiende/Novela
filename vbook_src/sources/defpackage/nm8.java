package defpackage;

import java.util.ArrayList;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: nm8  reason: default package */
/* loaded from: classes.dex */
public final class nm8 {
    public final String a;
    public final String b;

    public nm8(vc1 vc1Var, String str) {
        int i;
        int j0;
        vc1Var.getClass();
        int g1 = vc1Var.g1();
        if (vc1Var.F != null) {
            int j02 = vc1Var.j0(g1);
            i = vc1Var.G;
            if (j02 != -1) {
                i = j02 + i + 1;
            }
        } else {
            i = 1;
        }
        int g12 = vc1Var.g1();
        if (vc1Var.F != null && (j0 = vc1Var.j0(g12)) != -1) {
            ArrayList arrayList = vc1Var.F;
            arrayList.getClass();
            Object obj = arrayList.get(j0);
            obj.getClass();
            g12 -= ((Number) obj).intValue();
        }
        this.a = i + ":" + (g12 + 1);
        this.b = str;
    }

    public final String toString() {
        return eub.p("<", this.a, ">: ", this.b);
    }
}
