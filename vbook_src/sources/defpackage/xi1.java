package defpackage;

import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: xi1  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class xi1 implements xt4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ zl9 b;

    public /* synthetic */ xi1(int i, zl9 zl9Var) {
        this.a = i;
        this.b = zl9Var;
    }

    @Override // defpackage.xt4
    public final Object invoke(Object obj) {
        boolean z;
        int i = this.a;
        zl9 zl9Var = this.b;
        switch (i) {
            case 0:
                ax4 ax4Var = (ax4) obj;
                if (c16.i(ax4Var.x0(), "waiting")) {
                    zl9Var.a = ax4Var;
                    z = false;
                } else {
                    z = true;
                }
                return Boolean.valueOf(z);
            default:
                rnc rncVar = (rnc) obj;
                rncVar.getClass();
                ei6 ei6Var = ((tnc) rncVar).K;
                List list = (List) zl9Var.a;
                if (list != null) {
                    list.add(ei6Var);
                } else {
                    list = tl1.C(ei6Var);
                }
                zl9Var.a = list;
                return qnc.b;
        }
    }
}
