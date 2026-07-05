package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: jg  reason: default package */
/* loaded from: classes.dex */
public final class jg extends fb6 implements xt4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ zl9 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jg(int i, zl9 zl9Var) {
        super(1);
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
                zl9Var.a = (hn4) obj;
                return Boolean.TRUE;
            case 1:
                fa5 fa5Var = (fa5) obj;
                Object obj2 = zl9Var.a;
                if (obj2 == null && fa5Var.M) {
                    zl9Var.a = fa5Var;
                } else if (obj2 != null) {
                    fa5Var.getClass();
                }
                return Boolean.TRUE;
            default:
                rnc rncVar = (rnc) obj;
                if (((mq7) rncVar).a.J) {
                    zl9Var.a = rncVar;
                    z = false;
                } else {
                    z = true;
                }
                return Boolean.valueOf(z);
        }
    }
}
