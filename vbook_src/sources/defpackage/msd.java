package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: msd  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class msd implements vt4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ qi8 b;

    public /* synthetic */ msd(qi8 qi8Var, int i) {
        this.a = i;
        this.b = qi8Var;
    }

    @Override // defpackage.vt4
    public final Object invoke() {
        int i = this.a;
        qi8 qi8Var = this.b;
        switch (i) {
            case 0:
                return Float.valueOf(qi8Var.a.h());
            case 1:
                return new yk8(Float.valueOf(qi8Var.a.h()), Boolean.valueOf(qi8Var.b()));
            default:
                return new moc(Float.valueOf(qi8Var.c.h()), Boolean.valueOf(qi8Var.b()), Float.valueOf(qi8Var.a.h()));
        }
    }
}
