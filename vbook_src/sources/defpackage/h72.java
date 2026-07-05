package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: h72  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class h72 implements xt4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ol6 b;

    public /* synthetic */ h72(ol6 ol6Var, int i) {
        this.a = i;
        this.b = ol6Var;
    }

    @Override // defpackage.xt4
    public final Object invoke(Object obj) {
        String str;
        int i = this.a;
        pvc pvcVar = pvc.a;
        ol6 ol6Var = this.b;
        switch (i) {
            case 0:
                sc6 sc6Var = (sc6) obj;
                gvb d = ol6Var.d();
                if (d != null) {
                    d.c = sc6Var;
                }
                return pvcVar;
            case 1:
                hm8 hm8Var = ol6Var.t;
                jub jubVar = (jub) obj;
                String str2 = jubVar.a.b;
                ps psVar = ol6Var.j;
                if (psVar != null) {
                    str = psVar.b;
                } else {
                    str = null;
                }
                if (!c16.i(str2, str)) {
                    ol6Var.k.setValue(l35.a);
                    if (((Boolean) hm8Var.getValue()).booleanValue()) {
                        hm8Var.setValue(Boolean.FALSE);
                    } else {
                        ol6Var.s.setValue(Boolean.FALSE);
                    }
                }
                long j = fxb.b;
                ol6Var.f(j);
                ol6Var.e(j);
                ol6Var.u.invoke(jubVar);
                ek9 ek9Var = ol6Var.b;
                fk9 fk9Var = ek9Var.a;
                if (fk9Var != null) {
                    fk9Var.f(ek9Var, null);
                }
                return pvcVar;
            case 2:
                ol6Var.r.b(((xr5) obj).a);
                return pvcVar;
            case 3:
                return Boolean.valueOf(ol6Var.r.b(((xr5) obj).a));
            default:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                ol6Var.q.setValue(bool);
                return pvcVar;
        }
    }
}
