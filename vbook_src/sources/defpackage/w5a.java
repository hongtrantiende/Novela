package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import sun.misc.Unsafe;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: w5a  reason: default package */
/* loaded from: classes3.dex */
public final class w5a implements a61, zed {
    public final d82 a;
    public Object c;
    public static final /* synthetic */ AtomicReferenceFieldUpdater f = AtomicReferenceFieldUpdater.newUpdater(w5a.class, Object.class, "state$volatile");
    public static final /* synthetic */ long C = u4f.a.objectFieldOffset(w5a.class.getDeclaredField("state$volatile"));
    private volatile /* synthetic */ Object state$volatile = x5a.a;
    public ArrayList b = new ArrayList(2);
    public int d = -1;
    public Object e = x5a.d;

    public w5a(d82 d82Var) {
        this.a = d82Var;
    }

    @Override // defpackage.a61
    public final void a(Throwable th) {
        w5a w5aVar;
        while (true) {
            f.getClass();
            Unsafe unsafe = u4f.a;
            long j = C;
            Object objectVolatile = unsafe.getObjectVolatile(this, j);
            if (objectVolatile == x5a.b) {
                return;
            }
            while (true) {
                Unsafe unsafe2 = u4f.a;
                w5aVar = this;
                if (unsafe2.compareAndSwapObject(w5aVar, C, objectVolatile, x5a.c)) {
                    ArrayList arrayList = w5aVar.b;
                    if (arrayList == null) {
                        return;
                    }
                    int size = arrayList.size();
                    int i = 0;
                    while (i < size) {
                        Object obj = arrayList.get(i);
                        i++;
                        ((u5a) obj).a();
                    }
                    w5aVar.e = x5a.d;
                    w5aVar.b = null;
                    return;
                } else if (unsafe2.getObjectVolatile(w5aVar, j) != objectVolatile) {
                    break;
                } else {
                    this = w5aVar;
                }
            }
            this = w5aVar;
        }
    }

    @Override // defpackage.zed
    public final void b(f5a f5aVar, int i) {
        this.c = f5aVar;
        this.d = i;
    }

    public final void c(u5a u5aVar) {
        ArrayList arrayList = this.b;
        if (arrayList == null) {
            return;
        }
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            u5a u5aVar2 = (u5a) obj;
            if (u5aVar2 != u5aVar) {
                u5aVar2.a();
            }
        }
        f.getClass();
        u4f.a.putObjectVolatile(this, C, x5a.b);
        this.e = x5a.d;
        this.b = null;
    }

    public final Object d(n42 n42Var) {
        f.getClass();
        Object objectVolatile = u4f.a.getObjectVolatile(this, C);
        objectVolatile.getClass();
        u5a u5aVar = (u5a) objectVolatile;
        Object obj = this.e;
        c(u5aVar);
        mu4 mu4Var = u5aVar.c;
        Object obj2 = u5aVar.a;
        Object obj3 = u5aVar.d;
        Object c = mu4Var.c(obj2, obj3, obj);
        aab aabVar = u5aVar.e;
        if (obj3 == x5a.e) {
            return ((xt4) aabVar).invoke(n42Var);
        }
        return ((lu4) aabVar).invoke(c, n42Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x003e, code lost:
        if (l(r0) == r4) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0049 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x004a A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(defpackage.n42 r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.v5a
            if (r0 == 0) goto L13
            r0 = r6
            v5a r0 = (defpackage.v5a) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            v5a r0 = new v5a
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.a
            int r1 = r0.c
            r2 = 2
            r3 = 1
            n82 r4 = defpackage.n82.a
            if (r1 == 0) goto L35
            if (r1 == r3) goto L31
            if (r1 != r2) goto L2a
            defpackage.hre.r(r6)
            return r6
        L2a:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r5)
            r5 = 0
            return r5
        L31:
            defpackage.hre.r(r6)
            goto L41
        L35:
            defpackage.hre.r(r6)
            r0.c = r3
            java.lang.Object r6 = r5.l(r0)
            if (r6 != r4) goto L41
            goto L49
        L41:
            r0.c = r2
            java.lang.Object r5 = r5.d(r0)
            if (r5 != r4) goto L4a
        L49:
            return r4
        L4a:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.w5a.e(n42):java.lang.Object");
    }

    public final u5a f(Object obj) {
        Object obj2;
        ArrayList arrayList = this.b;
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i < size) {
                obj2 = arrayList.get(i);
                i++;
                if (((u5a) obj2).a == obj) {
                    break;
                }
            } else {
                obj2 = null;
                break;
            }
        }
        u5a u5aVar = (u5a) obj2;
        if (u5aVar != null) {
            return u5aVar;
        }
        cp8.m(obj, " is not found", "Clause with object ");
        return null;
    }

    public final void g(t5a t5aVar, lu4 lu4Var) {
        oaa oaaVar = (oaa) t5aVar;
        i(new u5a(this, ((oaa) t5aVar).b, (mu4) oaaVar.c, (mu4) oaaVar.d, null, (aab) lu4Var, (mu4) oaaVar.e), false);
    }

    public final boolean h() {
        f.getClass();
        return u4f.a.getObjectVolatile(this, C) instanceof u5a;
    }

    public final void i(u5a u5aVar, boolean z) {
        Object obj = u5aVar.a;
        f.getClass();
        Unsafe unsafe = u4f.a;
        long j = C;
        if (unsafe.getObjectVolatile(this, j) instanceof u5a) {
            return;
        }
        if (!z) {
            ArrayList arrayList = this.b;
            arrayList.getClass();
            if (!arrayList.isEmpty()) {
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj2 = arrayList.get(i);
                    i++;
                    if (((u5a) obj2).a == obj) {
                        cy7.a(rs8.i(obj, "Cannot use select clauses on the same object: "));
                        return;
                    }
                }
            }
        }
        u5aVar.b.c(obj, this, u5aVar.d);
        if (this.e == x5a.d) {
            if (!z) {
                ArrayList arrayList2 = this.b;
                arrayList2.getClass();
                arrayList2.add(u5aVar);
            }
            u5aVar.g = this.c;
            u5aVar.h = this.d;
            this.c = null;
            this.d = -1;
            return;
        }
        u4f.a.putObjectVolatile(this, j, u5aVar);
    }

    public final boolean j(Object obj, Object obj2) {
        if (k(obj, obj2) == 0) {
            return true;
        }
        return false;
    }

    public final int k(Object obj, Object obj2) {
        w5a w5aVar;
        Unsafe unsafe;
        Unsafe unsafe2;
        mu4 mu4Var;
        while (true) {
            f.getClass();
            Unsafe unsafe3 = u4f.a;
            long j = C;
            Object objectVolatile = unsafe3.getObjectVolatile(this, j);
            if (objectVolatile instanceof e61) {
                u5a f2 = this.f(obj);
                if (f2 != null) {
                    mu4 mu4Var2 = f2.f;
                    if (mu4Var2 != null) {
                        mu4Var = (mu4) mu4Var2.c(this, f2.d, obj2);
                    } else {
                        mu4Var = null;
                    }
                    while (true) {
                        Unsafe unsafe4 = u4f.a;
                        w5aVar = this;
                        if (unsafe4.compareAndSwapObject(w5aVar, C, objectVolatile, f2)) {
                            e61 e61Var = (e61) objectVolatile;
                            w5aVar.e = obj2;
                            lie g = e61Var.g(pvc.a, mu4Var);
                            if (g == null) {
                                w5aVar.e = x5a.d;
                                return 2;
                            }
                            e61Var.n(g);
                            return 0;
                        } else if (unsafe4.getObjectVolatile(w5aVar, j) != objectVolatile) {
                            break;
                        } else {
                            this = w5aVar;
                        }
                    }
                } else {
                    continue;
                }
            } else {
                w5aVar = this;
                if (!c16.i(objectVolatile, x5a.b) && !(objectVolatile instanceof u5a)) {
                    if (c16.i(objectVolatile, x5a.c)) {
                        return 2;
                    }
                    if (c16.i(objectVolatile, x5a.a)) {
                        List A = tl1.A(obj);
                        do {
                            unsafe2 = u4f.a;
                            if (unsafe2.compareAndSwapObject(w5aVar, C, objectVolatile, A)) {
                                return 1;
                            }
                        } while (unsafe2.getObjectVolatile(w5aVar, j) == objectVolatile);
                    } else if (objectVolatile instanceof List) {
                        ArrayList o0 = sl1.o0((Collection) objectVolatile, obj);
                        do {
                            unsafe = u4f.a;
                            if (unsafe.compareAndSwapObject(w5aVar, C, objectVolatile, o0)) {
                                return 1;
                            }
                        } while (unsafe.getObjectVolatile(w5aVar, j) == objectVolatile);
                    } else {
                        xk5.p(objectVolatile, "Unexpected state: ");
                        return 0;
                    }
                } else {
                    return 3;
                }
            }
            this = w5aVar;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x008c, code lost:
        r0 = r10.s();
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0092, code lost:
        if (r0 != defpackage.n82.a) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0094, code lost:
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0095, code lost:
        return r9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object l(defpackage.v5a r13) {
        /*
            r12 = this;
            f61 r5 = new f61
            m42 r0 = defpackage.w92.t(r13)
            r6 = 1
            r5.<init>(r6, r0)
            r5.u()
        Ld:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = defpackage.w5a.f
            r0.getClass()
            sun.misc.Unsafe r0 = defpackage.u4f.a
            long r7 = defpackage.w5a.C
            java.lang.Object r4 = r0.getObjectVolatile(r12, r7)
            pvc r9 = defpackage.pvc.a
            r0 = r5
            lie r5 = defpackage.x5a.a
            if (r4 != r5) goto L3b
            r5 = r0
        L22:
            sun.misc.Unsafe r0 = defpackage.u4f.a
            long r2 = defpackage.w5a.C
            r1 = r12
            boolean r2 = r0.compareAndSwapObject(r1, r2, r4, r5)
            r10 = r5
            if (r2 == 0) goto L32
            r10.x(r12)
            goto L8c
        L32:
            java.lang.Object r0 = r0.getObjectVolatile(r12, r7)
            if (r0 == r4) goto L39
            goto L72
        L39:
            r5 = r10
            goto L22
        L3b:
            r10 = r0
            boolean r0 = r4 instanceof java.util.List
            r11 = 0
            if (r0 == 0) goto L74
        L41:
            sun.misc.Unsafe r0 = defpackage.u4f.a
            long r2 = defpackage.w5a.C
            r1 = r12
            boolean r2 = r0.compareAndSwapObject(r1, r2, r4, r5)
            if (r2 == 0) goto L6c
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.util.Iterator r0 = r4.iterator()
        L52:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L72
            java.lang.Object r2 = r0.next()
            u5a r2 = r12.f(r2)
            r2.getClass()
            r2.g = r11
            r3 = -1
            r2.h = r3
            r12.i(r2, r6)
            goto L52
        L6c:
            java.lang.Object r0 = r0.getObjectVolatile(r12, r7)
            if (r0 == r4) goto L41
        L72:
            r5 = r10
            goto Ld
        L74:
            boolean r0 = r4 instanceof defpackage.u5a
            if (r0 == 0) goto L96
            u5a r4 = (defpackage.u5a) r4
            java.lang.Object r0 = r12.e
            mu4 r2 = r4.f
            if (r2 == 0) goto L89
            java.lang.Object r3 = r4.d
            java.lang.Object r0 = r2.c(r12, r3, r0)
            r11 = r0
            mu4 r11 = (defpackage.mu4) r11
        L89:
            r10.m(r9, r11)
        L8c:
            java.lang.Object r0 = r10.s()
            n82 r1 = defpackage.n82.a
            if (r0 != r1) goto L95
            return r0
        L95:
            return r9
        L96:
            java.lang.String r0 = "unexpected state: "
            defpackage.xk5.p(r4, r0)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.w5a.l(v5a):java.lang.Object");
    }
}
