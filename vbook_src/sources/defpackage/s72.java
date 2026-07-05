package defpackage;

import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: s72  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class s72 implements xt4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ t72 b;

    public /* synthetic */ s72(t72 t72Var, l8a l8aVar) {
        this.a = 3;
        this.b = t72Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.xt4
    public final Object invoke(Object obj) {
        int i = this.a;
        boolean z = false;
        t72 t72Var = this.b;
        switch (i) {
            case 0:
                hm8 hm8Var = t72Var.O.t;
                Boolean bool = Boolean.TRUE;
                hm8Var.setValue(bool);
                t72Var.O.s.setValue(bool);
                ol6 ol6Var = t72Var.O;
                CharSequence b = ((bj) ((bf4) obj)).b();
                b.getClass();
                t72.K1(ol6Var, (String) b, t72Var.P, t72Var.Q);
                return bool;
            case 1:
                List list = (List) obj;
                if (t72Var.O.d() != null) {
                    gvb d = t72Var.O.d();
                    d.getClass();
                    list.add(d.a);
                    z = true;
                }
                return Boolean.valueOf(z);
            case 2:
                t72.K1(t72Var.O, ((ps) obj).b, t72Var.P, t72Var.Q);
                return Boolean.TRUE;
            default:
                ps psVar = (ps) obj;
                if (!t72Var.P && t72Var.Q) {
                    wub wubVar = t72Var.O.e;
                    if (wubVar != null) {
                        List B = tl1.B(new Object(), new mq1(psVar, 1));
                        ol6 ol6Var2 = t72Var.O;
                        s6f s6fVar = ol6Var2.d;
                        h72 h72Var = ol6Var2.v;
                        jub j = s6fVar.j(B);
                        wubVar.a(null, j);
                        h72Var.invoke(j);
                    } else {
                        jub jubVar = t72Var.N;
                        String str = jubVar.a.b;
                        long j2 = jubVar.b;
                        int i2 = fxb.c;
                        String obj2 = k4b.v0(str, (int) (j2 >> 32), (int) (j2 & 4294967295L), psVar).toString();
                        int length = psVar.b.length() + ((int) (t72Var.N.b >> 32));
                        t72Var.O.v.invoke(new jub(obj2, sze.a(length, length), 4));
                    }
                    z = true;
                }
                return Boolean.valueOf(z);
        }
    }

    public /* synthetic */ s72(t72 t72Var, int i) {
        this.a = i;
        this.b = t72Var;
    }
}
