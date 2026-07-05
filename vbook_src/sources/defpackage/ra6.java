package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ra6  reason: default package */
/* loaded from: classes.dex */
public final class ra6 {
    public final re5 a;

    public /* synthetic */ ra6(re5 re5Var) {
        this.a = re5Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x004c, code lost:
        if (r9 == r5) goto L18;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0069 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006a A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object a(defpackage.re5 r6, defpackage.v18 r7, defpackage.lu4 r8, defpackage.n42 r9) {
        /*
            boolean r0 = r9 instanceof defpackage.qa6
            if (r0 == 0) goto L13
            r0 = r9
            qa6 r0 = (defpackage.qa6) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            qa6 r0 = new qa6
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.c
            int r1 = r0.d
            r2 = 2
            r3 = 1
            r4 = 0
            n82 r5 = defpackage.n82.a
            if (r1 == 0) goto L3c
            if (r1 == r3) goto L31
            if (r1 != r2) goto L2b
            defpackage.hre.r(r9)
            return r9
        L2b:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r6)
            return r4
        L31:
            re5 r6 = r0.b
            aab r7 = r0.a
            r8 = r7
            lu4 r8 = (defpackage.lu4) r8
            defpackage.hre.r(r9)
            goto L4f
        L3c:
            defpackage.hre.r(r9)
            r9 = r8
            aab r9 = (defpackage.aab) r9
            r0.a = r9
            r0.b = r6
            r0.d = r3
            gh5 r9 = defpackage.vqe.s(r7, r0)
            if (r9 != r5) goto L4f
            goto L69
        L4f:
            gh5 r9 = (defpackage.gh5) r9
            hi5 r7 = new hi5
            r7.<init>(r9, r6)
            qq4 r6 = new qq4
            r9 = 13
            r6.<init>(r8, r4, r9)
            r0.a = r4
            r0.b = r4
            r0.d = r2
            java.lang.Object r6 = r7.b(r6, r0)
            if (r6 != r5) goto L6a
        L69:
            return r5
        L6a:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ra6.a(re5, v18, lu4, n42):java.lang.Object");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ra6) {
            if (!c16.i(this.a, ((ra6) obj).a)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "KtorNetworkClient(httpClient=" + this.a + ")";
    }
}
