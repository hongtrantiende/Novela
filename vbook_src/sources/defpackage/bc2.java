package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: bc2  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class bc2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ cc2 b;
    public final /* synthetic */ px4 c;

    public /* synthetic */ bc2(cc2 cc2Var, px4 px4Var, int i) {
        this.a = i;
        this.b = cc2Var;
        this.c = px4Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        px4 px4Var = this.c;
        cc2 cc2Var = this.b;
        switch (i) {
            case 0:
                ((uwd) cc2Var.e()).r(px4Var);
                return;
            default:
                ((uwd) cc2Var.e()).r(px4Var);
                return;
        }
    }
}
