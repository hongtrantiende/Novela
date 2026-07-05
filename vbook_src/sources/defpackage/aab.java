package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: aab  reason: default package */
/* loaded from: classes3.dex */
public abstract class aab extends n42 implements vu4 {
    private final int arity;

    public aab(int i, m42 m42Var) {
        super(m42Var);
        this.arity = i;
    }

    @Override // defpackage.vu4
    public int getArity() {
        return this.arity;
    }

    @Override // defpackage.hh0
    public String toString() {
        if (getCompletion() == null) {
            cm9.a.getClass();
            return dm9.a(this);
        }
        return super.toString();
    }
}
