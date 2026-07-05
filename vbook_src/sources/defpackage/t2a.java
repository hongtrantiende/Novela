package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: t2a  reason: default package */
/* loaded from: classes.dex */
public final class t2a implements u08 {
    public final t3a a;
    public boolean b;

    public t2a(t3a t3aVar, boolean z) {
        this.a = t3aVar;
        this.b = z;
    }

    @Override // defpackage.u08
    public final long i1(long j, long j2, int i) {
        if (this.b) {
            t3a t3aVar = this.a;
            if (!t3aVar.a.a()) {
                return t3aVar.i(t3aVar.e(t3aVar.a.d(t3aVar.e(t3aVar.h(j2)))));
            }
            return 0L;
        }
        return 0L;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0030  */
    @Override // defpackage.u08
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object l1(long r4, long r6, defpackage.m42 r8) {
        /*
            r3 = this;
            boolean r4 = r8 instanceof defpackage.s2a
            if (r4 == 0) goto L13
            r4 = r8
            s2a r4 = (defpackage.s2a) r4
            int r5 = r4.d
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r5 & r0
            if (r1 == 0) goto L13
            int r5 = r5 - r0
            r4.d = r5
            goto L1a
        L13:
            s2a r4 = new s2a
            n42 r8 = (defpackage.n42) r8
            r4.<init>(r3, r8)
        L1a:
            java.lang.Object r5 = r4.b
            int r8 = r4.d
            r0 = 1
            if (r8 == 0) goto L30
            if (r8 != r0) goto L29
            long r6 = r4.a
            defpackage.hre.r(r5)
            goto L4d
        L29:
            java.lang.String r3 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r3)
            r3 = 0
            return r3
        L30:
            defpackage.hre.r(r5)
            boolean r5 = r3.b
            r1 = 0
            if (r5 == 0) goto L55
            t3a r3 = r3.a
            boolean r5 = r3.i
            if (r5 == 0) goto L40
            goto L51
        L40:
            r4.a = r6
            r4.d = r0
            java.lang.Object r5 = r3.a(r6, r4)
            n82 r3 = defpackage.n82.a
            if (r5 != r3) goto L4d
            return r3
        L4d:
            z4d r5 = (defpackage.z4d) r5
            long r1 = r5.a
        L51:
            long r1 = defpackage.z4d.d(r6, r1)
        L55:
            z4d r3 = new z4d
            r3.<init>(r1)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.t2a.l1(long, long, m42):java.lang.Object");
    }
}
