package defpackage;

import android.net.ConnectivityManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import okhttp3.Address;
import okhttp3.CertificatePinner;
import okhttp3.Handshake;
import okhttp3.internal.tls.CertificateChainCleaner;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: se0  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class se0 implements vt4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ se0(b7b b7bVar, String str, Object obj, g7b g7bVar) {
        this.a = 26;
        this.b = str;
        this.c = obj;
        this.d = g7bVar;
    }

    @Override // defpackage.vt4
    public final Object invoke() {
        int i;
        int i2;
        String str;
        dub b;
        i22 i22Var;
        rk9 rk9Var;
        boolean J1;
        gj6 gj6Var;
        float f;
        Integer num;
        int i3 = this.a;
        float f2 = 1.0f;
        float f3 = nae.e;
        int i4 = 0;
        Object obj = null;
        pvc pvcVar = pvc.a;
        Object obj2 = this.d;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (i3) {
            case 0:
                ((te0) obj4).a();
                z30 z30Var = (z30) ((bm1) obj3).d;
                int i5 = ((xl9) obj2).a;
                do {
                    i = z30Var.get();
                    if (((i >>> 27) & 15) == i5) {
                        i2 = i - 1;
                    } else {
                        i2 = i;
                    }
                } while (!z30Var.compareAndSet(i, i2));
                return pvcVar;
            case 1:
                String str2 = (String) obj4;
                sr0 sr0Var = (sr0) obj3;
                if (((qr0) ((aw7) obj2).getValue()).c && !k4b.j0(str2)) {
                    sr0Var.l(str2);
                } else {
                    sr0Var.k();
                }
                return pvcVar;
            case 2:
                r13 r13Var = (r13) obj2;
                float floatValue = ((Number) ((lq) obj4).e()).floatValue() / x02.i(((su0) obj3).b);
                if (floatValue < -1.0f) {
                    floatValue = -1.0f;
                }
                if (floatValue <= 1.0f) {
                    f2 = floatValue;
                }
                return Float.valueOf(nn3.a.f(Math.abs(f2)) * Math.signum(f2) * r13Var.L0(4.0f));
            case 3:
                ev0 ev0Var = (ev0) obj4;
                rk9 H1 = ev0.H1(ev0Var, (i38) obj3, (hg) obj2);
                if (H1 == null) {
                    return null;
                }
                i22 i22Var2 = ev0Var.K;
                if (zy5.b(i22Var2.R, -1L)) {
                    ov5.c("Expected BringIntoViewRequester to not be used before parents are placed.");
                }
                return H1.o(i22Var2.L1(i22Var2.I1(), 0L, H1) ^ (-9223372034707292160L));
            case 4:
                vt4 vt4Var = (vt4) obj3;
                vt4 vt4Var2 = (vt4) obj2;
                if (((lhd) obj4).j()) {
                    vt4Var.invoke();
                } else {
                    vt4Var2.invoke();
                }
                return pvcVar;
            case 5:
                qo3 qo3Var = (qo3) obj4;
                uo3 uo3Var = (uo3) obj3;
                ym0 ym0Var = (ym0) obj2;
                List list = uo3Var.e().a;
                list.getClass();
                if (qo3Var.a && qo3Var.b) {
                    ListIterator listIterator = list.listIterator(list.size());
                    while (true) {
                        if (listIterator.hasPrevious()) {
                            Object previous = listIterator.previous();
                            if (((xl0) previous).b.d()) {
                                obj = previous;
                            }
                        }
                    }
                    xl0 xl0Var = (xl0) obj;
                    if (xl0Var != null) {
                        String str3 = xl0Var.a;
                        String e = ym0Var.e(str3);
                        if (e != null) {
                            i4 = e.length();
                        }
                        ym0Var.g(sze.a(i4, i4), str3);
                        so3 e2 = uo3Var.e();
                        e2.getClass();
                        uo3Var.j(so3.a(e2, null, str3, rs3.a, null, null, 25).b());
                        uo3Var.c(uo3Var.e().a);
                    }
                }
                return pvcVar;
            case 6:
                yya yyaVar = (yya) obj3;
                ym0 ym0Var2 = (ym0) obj2;
                if (((Boolean) ((en) obj4).invoke()).booleanValue() && (str = ((ar4) yyaVar.getValue()).c) != null && (b = ym0Var2.b(str)) != null) {
                    long r = b23.r(b);
                    frb g = b.g();
                    try {
                        g.c(fxb.g(r) + 1, fxb.f(r) + 1, "/");
                        int g2 = fxb.g(r) + 2;
                        g.g(sze.a(g2, g2));
                        b.b(g);
                    } finally {
                        b.c();
                    }
                }
                return pvcVar;
            case 7:
                CertificateChainCleaner certificateChainCleaner = ((CertificatePinner) obj4).b;
                certificateChainCleaner.getClass();
                return certificateChainCleaner.a(((Address) obj2).h.d, ((Handshake) obj3).a());
            case 8:
                i22 i22Var3 = (i22) obj4;
                rxc rxcVar = (rxc) obj3;
                hv0 hv0Var = (hv0) obj2;
                fz4 fz4Var = i22Var3.P;
                while (true) {
                    gw7 gw7Var = (gw7) fz4Var.a;
                    int i6 = gw7Var.c;
                    if (i6 != 0) {
                        if (i6 != 0) {
                            rk9 rk9Var2 = (rk9) ((h22) gw7Var.a[i6 - 1]).a.invoke();
                            if (rk9Var2 == null) {
                                i22Var = i22Var3;
                                J1 = true;
                            } else {
                                i22Var = i22Var3;
                                J1 = i22.J1(i22Var, rk9Var2, 0L, 0L, 3);
                            }
                            if (J1) {
                                gw7 gw7Var2 = (gw7) fz4Var.a;
                                ((h22) gw7Var2.k(gw7Var2.c - 1)).b.resumeWith(pvcVar);
                                i22Var3 = i22Var;
                            }
                        } else {
                            p1a.l("MutableVector is empty.");
                            return null;
                        }
                    } else {
                        i22Var = i22Var3;
                    }
                }
                if (i22Var.Q && (rk9Var = (rk9) i22Var.O.invoke()) != null && i22.J1(i22Var, rk9Var, 0L, 0L, 3)) {
                    i22Var.Q = false;
                }
                rxcVar.e = i22.H1(i22Var, hv0Var, 0L);
                return pvcVar;
            case 9:
                ((xt4) obj4).invoke(lpe.x((rk9) obj3, (e00) obj2));
                return pvcVar;
            case 10:
                String str4 = (String) obj4;
                ma3 ma3Var = (ma3) obj3;
                if (((ka3) ((aw7) obj2).getValue()).c && !k4b.j0(str4)) {
                    ma3Var.l(str4);
                } else {
                    ma3Var.k();
                }
                return pvcVar;
            case 11:
                vt4 vt4Var3 = (vt4) obj3;
                vt4 vt4Var4 = (vt4) obj2;
                int i7 = ((ef3) obj4).i;
                if (i7 != 1) {
                    if (i7 == 2) {
                        vt4Var4.invoke();
                    }
                } else {
                    vt4Var3.invoke();
                }
                return pvcVar;
            case 12:
                Map map = (Map) obj3;
                f57 f57Var = (f57) obj2;
                i04 i04Var = ((x04) obj4).E;
                cw cwVar = new cw(2, (byte) 0);
                String str5 = (String) map.get("User-Agent");
                if (str5 == null) {
                    str5 = "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/58.0.3029.110 Safari/537.3";
                }
                cwVar.e = str5;
                cwVar.m(map);
                cwVar.b = 30000;
                i04Var.K(new pv2(cwVar).c(f57Var));
                return pvcVar;
            case 13:
                ((xt4) obj4).invoke((e24) obj3);
                ((aw7) obj2).setValue(Boolean.FALSE);
                return pvcVar;
            case 14:
                ng3 ng3Var = (ng3) obj4;
                vt4 vt4Var5 = (vt4) obj3;
                vt4 vt4Var6 = (vt4) obj2;
                if (ng3Var == ng3.a) {
                    vt4Var5.invoke();
                } else if (ng3Var == ng3.b) {
                    vt4Var6.invoke();
                }
                return pvcVar;
            case 15:
                ConnectivityManager connectivityManager = (ConnectivityManager) obj3;
                vu5 vu5Var = (vu5) obj2;
                if (((vl9) obj4).a) {
                    r95.n().c(zld.a, "NetworkRequestConstraintController unregister callback");
                    connectivityManager.unregisterNetworkCallback(vu5Var);
                }
                return pvcVar;
            case 16:
                kj6 kj6Var = (kj6) obj4;
                yya yyaVar2 = (yya) obj3;
                yya yyaVar3 = (yya) obj2;
                fj6 j = kj6Var.j();
                int i8 = j.n;
                List list2 = j.k;
                if (i8 != 0 && (gj6Var = (gj6) yyaVar2.getValue()) != null) {
                    int i9 = kj6Var.i();
                    int i10 = gj6Var.q;
                    if (i10 == 0) {
                        f = 0.0f;
                    } else {
                        f = i9 / i10;
                    }
                    gj6 gj6Var2 = (gj6) sl1.j0(list2);
                    int i11 = j.m - j.q;
                    int i12 = gj6Var2.q;
                    if (i12 != 0) {
                        f3 = (i11 - gj6Var2.p) / i12;
                    }
                    f3 = (((list2.size() - (((Boolean) yyaVar3.getValue()).booleanValue() ? 1 : 0)) - f) - (1.0f - f3)) / j.n;
                }
                return Float.valueOf(f3);
            case 17:
                kj6 kj6Var2 = (kj6) obj3;
                ri6 ri6Var = (ri6) ((h23) obj4).getValue();
                return new si6(kj6Var2, ri6Var, (xg6) obj2, new kj((ty5) kj6Var2.e.f.getValue(), ri6Var));
            case 18:
                qra qraVar = (qra) obj4;
                lu4 lu4Var = (lu4) obj3;
                xt4 xt4Var = (xt4) obj2;
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                Iterator it = qraVar.b.iterator();
                while (((z1) it).hasNext()) {
                    Map.Entry entry = (Map.Entry) ((hza) it).next();
                    String str6 = (String) entry.getKey();
                    if (((Boolean) entry.getValue()).booleanValue()) {
                        arrayList.add(str6);
                    } else {
                        arrayList2.add(str6);
                    }
                }
                lu4Var.invoke(arrayList, arrayList2);
                qraVar.clear();
                xt4Var.invoke(Boolean.FALSE);
                return pvcVar;
            case 19:
                ((xt4) obj4).invoke((m9) obj3);
                ((aw7) obj2).setValue(Boolean.FALSE);
                return pvcVar;
            case 20:
                z87.v((m82) obj4, null, null, new c95((atd) obj3, (p59) obj2, (m42) null, 21), 3);
                return pvcVar;
            case 21:
                r59 r59Var = (r59) obj2;
                String str7 = (String) sl1.f0(((rj8) obj3).k(), (List) obj4);
                if (str7 != null && !((q59) r59Var.d.getValue()).a) {
                    hk1 a = jdd.a(r59Var);
                    sw2 sw2Var = ab3.a;
                    r59Var.f(a, ru2.c, new z38(r59Var, str7, null, 7));
                }
                return pvcVar;
            case 22:
                m82 m82Var = (m82) obj3;
                yha yhaVar = (yha) obj2;
                if (((Boolean) ((yha) obj4).b.d.invoke(zha.b)).booleanValue()) {
                    z87.v(m82Var, null, null, new wk7(yhaVar, null, 2), 3);
                }
                return Boolean.TRUE;
            case 23:
                gia giaVar = (gia) obj4;
                m82 a2 = idd.a(giaVar);
                sw2 sw2Var2 = ab3.a;
                giaVar.f(a2, ru2.c, new fia(giaVar, null, 1));
                ((aw7) obj2).setValue(Boolean.FALSE);
                ((vt4) obj3).invoke();
                return pvcVar;
            case 24:
                ((xt4) obj4).invoke(Float.valueOf((float) nae.e));
                ((xt4) obj3).invoke(Float.valueOf(1.3f));
                ((xt4) obj2).invoke(Float.valueOf(0.5f));
                return pvcVar;
            case 25:
                lv4 lv4Var = (lv4) obj4;
                eqa eqaVar = (eqa) obj3;
                qe8 qe8Var = (qe8) obj2;
                if (lv4Var != null) {
                    eqaVar.a(eqaVar.c(lv4Var) - eqaVar.t);
                }
                List p = xxe.p(eqaVar, null, eqaVar.t, null);
                ow1 ow1Var = (ow1) sl1.k0(p);
                if (ow1Var != null) {
                    num = ow1Var.b;
                } else {
                    num = null;
                }
                List c = qe8Var.c(num);
                if (num != null && !c.isEmpty()) {
                    c = sl1.n0(tl1.A(new ow1(((ow1) sl1.c0(c)).a, null, num)), sl1.Y(c, 1));
                }
                return new nw1(sl1.n0(p, c), qe8Var.e());
            case 26:
                StringBuilder o = a82.o("SubsamplingState. resetTileDecoder:", (String) obj4, ". failed. ");
                o.append(hs9.a(obj3));
                o.append(". '");
                o.append(((g7b) obj2).a());
                o.append('\'');
                return o.toString();
            case 27:
                ((aw7) obj2).setValue(Boolean.FALSE);
                ((xt4) obj4).invoke(((vyb) obj3).a);
                return pvcVar;
            case 28:
                sw2 sw2Var3 = ab3.a;
                z87.v((m82) obj4, ru2.c, null, new z45((af) obj3, (String) obj2, (m42) null, 27), 2);
                return pvcVar;
            default:
                c3c c3cVar = k3c.a;
                ((aw7) obj3).setValue(Boolean.FALSE);
                ((aw7) obj2).setValue(pwb.d);
                ((cyb) obj4).a.setValue(p7a.c);
                return pvcVar;
        }
    }

    public /* synthetic */ se0(int i, Object obj, Object obj2, Object obj3) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }
}
