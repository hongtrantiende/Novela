package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: n42  reason: default package */
/* loaded from: classes3.dex */
public abstract class n42 extends hh0 {
    private final d82 _context;
    private transient m42 intercepted;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public n42(defpackage.m42 r2) {
        /*
            r1 = this;
            if (r2 == 0) goto L7
            d82 r0 = r2.getContext()
            goto L8
        L7:
            r0 = 0
        L8:
            r1.<init>(r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n42.<init>(m42):void");
    }

    @Override // defpackage.m42
    public d82 getContext() {
        d82 d82Var = this._context;
        d82Var.getClass();
        return d82Var;
    }

    public final m42 intercepted() {
        m42 m42Var = this.intercepted;
        if (m42Var == null) {
            o42 o42Var = (o42) getContext().get(abf.d);
            if (o42Var != null) {
                m42Var = o42Var.G(this);
            } else {
                m42Var = this;
            }
            this.intercepted = m42Var;
        }
        return m42Var;
    }

    @Override // defpackage.hh0
    public void releaseIntercepted() {
        m42 m42Var = this.intercepted;
        if (m42Var != null && m42Var != this) {
            b82 b82Var = getContext().get(abf.d);
            b82Var.getClass();
            ((o42) b82Var).b1(m42Var);
        }
        this.intercepted = et1.b;
    }

    public n42(m42 m42Var, d82 d82Var) {
        super(m42Var);
        this._context = d82Var;
    }
}
