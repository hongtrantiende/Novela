package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: js2  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class js2 implements or6 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ uad b;

    public /* synthetic */ js2(cd cdVar, uad uadVar) {
        this.b = uadVar;
    }

    @Override // defpackage.or6
    public final void invoke(Object obj) {
        int i = this.a;
        uad uadVar = this.b;
        switch (i) {
            case 0:
                l57 l57Var = (l57) ((dd) obj);
                kj kjVar = l57Var.p;
                if (kjVar != null) {
                    vq4 vq4Var = (vq4) kjVar.b;
                    if (vq4Var.w == -1) {
                        uq4 a = vq4Var.a();
                        a.u = uadVar.a;
                        a.v = uadVar.b;
                        l57Var.p = new kj(new vq4(a), kjVar.a, (String) kjVar.c);
                    }
                }
                int i2 = uadVar.a;
                return;
            default:
                ((az8) obj).a(uadVar);
                return;
        }
    }

    public /* synthetic */ js2(uad uadVar) {
        this.b = uadVar;
    }
}
