package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: r0a  reason: default package */
/* loaded from: classes3.dex */
public class r0a extends b1 implements o82 {
    public final m42 f;

    public r0a(m42 m42Var, d82 d82Var) {
        super(d82Var, true);
        this.f = m42Var;
    }

    @Override // defpackage.l36
    public final boolean O() {
        return true;
    }

    @Override // defpackage.o82
    public final o82 getCallerFrame() {
        m42 m42Var = this.f;
        if (m42Var instanceof o82) {
            return (o82) m42Var;
        }
        return null;
    }

    @Override // defpackage.l36
    public void l(Object obj) {
        ua3.a(w92.t(this.f), nxe.E(obj));
    }

    @Override // defpackage.l36
    public void p(Object obj) {
        this.f.resumeWith(nxe.E(obj));
    }

    public void s0() {
    }
}
