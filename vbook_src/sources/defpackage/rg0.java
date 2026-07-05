package defpackage;

import android.view.textclassifier.TextClassifier;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: rg0  reason: default package */
/* loaded from: classes3.dex */
public final class rg0 extends aab implements lu4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rg0(Object obj, m42 m42Var, int i) {
        super(2, m42Var);
        this.a = i;
        this.b = obj;
    }

    public static final void o(yl9 yl9Var, HashSet hashSet, ArrayList arrayList, zl9 zl9Var, ng1 ng1Var, fa7 fa7Var, boolean z) {
        String str = null;
        if (fa7Var.a() - yl9Var.a > 21600000) {
            if (!hashSet.contains(zj1.f(fa7Var.a(), "yyyyMMddHH"))) {
                arrayList.add(new wb3(fa7Var.a()));
            }
            ff1 ff1Var = (ff1) zl9Var.a;
            if (ff1Var != null) {
                hre.s(ff1Var);
            }
            zl9Var.a = null;
        } else if (fa7Var.a() - yl9Var.a > 120000) {
            ff1 ff1Var2 = (ff1) zl9Var.a;
            if (ff1Var2 != null) {
                hre.s(ff1Var2);
            }
            zl9Var.a = null;
        }
        String str2 = fa7Var.c().a;
        wzc wzcVar = ng1Var.H;
        if (wzcVar != null) {
            str = wzcVar.a;
        }
        ff1 ff1Var3 = new ff1(fa7Var, c16.i(str2, str), z);
        ff1 ff1Var4 = (ff1) zl9Var.a;
        db7 db7Var = db7.a;
        if (ff1Var4 == null) {
            ff1Var3.d = db7Var;
        } else {
            boolean i = c16.i(fa7Var.c().a, ff1Var4.a.c().a);
            db7 db7Var2 = ff1Var4.d;
            if (i) {
                db7 db7Var3 = db7.c;
                if (db7Var2 == db7Var3) {
                    ff1Var4.d = db7.b;
                }
                ff1Var3.d = db7Var3;
            } else {
                if (db7Var2 == db7Var) {
                    ff1Var4.d = db7.d;
                }
                ff1Var3.d = db7Var;
            }
        }
        arrayList.add(ff1Var3);
        zl9Var.a = ff1Var3;
        yl9Var.a = fa7Var.a();
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                return new rg0((dub) obj2, m42Var, 0);
            case 1:
                return new rg0((ng1) obj2, m42Var, 1);
            case 2:
                return new rg0((lz1) obj2, m42Var, 2);
            case 3:
                return new rg0((ymd) obj2, m42Var, 3);
            case 4:
                return new rg0((l93) obj2, m42Var, 4);
            case 5:
                return new rg0((ra3) obj2, m42Var, 5);
            case 6:
                return new rg0((v84) obj2, m42Var, 6);
            case 7:
                return new rg0((h94) obj2, m42Var, 7);
            case 8:
                return new rg0((zt1) obj2, m42Var, 8);
            case 9:
                return new rg0((hn8) obj2, m42Var, 9);
            case 10:
                return new rg0((vp4) obj2, m42Var, 10);
            case 11:
                return new rg0((i55) obj2, m42Var, 11);
            case 12:
                return new rg0((w65) obj2, m42Var, 12);
            case 13:
                return new rg0((rt8) obj2, m42Var, 13);
            case 14:
                return new rg0((nl1) obj2, m42Var, 14);
            case 15:
                return new rg0((i58) obj2, m42Var, 15);
            case 16:
                return new rg0((vi8) obj2, m42Var, 16);
            case 17:
                return new rg0((bx8) obj2, m42Var, 17);
            case 18:
                return new rg0((xx8) obj2, m42Var, 18);
            case 19:
                return new rg0((vfb) obj2, m42Var, 19);
            case 20:
                return new rg0((zi9) obj2, m42Var, 20);
            case 21:
                return new rg0((saa) obj2, m42Var, 21);
            case 22:
                return new rg0((v7c) obj2, m42Var, 22);
            case 23:
                return new rg0((s8c) obj2, m42Var, 23);
            case 24:
                return new rg0((shc) obj2, m42Var, 24);
            case 25:
                return new rg0((zqc) obj2, m42Var, 25);
            case 26:
                return new rg0((csc) obj2, m42Var, 26);
            case 27:
                return new rg0((pgd) obj2, m42Var, 27);
            default:
                return new rg0((iaa) obj2, m42Var, 28);
        }
    }

    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        switch (i) {
            case 0:
                ((rg0) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
                return pvcVar;
            case 1:
                return ((rg0) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 2:
                ((rg0) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
                return pvcVar;
            case 3:
                ((rg0) create((d12) obj, (m42) obj2)).invokeSuspend(pvcVar);
                return pvcVar;
            case 4:
                ((rg0) create((List) obj, (m42) obj2)).invokeSuspend(pvcVar);
                return pvcVar;
            case 5:
                return ((rg0) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 6:
                ((rg0) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
                return pvcVar;
            case 7:
                ((rg0) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
                return pvcVar;
            case 8:
                ((rg0) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
                return pvcVar;
            case 9:
                return ((rg0) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 10:
                ((rg0) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
                return pvcVar;
            case 11:
                return ((rg0) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 12:
                ((rg0) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
                return pvcVar;
            case 13:
                ((rg0) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
                return pvcVar;
            case 14:
                ((rg0) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
                return pvcVar;
            case 15:
                ((rg0) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
                return pvcVar;
            case 16:
                ((rg0) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
                return pvcVar;
            case 17:
                return ((rg0) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 18:
                return ((rg0) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 19:
                ((rg0) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
                return pvcVar;
            case 20:
                ((rg0) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
                return pvcVar;
            case 21:
                return ((rg0) create((saa) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 22:
                ((rg0) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
                return pvcVar;
            case 23:
                ((rg0) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
                return pvcVar;
            case 24:
                ((rg0) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
                return pvcVar;
            case 25:
                ((rg0) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
                return pvcVar;
            case 26:
                ((rg0) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
                return pvcVar;
            case 27:
                ((rg0) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
                return pvcVar;
            default:
                ((rg0) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
                return pvcVar;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [yl9, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v15, types: [java.lang.Object, yma] */
    /* JADX WARN: Type inference failed for: r2v28, types: [my0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v28 */
    /* JADX WARN: Type inference failed for: r4v0, types: [zl9, java.lang.Object] */
    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        uyb uybVar;
        Throwable th;
        Object value;
        Object value2;
        boolean e;
        boolean booleanValue;
        boolean c;
        boolean g;
        int a;
        long b;
        Object value3;
        int c2;
        int d;
        boolean i;
        boolean f;
        boolean h;
        boolean e2;
        boolean booleanValue2;
        boolean z;
        char c3 = 1;
        int i2 = 0;
        byte[] bArr = null;
        switch (this.a) {
            case 0:
                hre.r(obj);
                dub dubVar = (dub) this.b;
                long j = dubVar.d().e;
                int i3 = fxb.c;
                if (((int) (j >> 32)) == 0 && fxb.d(dubVar.d().e)) {
                    frb g2 = dubVar.g();
                    try {
                        g2.g(sze.a(1, 1));
                        dubVar.b(g2);
                    } finally {
                        dubVar.c();
                    }
                }
                return pvc.a;
            case 1:
                hre.r(obj);
                ArrayList arrayList = new ArrayList();
                ?? obj3 = new Object();
                HashSet hashSet = new HashSet();
                ?? obj4 = new Object();
                ng1 ng1Var = (ng1) this.b;
                Collection values = ng1Var.P.values();
                values.getClass();
                List<fa7> u0 = sl1.u0(values, new kn4(17));
                ng1 ng1Var2 = (ng1) this.b;
                for (fa7 fa7Var : u0) {
                    fa7Var.getClass();
                    ng1 ng1Var3 = ng1Var2;
                    o(obj3, hashSet, arrayList, obj4, ng1Var3, fa7Var, false);
                    ng1Var2 = ng1Var3;
                }
                Collection<fa7> values2 = ng1Var.Q.values();
                values2.getClass();
                ng1 ng1Var4 = (ng1) this.b;
                for (fa7 fa7Var2 : values2) {
                    fa7Var2.getClass();
                    o(obj3, hashSet, arrayList, obj4, ng1Var4, fa7Var2, true);
                }
                ff1 ff1Var = (ff1) obj4.a;
                if (ff1Var != null) {
                    hre.s(ff1Var);
                }
                return sl1.p0(arrayList);
            case 2:
                hre.r(obj);
                lz1 lz1Var = (lz1) this.b;
                cza czaVar = lz1Var.c;
                dx dxVar = lz1Var.a;
                hy5 hy5Var = dxVar.v;
                r76[] r76VarArr = dx.W;
                Integer num = new Integer(((Number) hy5Var.c(r76VarArr[20], dxVar)).intValue());
                czaVar.getClass();
                czaVar.n(null, num);
                cza czaVar2 = lz1Var.d;
                Integer num2 = new Integer(((Number) dxVar.w.c(r76VarArr[21], dxVar)).intValue());
                czaVar2.getClass();
                czaVar2.n(null, num2);
                cza czaVar3 = lz1Var.e;
                Integer num3 = new Integer(((Number) dxVar.x.c(r76VarArr[22], dxVar)).intValue());
                czaVar3.getClass();
                czaVar3.n(null, num3);
                cza czaVar4 = lz1Var.f;
                Integer num4 = new Integer(dxVar.b());
                czaVar4.getClass();
                czaVar4.n(null, num4);
                cza czaVar5 = lz1Var.g;
                Boolean valueOf = Boolean.valueOf(dxVar.a());
                czaVar5.getClass();
                czaVar5.n(null, valueOf);
                return pvc.a;
            case 3:
                hre.r(obj);
                String str = u02.a;
                r95.n().c(str, "Constraints changed for " + ((ymd) this.b));
                return pvc.a;
            case 4:
                hre.r(obj);
                l93 l93Var = (l93) this.b;
                hk1 a2 = jdd.a(l93Var);
                sw2 sw2Var = ab3.a;
                l93Var.f(a2, ru2.c, new l(l93Var, null, 17));
                return pvc.a;
            case 5:
                hre.r(obj);
                ra3 ra3Var = (ra3) this.b;
                synchronized (ra3Var.D) {
                    if (ra3Var.I && !ra3Var.J) {
                        try {
                            ra3Var.p0();
                        } catch (IOException unused) {
                            ra3Var.K = true;
                        }
                        try {
                            if (ra3Var.F >= 2000) {
                                i2 = 1;
                            }
                            if (i2 != 0) {
                                ra3Var.I0();
                            }
                        } catch (IOException unused2) {
                            ra3Var.L = true;
                            ra3Var.G = new lj9(new Object());
                        }
                        return pvc.a;
                    }
                    return pvc.a;
                }
            case 6:
                int i4 = 21;
                hre.r(obj);
                v84 v84Var = (v84) this.b;
                for (l54 l54Var : v84Var.D) {
                    Iterator it = v84Var.E.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            obj2 = it.next();
                            if (c16.i(((l54) obj2).a, l54Var.a)) {
                            }
                        } else {
                            obj2 = null;
                        }
                    }
                    l54 l54Var2 = (l54) obj2;
                    if (l54Var2 != null && l54Var2.g < l54Var.g) {
                        hk1 a3 = jdd.a(v84Var);
                        sw2 sw2Var2 = ab3.a;
                        v84Var.f(a3, ru2.c, new uw2(v84Var, l54Var, (m42) null, i4));
                    }
                    i4 = 21;
                }
                return pvc.a;
            case 7:
                hre.r(obj);
                h94 h94Var = (h94) this.b;
                int i5 = h94Var.q;
                while (i2 < i5) {
                    int i6 = h94Var.p + i2 + 1;
                    List list = h94Var.k;
                    if (list != null) {
                        uybVar = (uyb) sl1.f0(i6, list);
                    } else {
                        uybVar = null;
                    }
                    if (uybVar != null) {
                        String str2 = uybVar.a;
                        k97 k97Var = h94Var.s;
                        k97Var.getClass();
                        if (k97Var.a.h(str2) == null) {
                            a94 a94Var = new a94();
                            h94Var.C(a94Var, str2);
                            k97Var.a(str2, a94Var);
                        }
                    }
                    i2++;
                }
                return pvc.a;
            case 8:
                hre.r(obj);
                zt1 zt1Var = (zt1) this.b;
                if (zt1Var != null) {
                    WeakReference weakReference = fd4.a;
                    fd4.a = new WeakReference(zt1Var);
                }
                return pvc.a;
            case 9:
                hre.r(obj);
                pe4.a.getClass();
                qw5 J = tl1.J(((hn8) this.b).toFile());
                ?? obj5 = new Object();
                try {
                    obj5.J(J);
                    byte[] p0 = obj5.p0(obj5.b);
                    try {
                        J.close();
                        obj5.o();
                    } catch (Throwable th2) {
                        bArr = th2;
                    }
                    byte[] bArr2 = bArr;
                    bArr = p0;
                    th = bArr2;
                } catch (Throwable th3) {
                    Throwable th4 = th3;
                    try {
                        J.close();
                        obj5.o();
                        th = th4;
                    } catch (Throwable th5) {
                        pye.e(th4, th5);
                        th = th4;
                    }
                }
                if (th == null) {
                    return bArr;
                }
                throw th;
            case 10:
                hre.r(obj);
                vp4 vp4Var = (vp4) this.b;
                hk1 a4 = jdd.a(vp4Var);
                sw2 sw2Var3 = ab3.a;
                vp4Var.f(a4, ru2.c, new d53(vp4Var, null, 23));
                return pvc.a;
            case 11:
                hre.r(obj);
                pgd pgdVar = ((i55) this.b).a;
                if (pgdVar == null) {
                    return null;
                }
                pgdVar.a.destroy();
                pgdVar.f.clear();
                pgdVar.e = null;
                return pvc.a;
            case 12:
                hre.r(obj);
                w65 w65Var = (w65) this.b;
                cza czaVar6 = w65Var.C;
                if (czaVar6 != null) {
                    do {
                        value = czaVar6.getValue();
                    } while (!czaVar6.l(value, t65.a((t65) value, 0, 0, false, false, false, ((qi9) w65Var.f).g(), null, 191)));
                    return pvc.a;
                }
                return pvc.a;
            case 13:
                hre.r(obj);
                ((rt8) this.b).a.a();
                return pvc.a;
            case 14:
                hre.r(obj);
                btd btdVar = ((nl1) this.b).a;
                sz9.o.getClass();
                btdVar.m(new rh4(2.0f));
                btdVar.I.setValue(Boolean.FALSE);
                yrd yrdVar = btdVar.c;
                yrdVar.getClass();
                zr1.A();
                if (yrdVar.m) {
                    yrdVar.m = false;
                    qw6 qw6Var = yrdVar.a;
                    qw6Var.getClass();
                    mw6 mw6Var = mw6.b;
                    if (qw6Var.a(mw6Var)) {
                        pj pjVar = qw6Var.b;
                        String str3 = qw6Var.a;
                        pjVar.getClass();
                        pj.a(mw6Var, str3, "ZoomableState. rubberBandScale=false");
                    }
                }
                return pvc.a;
            case 15:
                hre.r(obj);
                i58 i58Var = (i58) this.b;
                cza czaVar7 = i58Var.b;
                dx dxVar2 = i58Var.a;
                ls0 ls0Var = dxVar2.y;
                r76[] r76VarArr2 = dx.W;
                Boolean bool = (Boolean) ls0Var.c(r76VarArr2[23], dxVar2);
                bool.booleanValue();
                czaVar7.getClass();
                czaVar7.n(null, bool);
                cza czaVar8 = i58Var.c;
                Boolean bool2 = (Boolean) dxVar2.z.c(r76VarArr2[24], dxVar2);
                bool2.getClass();
                czaVar8.getClass();
                czaVar8.n(null, bool2);
                cza czaVar9 = i58Var.d;
                Boolean bool3 = (Boolean) dxVar2.A.c(r76VarArr2[25], dxVar2);
                bool3.booleanValue();
                czaVar9.getClass();
                czaVar9.n(null, bool3);
                cza czaVar10 = i58Var.e;
                Boolean bool4 = (Boolean) dxVar2.B.c(r76VarArr2[26], dxVar2);
                bool4.booleanValue();
                czaVar10.getClass();
                czaVar10.n(null, bool4);
                cza czaVar11 = i58Var.f;
                Integer num5 = new Integer(((Number) dxVar2.C.c(r76VarArr2[27], dxVar2)).intValue());
                czaVar11.getClass();
                czaVar11.n(null, num5);
                cza czaVar12 = i58Var.g;
                Integer num6 = new Integer(dxVar2.f());
                czaVar12.getClass();
                czaVar12.n(null, num6);
                return pvc.a;
            case 16:
                hre.r(obj);
                vi8 vi8Var = (vi8) this.b;
                vi8Var.h(nae.e);
                vi8Var.e.setValue(Boolean.TRUE);
                vi8Var.f();
                return pvc.a;
            case 17:
                hre.r(obj);
                wj9 wj9Var = new wj9(fpe.v((bx8) this.b));
                try {
                    byte[] n = pbe.n(wj9Var, -1);
                    dxe.r(wj9Var, null);
                    return n;
                } catch (Throwable th6) {
                    try {
                        throw th6;
                    } catch (Throwable th7) {
                        dxe.r(wj9Var, th6);
                        throw th7;
                    }
                }
            case 18:
                hre.r(obj);
                xx8 xx8Var = (xx8) this.b;
                TextClassifier k = ru.k(xx8Var.b, xx8Var.c);
                xx8Var.f = k;
                return k;
            case 19:
                hre.r(obj);
                ((vfb) this.b).b(rfb.b);
                return pvc.a;
            case 20:
                hre.r(obj);
                zi9 zi9Var = (zi9) this.b;
                cza czaVar13 = zi9Var.d;
                if (czaVar13 != null) {
                    do {
                        value2 = czaVar13.getValue();
                        pi9 pi9Var = zi9Var.c;
                        e = ((qi9) pi9Var).a.e();
                        qi9 qi9Var = (qi9) pi9Var;
                        xh9 xh9Var = qi9Var.a;
                        booleanValue = ((Boolean) xh9Var.d.c(xh9.s[2], xh9Var)).booleanValue();
                        c = qi9Var.a.c();
                        g = qi9Var.g();
                        a = qi9Var.a();
                        b = qi9Var.b();
                        ((yi9) value2).getClass();
                    } while (!czaVar13.l(value2, new yi9(e, booleanValue, c, g, a, b)));
                    return pvc.a;
                }
                return pvc.a;
            case 21:
                hre.r(obj);
                return (saa) this.b;
            case 22:
                hre.r(obj);
                v7c v7cVar = (v7c) this.b;
                v7cVar.getClass();
                try {
                    eub.u(v7cVar);
                } catch (RuntimeException e3) {
                    throw e3;
                } catch (Exception unused3) {
                }
                return pvc.a;
            case 23:
                s8c s8cVar = (s8c) this.b;
                hre.r(obj);
                try {
                    jm9 a5 = s8cVar.c.a(new g7b(new aq5(s8cVar.a), s8cVar.b), s8cVar.a);
                    a5.j();
                    s8cVar.i = a5;
                } catch (Throwable th8) {
                    s8cVar.h.setValue(th8);
                }
                return pvc.a;
            case 24:
                hre.r(obj);
                shc shcVar = (shc) this.b;
                if (!shcVar.F) {
                    shcVar.l();
                }
                return pvc.a;
            case 25:
                hre.r(obj);
                zqc zqcVar = (zqc) this.b;
                int l = ((mnb) zqcVar.d).l();
                cza czaVar14 = zqcVar.e;
                if (czaVar14 != null) {
                    do {
                        value3 = czaVar14.getValue();
                        wqc wqcVar = (wqc) value3;
                        pi9 pi9Var2 = zqcVar.c;
                        c2 = ((qi9) pi9Var2).c();
                        qi9 qi9Var2 = (qi9) pi9Var2;
                        d = qi9Var2.d();
                        i = qi9Var2.i();
                        f = qi9Var2.f();
                        h = qi9Var2.h();
                        e2 = qi9Var2.e();
                        xh9 xh9Var2 = qi9Var2.a;
                        booleanValue2 = ((Boolean) xh9Var2.o.c(xh9.s[13], xh9Var2)).booleanValue();
                        if (l != 3 && l != 4) {
                            z = false;
                        } else {
                            z = true;
                        }
                        wqcVar.getClass();
                    } while (!czaVar14.l(value3, new wqc(c2, d, i, f, h, e2, booleanValue2, z)));
                    return pvc.a;
                }
                return pvc.a;
            case 26:
                hre.r(obj);
                csc cscVar = (csc) this.b;
                hk1 a6 = jdd.a(cscVar);
                sw2 sw2Var4 = ab3.a;
                cscVar.f(a6, ru2.c, new lc9(cscVar, (m42) null, 17));
                return pvc.a;
            case 27:
                hre.r(obj);
                pgd pgdVar2 = (pgd) this.b;
                pgdVar2.a.destroy();
                pgdVar2.f.clear();
                pgdVar2.e = null;
                return pvc.a;
            default:
                hre.r(obj);
                iaa iaaVar = (iaa) this.b;
                cza czaVar15 = iaaVar.R;
                if (czaVar15 != null) {
                    while (true) {
                        Object value4 = czaVar15.getValue();
                        q6d q6dVar = iaaVar.C;
                        s9d s9dVar = ((r6d) q6dVar).a;
                        hy5 hy5Var2 = s9dVar.a;
                        r76[] r76VarArr3 = s9d.t;
                        int intValue = ((Number) hy5Var2.c(r76VarArr3[0], s9dVar)).intValue();
                        r6d r6dVar = (r6d) q6dVar;
                        s9d s9dVar2 = r6dVar.a;
                        int intValue2 = ((Number) s9dVar2.b.c(r76VarArr3[c3], s9dVar2)).intValue();
                        s9d s9dVar3 = r6dVar.a;
                        boolean booleanValue3 = ((Boolean) s9dVar3.c.c(r76VarArr3[4], s9dVar3)).booleanValue();
                        s9d s9dVar4 = r6dVar.a;
                        char c4 = c3;
                        boolean booleanValue4 = ((Boolean) s9dVar4.d.c(r76VarArr3[5], s9dVar4)).booleanValue();
                        s9d s9dVar5 = r6dVar.a;
                        boolean booleanValue5 = ((Boolean) s9dVar5.e.c(r76VarArr3[7], s9dVar5)).booleanValue();
                        s9d s9dVar6 = r6dVar.a;
                        boolean booleanValue6 = ((Boolean) s9dVar6.f.c(r76VarArr3[8], s9dVar6)).booleanValue();
                        s9d s9dVar7 = r6dVar.a;
                        float floatValue = ((Number) s9dVar7.g.c(r76VarArr3[9], s9dVar7)).floatValue();
                        s9d s9dVar8 = r6dVar.a;
                        float floatValue2 = ((Number) s9dVar8.h.c(r76VarArr3[10], s9dVar8)).floatValue();
                        s9d s9dVar9 = r6dVar.a;
                        long longValue = ((Number) s9dVar9.i.c(r76VarArr3[11], s9dVar9)).longValue();
                        s9d s9dVar10 = r6dVar.a;
                        long longValue2 = ((Number) s9dVar10.j.c(r76VarArr3[12], s9dVar10)).longValue();
                        s9d s9dVar11 = r6dVar.a;
                        int intValue3 = ((Number) s9dVar11.k.c(r76VarArr3[13], s9dVar11)).intValue();
                        s9d s9dVar12 = r6dVar.a;
                        float floatValue3 = ((Number) s9dVar12.l.c(r76VarArr3[14], s9dVar12)).floatValue();
                        s9d s9dVar13 = r6dVar.a;
                        boolean booleanValue7 = ((Boolean) s9dVar13.m.c(r76VarArr3[15], s9dVar13)).booleanValue();
                        s9d s9dVar14 = r6dVar.a;
                        float floatValue4 = ((Number) s9dVar14.n.c(r76VarArr3[16], s9dVar14)).floatValue();
                        s9d s9dVar15 = r6dVar.a;
                        int intValue4 = ((Number) s9dVar15.o.c(r76VarArr3[17], s9dVar15)).intValue();
                        s9d s9dVar16 = r6dVar.a;
                        int intValue5 = ((Number) s9dVar16.p.c(r76VarArr3[18], s9dVar16)).intValue();
                        s9d s9dVar17 = r6dVar.a;
                        boolean booleanValue8 = ((Boolean) s9dVar17.q.c(r76VarArr3[19], s9dVar17)).booleanValue();
                        s9d s9dVar18 = r6dVar.a;
                        boolean booleanValue9 = ((Boolean) s9dVar18.r.c(r76VarArr3[20], s9dVar18)).booleanValue();
                        s9d s9dVar19 = r6dVar.a;
                        if (!czaVar15.l(value4, s6d.a((s6d) value4, 0, intValue, intValue2, booleanValue3, booleanValue4, booleanValue5, booleanValue6, floatValue, floatValue2, longValue, longValue2, intValue3, floatValue3, booleanValue7, nae.e, floatValue4, intValue4, intValue5, booleanValue8, false, nae.e, booleanValue9, ((Boolean) s9dVar19.s.c(r76VarArr3[21], s9dVar19)).booleanValue(), 1589249))) {
                            c3 = c4;
                        }
                    }
                }
                return pvc.a;
        }
    }
}
