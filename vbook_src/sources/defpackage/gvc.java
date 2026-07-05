package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: gvc  reason: default package */
/* loaded from: classes3.dex */
public final class gvc extends r0a {
    public final ThreadLocal C;
    private volatile boolean threadLocalIsSet;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public gvc(defpackage.m42 r3, defpackage.d82 r4) {
        /*
            r2 = this;
            j61 r0 = defpackage.j61.c
            b82 r1 = r4.get(r0)
            if (r1 != 0) goto Ld
            d82 r0 = r4.plus(r0)
            goto Le
        Ld:
            r0 = r4
        Le:
            r2.<init>(r3, r0)
            java.lang.ThreadLocal r0 = new java.lang.ThreadLocal
            r0.<init>()
            r2.C = r0
            d82 r3 = r3.getContext()
            abf r0 = defpackage.abf.d
            b82 r3 = r3.get(r0)
            boolean r3 = r3 instanceof defpackage.f82
            if (r3 != 0) goto L31
            r3 = 0
            java.lang.Object r3 = defpackage.a7c.c(r4, r3)
            defpackage.a7c.a(r4, r3)
            r2.v0(r4, r3)
        L31:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gvc.<init>(m42, d82):void");
    }

    @Override // defpackage.r0a, defpackage.l36
    public final void p(Object obj) {
        u0();
        Object E = nxe.E(obj);
        m42 m42Var = this.f;
        d82 context = m42Var.getContext();
        gvc gvcVar = null;
        Object c = a7c.c(context, null);
        if (c != a7c.a) {
            gvcVar = tc4.t(m42Var, context, c);
        }
        try {
            m42Var.resumeWith(E);
            if (gvcVar != null && !gvcVar.t0()) {
                return;
            }
            a7c.a(context, c);
        } catch (Throwable th) {
            if (gvcVar == null || gvcVar.t0()) {
                a7c.a(context, c);
            }
            throw th;
        }
    }

    @Override // defpackage.r0a
    public final void s0() {
        u0();
    }

    public final boolean t0() {
        boolean z;
        if (this.threadLocalIsSet && this.C.get() == null) {
            z = true;
        } else {
            z = false;
        }
        this.C.remove();
        return !z;
    }

    public final void u0() {
        if (this.threadLocalIsSet) {
            yk8 yk8Var = (yk8) this.C.get();
            if (yk8Var != null) {
                a7c.a((d82) yk8Var.a, yk8Var.b);
            }
            this.C.remove();
        }
    }

    public final void v0(d82 d82Var, Object obj) {
        this.threadLocalIsSet = true;
        this.C.set(new yk8(d82Var, obj));
    }
}
