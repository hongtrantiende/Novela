package defpackage;

import android.content.Context;
import android.os.Build;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: r7  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class r7 implements xt4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ r7(i22 i22Var, rxc rxcVar, w26 w26Var, s3a s3aVar) {
        this.a = 16;
        this.b = i22Var;
        this.c = w26Var;
        this.d = s3aVar;
    }

    @Override // defpackage.xt4
    public final Object invoke(Object obj) {
        float f;
        float f2;
        long floatToRawIntBits;
        long floatToRawIntBits2;
        bk3 s4bVar;
        long j;
        tu1 tu1Var;
        float f3;
        float f4;
        long k;
        long j2;
        int i = this.a;
        ff8 ff8Var = ff8.a;
        float f5 = 1.0f;
        zl1 zl1Var = null;
        int i2 = 0;
        pvc pvcVar = pvc.a;
        Object obj2 = this.d;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (i) {
            case 0:
                yya yyaVar = (yya) obj3;
                ri6 ri6Var = (ri6) obj;
                ri6Var.getClass();
                ri6.y(ri6Var, "create_group", new tu1(new xd1((cz7) obj4, 1), true, 2111014282), 2);
                List list = ((a8) yyaVar.getValue()).e;
                ri6Var.z(list.size(), new x7(0, new y4(1), list), new y7(0, list), new tu1(new z7(0, list, (b8) obj2), true, 802480018));
                if (((a8) yyaVar.getValue()).d) {
                    ri6.y(ri6Var, null, ade.a, 3);
                }
                return pvcVar;
            case 1:
                wl9 wl9Var = (wl9) obj4;
                cgc cgcVar = (cgc) obj3;
                wr wrVar = (wr) obj;
                float floatValue = ((Number) wrVar.e.getValue()).floatValue() - wl9Var.a;
                float h = cgcVar.d.h();
                cgcVar.b(h + floatValue);
                float abs = Math.abs(h - cgcVar.d.h());
                wl9Var.a = ((Number) wrVar.e.getValue()).floatValue();
                ((wl9) obj2).a = ((Number) wrVar.b()).floatValue();
                if (Math.abs(floatValue - abs) > 0.5f) {
                    wrVar.a();
                }
                return pvcVar;
            case 2:
                ud0 ud0Var = (ud0) obj4;
                ri6 ri6Var2 = (ri6) obj;
                ri6Var2.getClass();
                List a = ud0Var.a();
                ri6Var2.z(a.size(), null, new y7(3, a), new tu1(new td0(a, ud0Var, (sk1) obj3, (aw7) obj2, 0), true, 2039820996));
                return pvcVar;
            case 3:
                xt4 xt4Var = (xt4) obj4;
                aw7 aw7Var = (aw7) obj2;
                jub jubVar = (jub) obj;
                ((aw7) obj3).setValue(jubVar);
                boolean i3 = c16.i((String) aw7Var.getValue(), jubVar.a.b);
                ps psVar = jubVar.a;
                aw7Var.setValue(psVar.b);
                if (!i3) {
                    xt4Var.invoke(psVar.b);
                }
                return pvcVar;
            case 4:
                ri6 ri6Var3 = (ri6) obj;
                ri6Var3.getClass();
                List list2 = ((h34) obj4).g;
                ri6Var3.z(list2.size(), null, new y7(4, list2), new tu1(new bq0(list2, (xt4) obj3, (xt4) obj2, 0), true, 802480018));
                return pvcVar;
            case 5:
                ou9 ou9Var = (ou9) obj3;
                hy0 hy0Var = (hy0) obj2;
                ak3 ak3Var = (ak3) obj;
                u5b u5bVar = (u5b) ((bm1) obj4).c;
                u5bVar.getClass();
                float floatValue2 = Float.valueOf(u5bVar.b).floatValue();
                if (floatValue2 < nae.e) {
                    f = 0.0f;
                } else {
                    f = floatValue2;
                }
                float f6 = f / 2.0f;
                float min = Math.min(Math.abs(ou9Var.b()), Math.abs(ou9Var.a()));
                float f7 = ou9Var.a;
                float f8 = ou9Var.b;
                if (f * 2.0f > min) {
                    i2 = 1;
                }
                long j3 = ou9Var.e;
                s4b s4bVar2 = new s4b(f, nae.e, 0, 0, null, 30);
                if (i2 != 0) {
                    long floatToRawIntBits3 = (Float.floatToRawIntBits(f7) << 32) | (Float.floatToRawIntBits(f8) & 4294967295L);
                    float b = ou9Var.b();
                    float a2 = ou9Var.a();
                    ak3.t0(ak3Var, hy0Var, floatToRawIntBits3, (Float.floatToRawIntBits(b) << 32) | (Float.floatToRawIntBits(a2) & 4294967295L), j3, nae.e, null, null, 0, 240);
                } else if (Float.intBitsToFloat((int) (j3 >> 32)) < f6) {
                    float f9 = f7 + f;
                    float f10 = f8 + f;
                    float f11 = ou9Var.c - f;
                    float f12 = ou9Var.d - f;
                    ij1 Q0 = ak3Var.Q0();
                    long G = Q0.G();
                    Q0.w().i();
                    try {
                        ((mu9) Q0.b).n(f9, f10, f11, f12, 0);
                        float b2 = ou9Var.b();
                        float a3 = ou9Var.a();
                        ak3.t0(ak3Var, hy0Var, (Float.floatToRawIntBits(f7) << 32) | (Float.floatToRawIntBits(f8) & 4294967295L), (Float.floatToRawIntBits(b2) << 32) | (Float.floatToRawIntBits(a3) & 4294967295L), j3, nae.e, null, null, 0, 240);
                    } finally {
                        rs8.r(Q0, G);
                    }
                } else {
                    ak3.t0(ak3Var, hy0Var, (Float.floatToRawIntBits(f7 + f6) << 32) | (Float.floatToRawIntBits(f8 + f6) & 4294967295L), (Float.floatToRawIntBits(ou9Var.b() - f) << 32) | (Float.floatToRawIntBits(ou9Var.a() - f) & 4294967295L), zr1.B(f6, j3), nae.e, s4bVar2, null, 0, 208);
                }
                return pvcVar;
            case 6:
                rk9 rk9Var = (rk9) obj3;
                hy0 hy0Var2 = (hy0) obj2;
                ak3 ak3Var2 = (ak3) obj;
                u5b u5bVar2 = (u5b) ((bm1) obj4).c;
                u5bVar2.getClass();
                float floatValue3 = Float.valueOf(u5bVar2.b).floatValue();
                if (floatValue3 < nae.e) {
                    f2 = 0.0f;
                } else {
                    f2 = floatValue3;
                }
                float g = rk9Var.g();
                float f13 = rk9Var.b;
                float f14 = rk9Var.a;
                if (f2 * 2.0f > g) {
                    i2 = 1;
                }
                if (i2 != 0) {
                    floatToRawIntBits = rk9Var.j();
                } else {
                    float f15 = f2 / 2.0f;
                    floatToRawIntBits = (Float.floatToRawIntBits(f14 + f15) << 32) | (Float.floatToRawIntBits(f15 + f13) & 4294967295L);
                }
                if (i2 != 0) {
                    floatToRawIntBits2 = rk9Var.h();
                } else {
                    floatToRawIntBits2 = (Float.floatToRawIntBits((rk9Var.c - f14) - f2) << 32) | (Float.floatToRawIntBits((rk9Var.d - f13) - f2) & 4294967295L);
                }
                if (i2 != 0) {
                    s4bVar = ye4.a;
                } else {
                    s4bVar = new s4b(f2, nae.e, 0, 0, null, 30);
                }
                ak3.h1(ak3Var2, hy0Var2, floatToRawIntBits, floatToRawIntBits2, nae.e, s4bVar, null, 0, Token.ASSIGN_LOGICAL_AND);
                return pvcVar;
            case 7:
                List list3 = (List) obj4;
                List list4 = (List) obj3;
                xt4 xt4Var2 = (xt4) obj2;
                vf6 vf6Var = (vf6) obj;
                vf6Var.getClass();
                if (!list3.isEmpty()) {
                    vf6.y(vf6Var, null, new nj0(18), new tu1(new xv0(list3, xt4Var2, 0), true, -778041003), 5);
                }
                if (!list4.isEmpty()) {
                    vf6.y(vf6Var, null, new nj0(19), lpe.a, 5);
                    vf6Var.z(list4.size(), null, new aw0(0, new c8(5, (byte) 0), list4), new y7(7, list4), new tu1(new xa(list4, xt4Var2, 1), true, -1117249557));
                }
                return pvcVar;
            case 8:
                uo3 uo3Var = (uo3) obj4;
                ym0 ym0Var = (ym0) obj3;
                wm0 wm0Var = (wm0) obj2;
                ((ib3) obj).getClass();
                uo3Var.getClass();
                ym0Var.getClass();
                wm0Var.getClass();
                uo3Var.c = ym0Var;
                uo3Var.d = wm0Var;
                return new qq(1, uo3Var, ym0Var, wm0Var);
            case 9:
                d92 d92Var = (d92) obj4;
                xt4 xt4Var3 = (xt4) obj3;
                qd6 qd6Var = (qd6) obj;
                qd6Var.getClass();
                String str = "blockDraw:" + ((String) obj2);
                try {
                    qd6Var.a();
                } catch (CancellationException e) {
                    throw e;
                } catch (Throwable th) {
                    if (d92Var != d92.a) {
                        o28.v(xt4Var3, new g81(str, th));
                    } else {
                        throw th;
                    }
                }
                return pvcVar;
            case 10:
                cg1 cg1Var = (cg1) obj4;
                ri6 ri6Var4 = (ri6) obj;
                ri6Var4.getClass();
                List list5 = cg1Var.f;
                ri6Var4.z(list5.size(), new x7(8, new v71(16), list5), new y7(11, list5), new tu1(new td0(list5, cg1Var, (xt4) obj3, (aw7) obj2, 1), true, 802480018));
                return pvcVar;
            case 11:
                xt4 xt4Var4 = (xt4) obj4;
                aw7 aw7Var2 = (aw7) obj2;
                ri6 ri6Var5 = (ri6) obj;
                ri6Var5.getClass();
                ri6.y(ri6Var5, "conversation_shortcuts", new tu1(new wd1(0, (vt4) obj3, xt4Var4), true, -504751846), 2);
                List list6 = ((ce1) aw7Var2.getValue()).g;
                ri6Var5.z(list6.size(), new x7(10, new c8(9, (byte) 0), list6), new y7(13, list6), new tu1(new ya(list6, xt4Var4, aw7Var2), true, 2039820996));
                if (((ce1) aw7Var2.getValue()).d) {
                    ri6.y(ri6Var5, "load_more", p1d.c, 2);
                }
                return pvcVar;
            case 12:
                ee1 ee1Var = (ee1) obj4;
                aw7 aw7Var3 = (aw7) obj2;
                jub jubVar2 = (jub) obj;
                jubVar2.getClass();
                ((aw7) obj3).setValue(jubVar2);
                if (k4b.j0(jubVar2.a.b) && !k4b.j0(((ce1) aw7Var3.getValue()).f)) {
                    ee1Var.k("");
                }
                return pvcVar;
            case 13:
                Long l = (Long) obj;
                l.getClass();
                ((xt4) obj4).invoke(l);
                zm4.a((zm4) obj3);
                bsa bsaVar = ((z86) obj2).c;
                if (bsaVar != null) {
                    ((w03) bsaVar).b();
                }
                return pvcVar;
            case 14:
                cz7 cz7Var = (cz7) obj4;
                String str2 = (String) obj;
                str2.getClass();
                ((aw7) obj2).setValue(Boolean.FALSE);
                if (((rj8) obj3).k() == 0) {
                    cz7Var.getClass();
                    cz7Var.a.c(new ks1(str2));
                } else {
                    cz7Var.getClass();
                    cz7Var.a.c(new tr1(str2));
                }
                return pvcVar;
            case 15:
                m82 m82Var = (m82) obj3;
                lq lqVar = (lq) obj2;
                if (!((Boolean) ((mab) obj4).invoke(new z78(dye.t(((y78) ((lq) obj).e()).a)))).booleanValue()) {
                    z87.v(m82Var, null, null, new ot0(lqVar, null, 2), 3);
                }
                return pvcVar;
            case 16:
                i22 i22Var = (i22) obj4;
                w26 w26Var = (w26) obj3;
                s3a s3aVar = (s3a) obj2;
                float floatValue4 = ((Float) obj).floatValue();
                if (!i22Var.M) {
                    f5 = -1.0f;
                }
                t3a t3aVar = i22Var.L;
                long f16 = t3aVar.f(t3aVar.i(f5 * floatValue4));
                t3a t3aVar2 = s3aVar.a;
                float h2 = t3aVar.h(t3aVar.f(t3aVar2.d(t3aVar2.k, f16, 1))) * f5;
                if (Math.abs(h2) < Math.abs(floatValue4)) {
                    k27.o(w26Var, a82.l("Scroll animation cancelled because scroll was not consumed (", h2, " < ", floatValue4, ")"), null);
                }
                return pvcVar;
            case 17:
                ol6 ol6Var = (ol6) obj4;
                jub jubVar3 = (jub) obj3;
                j88 j88Var = (j88) obj2;
                ak3 ak3Var3 = (ak3) obj;
                gvb d = ol6Var.d();
                if (d != null) {
                    k61 w = ak3Var3.Q0().w();
                    long j4 = ((fxb) ol6Var.A.getValue()).a;
                    long j5 = ((fxb) ol6Var.B.getValue()).a;
                    fvb fvbVar = d.a;
                    ljc ljcVar = ol6Var.y;
                    long j6 = ol6Var.z;
                    if (!fxb.d(j4)) {
                        ljcVar.p(j6);
                        int w2 = j88Var.w(fxb.g(j4));
                        int w3 = j88Var.w(fxb.f(j4));
                        if (w2 != w3) {
                            w.b(fvbVar.j(w2, w3), ljcVar);
                        }
                    } else if (!fxb.d(j5)) {
                        long c = fvbVar.a.b.c();
                        zl1 zl1Var2 = new zl1(c);
                        if (c != 16) {
                            zl1Var = zl1Var2;
                        }
                        if (zl1Var != null) {
                            j = zl1Var.a;
                        } else {
                            j = zl1.b;
                        }
                        ljcVar.p(zl1.b(zl1.d(j) * 0.2f, j));
                        int w4 = j88Var.w(fxb.g(j5));
                        int w5 = j88Var.w(fxb.f(j5));
                        if (w4 != w5) {
                            w.b(fvbVar.j(w4, w5), ljcVar);
                        }
                    } else if (!fxb.d(jubVar3.b)) {
                        ljcVar.p(j6);
                        long j7 = jubVar3.b;
                        int w6 = j88Var.w(fxb.g(j7));
                        int w7 = j88Var.w(fxb.f(j7));
                        if (w6 != w7) {
                            w.b(fvbVar.j(w6, w7), ljcVar);
                        }
                    }
                    bze.p(w, fvbVar);
                }
                return pvcVar;
            case 18:
                ddd dddVar = (ddd) obj4;
                ((ib3) obj).getClass();
                dddVar.c(l27.d(dddVar.b(), (rk9) obj3), (rk9) obj2);
                return new ok(2);
            case 19:
                nm nmVar = (nm) obj;
                nmVar.getClass();
                nmVar.g(0, (String) obj4);
                nmVar.g(1, (String) obj3);
                nmVar.g(2, (String) obj2);
                return pvcVar;
            case 20:
                nm nmVar2 = (nm) obj;
                nmVar2.getClass();
                ((kh5) ((gk2) obj4).c).getClass();
                s46 s46Var = v46.a;
                s46Var.getClass();
                nmVar2.g(0, s46Var.b(new sz(c4b.a, 0), (List) obj3));
                nmVar2.g(1, (String) obj2);
                return pvcVar;
            case 21:
                nm nmVar3 = (nm) obj;
                nmVar3.getClass();
                ((r0f) ((gk2) obj4).c).getClass();
                s46 s46Var2 = v46.a;
                s46Var2.getClass();
                c4b c4bVar = c4b.a;
                nmVar3.g(0, s46Var2.b(new b45(c4bVar, c4bVar, 1), (LinkedHashMap) obj3));
                nmVar3.g(1, (String) obj2);
                return pvcVar;
            case 22:
                nm nmVar4 = (nm) obj;
                nmVar4.getClass();
                ((r0f) ((gk2) obj4).c).getClass();
                s46 s46Var3 = v46.a;
                s46Var3.getClass();
                c4b c4bVar2 = c4b.a;
                nmVar4.g(0, s46Var3.b(new b45(c4bVar2, c4bVar2, 1), (Map) obj3));
                nmVar4.g(1, (String) obj2);
                return pvcVar;
            case 23:
                wl9 wl9Var2 = (wl9) obj4;
                wr wrVar2 = (wr) obj;
                float floatValue5 = ((Number) wrVar2.e.getValue()).floatValue() - wl9Var2.a;
                float a4 = ((i2a) obj3).a(floatValue5);
                wl9Var2.a = ((Number) wrVar2.e.getValue()).floatValue();
                ((wl9) obj2).a = ((Number) wrVar2.b()).floatValue();
                if (Math.abs(floatValue5 - a4) > 0.5f) {
                    wrVar2.a();
                }
                return pvcVar;
            case 24:
                y60 y60Var = (y60) obj2;
                ul8 ul8Var = (ul8) obj;
                ul8Var.getClass();
                ul8Var.h("grant_type", "authorization_code");
                ul8Var.h("code", (String) obj4);
                rc8 rc8Var = ((fw2) obj3).b;
                String str3 = rc8Var.g;
                if (str3 != null) {
                    ul8Var.h("redirect_uri", str3);
                }
                String str4 = rc8Var.c;
                if (str4 != null) {
                    ul8Var.h("client_id", str4);
                    String str5 = rc8Var.d;
                    if (str5 != null) {
                        ul8Var.h("client_secret", str5);
                    }
                    if (rc8Var.f != qk1.off) {
                        ul8Var.h("code_verifier", y60Var.c.a);
                    }
                    return pvcVar;
                }
                throw new zc8("clientId is missing");
            case 25:
                Context context = (Context) obj3;
                apb apbVar = (apb) obj2;
                r32 r32Var = (r32) obj;
                List list7 = ((nob) obj4).a;
                int size = list7.size();
                for (int i4 = 0; i4 < size; i4++) {
                    mob mobVar = (mob) list7.get(i4);
                    if (mobVar instanceof uob) {
                        uob uobVar = (uob) mobVar;
                        sj sjVar = new sj(uobVar, 9);
                        if (uobVar.c == 0) {
                            tu1Var = null;
                        } else {
                            tu1Var = new tu1(new wx2(uobVar, 0), true, -1930700965);
                        }
                        r32.b(r32Var, sjVar, tu1Var, new t7(29, uobVar, apbVar), 6);
                    } else if (mobVar instanceof cpb) {
                        if (Build.VERSION.SDK_INT >= 28) {
                            nc6.k(r32Var, context, (cpb) mobVar);
                        }
                    } else if (mobVar instanceof zob) {
                        r32Var.a.add(cqe.b);
                    }
                }
                return pvcVar;
            case 26:
                String str6 = (String) obj3;
                ((vjc) obj).getClass();
                ii2 ii2Var = ((n33) obj4).a;
                ii2Var.N.i0(str6);
                for (Object obj5 : (List) obj2) {
                    int i5 = i2 + 1;
                    if (i2 >= 0) {
                        String str7 = (String) obj5;
                        gk2 gk2Var = ii2Var.N;
                        String m = a82.m(str6, "_", i2);
                        yj1 yj1Var = by5.a;
                        gk2Var.D0(new vo2(m, str6, i2, str7, yj1Var.k().b(), yj1Var.k().b()));
                        i2 = i5;
                    } else {
                        tl1.M();
                        throw null;
                    }
                }
                return pvcVar;
            case 27:
                cz7 cz7Var2 = (cz7) obj4;
                String str8 = (String) obj;
                str8.getClass();
                ((aw7) obj2).setValue(Boolean.FALSE);
                String str9 = ((l54) obj3).a;
                cz7Var2.getClass();
                str9.getClass();
                cz7Var2.a.c(new x83(str9, str8));
                return pvcVar;
            case 28:
                fj3 fj3Var = (fj3) obj3;
                mw8 mw8Var = (mw8) obj2;
                lw8 lw8Var = (lw8) obj;
                lw8Var.getClass();
                boolean I0 = ((e37) obj4).I0();
                pe peVar = fj3Var.K;
                if (I0) {
                    f3 = peVar.d().d(fj3Var.K.h.getValue());
                } else {
                    f3 = peVar.f();
                }
                ff8 ff8Var2 = fj3Var.M;
                if (ff8Var2 == ff8.b) {
                    f4 = f3;
                } else {
                    f4 = 0.0f;
                }
                if (ff8Var2 != ff8Var) {
                    f3 = 0.0f;
                }
                lw8Var.o(mw8Var, k27.A(f4), k27.A(f3), nae.e);
                return pvcVar;
            default:
                ne neVar = (ne) obj4;
                ff8 ff8Var3 = (ff8) obj2;
                long j8 = ((rh3) obj).a;
                if (((pj3) obj3).j0) {
                    k = y78.k(-1.0f, j8);
                } else {
                    k = y78.k(1.0f, j8);
                }
                ij3 ij3Var = nj3.a;
                if (ff8Var3 == ff8Var) {
                    j2 = k & 4294967295L;
                } else {
                    j2 = k >> 32;
                }
                float intBitsToFloat = Float.intBitsToFloat((int) j2);
                switch (neVar.a) {
                    case 0:
                        pe peVar2 = (pe) neVar.b;
                        ke keVar = peVar2.n;
                        float e2 = peVar2.e(intBitsToFloat);
                        pe peVar3 = keVar.a;
                        peVar3.j.i(e2);
                        peVar3.k.i(nae.e);
                        break;
                    case 1:
                        ((kt2) neVar.b).a.invoke(Float.valueOf(intBitsToFloat));
                        break;
                    default:
                        ((wpa) neVar.b).b(intBitsToFloat);
                        break;
                }
                return pvcVar;
        }
    }

    public /* synthetic */ r7(int i, Object obj, Object obj2, Object obj3) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    public /* synthetic */ r7(rj8 rj8Var, cz7 cz7Var, aw7 aw7Var) {
        this.a = 14;
        this.c = rj8Var;
        this.b = cz7Var;
        this.d = aw7Var;
    }

    public /* synthetic */ r7(wl9 wl9Var, i2a i2aVar, wl9 wl9Var2, wt2 wt2Var) {
        this.a = 23;
        this.b = wl9Var;
        this.c = i2aVar;
        this.d = wl9Var2;
    }
}
