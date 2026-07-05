package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.util.SizeF;
import android.widget.RemoteViews;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: cqe  reason: default package */
/* loaded from: classes.dex */
public abstract class cqe {
    public static final tu1 a = new tu1(new Object(), false, -1571120048);
    public static final tu1 b = new tu1(new tx0(14), false, -1455401925);
    public static final gy8 c = new gy8(null, new ox8());
    public static final rg8 d = new rg8(18);
    public static final bv1 e = new bv1(2);

    public static final void a(String str, String str2, cz7 cz7Var, rv4 rv4Var, int i) {
        int i2;
        int i3;
        int i4;
        boolean z;
        cz7 cz7Var2;
        boolean z2;
        pb2 pb2Var;
        boolean z3;
        boolean z4;
        str.getClass();
        str2.getClass();
        cz7Var.getClass();
        rv4Var.g0(1370682843);
        if (rv4Var.f(str)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i5 = i | i2;
        if (rv4Var.f(str2)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i6 = i5 | i3;
        if (rv4Var.f(cz7Var)) {
            i4 = 256;
        } else {
            i4 = Token.CASE;
        }
        int i7 = i6 | i4;
        if ((i7 & Token.EXPR_VOID) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i7 & 1, z)) {
            if ((i7 & Token.ASSIGN_MOD) == 32) {
                z2 = true;
            } else {
                z2 = false;
            }
            Object P = rv4Var.P();
            Object obj = ax1.a;
            if (z2 || P == obj) {
                P = new op0(str2, 6);
                rv4Var.o0(P);
            }
            vt4 vt4Var = (vt4) P;
            sdd a2 = kv6.a(rv4Var);
            if (a2 != null) {
                if (a2 instanceof y35) {
                    pb2Var = ((y35) a2).f();
                } else {
                    pb2Var = ob2.b;
                }
                h93 h93Var = (h93) ((fdd) voe.z(cm9.a(h93.class), a2.i(), null, pb2Var, o96.a(rv4Var), vt4Var));
                aw7 z5 = jsc.z(h93Var.W, rv4Var);
                aw7 z6 = jsc.z(h93Var.d, rv4Var);
                Object[] objArr = new Object[0];
                if ((i7 & 14) == 4) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                Object P2 = rv4Var.P();
                if (z3 || P2 == obj) {
                    P2 = new op0(str, 7);
                    rv4Var.o0(P2);
                }
                aw7 aw7Var = (aw7) zpe.k(objArr, (vt4) P2, rv4Var, 0);
                Object[] objArr2 = new Object[0];
                Object P3 = rv4Var.P();
                if (P3 == obj) {
                    P3 = new rj2(23);
                    rv4Var.o0(P3);
                }
                aw7 aw7Var2 = (aw7) zpe.k(objArr2, (vt4) P3, rv4Var, 48);
                Object[] objArr3 = new Object[0];
                Object P4 = rv4Var.P();
                if (P4 == obj) {
                    P4 = new rj2(24);
                    rv4Var.o0(P4);
                }
                aw7 aw7Var3 = (aw7) zpe.k(objArr3, (vt4) P4, rv4Var, 48);
                boolean f = rv4Var.f(h93Var);
                Object P5 = rv4Var.P();
                if (f || P5 == obj) {
                    P5 = new cq2(h93Var, 10);
                    rv4Var.o0(P5);
                }
                tte.d(h93Var, null, (xt4) P5, rv4Var, 0);
                String str3 = (String) aw7Var.getValue();
                boolean f2 = rv4Var.f(h93Var) | rv4Var.f(aw7Var);
                Object P6 = rv4Var.P();
                if (f2 || P6 == obj) {
                    P6 = new db(h93Var, aw7Var, null, 13);
                    rv4Var.o0(P6);
                }
                yte.g((lu4) P6, rv4Var, str3);
                cz7Var2 = cz7Var;
                fxe.h(yqe.B((y3b) b3b.R.getValue(), new Object[]{(String) aw7Var.getValue()}, rv4Var), null, false, jce.E(-587010217, new p7(cz7Var, 17), rv4Var), jce.E(826630848, new ld1(aw7Var3, aw7Var2, z6, 9), rv4Var), null, jce.E(629721702, new q7(str2, cz7Var, z5, h93Var, 2), rv4Var), rv4Var, 1600512, 38);
                boolean booleanValue = ((Boolean) aw7Var2.getValue()).booleanValue();
                String str4 = (String) aw7Var.getValue();
                String A = yqe.A((y3b) b3b.P.getValue(), rv4Var);
                boolean f3 = rv4Var.f(aw7Var2);
                Object P7 = rv4Var.P();
                if (f3 || P7 == obj) {
                    P7 = new as1(aw7Var2, 17);
                    rv4Var.o0(P7);
                }
                xt4 xt4Var = (xt4) P7;
                boolean f4 = rv4Var.f(aw7Var2) | rv4Var.f(aw7Var);
                Object P8 = rv4Var.P();
                if (f4 || P8 == obj) {
                    P8 = new pr0(aw7Var2, aw7Var, 4);
                    rv4Var.o0(P8);
                }
                wq9.f(booleanValue, str4, A, xt4Var, (xt4) P8, rv4Var, 0);
                boolean booleanValue2 = ((Boolean) aw7Var3.getValue()).booleanValue();
                boolean f5 = rv4Var.f(aw7Var3);
                Object P9 = rv4Var.P();
                if (f5 || P9 == obj) {
                    P9 = new as1(aw7Var3, 18);
                    rv4Var.o0(P9);
                }
                xt4 xt4Var2 = (xt4) P9;
                boolean f6 = rv4Var.f(aw7Var3);
                if ((i7 & 896) == 256) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                boolean z7 = f6 | z4;
                Object P10 = rv4Var.P();
                if (z7 || P10 == obj) {
                    P10 = new rp0(cz7Var2, aw7Var3, 9);
                    rv4Var.o0(P10);
                }
                cae.g(booleanValue2, null, str2, xt4Var2, (vt4) P10, rv4Var, (i7 << 3) & 896);
            } else {
                vs.k("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
        } else {
            cz7Var2 = cz7Var;
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new ax(str, str2, cz7Var2, i, 14);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(defpackage.q3b r4, defpackage.ns2 r5, defpackage.sq9 r6, defpackage.n42 r7) {
        /*
            boolean r0 = r7 instanceof defpackage.r3b
            if (r0 == 0) goto L13
            r0 = r7
            r3b r0 = (defpackage.r3b) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            r3b r0 = new r3b
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.a
            int r1 = r0.b
            r2 = 1
            if (r1 == 0) goto L2c
            if (r1 != r2) goto L25
            defpackage.hre.r(r7)
            goto L3e
        L25:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r4)
            r4 = 0
            return r4
        L2c:
            defpackage.hre.r(r7)
            cr9 r4 = defpackage.vq9.a(r4, r6)
            r0.b = r2
            java.lang.Object r7 = defpackage.b4b.a(r4, r5, r0)
            n82 r4 = defpackage.n82.a
            if (r7 != r4) goto L3e
            return r4
        L3e:
            r7.getClass()
            s3b r7 = (defpackage.s3b) r7
            java.util.ArrayList r4 = r7.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cqe.b(q3b, ns2, sq9, n42):java.lang.Object");
    }

    public static final void c(v4 v4Var, b8a b8aVar) {
        if (kqe.d(b8aVar)) {
            u7a u7aVar = b8aVar.d;
            Object g = u7aVar.a.g(s7a.i);
            if (g == null) {
                g = null;
            }
            g4 g4Var = (g4) g;
            if (g4Var != null) {
                v4Var.b(new q4(16908349, g4Var.a));
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x00c6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00eb A[Catch: a26 -> 0x01c4, TRY_ENTER, TRY_LEAVE, TryCatch #7 {a26 -> 0x01c4, blocks: (B:35:0x00c2, B:43:0x00eb, B:57:0x0115, B:59:0x012b, B:63:0x0140, B:67:0x0148), top: B:121:0x00c2 }] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x020a  */
    /* JADX WARN: Type inference failed for: r20v1, types: [wl9, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v2, types: [vl9, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v1, types: [zl9, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v1, types: [xl9, java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:76:0x0198 -> B:18:0x0060). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object d(defpackage.ig6 r28, int r29, int r30, int r31, defpackage.r13 r32, defpackage.n42 r33) {
        /*
            Method dump skipped, instructions count: 586
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cqe.d(ig6, int, int, int, r13, n42):java.lang.Object");
    }

    public static final boolean e(boolean z, ig6 ig6Var, int i, int i2) {
        if (z) {
            if (ig6Var.c() <= i) {
                if (ig6Var.c() == i && ig6Var.d() > i2) {
                    return true;
                }
                return false;
            }
            return true;
        } else if (ig6Var.c() >= i) {
            if (ig6Var.c() == i && ig6Var.d() < i2) {
                return true;
            }
            return false;
        } else {
            return true;
        }
    }

    public static Handler f(Looper looper) {
        if (Build.VERSION.SDK_INT >= 28) {
            return ru.h(looper);
        }
        try {
            return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
        } catch (IllegalAccessException e2) {
            e = e2;
            Log.w("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
            return new Handler(looper);
        } catch (InstantiationException e3) {
            e = e3;
            Log.w("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
            return new Handler(looper);
        } catch (NoSuchMethodException e4) {
            e = e4;
            Log.w("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
            return new Handler(looper);
        } catch (InvocationTargetException e5) {
            Throwable cause = e5.getCause();
            if (!(cause instanceof RuntimeException)) {
                if (!(cause instanceof Error)) {
                    fb4.l(cause);
                    return null;
                }
                throw ((Error) cause);
            }
            throw ((RuntimeException) cause);
        }
    }

    public static final sm2 g(ibb ibbVar, String str) {
        ibbVar.getClass();
        str.getClass();
        return new sm2(ibbVar.a, str, ibbVar.b, ibbVar.c, ibbVar.d, ibbVar.e, ibbVar.f, ibbVar.g, ibbVar.h, ibbVar.i, ibbVar.j, ibbVar.k);
    }

    public static final float h(long j, ff8 ff8Var) {
        ff8Var.getClass();
        int ordinal = ff8Var.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                return y78.g(j);
            }
            xk5.o();
            return nae.e;
        }
        return y78.h(j);
    }

    public static final xq7 i(d82 d82Var) {
        xq7 xq7Var = (xq7) d82Var.get(zj1.C);
        if (xq7Var != null) {
            return xq7Var;
        }
        vs.k("A MonotonicFrameClock is not available in this CoroutineContext. Callers should supply an appropriate MonotonicFrameClock using withContext.");
        return null;
    }

    public static final boolean j(ig6 ig6Var, int i) {
        int c2 = ig6Var.c();
        if (i <= ig6Var.e() && c2 <= i) {
            return true;
        }
        return false;
    }

    public static final long k(long j, ff8 ff8Var) {
        ff8Var.getClass();
        int ordinal = ff8Var.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                return oue.p(-y78.g(j), y78.h(j));
            }
            xk5.o();
            return 0L;
        }
        return oue.p(y78.g(j), -y78.h(j));
    }

    public static final void l(RemoteViews remoteViews, smc smcVar, bx5 bx5Var, List list) {
        int i = 0;
        for (Object obj : sl1.v0(list, 10)) {
            int i2 = i + 1;
            if (i >= 0) {
                o(remoteViews, smcVar.b(bx5Var, i), (lp3) obj);
                i = i2;
            } else {
                tl1.M();
                throw null;
            }
        }
    }

    public static final List m(q3b q3bVar, rv4 rv4Var) {
        q3bVar.getClass();
        ns2 s = hma.s(fr9.a, rv4Var);
        Object P = rv4Var.P();
        lh9 lh9Var = ax1.a;
        if (P == lh9Var) {
            P = new n3b(19);
            rv4Var.o0(P);
        }
        vt4 vt4Var = (vt4) P;
        boolean f = rv4Var.f(q3bVar) | rv4Var.h(s);
        Object P2 = rv4Var.P();
        if (f || P2 == lh9Var) {
            P2 = new jk8(q3bVar, s, (m42) null, 25);
            rv4Var.o0(P2);
        }
        return (List) fre.q(q3bVar, vt4Var, (lu4) P2, rv4Var).getValue();
    }

    public static final int n(cc ccVar) {
        int i = ccVar.a;
        int i2 = 8388611;
        if (i != 0) {
            if (i == 2) {
                i2 = 8388613;
            } else if (i == 1) {
                i2 = 1;
            } else {
                Log.w("GlanceAppWidget", "Unknown horizontal alignment: " + ((Object) ac.b(i)));
            }
        }
        int i3 = ccVar.b;
        int i4 = 48;
        if (i3 != 0) {
            if (i3 == 2) {
                i4 = 80;
            } else if (i3 == 1) {
                i4 = 16;
            } else {
                Log.w("GlanceAppWidget", "Unknown vertical alignment: " + ((Object) bc.b(i3)));
            }
        }
        return i2 | i4;
    }

    /* JADX WARN: Code restructure failed: missing block: B:124:0x02fd, code lost:
        if (defpackage.c16.i(r3, r2) != false) goto L118;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void o(android.widget.RemoteViews r19, defpackage.smc r20, defpackage.lp3 r21) {
        /*
            Method dump skipped, instructions count: 853
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cqe.o(android.widget.RemoteViews, smc, lp3):void");
    }

    public static final RemoteViews p(Context context, int i, rn9 rn9Var, rc6 rc6Var, int i2, ComponentName componentName) {
        boolean z;
        if (context.getResources().getConfiguration().getLayoutDirection() == 1) {
            z = true;
        } else {
            z = false;
        }
        smc smcVar = new smc(context, i, z, rc6Var, -1, false, new AtomicInteger(1), new bx5(0, 0, null, 7), new AtomicBoolean(false), 9205357640488583168L, -1, false, null, componentName);
        ArrayList arrayList = rn9Var.b;
        if (arrayList == null || !arrayList.isEmpty()) {
            int size = arrayList.size();
            int i3 = 0;
            while (i3 < size) {
                Object obj = arrayList.get(i3);
                i3++;
                if (!(((lp3) obj) instanceof rp3)) {
                    lp3 lp3Var = (lp3) sl1.r0(arrayList);
                    qn9 a2 = re6.a(smcVar, lp3Var.a(), i2);
                    RemoteViews remoteViews = a2.a;
                    o(remoteViews, smc.a(smcVar.b(a2.b, 0), 0, new AtomicInteger(1), null, new AtomicBoolean(false), 0L, null, 32447), lp3Var);
                    return remoteViews;
                }
            }
        }
        Object c0 = sl1.c0(arrayList);
        c0.getClass();
        sna snaVar = ((rp3) c0).d;
        ArrayList arrayList2 = new ArrayList(tl1.s(arrayList, 10));
        int size2 = arrayList.size();
        int i4 = 0;
        while (i4 < size2) {
            Object obj2 = arrayList.get(i4);
            i4++;
            lp3 lp3Var2 = (lp3) obj2;
            lp3Var2.getClass();
            long j = ((rp3) lp3Var2).c;
            qn9 a3 = re6.a(smcVar, lp3Var2.a(), i2);
            RemoteViews remoteViews2 = a3.a;
            o(remoteViews2, smc.a(smcVar.b(a3.b, 0), 0, new AtomicInteger(1), null, new AtomicBoolean(false), j, null, 31935), lp3Var2);
            arrayList2.add(new yk8(new SizeF(ug3.b(j), ug3.a(j)), remoteViews2));
        }
        if (snaVar instanceof rna) {
            return (RemoteViews) ((yk8) sl1.r0(arrayList2)).b;
        }
        if (c16.i(snaVar, qna.a)) {
            if (Build.VERSION.SDK_INT >= 31) {
                return wu.a.a(o17.x(arrayList2));
            }
            if (arrayList2.size() != 1 && arrayList2.size() != 2) {
                vs.m("unsupported views size");
                return null;
            }
            ArrayList arrayList3 = new ArrayList(tl1.s(arrayList2, 10));
            int size3 = arrayList2.size();
            int i5 = 0;
            while (i5 < size3) {
                Object obj3 = arrayList2.get(i5);
                i5++;
                arrayList3.add((RemoteViews) ((yk8) obj3).b);
            }
            int size4 = arrayList3.size();
            if (size4 != 1) {
                if (size4 == 2) {
                    return new RemoteViews((RemoteViews) arrayList3.get(0), (RemoteViews) arrayList3.get(1));
                }
                vs.m("There must be between 1 and 2 views.");
                return null;
            }
            return (RemoteViews) arrayList3.get(0);
        }
        xk5.o();
        return null;
    }

    public static String q(String str, Object... objArr) {
        int length;
        int length2;
        int indexOf;
        String o;
        int i = 0;
        int i2 = 0;
        while (true) {
            length = objArr.length;
            if (i2 >= length) {
                break;
            }
            Object obj = objArr[i2];
            if (obj == null) {
                o = "null";
            } else {
                try {
                    o = obj.toString();
                } catch (Exception e2) {
                    String o2 = eub.o(obj.getClass().getName(), "@", Integer.toHexString(System.identityHashCode(obj)));
                    Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for ".concat(o2), (Throwable) e2);
                    o = hl5.o("<", o2, " threw ", e2.getClass().getName(), ">");
                }
            }
            objArr[i2] = o;
            i2++;
        }
        StringBuilder sb = new StringBuilder(str.length() + (length * 16));
        int i3 = 0;
        while (true) {
            length2 = objArr.length;
            if (i >= length2 || (indexOf = str.indexOf("%s", i3)) == -1) {
                break;
            }
            sb.append((CharSequence) str, i3, indexOf);
            sb.append(objArr[i]);
            i++;
            i3 = indexOf + 2;
        }
        sb.append((CharSequence) str, i3, str.length());
        if (i < length2) {
            sb.append(" [");
            sb.append(objArr[i]);
            for (int i4 = i + 1; i4 < objArr.length; i4++) {
                sb.append(", ");
                sb.append(objArr[i4]);
            }
            sb.append(']');
        }
        return sb.toString();
    }
}
