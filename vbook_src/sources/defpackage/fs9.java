package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: fs9  reason: default package */
/* loaded from: classes3.dex */
public abstract class fs9 extends es9 implements vu4 {
    public final int a;

    public fs9(int i, m42 m42Var) {
        super(m42Var);
        this.a = i;
    }

    @Override // defpackage.vu4
    public final int getArity() {
        return this.a;
    }

    @Override // defpackage.hh0
    public final String toString() {
        if (getCompletion() == null) {
            cm9.a.getClass();
            return dm9.a(this);
        }
        return super.toString();
    }
}
