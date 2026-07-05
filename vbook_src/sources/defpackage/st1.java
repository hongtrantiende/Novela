package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: st1  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class st1 implements rn6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ st1(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // defpackage.rn6
    public final void C(un6 un6Var, jn6 jn6Var) {
        int i = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                bu1.l((tb8) obj2, (bu1) obj, un6Var, jn6Var);
                return;
            default:
                ov7 ov7Var = (ov7) obj;
                if (jn6Var == ((jn6) obj2) && !c16.i((vt8) ov7Var.f.getValue(), ut8.a)) {
                    ov7Var.f.setValue(ov7Var.b());
                    return;
                }
                return;
        }
    }
}
