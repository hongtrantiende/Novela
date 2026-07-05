package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashMap;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: s56  reason: default package */
/* loaded from: classes3.dex */
public final class s56 {
    public int a;
    public final boolean b;
    public final boolean c;
    public final Object d;

    public s56(a46 a46Var, z1 z1Var) {
        this.d = z1Var;
        this.b = a46Var.c;
        this.c = a46Var.k;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00aa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(defpackage.s56 r10, defpackage.jr2 r11, defpackage.hh0 r12) {
        /*
            java.lang.Object r0 = r10.d
            z1 r0 = (defpackage.z1) r0
            boolean r1 = r12 instanceof defpackage.r56
            if (r1 == 0) goto L17
            r1 = r12
            r56 r1 = (defpackage.r56) r1
            int r2 = r1.D
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L17
            int r2 = r2 - r3
            r1.D = r2
            goto L1c
        L17:
            r56 r1 = new r56
            r1.<init>(r10, r12)
        L1c:
            java.lang.Object r12 = r1.f
            int r2 = r1.D
            r3 = 0
            r4 = 6
            r5 = 0
            r6 = 7
            r7 = 4
            r8 = 1
            if (r2 == 0) goto L5c
            if (r2 != r8) goto L56
            int r10 = r1.e
            java.lang.String r11 = r1.d
            java.util.LinkedHashMap r0 = r1.c
            s56 r2 = r1.b
            jr2 r9 = r1.a
            defpackage.hre.r(r12)
            k46 r12 = (defpackage.k46) r12
            r0.put(r11, r12)
            java.lang.Object r11 = r2.d
            z1 r11 = (defpackage.z1) r11
            byte r11 = r11.g()
            if (r11 == r7) goto L53
            if (r11 != r6) goto L49
            goto La0
        L49:
            java.lang.Object r10 = r2.d
            z1 r10 = (defpackage.z1) r10
            java.lang.String r11 = "Expected end of the object or comma"
            defpackage.z1.r(r10, r11, r5, r3, r4)
            throw r3
        L53:
            r5 = r10
            r10 = r2
            goto L70
        L56:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r10)
            return r3
        L5c:
            defpackage.hre.r(r12)
            byte r12 = r0.h(r4)
            byte r2 = r0.w()
            if (r2 == r7) goto Lc0
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            r9 = r11
            r11 = r12
        L70:
            java.lang.Object r12 = r10.d
            z1 r12 = (defpackage.z1) r12
            boolean r2 = r12.d()
            if (r2 == 0) goto L9f
            boolean r11 = r10.b
            if (r11 == 0) goto L83
            java.lang.String r11 = r12.m()
            goto L87
        L83:
            java.lang.String r11 = r12.k()
        L87:
            r2 = 5
            r12.h(r2)
            r1.a = r9
            r1.b = r10
            r1.c = r0
            r1.d = r11
            r1.e = r5
            r1.D = r8
            r9.getClass()
            r9.b = r1
            n82 r10 = defpackage.n82.a
            return r10
        L9f:
            r2 = r10
        La0:
            java.lang.Object r10 = r2.d
            z1 r10 = (defpackage.z1) r10
            if (r11 != r4) goto Laa
            r10.h(r6)
            goto Lba
        Laa:
            if (r11 != r7) goto Lba
            boolean r11 = r2.c
            if (r11 == 0) goto Lb4
            r10.h(r6)
            goto Lba
        Lb4:
            java.lang.String r11 = "object"
            defpackage.am8.A(r10, r11)
            throw r3
        Lba:
            d56 r10 = new d56
            r10.<init>(r0)
            return r10
        Lc0:
            java.lang.String r10 = "Unexpected leading comma"
            defpackage.z1.r(r0, r10, r5, r3, r4)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.s56.a(s56, jr2, hh0):java.lang.Object");
    }

    /* JADX WARN: Type inference failed for: r1v15, types: [java.lang.Object, m42, jr2] */
    public k46 b() {
        k46 d56Var;
        String k;
        Object obj;
        z1 z1Var = (z1) this.d;
        byte w = z1Var.w();
        if (w == 1) {
            return d(true);
        }
        if (w == 0) {
            return d(false);
        }
        if (w == 6) {
            int i = this.a + 1;
            this.a = i;
            if (i == 200) {
                q56 q56Var = new q56(this, null);
                ?? obj2 = new Object();
                obj2.a = q56Var;
                obj2.b = obj2;
                n82 n82Var = xpe.b;
                obj2.c = n82Var;
                while (true) {
                    obj = obj2.c;
                    m42 m42Var = obj2.b;
                    if (m42Var == null) {
                        break;
                    } else if (c16.i(n82Var, obj)) {
                        try {
                            q56 q56Var2 = obj2.a;
                            jsc.u(3, q56Var2);
                            q56 q56Var3 = new q56(q56Var2.d, m42Var);
                            q56Var3.c = obj2;
                            Object invokeSuspend = q56Var3.invokeSuspend(pvc.a);
                            if (invokeSuspend != n82.a) {
                                m42Var.resumeWith(invokeSuspend);
                            }
                        } catch (Throwable th) {
                            m42Var.resumeWith(new gs9(th));
                        }
                    } else {
                        obj2.c = n82Var;
                        m42Var.resumeWith(obj);
                    }
                }
                hre.r(obj);
                d56Var = (k46) obj;
            } else {
                byte h = z1Var.h((byte) 6);
                if (z1Var.w() != 4) {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    while (true) {
                        if (!z1Var.d()) {
                            break;
                        }
                        if (this.b) {
                            k = z1Var.m();
                        } else {
                            k = z1Var.k();
                        }
                        z1Var.h((byte) 5);
                        linkedHashMap.put(k, b());
                        h = z1Var.g();
                        if (h != 4) {
                            if (h != 7) {
                                z1.r(z1Var, "Expected end of the object or comma", 0, null, 6);
                                throw null;
                            }
                        }
                    }
                    if (h == 6) {
                        z1Var.h((byte) 7);
                    } else if (h == 4) {
                        if (this.c) {
                            z1Var.h((byte) 7);
                        } else {
                            am8.A(z1Var, "object");
                            throw null;
                        }
                    }
                    d56Var = new d56(linkedHashMap);
                } else {
                    z1.r(z1Var, "Unexpected leading comma", 0, null, 6);
                    throw null;
                }
            }
            this.a--;
            return d56Var;
        } else if (w == 8) {
            return c();
        } else {
            z1.r(z1Var, "Cannot read Json element because of unexpected ".concat(pbe.u(w)), 0, null, 6);
            throw null;
        }
    }

    public t36 c() {
        boolean z;
        z1 z1Var = (z1) this.d;
        byte g = z1Var.g();
        if (z1Var.w() != 4) {
            ArrayList arrayList = new ArrayList();
            while (z1Var.d()) {
                arrayList.add(b());
                g = z1Var.g();
                if (g != 4) {
                    if (g == 9) {
                        z = true;
                    } else {
                        z = false;
                    }
                    int i = z1Var.b;
                    if (!z) {
                        z1.r(z1Var, "Expected end of the array or comma", i, null, 4);
                        throw null;
                    }
                }
            }
            if (g == 8) {
                z1Var.h((byte) 9);
            } else if (g == 4) {
                if (this.c) {
                    z1Var.h((byte) 9);
                } else {
                    am8.A(z1Var, "array");
                    throw null;
                }
            }
            return new t36(arrayList);
        }
        z1.r(z1Var, "Unexpected leading comma", 0, null, 6);
        throw null;
    }

    public i56 d(boolean z) {
        String m;
        z1 z1Var = (z1) this.d;
        if (!this.b && z) {
            m = z1Var.k();
        } else {
            m = z1Var.m();
        }
        if (!z && c16.i(m, "null")) {
            return a56.INSTANCE;
        }
        return new w46(m, z);
    }

    public void e(String str) {
        ((ppe) this.d).g0(this.a, this.b, this.c, str, null, null, null);
    }

    public void f(Object obj, String str) {
        ((ppe) this.d).g0(this.a, this.b, this.c, str, obj, null, null);
    }

    public void g(Object obj, Object obj2, String str) {
        ((ppe) this.d).g0(this.a, this.b, this.c, str, obj, obj2, null);
    }

    public void h(String str, Object obj, Object obj2, Object obj3) {
        ((ppe) this.d).g0(this.a, this.b, this.c, str, obj, obj2, obj3);
    }

    public s56(ppe ppeVar, int i, boolean z, boolean z2) {
        this.d = ppeVar;
        this.a = i;
        this.b = z;
        this.c = z2;
    }
}
