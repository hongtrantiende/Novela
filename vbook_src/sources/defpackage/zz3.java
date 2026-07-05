package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: zz3  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class zz3 implements or6, lfb {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ zz3(int i, bz8 bz8Var, bz8 bz8Var2) {
        this.a = i;
        this.b = bz8Var;
        this.c = bz8Var2;
    }

    @Override // defpackage.lfb
    public Object h() {
        ((zg4) ((tc0) this.b).d).i0((ld0) this.c, this.a + 1, false);
        return null;
    }

    @Override // defpackage.or6
    public void invoke(Object obj) {
        az8 az8Var = (az8) obj;
        az8Var.getClass();
        az8Var.r(this.a, (bz8) this.b, (bz8) this.c);
    }

    public /* synthetic */ zz3(tc0 tc0Var, ld0 ld0Var, int i) {
        this.b = tc0Var;
        this.c = ld0Var;
        this.a = i;
    }
}
