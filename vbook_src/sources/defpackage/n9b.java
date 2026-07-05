package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: n9b  reason: default package */
/* loaded from: classes.dex */
public final class n9b implements xjc, bh9 {
    public final h9b a;

    public n9b(h9b h9bVar) {
        this.a = h9bVar;
    }

    @Override // defpackage.xjc
    public final Object a(wjc wjcVar, lu4 lu4Var, aab aabVar) {
        return e(wjcVar, lu4Var, aabVar);
    }

    @Override // defpackage.p19
    public final Object b(String str, xt4 xt4Var, n42 n42Var) {
        s9b h1 = this.a.h1(str);
        try {
            Object invoke = xt4Var.invoke(h1);
            dxe.r(h1, null);
            return invoke;
        } finally {
        }
    }

    @Override // defpackage.bh9
    public final cw9 c() {
        return this.a;
    }

    @Override // defpackage.xjc
    public final Object d(aab aabVar) {
        return Boolean.valueOf(this.a.a.V());
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00cd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(defpackage.wjc r9, defpackage.lu4 r10, defpackage.n42 r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof defpackage.m9b
            if (r0 == 0) goto L13
            r0 = r11
            m9b r0 = (defpackage.m9b) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            m9b r0 = new m9b
            r0.<init>(r8, r11)
        L18:
            java.lang.Object r11 = r0.c
            int r1 = r0.e
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L34
            if (r1 != r3) goto L2e
            it4 r8 = r0.b
            n9b r9 = r0.a
            defpackage.hre.r(r11)     // Catch: java.lang.Throwable -> L2b
            goto Lb1
        L2b:
            r10 = move-exception
            goto Lc4
        L2e:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r8)
            return r2
        L34:
            defpackage.hre.r(r11)
            h9b r11 = r8.a
            it4 r11 = r11.a
            r11.V()
            int r9 = r9.ordinal()
            if (r9 == 0) goto L55
            if (r9 == r3) goto L51
            r1 = 2
            if (r9 != r1) goto L4d
            r11.o()
            goto L99
        L4d:
            defpackage.xk5.o()
            return r2
        L51:
            r11.q()
            goto L99
        L55:
            r9 = 0
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            android.database.sqlite.SQLiteDatabase r1 = r11.a
            ye6 r4 = defpackage.it4.e
            java.lang.Object r5 = r4.getValue()
            java.lang.reflect.Method r5 = (java.lang.reflect.Method) r5
            if (r5 == 0) goto L96
            ye6 r5 = defpackage.it4.d
            java.lang.Object r6 = r5.getValue()
            java.lang.reflect.Method r6 = (java.lang.reflect.Method) r6
            if (r6 == 0) goto L96
            java.lang.Object r4 = r4.getValue()
            java.lang.reflect.Method r4 = (java.lang.reflect.Method) r4
            r4.getClass()
            java.lang.Object r5 = r5.getValue()
            java.lang.reflect.Method r5 = (java.lang.reflect.Method) r5
            r5.getClass()
            java.lang.Object r1 = r5.invoke(r1, r2)
            if (r1 == 0) goto L90
            java.lang.Object[] r9 = new java.lang.Object[]{r9, r2, r9, r2}
            r4.invoke(r1, r9)
            goto L99
        L90:
            java.lang.String r9 = "Required value was null."
            defpackage.vs.k(r9)
            goto L99
        L96:
            r11.o()
        L99:
            r19 r9 = new r19     // Catch: java.lang.Throwable -> Lc1
            r9.<init>(r8, r3)     // Catch: java.lang.Throwable -> Lc1
            r0.a = r8     // Catch: java.lang.Throwable -> Lc1
            r0.b = r11     // Catch: java.lang.Throwable -> Lc1
            r0.e = r3     // Catch: java.lang.Throwable -> Lc1
            java.lang.Object r9 = r10.invoke(r9, r0)     // Catch: java.lang.Throwable -> Lc1
            n82 r10 = defpackage.n82.a
            if (r9 != r10) goto Lad
            return r10
        Lad:
            r7 = r9
            r9 = r8
            r8 = r11
            r11 = r7
        Lb1:
            r8.j0()     // Catch: java.lang.Throwable -> L2b
            r8.G()
            boolean r8 = r8.V()
            if (r8 != 0) goto Lc0
            r9.getClass()
        Lc0:
            return r11
        Lc1:
            r10 = move-exception
            r9 = r8
            r8 = r11
        Lc4:
            r8.G()
            boolean r8 = r8.V()
            if (r8 != 0) goto Ld0
            r9.getClass()
        Ld0:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n9b.e(wjc, lu4, n42):java.lang.Object");
    }
}
