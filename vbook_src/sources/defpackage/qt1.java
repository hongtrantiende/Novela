package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: qt1  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class qt1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ bu1 b;

    public /* synthetic */ qt1(bu1 bu1Var, int i) {
        this.a = i;
        this.b = bu1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        bu1 bu1Var = this.b;
        switch (i) {
            case 0:
                bu1Var.invalidateOptionsMenu();
                return;
            default:
                bu1.m(bu1Var);
                return;
        }
    }
}
