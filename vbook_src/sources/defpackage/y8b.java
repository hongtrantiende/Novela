package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: y8b  reason: default package */
/* loaded from: classes3.dex */
public final class y8b {
    public int a;
    public int b;
    public int c;
    public int[] d;
    public int[] e;
    public boolean f;
    public boolean g;

    /* JADX WARN: Removed duplicated region for block: B:64:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00da A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean c(int[] r11, int[] r12, int r13, defpackage.h02 r14) {
        /*
            r0 = 0
            r1 = r0
            r2 = r1
        L3:
            if (r1 >= r13) goto Lde
            r3 = r11[r1]
            r4 = r12[r1]
            r5 = 1
            if (r3 != r4) goto Le
            goto L71
        Le:
            r6 = r3 & 255(0xff, float:3.57E-43)
            r7 = r4 & 255(0xff, float:3.57E-43)
            r8 = 7
            if (r6 != r8) goto L17
            r9 = r5
            goto L18
        L17:
            r9 = r0
        L18:
            if (r7 != r8) goto L1c
            r8 = r5
            goto L1d
        L1c:
            r8 = r0
        L1d:
            r10 = 5
            if (r9 == 0) goto L23
            if (r4 != r10) goto L23
            goto L71
        L23:
            if (r6 == 0) goto Ld4
            if (r7 != 0) goto L29
            goto Ld4
        L29:
            if (r3 != r10) goto L2f
            if (r8 == 0) goto L2f
            goto Ld5
        L2f:
            if (r9 == 0) goto Lc0
            if (r8 == 0) goto Lc0
            java.lang.String r6 = defpackage.bbe.r(r3, r14)
            java.lang.String r7 = defpackage.bbe.r(r4, r14)
            r8 = 2
            java.lang.Object r8 = r14.k(r8)
            java.lang.String r8 = (java.lang.String) r8
            r9 = 4
            java.lang.Object r9 = r14.k(r9)
            java.lang.String r9 = (java.lang.String) r9
            boolean r10 = r6.equals(r8)
            if (r10 == 0) goto L50
            r6 = r9
        L50:
            boolean r8 = r7.equals(r8)
            if (r8 == 0) goto L57
            r7 = r9
        L57:
            r8 = 46
            r9 = 47
            java.lang.String r6 = r6.replace(r9, r8)     // Catch: java.lang.ClassNotFoundException -> Lbb
            java.lang.Class r6 = java.lang.Class.forName(r6)     // Catch: java.lang.ClassNotFoundException -> Lbb
            java.lang.String r7 = r7.replace(r9, r8)     // Catch: java.lang.ClassNotFoundException -> Lb6
            java.lang.Class r7 = java.lang.Class.forName(r7)     // Catch: java.lang.ClassNotFoundException -> Lb6
            boolean r10 = r6.isAssignableFrom(r7)
            if (r10 == 0) goto L73
        L71:
            r4 = r3
            goto Ld5
        L73:
            boolean r10 = r7.isAssignableFrom(r6)
            if (r10 == 0) goto L7a
            goto Ld5
        L7a:
            boolean r10 = r7.isInterface()
            if (r10 != 0) goto Lab
            boolean r10 = r6.isInterface()
            if (r10 == 0) goto L87
            goto Lab
        L87:
            java.lang.Class r7 = r7.getSuperclass()
        L8b:
            if (r7 == 0) goto Lc0
            boolean r10 = r7.isAssignableFrom(r6)
            if (r10 == 0) goto La6
            java.lang.String r4 = r7.getName()
            int r6 = defpackage.fi1.E
            java.lang.String r4 = r4.replace(r8, r9)
            short r4 = r14.a(r4)
            int r4 = defpackage.bbe.h(r4)
            goto Ld5
        La6:
            java.lang.Class r7 = r7.getSuperclass()
            goto L8b
        Lab:
            java.lang.String r4 = "java/lang/Object"
            short r4 = r14.a(r4)
            int r4 = defpackage.bbe.h(r4)
            goto Ld5
        Lb6:
            r11 = move-exception
            defpackage.fb4.l(r11)
            return r0
        Lbb:
            r11 = move-exception
            defpackage.fb4.l(r11)
            return r0
        Lc0:
            java.lang.String r11 = defpackage.bbe.y(r3, r14)
            java.lang.String r12 = defpackage.bbe.y(r4, r14)
            java.lang.String r13 = "bad merge attempt between "
            java.lang.String r14 = " and "
            java.lang.String r11 = defpackage.eub.p(r13, r11, r14, r12)
            defpackage.vs.m(r11)
            return r0
        Ld4:
            r4 = r0
        Ld5:
            r11[r1] = r4
            if (r3 == r4) goto Lda
            r2 = r5
        Lda:
            int r1 = r1 + 1
            goto L3
        Lde:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.y8b.c(int[], int[], int, h02):boolean");
    }

    public final int[] a() {
        int[] iArr = this.d;
        int length = iArr.length - 1;
        while (length >= 0 && iArr[length] == 0 && !bbe.s(iArr[length - 1])) {
            length--;
        }
        int i = length + 1;
        int i2 = 0;
        int i3 = i;
        for (int i4 = 0; i4 < i; i4++) {
            if (bbe.s(iArr[i4])) {
                i3--;
            }
        }
        int[] iArr2 = new int[i3];
        int i5 = 0;
        while (i2 < i3) {
            iArr2[i2] = iArr[i5];
            if (bbe.s(iArr[i5])) {
                i5++;
            }
            i2++;
            i5++;
        }
        return iArr2;
    }

    public final boolean b(int[] iArr, int i, int[] iArr2, int i2, h02 h02Var) {
        boolean z = this.f;
        int[] iArr3 = this.d;
        if (!z) {
            System.arraycopy(iArr, 0, iArr3, 0, i);
            int[] iArr4 = new int[i2];
            this.e = iArr4;
            System.arraycopy(iArr2, 0, iArr4, 0, i2);
            this.f = true;
            return true;
        } else if (iArr3.length == i && this.e.length == i2) {
            boolean c = c(iArr3, iArr, i, h02Var);
            boolean c2 = c(this.e, iArr2, i2, h02Var);
            if (c || c2) {
                return true;
            }
            return false;
        } else {
            vs.m("bad merge attempt");
            return false;
        }
    }

    public final String toString() {
        return a82.j(this.a, "sb ");
    }
}
