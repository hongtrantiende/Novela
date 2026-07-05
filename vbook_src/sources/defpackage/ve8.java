package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ve8  reason: default package */
/* loaded from: classes.dex */
public final class ve8 implements l99 {
    public static final cy7 c = new cy7(26);
    public static final ou1 d = new ou1(5);
    public fz2 a;
    public volatile l99 b;

    public ve8(cy7 cy7Var, l99 l99Var) {
        this.a = cy7Var;
        this.b = l99Var;
    }

    public final void a(fz2 fz2Var) {
        l99 l99Var;
        l99 l99Var2;
        l99 l99Var3 = this.b;
        ou1 ou1Var = d;
        if (l99Var3 != ou1Var) {
            fz2Var.f(l99Var3);
            return;
        }
        synchronized (this) {
            l99Var = this.b;
            if (l99Var != ou1Var) {
                l99Var2 = l99Var;
            } else {
                this.a = new iu1(10, this.a, fz2Var);
                l99Var2 = null;
            }
        }
        if (l99Var2 != null) {
            fz2Var.f(l99Var);
        }
    }

    @Override // defpackage.l99
    public final Object get() {
        return this.b.get();
    }
}
