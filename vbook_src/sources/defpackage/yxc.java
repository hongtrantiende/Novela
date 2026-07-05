package defpackage;

import com.reader.data.updates.impl.bookupdate.AndroidBookUpdateWorker;
import j$.time.Instant;
import j$.time.ZoneId;
import j$.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.TimeUnit;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: yxc  reason: default package */
/* loaded from: classes3.dex */
public final class yxc implements wxc {
    public static final long e;
    public final as0 a;
    public final o84 b;
    public final dx c;
    public final cza d;

    static {
        r76[] r76VarArr = dx.W;
        hq7 hq7Var = wl3.b;
        e = wl3.e(jue.O(1, am3.HOURS));
    }

    public yxc(as0 as0Var, o84 o84Var, dx dxVar) {
        this.a = as0Var;
        this.b = o84Var;
        this.c = dxVar;
        this.d = as0Var.b;
    }

    public final pvc a() {
        int i;
        Object obj;
        long j;
        long j2;
        long j3;
        dx dxVar = this.c;
        boolean booleanValue = ((Boolean) dxVar.B.c(dx.W[26], dxVar)).booleanValue();
        pvc pvcVar = pvc.a;
        if (booleanValue) {
            int f = dxVar.f();
            int i2 = w9c.b;
            w9c p = b16.p();
            ZoneId zoneId = p.a;
            zx5 k = by5.a.k();
            nt6 a = c16.x(k, p).a();
            List B = tl1.B(6, 12, 18, 23);
            ArrayList arrayList = new ArrayList(tl1.s(B, 10));
            Iterator it = B.iterator();
            while (true) {
                i = 0;
                if (!it.hasNext()) {
                    break;
                }
                Instant instant = new xt6(a, new fv6(((Number) it.next()).intValue(), 0, 0, 0)).a.E(zoneId).toInstant();
                instant.getClass();
                arrayList.add(eze.t(instant));
            }
            int size = arrayList.size();
            while (true) {
                if (i < size) {
                    obj = arrayList.get(i);
                    i++;
                    zx5 zx5Var = (zx5) obj;
                    zx5Var.getClass();
                    int m = c16.m(zx5Var.a, k.a);
                    if (m == 0) {
                        m = c16.l(zx5Var.b, k.b);
                        continue;
                    }
                    if (m > 0) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            zx5 zx5Var2 = (zx5) obj;
            if (zx5Var2 == null) {
                zx5 zx5Var3 = (zx5) sl1.c0(arrayList);
                qj2.Companion.getClass();
                lj2 lj2Var = qj2.a;
                zx5Var3.getClass();
                lj2Var.getClass();
                try {
                    f1d u = c16.u(zx5Var3, p);
                    Instant instant2 = ZonedDateTime.ofLocal(sze.i(sze.q(zx5Var3, u), 1L, lj2Var).a, zoneId, u.a).toInstant();
                    instant2.getClass();
                    zx5Var2 = eze.t(instant2);
                } catch (ArithmeticException e2) {
                    throw new gt1(1, "Arithmetic overflow when adding to an Instant", e2);
                } catch (IllegalArgumentException e3) {
                    throw new gt1(1, "Boundaries of Instant exceeded when adding a value", e3);
                }
            }
            long e4 = wl3.e(zx5Var2.a(k));
            if (f != 0) {
                if (f != 1) {
                    j = 86400000;
                    if (f != 2) {
                        if (f != 3) {
                            if (f == 4) {
                                j = 604800000;
                            }
                        } else {
                            j = 129600000;
                        }
                    }
                } else {
                    j = 43200000;
                }
            } else {
                j = 21600000;
            }
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            timeUnit.getClass();
            f0 f0Var = new f0(AndroidBookUpdateWorker.class);
            ymd ymdVar = (ymd) f0Var.b;
            ymdVar.getClass();
            String str = ymd.z;
            long j4 = 900000;
            int i3 = (j > 900000L ? 1 : (j == 900000L ? 0 : -1));
            if (i3 < 0) {
                r95.n().s(str, "Interval duration lesser than minimum allowed value; Changed to 900000");
            }
            if (i3 >= 0) {
                j4 = j;
            }
            if (i3 < 0) {
                j2 = 900000;
            } else {
                j2 = j;
            }
            int i4 = (j4 > 900000L ? 1 : (j4 == 900000L ? 0 : -1));
            if (i4 < 0) {
                r95.n().s(str, "Interval duration lesser than minimum allowed value; Changed to 900000");
            }
            if (i4 < 0) {
                j3 = 900000;
            } else {
                j3 = j4;
            }
            ymdVar.h = j3;
            if (j2 < 300000) {
                r95.n().s(str, "Flex duration lesser than minimum allowed value; Changed to 300000");
            }
            if (j2 > ymdVar.h) {
                r95.n().s(str, "Flex duration greater than interval duration; Changed to " + j4);
            }
            ymdVar.i = dce.o(j2, 300000L, ymdVar.h);
            nt8 nt8Var = (nt8) f0Var.l(e4, timeUnit);
            ((ymd) nt8Var.b).j = new w02(new w18(null), c28.b, false, false, true, false, -1L, -1L, sl1.H0(new LinkedHashSet()));
            new amd(lmd.b(this.a.a), "book_update_work", kz3.b, Collections.singletonList((ot8) nt8Var.a()), 0).a();
        }
        return pvcVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x008c A[LOOP:0: B:22:0x0086->B:24:0x008c, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable b(defpackage.n42 r13) {
        /*
            r12 = this;
            dx r0 = r12.c
            wx6 r1 = r0.N
            boolean r2 = r13 instanceof defpackage.xxc
            if (r2 == 0) goto L17
            r2 = r13
            xxc r2 = (defpackage.xxc) r2
            int r3 = r2.c
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.c = r3
            goto L1c
        L17:
            xxc r2 = new xxc
            r2.<init>(r12, r13)
        L1c:
            java.lang.Object r13 = r2.a
            int r3 = r2.c
            r4 = 0
            r5 = 1
            if (r3 == 0) goto L30
            if (r3 != r5) goto L2a
            defpackage.hre.r(r13)
            goto L75
        L2a:
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r12)
            return r4
        L30:
            defpackage.hre.r(r13)
            yj1 r13 = defpackage.by5.a
            zx5 r13 = r13.k()
            long r6 = r13.b()
            r76[] r13 = defpackage.dx.W
            r3 = 39
            r8 = r13[r3]
            java.lang.Object r0 = r1.c(r8, r0)
            java.lang.Number r0 = (java.lang.Number) r0
            long r8 = r0.longValue()
            long r8 = r6 - r8
            long r10 = defpackage.yxc.e
            int r0 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r0 >= 0) goto L58
            ks3 r12 = defpackage.ks3.a
            return r12
        L58:
            r13 = r13[r3]
            java.lang.Long r0 = java.lang.Long.valueOf(r6)
            r1.e(r13, r0)
            r2.c = r5
            uw2 r13 = new uw2
            r0 = 19
            o84 r12 = r12.b
            r13.<init>(r12, r4, r0)
            java.lang.Object r13 = defpackage.k27.p(r13, r2)
            n82 r12 = defpackage.n82.a
            if (r13 != r12) goto L75
            return r12
        L75:
            java.lang.Iterable r13 = (java.lang.Iterable) r13
            java.util.ArrayList r12 = new java.util.ArrayList
            r0 = 10
            int r0 = defpackage.tl1.s(r13, r0)
            r12.<init>(r0)
            java.util.Iterator r13 = r13.iterator()
        L86:
            boolean r0 = r13.hasNext()
            if (r0 == 0) goto L98
            java.lang.Object r0 = r13.next()
            l54 r0 = (defpackage.l54) r0
            java.lang.String r0 = r0.b
            r12.add(r0)
            goto L86
        L98:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yxc.b(n42):java.io.Serializable");
    }
}
