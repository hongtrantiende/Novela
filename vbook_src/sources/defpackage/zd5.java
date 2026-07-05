package defpackage;

import java.util.ArrayList;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: zd5  reason: default package */
/* loaded from: classes.dex */
public final class zd5 extends de5 {
    public zd5() {
        super("InTableText", 9);
    }

    @Override // defpackage.de5
    public final boolean a(dcc dccVar, ed5 ed5Var) {
        dccVar.getClass();
        if (((acc) dccVar.c) == acc.e) {
            tbc tbcVar = (tbc) dccVar;
            tbc tbcVar2 = new tbc();
            tbcVar2.a = tbcVar.a;
            tbcVar2.b = tbcVar.b;
            String V = tbcVar.d.V();
            s26 s26Var = tbcVar2.d;
            s26Var.getClass();
            s26Var.O();
            s26Var.b = V;
            ArrayList arrayList = ed5Var.t;
            arrayList.getClass();
            arrayList.add(tbcVar2);
            return true;
        }
        ArrayList arrayList2 = ed5Var.t;
        arrayList2.getClass();
        if (!arrayList2.isEmpty()) {
            dcc i = ed5Var.i();
            ArrayList arrayList3 = ed5Var.t;
            arrayList3.getClass();
            int size = arrayList3.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList3.get(i2);
                i2++;
                tbc tbcVar3 = (tbc) obj;
                tbcVar3.getClass();
                ed5Var.g = tbcVar3;
                if (!lh9.p(de5.a, tbcVar3)) {
                    ed5Var.H(this);
                    String[] strArr = d4b.a;
                    boolean c = d4b.c(ed5Var.a().e.b, xxe.C);
                    nd5 nd5Var = de5.D;
                    if (c) {
                        ed5Var.w = true;
                        nd5Var.a(tbcVar3, ed5Var);
                        ed5Var.w = false;
                    } else {
                        nd5Var.a(tbcVar3, ed5Var);
                    }
                } else {
                    ed5Var.O(tbcVar3, false);
                }
            }
            ed5Var.g = i;
            ArrayList arrayList4 = ed5Var.t;
            if (arrayList4 != null) {
                arrayList4.clear();
            }
        }
        ed5Var.l = ed5Var.m;
        return ed5Var.s(dccVar);
    }
}
