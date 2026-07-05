package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: uo9  reason: default package */
/* loaded from: classes.dex */
public final class uo9 implements af6 {
    public final /* synthetic */ gj6 a;
    public final /* synthetic */ ff8 b;

    public uo9(gj6 gj6Var, ff8 ff8Var) {
        this.a = gj6Var;
        this.b = ff8Var;
    }

    @Override // defpackage.af6
    public final long a() {
        int i = this.a.q;
        int ordinal = this.b.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                return i << 32;
            }
            xk5.o();
            return 0L;
        }
        return i & 4294967295L;
    }

    @Override // defpackage.af6
    public final long b() {
        int i = this.a.p;
        int ordinal = this.b.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                return hif.b(i, 0);
            }
            xk5.o();
            return 0L;
        }
        return hif.b(0, i);
    }

    @Override // defpackage.af6
    public final Object getData() {
        return this.a;
    }

    @Override // defpackage.af6
    public final int getIndex() {
        return this.a.a;
    }

    @Override // defpackage.af6
    public final Object getKey() {
        return this.a.l;
    }
}
