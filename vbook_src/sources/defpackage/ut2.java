package defpackage;

import android.net.Uri;
import java.util.ArrayList;
import java.util.HashMap;
import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ut2  reason: default package */
/* loaded from: classes.dex */
public final class ut2 implements u94 {
    public static final int[] C = {5, 4, 12, 8, 3, 10, 9, 11, 6, 2, 0, 1, 7, 16, 15, 14, 17, 18, 19, 20, 21};
    public static final kw5 D = new kw5(new ls2(10));
    public static final kw5 E = new kw5(new ls2(11));
    public mm9 a;
    public int e;
    public int f;
    public abf c = new abf(22);
    public boolean b = true;
    public int d = 3;

    public final void a(int i, ArrayList arrayList) {
        int i2;
        int i3 = 2;
        int i4 = 0;
        switch (i) {
            case 0:
                arrayList.add(new y3());
                return;
            case 1:
                arrayList.add(new a4());
                return;
            case 2:
                arrayList.add(new q8(0));
                return;
            case 3:
                arrayList.add(new vc());
                return;
            case 4:
                r94 q = D.q(0);
                if (q != null) {
                    arrayList.add(q);
                    return;
                } else {
                    arrayList.add(new zh4());
                    return;
                }
            case 5:
                arrayList.add(new am4());
                return;
            case 6:
                abf abfVar = this.c;
                if (this.b) {
                    i3 = 0;
                }
                arrayList.add(new s27(abfVar, i3));
                return;
            case 7:
                arrayList.add(new os7(0));
                return;
            case 8:
                abf abfVar2 = this.c;
                int g = us4.g(this.d);
                int i5 = 32;
                if (this.b) {
                    i2 = 0;
                } else {
                    i2 = 32;
                }
                int i6 = g | i2;
                ms5 ms5Var = qs5.b;
                arrayList.add(new us4(abfVar2, i6, null, mm9.e, null));
                abf abfVar3 = this.c;
                int i7 = this.d;
                if ((i7 & 1) == 0) {
                    i5 = 0;
                }
                if ((2 & i7) != 0) {
                    i5 |= Token.CASE;
                }
                if (!this.b) {
                    i4 = 16;
                }
                arrayList.add(new ws7(abfVar3, i5 | i4));
                return;
            case 9:
                arrayList.add(new Object());
                return;
            case 10:
                arrayList.add(new p99());
                return;
            case 11:
                if (this.a == null) {
                    ms5 ms5Var2 = qs5.b;
                    this.a = mm9.e;
                }
                arrayList.add(new toc(1, !this.b ? 1 : 0, this.c, new lac(0L), new qy2(0, this.a)));
                return;
            case 12:
                arrayList.add(new lfd());
                return;
            case 13:
            default:
                return;
            case 14:
                arrayList.add(new vn0(this.e));
                return;
            case 15:
                r94 q2 = E.q(new Object[0]);
                if (q2 != null) {
                    arrayList.add(q2);
                    return;
                }
                return;
            case 16:
                arrayList.add(new he0(!this.b ? 1 : 0, this.c));
                return;
            case 17:
                arrayList.add(new vn0(1, (byte) 0));
                return;
            case 18:
                arrayList.add(new ke0(1));
                return;
            case 19:
                arrayList.add(new vn0(0, (byte) 0));
                return;
            case 20:
                arrayList.add(new q55(this.f));
                return;
            case 21:
                arrayList.add(new ke0(0));
                return;
        }
    }

    @Override // defpackage.u94
    public final synchronized r94[] b() {
        return d(Uri.EMPTY, new HashMap());
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002b A[Catch: all -> 0x002f, TryCatch #0 {all -> 0x002f, blocks: (B:3:0x0001, B:5:0x0015, B:8:0x001c, B:10:0x0024, B:12:0x002b, B:15:0x0031, B:18:0x0039, B:21:0x003f, B:24:0x0045, B:25:0x0048, B:26:0x004b), top: B:31:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003f A[Catch: all -> 0x002f, TryCatch #0 {all -> 0x002f, blocks: (B:3:0x0001, B:5:0x0015, B:8:0x001c, B:10:0x0024, B:12:0x002b, B:15:0x0031, B:18:0x0039, B:21:0x003f, B:24:0x0045, B:25:0x0048, B:26:0x004b), top: B:31:0x0001 }] */
    @Override // defpackage.u94
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized defpackage.r94[] d(android.net.Uri r7, java.util.Map r8) {
        /*
            r6 = this;
            monitor-enter(r6)
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L2f
            int[] r1 = defpackage.ut2.C     // Catch: java.lang.Throwable -> L2f
            r2 = 21
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L2f
            java.lang.String r3 = "Content-Type"
            java.lang.Object r8 = r8.get(r3)     // Catch: java.lang.Throwable -> L2f
            java.util.List r8 = (java.util.List) r8     // Catch: java.lang.Throwable -> L2f
            r3 = 0
            if (r8 == 0) goto L23
            boolean r4 = r8.isEmpty()     // Catch: java.lang.Throwable -> L2f
            if (r4 == 0) goto L1c
            goto L23
        L1c:
            java.lang.Object r8 = r8.get(r3)     // Catch: java.lang.Throwable -> L2f
            java.lang.String r8 = (java.lang.String) r8     // Catch: java.lang.Throwable -> L2f
            goto L24
        L23:
            r8 = 0
        L24:
            int r8 = defpackage.nq2.z(r8)     // Catch: java.lang.Throwable -> L2f
            r4 = -1
            if (r8 == r4) goto L31
            r6.a(r8, r0)     // Catch: java.lang.Throwable -> L2f
            goto L31
        L2f:
            r7 = move-exception
            goto L55
        L31:
            int r7 = defpackage.nq2.A(r7)     // Catch: java.lang.Throwable -> L2f
            if (r7 == r4) goto L3c
            if (r7 == r8) goto L3c
            r6.a(r7, r0)     // Catch: java.lang.Throwable -> L2f
        L3c:
            r4 = r3
        L3d:
            if (r4 >= r2) goto L4b
            r5 = r1[r4]     // Catch: java.lang.Throwable -> L2f
            if (r5 == r8) goto L48
            if (r5 == r7) goto L48
            r6.a(r5, r0)     // Catch: java.lang.Throwable -> L2f
        L48:
            int r4 = r4 + 1
            goto L3d
        L4b:
            r94[] r7 = new defpackage.r94[r3]     // Catch: java.lang.Throwable -> L2f
            java.lang.Object[] r7 = r0.toArray(r7)     // Catch: java.lang.Throwable -> L2f
            r94[] r7 = (defpackage.r94[]) r7     // Catch: java.lang.Throwable -> L2f
            monitor-exit(r6)
            return r7
        L55:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L2f
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ut2.d(android.net.Uri, java.util.Map):r94[]");
    }
}
