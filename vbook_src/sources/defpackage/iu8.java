package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: iu8  reason: default package */
/* loaded from: classes.dex */
public final class iu8 extends sw4 {
    public boolean C;
    public int D;
    public final hu8 e;
    public Object f;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public iu8(defpackage.hu8 r3) {
        /*
            r2 = this;
            java.lang.Object r0 = r3.b
            au8 r1 = r3.d
            r2.<init>(r0, r1)
            r2.e = r3
            int r3 = r1.e
            r2.D = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iu8.<init>(hu8):void");
    }

    @Override // defpackage.sw4, java.util.Iterator
    public final Object next() {
        if (this.e.d.e == this.D) {
            Object next = super.next();
            this.f = next;
            this.C = true;
            return next;
        }
        vs.f();
        return null;
    }

    @Override // defpackage.sw4, java.util.Iterator
    public final void remove() {
        if (this.C) {
            Object obj = this.f;
            hu8 hu8Var = this.e;
            jsc.r(hu8Var).remove(obj);
            this.f = null;
            this.C = false;
            this.D = hu8Var.d.e;
            this.b--;
            return;
        }
        vm1.d();
    }
}
