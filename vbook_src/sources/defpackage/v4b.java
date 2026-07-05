package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: v4b  reason: default package */
/* loaded from: classes.dex */
public final class v4b extends z4b {
    public static final s26 e = new s26((vt4) new n3b(23));
    public final boolean d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public v4b(defpackage.ex3 r3) {
        /*
            r2 = this;
            r3.getClass()
            r2.<init>(r3)
            boolean r0 = r3 instanceof defpackage.ro1
            if (r0 == 0) goto L2e
            ro1 r3 = (defpackage.ro1) r3
            java.util.ArrayList r3 = r3.a
            java.util.Iterator r3 = r3.iterator()
            r3.getClass()
        L15:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L2e
            java.lang.Object r0 = r3.next()
            r0.getClass()
            ex3 r0 = (defpackage.ex3) r0
            boolean r1 = r0 instanceof defpackage.y4b
            if (r1 != 0) goto L2c
            boolean r0 = r0 instanceof defpackage.x4b
            if (r0 == 0) goto L15
        L2c:
            r3 = 1
            goto L2f
        L2e:
            r3 = 0
        L2f:
            r2.d = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.v4b.<init>(ex3):void");
    }

    @Override // defpackage.ex3
    public final int a() {
        return this.a.a() * 10;
    }

    @Override // defpackage.z4b, defpackage.ex3
    public final boolean b(cp3 cp3Var, cp3 cp3Var2) {
        cp3 cp3Var3;
        cp3Var.getClass();
        cp3Var2.getClass();
        boolean z = this.d;
        ex3 ex3Var = this.a;
        if (z) {
            cp3 cp3Var4 = cp3Var2.a;
            if (cp3Var4 == null) {
                cp3Var4 = null;
            }
            if (cp3Var4 != null) {
                cp3Var3 = cp3Var4.P();
            } else {
                cp3Var3 = cp3Var2;
            }
            while (cp3Var3 != null) {
                if (cp3Var3 != cp3Var2 && ex3Var.b(cp3Var2, cp3Var3)) {
                    return true;
                }
                cp3Var3 = cp3Var3.s();
            }
        }
        s26 s26Var = e;
        n38 n38Var = (n38) s26Var.l();
        n38Var.getClass();
        if (n38Var.a.h(cp3Var2)) {
            n38Var.c = cp3Var2;
        }
        n38Var.d = cp3Var2;
        n38Var.e = cp3Var2;
        n38Var.b = cp3Var2;
        n38Var.f = cp3Var2.A();
        while (n38Var.hasNext()) {
            try {
                y28 next = n38Var.next();
                if (next != cp3Var2 && ex3Var.d(cp3Var2, next)) {
                    return true;
                }
            } finally {
                s26Var.M(n38Var);
            }
        }
        s26Var.M(n38Var);
        return false;
    }

    @Override // defpackage.z4b
    public final boolean g(cp3 cp3Var, y28 y28Var) {
        cp3Var.getClass();
        y28Var.getClass();
        return false;
    }

    public final String toString() {
        return ":has(" + this.a + ")";
    }
}
