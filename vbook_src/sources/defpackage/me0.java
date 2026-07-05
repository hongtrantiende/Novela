package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: me0  reason: default package */
/* loaded from: classes3.dex */
public final class me0 implements a61 {
    public final le0[] a;

    public me0(le0[] le0VarArr) {
        this.a = le0VarArr;
    }

    @Override // defpackage.a61
    public final void a(Throwable th) {
        b();
    }

    public final void b() {
        for (le0 le0Var : this.a) {
            kb3 kb3Var = le0Var.E;
            if (kb3Var != null) {
                kb3Var.a();
            } else {
                c16.w("handle");
                throw null;
            }
        }
    }

    public final String toString() {
        return "DisposeHandlersOnCancel[" + this.a + ']';
    }
}
