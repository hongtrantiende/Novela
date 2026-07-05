package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: h67  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class h67 implements h12 {
    public final /* synthetic */ int a;
    public final /* synthetic */ cl3 b;
    public final /* synthetic */ cs6 c;
    public final /* synthetic */ h57 d;

    public /* synthetic */ h67(cl3 cl3Var, cs6 cs6Var, h57 h57Var, int i) {
        this.a = i;
        this.b = cl3Var;
        this.c = cs6Var;
        this.d = h57Var;
    }

    @Override // defpackage.h12
    public final void accept(Object obj) {
        int i = this.a;
        h57 h57Var = this.d;
        cs6 cs6Var = this.c;
        cl3 cl3Var = this.b;
        k67 k67Var = (k67) obj;
        switch (i) {
            case 0:
                k67Var.m(cl3Var.a, cl3Var.b, cs6Var, h57Var);
                return;
            default:
                k67Var.j(cl3Var.a, cl3Var.b, cs6Var, h57Var);
                return;
        }
    }
}
