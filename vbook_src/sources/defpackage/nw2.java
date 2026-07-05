package defpackage;

import java.util.HashMap;
import java.util.Random;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: nw2  reason: default package */
/* loaded from: classes.dex */
public final class nw2 {
    public static final lw2 h = new lw2(0);
    public static final Random i = new Random();
    public l57 d;
    public String f;
    public final z9c a = new z9c();
    public final y9c b = new y9c();
    public final HashMap c = new HashMap();
    public aac e = aac.a;
    public long g = -1;

    public final void a(mw2 mw2Var) {
        long j = mw2Var.c;
        if (j != -1 && mw2Var.e) {
            this.g = j;
        }
        this.f = null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0048, code lost:
        if (r12 != (-1)) goto L13;
     */
    /* JADX WARN: Removed duplicated region for block: B:41:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a0 A[ADDED_TO_REGION, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.mw2 b(int r19, defpackage.e67 r20) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = r20
            java.util.HashMap r3 = r0.c
            java.util.Collection r4 = r3.values()
            java.util.Iterator r4 = r4.iterator()
            r5 = 0
            r6 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
        L16:
            boolean r8 = r4.hasNext()
            if (r8 == 0) goto La4
            java.lang.Object r8 = r4.next()
            mw2 r8 = (defpackage.mw2) r8
            long r9 = r8.c
            e67 r11 = r8.d
            r12 = -1
            int r9 = (r9 > r12 ? 1 : (r9 == r12 ? 0 : -1))
            if (r9 != 0) goto L57
            int r9 = r8.b
            if (r1 != r9) goto L57
            if (r2 == 0) goto L57
            long r9 = r2.d
            nw2 r14 = r8.g
            java.util.HashMap r15 = r14.c
            r16 = r12
            java.lang.String r12 = r14.f
            java.lang.Object r12 = r15.get(r12)
            mw2 r12 = (defpackage.mw2) r12
            if (r12 == 0) goto L4b
            long r12 = r12.c
            int r15 = (r12 > r16 ? 1 : (r12 == r16 ? 0 : -1))
            if (r15 == 0) goto L4b
            goto L50
        L4b:
            long r12 = r14.g
            r14 = 1
            long r12 = r12 + r14
        L50:
            int r12 = (r9 > r12 ? 1 : (r9 == r12 ? 0 : -1))
            if (r12 < 0) goto L59
            r8.c = r9
            goto L59
        L57:
            r16 = r12
        L59:
            if (r2 == 0) goto L84
            long r9 = r2.d
            int r12 = (r9 > r16 ? 1 : (r9 == r16 ? 0 : -1))
            if (r12 != 0) goto L62
            goto L84
        L62:
            if (r11 != 0) goto L71
            boolean r12 = r2.b()
            if (r12 != 0) goto L16
            long r12 = r8.c
            int r9 = (r9 > r12 ? 1 : (r9 == r12 ? 0 : -1))
            if (r9 != 0) goto L16
            goto L88
        L71:
            long r12 = r11.d
            int r9 = (r9 > r12 ? 1 : (r9 == r12 ? 0 : -1))
            if (r9 != 0) goto L16
            int r9 = r2.b
            int r10 = r11.b
            if (r9 != r10) goto L16
            int r9 = r2.c
            int r10 = r11.c
            if (r9 != r10) goto L16
            goto L88
        L84:
            int r9 = r8.b
            if (r1 != r9) goto L16
        L88:
            long r9 = r8.c
            int r12 = (r9 > r16 ? 1 : (r9 == r16 ? 0 : -1))
            if (r12 == 0) goto La0
            int r12 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r12 >= 0) goto L93
            goto La0
        L93:
            if (r12 != 0) goto L16
            java.lang.String r9 = defpackage.a2d.a
            e67 r9 = r5.d
            if (r9 == 0) goto L16
            if (r11 == 0) goto L16
            r5 = r8
            goto L16
        La0:
            r5 = r8
            r6 = r9
            goto L16
        La4:
            if (r5 != 0) goto Lb6
            lw2 r4 = defpackage.nw2.h
            java.lang.Object r4 = r4.get()
            java.lang.String r4 = (java.lang.String) r4
            mw2 r5 = new mw2
            r5.<init>(r0, r4, r1, r2)
            r3.put(r4, r5)
        Lb6:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nw2.b(int, e67):mw2");
    }

    public final synchronized String c(aac aacVar, e67 e67Var) {
        return b(aacVar.g(e67Var.a, this.b).c, e67Var).a;
    }

    public final void d(cd cdVar) {
        e67 e67Var;
        aac aacVar = cdVar.b;
        int i2 = cdVar.c;
        e67 e67Var2 = cdVar.d;
        boolean p = aacVar.p();
        String str = this.f;
        HashMap hashMap = this.c;
        if (p) {
            if (str != null) {
                mw2 mw2Var = (mw2) hashMap.get(str);
                mw2Var.getClass();
                a(mw2Var);
                return;
            }
            return;
        }
        mw2 mw2Var2 = (mw2) hashMap.get(str);
        this.f = b(i2, e67Var2).a;
        e(cdVar);
        if (e67Var2 != null) {
            long j = e67Var2.d;
            if (e67Var2.b()) {
                if (mw2Var2 == null || mw2Var2.c != j || (e67Var = mw2Var2.d) == null || e67Var.b != e67Var2.b || e67Var.c != e67Var2.c) {
                    b(i2, new e67(e67Var2.a, j));
                    this.d.getClass();
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0038 A[DONT_GENERATE] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void e(defpackage.cd r10) {
        /*
            Method dump skipped, instructions count: 220
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nw2.e(cd):void");
    }
}
