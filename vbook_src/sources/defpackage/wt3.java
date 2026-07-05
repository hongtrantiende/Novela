package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: wt3  reason: default package */
/* loaded from: classes.dex */
public final class wt3 extends fb6 implements xt4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ eu3 b;
    public final /* synthetic */ lz3 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wt3(eu3 eu3Var, lz3 lz3Var, int i) {
        super(1);
        this.a = i;
        this.b = eu3Var;
        this.c = lz3Var;
    }

    @Override // defpackage.xt4
    public final Object invoke(Object obj) {
        lf4 lf4Var;
        lf4 lf4Var2;
        lf4 lf4Var3;
        lf4 lf4Var4;
        int i = this.a;
        lz3 lz3Var = this.c;
        st3 st3Var = st3.c;
        eu3 eu3Var = this.b;
        st3 st3Var2 = st3.b;
        st3 st3Var3 = st3.a;
        switch (i) {
            case 0:
                qkc qkcVar = (qkc) obj;
                if (qkcVar.c(st3Var3, st3Var2)) {
                    qa4 qa4Var = eu3Var.a.a;
                    if (qa4Var == null || (lf4Var2 = qa4Var.b) == null) {
                        return zt3.b;
                    }
                    return lf4Var2;
                } else if (qkcVar.c(st3Var2, st3Var)) {
                    qa4 qa4Var2 = lz3Var.a.a;
                    if (qa4Var2 == null || (lf4Var = qa4Var2.b) == null) {
                        return zt3.b;
                    }
                    return lf4Var;
                } else {
                    return zt3.b;
                }
            default:
                qkc qkcVar2 = (qkc) obj;
                if (qkcVar2.c(st3Var3, st3Var2)) {
                    iz9 iz9Var = eu3Var.a.d;
                    if (iz9Var == null || (lf4Var4 = iz9Var.c) == null) {
                        return zt3.b;
                    }
                    return lf4Var4;
                } else if (qkcVar2.c(st3Var2, st3Var)) {
                    iz9 iz9Var2 = lz3Var.a.d;
                    if (iz9Var2 == null || (lf4Var3 = iz9Var2.c) == null) {
                        return zt3.b;
                    }
                    return lf4Var3;
                } else {
                    return zt3.b;
                }
        }
    }
}
