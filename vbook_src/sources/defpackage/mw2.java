package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: mw2  reason: default package */
/* loaded from: classes.dex */
public final class mw2 {
    public final String a;
    public int b;
    public long c;
    public final e67 d;
    public boolean e;
    public boolean f;
    public final /* synthetic */ nw2 g;

    public mw2(nw2 nw2Var, String str, int i, e67 e67Var) {
        long j;
        this.g = nw2Var;
        this.a = str;
        this.b = i;
        if (e67Var == null) {
            j = -1;
        } else {
            j = e67Var.d;
        }
        this.c = j;
        if (e67Var != null && e67Var.b()) {
            this.d = e67Var;
        }
    }

    public final boolean a(cd cdVar) {
        e67 e67Var = cdVar.d;
        aac aacVar = cdVar.b;
        if (e67Var == null) {
            if (this.b != cdVar.c) {
                return true;
            }
            return false;
        }
        long j = this.c;
        if (j != -1) {
            if (e67Var.d <= j) {
                e67 e67Var2 = this.d;
                if (e67Var2 != null) {
                    int i = e67Var2.b;
                    int b = aacVar.b(e67Var.a);
                    int b2 = aacVar.b(e67Var2.a);
                    if (e67Var.d >= e67Var2.d && b >= b2) {
                        if (b <= b2) {
                            if (e67Var.b()) {
                                int i2 = e67Var.b;
                                int i3 = e67Var.c;
                                if (i2 <= i) {
                                    if (i2 == i && i3 > e67Var2.c) {
                                        return true;
                                    }
                                    return false;
                                }
                                return true;
                            }
                            int i4 = e67Var.e;
                            if (i4 == -1 || i4 > i) {
                                return true;
                            }
                            return false;
                        }
                        return true;
                    }
                    return false;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x000e, code lost:
        if (r0 < r8.o()) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean b(defpackage.aac r7, defpackage.aac r8) {
        /*
            r6 = this;
            int r0 = r6.b
            int r1 = r7.o()
            r2 = 0
            r3 = -1
            if (r0 < r1) goto L13
            int r7 = r8.o()
            if (r0 >= r7) goto L11
            goto L36
        L11:
            r0 = r3
            goto L36
        L13:
            nw2 r1 = r6.g
            z9c r4 = r1.a
            r7.n(r0, r4)
            int r0 = r4.m
        L1c:
            int r5 = r4.n
            if (r0 > r5) goto L11
            java.lang.Object r5 = r7.l(r0)
            int r5 = r8.b(r5)
            if (r5 == r3) goto L33
            y9c r7 = r1.b
            y9c r7 = r8.f(r5, r7, r2)
            int r0 = r7.c
            goto L36
        L33:
            int r0 = r0 + 1
            goto L1c
        L36:
            r6.b = r0
            if (r0 != r3) goto L3b
            goto L4a
        L3b:
            e67 r6 = r6.d
            if (r6 != 0) goto L40
            goto L48
        L40:
            java.lang.Object r6 = r6.a
            int r6 = r8.b(r6)
            if (r6 == r3) goto L4a
        L48:
            r6 = 1
            return r6
        L4a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mw2.b(aac, aac):boolean");
    }
}
