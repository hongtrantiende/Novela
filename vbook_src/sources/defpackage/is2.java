package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: is2  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class is2 implements or6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;

    public /* synthetic */ is2(cd cdVar, int i, bz8 bz8Var, bz8 bz8Var2) {
        this.a = 0;
        this.b = i;
    }

    @Override // defpackage.or6
    public final void invoke(Object obj) {
        int i = this.a;
        int i2 = this.b;
        switch (i) {
            case 0:
                dd ddVar = (dd) obj;
                ddVar.getClass();
                l57 l57Var = (l57) ddVar;
                if (i2 == 1) {
                    l57Var.v = true;
                }
                l57Var.l = i2;
                return;
            case 1:
                ((az8) obj).k(i2);
                return;
            default:
                ((az8) obj).v(i2);
                return;
        }
    }

    public /* synthetic */ is2(int i, int i2) {
        this.a = i2;
        this.b = i;
    }
}
