package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: b36  reason: default package */
/* loaded from: classes3.dex */
public abstract class b36 extends tv6 implements kb3, gt5 {
    public l36 C;

    @Override // defpackage.kb3
    public final void a() {
        p().b0(this);
    }

    @Override // defpackage.gt5
    public final p38 c() {
        return null;
    }

    public w26 getParent() {
        return p();
    }

    @Override // defpackage.gt5
    public final boolean isActive() {
        return true;
    }

    public final l36 p() {
        l36 l36Var = this.C;
        if (l36Var != null) {
            return l36Var;
        }
        c16.w("job");
        throw null;
    }

    public abstract boolean q();

    public abstract void r(Throwable th);

    @Override // defpackage.tv6
    public final String toString() {
        return getClass().getSimpleName() + '@' + nq2.y(this) + "[job@" + nq2.y(p()) + ']';
    }
}
