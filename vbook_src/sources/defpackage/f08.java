package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: f08  reason: default package */
/* loaded from: classes.dex */
public final class f08 {
    public final cza a = dza.a(h08.a);
    public final cza b;
    public final jj9 c;
    public final rz d;
    public final rz e;
    public a08 f;
    public int g;
    public e08 h;
    public final lv7 i;
    public final lv7 j;
    public final lv7 k;
    public boolean l;
    public boolean m;
    public boolean n;

    public f08() {
        cza a = dza.a(new b08());
        this.b = a;
        this.c = z1d.q(a);
        this.d = new rz();
        this.e = new rz();
        this.i = df8.a();
        this.j = df8.a();
        this.k = df8.a();
    }

    public final void a(yz7 yz7Var, e08 e08Var, int i) {
        lv7 lv7Var;
        boolean z;
        yz7Var.getClass();
        if (e08Var.a == null) {
            if (i != 0) {
                if (i != 1) {
                    lv7Var = this.i;
                } else {
                    lv7Var = this.j;
                }
            } else {
                lv7Var = this.k;
            }
            lv7Var.g(e08Var);
            e08Var.a = yz7Var;
            ((b08) this.c.a.getValue()).getClass();
            if (i != 0) {
                if (i != 1) {
                    z = this.n;
                } else {
                    z = this.l;
                }
            } else {
                z = this.m;
            }
            e08Var.b(z);
            return;
        }
        StringBuilder sb = new StringBuilder("Input '");
        sb.append(e08Var);
        yz7 yz7Var2 = e08Var.a;
        sb.append("' is already added to dispatcher ");
        sb.append(yz7Var2);
        sb.append('.');
        throw new IllegalArgumentException(sb.toString().toString());
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0018  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b() {
        /*
            Method dump skipped, instructions count: 216
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.f08.b():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0090  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.a08 c(int r5) {
        /*
            r4 = this;
            r0 = -1
            rz r1 = r4.e
            rz r4 = r4.d
            r2 = 0
            if (r5 == r0) goto La8
            if (r5 == 0) goto L63
            r0 = 1
            if (r5 != r0) goto L46
            java.util.Iterator r4 = r4.iterator()
        L11:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L25
            java.lang.Object r5 = r4.next()
            r0 = r5
            a08 r0 = (defpackage.a08) r0
            boolean r0 = r0.b()
            if (r0 == 0) goto L11
            goto L26
        L25:
            r5 = r2
        L26:
            a08 r5 = (defpackage.a08) r5
            if (r5 != 0) goto L45
            java.util.Iterator r4 = r1.iterator()
        L2e:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L42
            java.lang.Object r5 = r4.next()
            r0 = r5
            a08 r0 = (defpackage.a08) r0
            boolean r0 = r0.b()
            if (r0 == 0) goto L2e
            r2 = r5
        L42:
            a08 r2 = (defpackage.a08) r2
            return r2
        L45:
            return r5
        L46:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Unsupported direction: '"
            r0.<init>(r1)
            r0.append(r5)
            java.lang.String r5 = "'."
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
        L63:
            java.util.Iterator r4 = r4.iterator()
        L67:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L81
            java.lang.Object r5 = r4.next()
            r0 = r5
            a08 r0 = (defpackage.a08) r0
            boolean r3 = r0.a()
            if (r3 != 0) goto L82
            boolean r0 = r0.b()
            if (r0 == 0) goto L67
            goto L82
        L81:
            r5 = r2
        L82:
            a08 r5 = (defpackage.a08) r5
            if (r5 != 0) goto La7
            java.util.Iterator r4 = r1.iterator()
        L8a:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto La4
            java.lang.Object r5 = r4.next()
            r0 = r5
            a08 r0 = (defpackage.a08) r0
            boolean r1 = r0.a()
            if (r1 != 0) goto La3
            boolean r0 = r0.b()
            if (r0 == 0) goto L8a
        La3:
            r2 = r5
        La4:
            a08 r2 = (defpackage.a08) r2
            return r2
        La7:
            return r5
        La8:
            java.util.Iterator r4 = r4.iterator()
        Lac:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto Lc0
            java.lang.Object r5 = r4.next()
            r0 = r5
            a08 r0 = (defpackage.a08) r0
            boolean r0 = r0.a()
            if (r0 == 0) goto Lac
            goto Lc1
        Lc0:
            r5 = r2
        Lc1:
            a08 r5 = (defpackage.a08) r5
            if (r5 != 0) goto Le0
            java.util.Iterator r4 = r1.iterator()
        Lc9:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto Ldd
            java.lang.Object r5 = r4.next()
            r0 = r5
            a08 r0 = (defpackage.a08) r0
            boolean r0 = r0.a()
            if (r0 == 0) goto Lc9
            r2 = r5
        Ldd:
            a08 r2 = (defpackage.a08) r2
            return r2
        Le0:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.f08.c(int):a08");
    }

    public final void d(a08 a08Var) {
        b08 b08Var;
        a08 a08Var2 = this.f;
        if (a08Var2 == null) {
            a08Var2 = c(0);
        }
        if (c16.i(a08Var2, a08Var)) {
            if (a08Var2 == null) {
                b08Var = new b08();
            } else {
                ArrayList arrayList = new ArrayList();
                Iterator<E> it = this.d.iterator();
                while (it.hasNext()) {
                    a08 a08Var3 = (a08) it.next();
                    if (a08Var3.a() && !a08Var3.b.isEmpty()) {
                        arrayList.addAll(a08Var3.b);
                    }
                }
                Iterator<E> it2 = this.e.iterator();
                while (it2.hasNext()) {
                    a08 a08Var4 = (a08) it2.next();
                    if (a08Var4.a() && !a08Var4.b.isEmpty()) {
                        arrayList.addAll(a08Var4.b);
                    }
                }
                d08 d08Var = a08Var2.a;
                List list = a08Var2.c;
                d08Var.getClass();
                list.getClass();
                b08Var = new b08(d08Var, arrayList, list, arrayList.size());
            }
            cza czaVar = this.b;
            if (!c16.i((b08) czaVar.getValue(), b08Var)) {
                czaVar.getClass();
                czaVar.n(null, b08Var);
                lv7 lv7Var = this.k;
                Object[] objArr = lv7Var.b;
                long[] jArr = lv7Var.c;
                for (int i = lv7Var.e; i != Integer.MAX_VALUE; i = (int) (2147483647L & (jArr[i] >> 31))) {
                    ((e08) objArr[i]).getClass();
                }
                lv7 lv7Var2 = this.j;
                Object[] objArr2 = lv7Var2.b;
                long[] jArr2 = lv7Var2.c;
                for (int i2 = lv7Var2.e; i2 != Integer.MAX_VALUE; i2 = (int) ((jArr2[i2] >> 31) & 2147483647L)) {
                    ((e08) objArr2[i2]).getClass();
                }
                lv7 lv7Var3 = this.i;
                Object[] objArr3 = lv7Var3.b;
                long[] jArr3 = lv7Var3.c;
                for (int i3 = lv7Var3.e; i3 != Integer.MAX_VALUE; i3 = (int) ((jArr3[i3] >> 31) & 2147483647L)) {
                    ((e08) objArr3[i3]).getClass();
                }
            }
        }
    }
}
