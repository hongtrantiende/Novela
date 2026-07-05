package defpackage;

import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: x65  reason: default package */
/* loaded from: classes.dex */
public final class x65 {
    public final sc6 a;
    public boolean b;
    public boolean c;
    public boolean d;
    public boolean e;
    public final kv7 f = new kv7();
    public final s38 g = new s38();
    public final cv7 h = new cv7(10);

    public x65(sc6 sc6Var) {
        this.a = sc6Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v2, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r16v8 */
    public final void a(long j, List list, boolean z) {
        cv7 cv7Var;
        long[] jArr;
        long[] jArr2;
        int i;
        z28 z28Var;
        z28 z28Var2;
        int size = list.size();
        s38 s38Var = this.g;
        z28 z28Var3 = s38Var;
        boolean z2 = true;
        int i2 = 0;
        while (true) {
            cv7Var = this.h;
            if (i2 >= size) {
                break;
            }
            mq7 mq7Var = (mq7) list.get(i2);
            if (mq7Var.J) {
                mq7Var.I = new hg(17, this, mq7Var);
                if (z2) {
                    gw7 gw7Var = z28Var3.a;
                    ?? r14 = gw7Var.a;
                    int i3 = gw7Var.c;
                    int i4 = 0;
                    while (true) {
                        if (i4 < i3) {
                            z28Var2 = r14[i4];
                            if (c16.i(((z28) z28Var2).c, mq7Var)) {
                                break;
                            }
                            i4++;
                        } else {
                            z28Var2 = null;
                            break;
                        }
                    }
                    z28Var = z28Var2;
                    if (z28Var != null) {
                        z28Var.i = true;
                        z28Var.d.a(j);
                        if (z) {
                            Object e = cv7Var.e(j);
                            if (e == null) {
                                e = new kv7();
                                cv7Var.i(e, j);
                            }
                            ((kv7) e).a(z28Var);
                        }
                        z28Var3 = z28Var;
                    } else {
                        z2 = false;
                    }
                }
                z28Var = new z28(mq7Var);
                z28Var.d.a(j);
                if (z) {
                    Object e2 = cv7Var.e(j);
                    if (e2 == null) {
                        e2 = new kv7();
                        cv7Var.i(e2, j);
                    }
                    ((kv7) e2).a(z28Var);
                }
                z28Var3.a.b(z28Var);
                z28Var3 = z28Var;
            }
            i2++;
        }
        if (z) {
            long[] jArr3 = cv7Var.b;
            Object[] objArr = cv7Var.c;
            long[] jArr4 = cv7Var.a;
            int length = jArr4.length - 2;
            if (length >= 0) {
                int i5 = 0;
                while (true) {
                    long j2 = jArr4[i5];
                    if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i6 = 8;
                        int i7 = 8 - ((~(i5 - length)) >>> 31);
                        int i8 = 0;
                        while (i8 < i7) {
                            if ((255 & j2) < 128) {
                                int i9 = (i5 << 3) + i8;
                                long j3 = jArr3[i9];
                                kv7 kv7Var = (kv7) objArr[i9];
                                gw7 gw7Var2 = s38Var.a;
                                i = i6;
                                Object[] objArr2 = gw7Var2.a;
                                int i10 = gw7Var2.c;
                                jArr2 = jArr3;
                                for (int i11 = 0; i11 < i10; i11++) {
                                    ((z28) objArr2[i11]).f(j3, kv7Var);
                                }
                            } else {
                                jArr2 = jArr3;
                                i = i6;
                            }
                            j2 >>= i;
                            i8++;
                            i6 = i;
                            jArr3 = jArr2;
                        }
                        jArr = jArr3;
                        if (i7 != i6) {
                            break;
                        }
                    } else {
                        jArr = jArr3;
                    }
                    if (i5 == length) {
                        break;
                    }
                    i5++;
                    jArr3 = jArr;
                }
            }
        }
        cv7Var.a();
    }

    public final boolean b(ejf ejfVar, boolean z) {
        sc6 sc6Var = this.a;
        s38 s38Var = this.g;
        boolean a = s38Var.a((my6) ejfVar.b, sc6Var, ejfVar, z);
        gw7 gw7Var = s38Var.a;
        if (!a) {
            return false;
        }
        boolean z2 = true;
        this.b = true;
        Object[] objArr = gw7Var.a;
        int i = gw7Var.c;
        boolean z3 = false;
        for (int i2 = 0; i2 < i; i2++) {
            if (!((z28) objArr[i2]).e(ejfVar, z) && !z3) {
                z3 = false;
            } else {
                z3 = true;
            }
        }
        Object[] objArr2 = gw7Var.a;
        int i3 = gw7Var.c;
        boolean z4 = false;
        for (int i4 = 0; i4 < i3; i4++) {
            if (!((z28) objArr2[i4]).d(ejfVar) && !z4) {
                z4 = false;
            } else {
                z4 = true;
            }
        }
        s38Var.b(ejfVar);
        if (!z4 && !z3) {
            z2 = false;
        }
        this.b = false;
        if (this.e) {
            this.e = false;
            kv7 kv7Var = this.f;
            int i5 = kv7Var.b;
            for (int i6 = 0; i6 < i5; i6++) {
                d((mq7) kv7Var.f(i6));
            }
            kv7Var.d();
        }
        if (this.c) {
            this.c = false;
            c();
        }
        if (this.d) {
            this.d = false;
            s38Var.a.g();
        }
        return z2;
    }

    public final void c() {
        if (this.b) {
            this.c = true;
            return;
        }
        s38 s38Var = this.g;
        gw7 gw7Var = s38Var.a;
        Object[] objArr = gw7Var.a;
        int i = gw7Var.c;
        for (int i2 = 0; i2 < i; i2++) {
            ((z28) objArr[i2]).c();
        }
        if (this.d) {
            this.d = true;
        } else {
            s38Var.a.g();
        }
    }

    public final void d(mq7 mq7Var) {
        if (this.b) {
            this.e = true;
            this.f.a(mq7Var);
            return;
        }
        s38 s38Var = this.g;
        kv7 kv7Var = s38Var.b;
        kv7Var.d();
        kv7Var.a(s38Var);
        while (kv7Var.i()) {
            s38 s38Var2 = (s38) kv7Var.k(kv7Var.b - 1);
            int i = 0;
            while (true) {
                gw7 gw7Var = s38Var2.a;
                if (i < gw7Var.c) {
                    z28 z28Var = (z28) gw7Var.a[i];
                    if (c16.i(z28Var.c, mq7Var)) {
                        s38Var2.a.j(z28Var);
                        z28Var.c();
                    } else {
                        kv7Var.a(z28Var);
                        i++;
                    }
                }
            }
        }
    }
}
