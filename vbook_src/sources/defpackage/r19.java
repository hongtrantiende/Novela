package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: r19  reason: default package */
/* loaded from: classes.dex */
public final class r19 implements bh9, p19 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ r19(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.p19
    public final Object b(String str, xt4 xt4Var, n42 n42Var) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                return ((x19) obj).b(str, xt4Var, n42Var);
            default:
                return ((n9b) obj).b(str, xt4Var, n42Var);
        }
    }

    @Override // defpackage.bh9
    public final cw9 c() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                return ((x19) obj).a;
            default:
                return ((n9b) obj).a;
        }
    }
}
