package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: xt3  reason: default package */
/* loaded from: classes.dex */
public final class xt3 extends fb6 implements xt4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ eu3 b;
    public final /* synthetic */ lz3 c;
    public final /* synthetic */ sga d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xt3(eu3 eu3Var, lz3 lz3Var, sga sgaVar, int i) {
        super(1);
        this.a = i;
        this.b = eu3Var;
        this.c = lz3Var;
        this.d = sgaVar;
    }

    @Override // defpackage.xt4
    public final Object invoke(Object obj) {
        int i = this.a;
        eu3 eu3Var = this.b;
        sga sgaVar = this.d;
        lz3 lz3Var = this.c;
        float f = 1.0f;
        switch (i) {
            case 0:
                int ordinal = ((st3) obj).ordinal();
                if (ordinal != 0) {
                    if (ordinal != 1) {
                        if (ordinal == 2) {
                            qa4 qa4Var = lz3Var.a.a;
                            f = qa4Var != null ? qa4Var.a : sgaVar.f;
                        } else {
                            xk5.o();
                            return null;
                        }
                    }
                } else {
                    qa4 qa4Var2 = eu3Var.a.a;
                    if (qa4Var2 != null) {
                        f = qa4Var2.a;
                    }
                }
                return Float.valueOf(f);
            default:
                int ordinal2 = ((st3) obj).ordinal();
                if (ordinal2 != 0) {
                    if (ordinal2 != 1) {
                        if (ordinal2 == 2) {
                            iz9 iz9Var = lz3Var.a.d;
                            f = iz9Var != null ? iz9Var.a : sgaVar.g;
                        } else {
                            xk5.o();
                            return null;
                        }
                    }
                } else {
                    iz9 iz9Var2 = eu3Var.a.d;
                    if (iz9Var2 != null) {
                        f = iz9Var2.a;
                    }
                }
                return Float.valueOf(f);
        }
    }
}
