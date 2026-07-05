package defpackage;

import android.graphics.Bitmap;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import okhttp3.OkHttpClient;
import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: fl7  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class fl7 implements xt4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ fl7(aw7 aw7Var, ArrayList arrayList) {
        this.a = 18;
        this.c = aw7Var;
        this.b = arrayList;
    }

    @Override // defpackage.xt4
    public final Object invoke(Object obj) {
        long j;
        xn6 k;
        int i = 0;
        switch (this.a) {
            case 0:
                gia giaVar = (gia) this.b;
                List list = (List) obj;
                list.getClass();
                ((aw7) this.c).setValue(Boolean.FALSE);
                hk1 a = jdd.a(giaVar);
                sw2 sw2Var = ab3.a;
                giaVar.f(a, ru2.c, new z38(giaVar, list, null, 26));
                return pvc.a;
            case 1:
                ((xt4) this.b).invoke(lh9.s(((Integer) obj).intValue(), (String) this.c));
                return pvc.a;
            case 2:
                xt4 xt4Var = (xt4) this.c;
                ri6 ri6Var = (ri6) obj;
                ri6Var.getClass();
                List list2 = ((vxb) this.b).f;
                int size = list2.size();
                while (i < size) {
                    rb1 rb1Var = (rb1) list2.get(i);
                    ri6.B(ri6Var, String.valueOf(rb1Var.a), new tu1(new zd1(rb1Var, 5), true, 16986135));
                    ArrayList arrayList = rb1Var.c;
                    ri6Var.z(arrayList.size(), null, new p14(3, arrayList), new tu1(new q14(arrayList, xt4Var, 3), true, 802480018));
                    i++;
                }
                return pvc.a;
            case 3:
                ((au7) this.b).c.add(new xt7(obj, (u8a) this.c));
                return pvc.a;
            case 4:
                y69 y69Var = (y69) this.c;
                pvc pvcVar = pvc.a;
                if (c16.i((String) obj, ((File) this.b).getName())) {
                    Object j2 = y69Var.f.j(pvcVar);
                    if (!(j2 instanceof ib1)) {
                        pvc pvcVar2 = (pvc) j2;
                    } else {
                        Object obj2 = ((jb1) z87.C(gs3.a, new cv0(y69Var, null, 9))).a;
                    }
                }
                return pvcVar;
            case 5:
                ov7 ov7Var = (ov7) this.b;
                Boolean bool = (Boolean) obj;
                bool.getClass();
                ov7Var.f.setValue(ov7Var.b());
                ((xt4) this.c).invoke(bool);
                return pvc.a;
            case 6:
                ov7 ov7Var2 = (ov7) this.b;
                ((ib3) obj).getClass();
                ov7Var2.g = (i07) this.c;
                return new r6(ov7Var2, 14);
            case 7:
                yya yyaVar = (yya) this.b;
                ri6 ri6Var2 = (ri6) obj;
                ri6Var2.getClass();
                ri6.A(ri6Var2, ((zw7) yyaVar.getValue()).b.size(), new jt0(yyaVar, 5), new tu1(new xw7((bx7) this.c, yyaVar), true, 1361069818), 4);
                return pvc.a;
            case 8:
                return Boolean.valueOf(((yx7) this.b).c(((Integer) obj).intValue()).equals((String) this.c));
            case 9:
                ((iya) this.b).cancel(null);
                ((y69) this.c).j((d12) obj);
                return pvc.a;
            case 10:
                h68 h68Var = (h68) this.b;
                ((vjc) obj).getClass();
                ii2 ii2Var = h68Var.b;
                gk2 gk2Var = ii2Var.N;
                String str = h68Var.a;
                gk2Var.i0(str);
                for (Object obj3 : (List) this.c) {
                    int i2 = i + 1;
                    if (i >= 0) {
                        gk2 gk2Var2 = ii2Var.N;
                        String m = a82.m(str, "_", i);
                        String str2 = h68Var.a;
                        String str3 = ((eua) obj3).a;
                        yj1 yj1Var = by5.a;
                        gk2Var2.D0(new vo2(m, str2, i, str3, yj1Var.k().b(), yj1Var.k().b()));
                        i = i2;
                    } else {
                        tl1.M();
                        throw null;
                    }
                }
                return pvc.a;
            case 11:
                h68 h68Var2 = (h68) this.b;
                ArrayList arrayList2 = (ArrayList) this.c;
                ((vjc) obj).getClass();
                ii2 ii2Var2 = h68Var2.b;
                ii2Var2.C.f0(h68Var2.a);
                int size2 = arrayList2.size();
                while (i < size2) {
                    Object obj4 = arrayList2.get(i);
                    i++;
                    sm2 sm2Var = (sm2) obj4;
                    if (sm2Var.e.length() != 0) {
                        ii2Var2.C.z0(sm2Var);
                    }
                }
                return pvc.a;
            case 12:
                k88 k88Var = (k88) this.b;
                mw8 mw8Var = (mw8) this.c;
                lw8 lw8Var = (lw8) obj;
                boolean z = k88Var.L;
                float f = k88Var.K;
                if (z) {
                    lw8.z(lw8Var, mw8Var, lw8Var.X0(f), lw8Var.X0(nae.e));
                } else {
                    lw8Var.o(mw8Var, lw8Var.X0(f), lw8Var.X0(nae.e), nae.e);
                }
                return pvc.a;
            case 13:
                n88 n88Var = (n88) this.b;
                mw8 mw8Var2 = (mw8) this.c;
                lw8 lw8Var2 = (lw8) obj;
                long j3 = ((py5) n88Var.K.invoke(lw8Var2)).a;
                if (n88Var.L) {
                    lw8.E(lw8Var2, mw8Var2, (int) (j3 >> 32), (int) (j3 & 4294967295L), null, 12);
                } else {
                    lw8.L(lw8Var2, mw8Var2, (int) (j3 >> 32), (int) (j3 & 4294967295L), null, 12);
                }
                return pvc.a;
            case 14:
                OkHttpClient.Builder builder = (OkHttpClient.Builder) obj;
                builder.getClass();
                ((xt4) this.b).invoke(builder);
                ((qi5) this.c).invoke(builder);
                return pvc.a;
            case 15:
                qh8 qh8Var = (qh8) this.b;
                mw8 mw8Var3 = (mw8) this.c;
                lw8 lw8Var3 = (lw8) obj;
                boolean z2 = qh8Var.O;
                float f2 = qh8Var.K;
                if (z2) {
                    lw8.z(lw8Var3, mw8Var3, lw8Var3.X0(f2), lw8Var3.X0(qh8Var.L));
                } else {
                    lw8Var3.o(mw8Var3, lw8Var3.X0(f2), lw8Var3.X0(qh8Var.L), nae.e);
                }
                return pvc.a;
            case 16:
                ((r13) obj).getClass();
                float intBitsToFloat = Float.intBitsToFloat((int) (((kwb) this.b).a >> 32));
                rk9 rk9Var = ((mwb) this.c).a;
                return new py5((((int) (intBitsToFloat + rk9Var.a)) << 32) | (((int) (Float.intBitsToFloat((int) (j & 4294967295L)) + rk9Var.b)) & 4294967295L));
            case 17:
                ((lu4) this.b).invoke(Integer.valueOf(((z49) obj).a), Integer.valueOf(((zg4) this.c).S().b));
                return pvc.a;
            case 18:
                lw8 lw8Var4 = (lw8) obj;
                rs rsVar = new rs(3, (ArrayList) this.b);
                lw8Var4.a = true;
                rsVar.invoke(lw8Var4);
                lw8Var4.a = false;
                ((aw7) this.c).getValue();
                return pvc.a;
            case 19:
                ri6 ri6Var3 = (ri6) obj;
                ri6Var3.getClass();
                List list3 = ((kob) this.b).b;
                ri6Var3.z(list3.size(), new oj7(10, new rg8(3), list3), new pj7(14, list3), new tu1(new z7(2, list3, (su0) this.c), true, 802480018));
                return pvc.a;
            case 20:
                kq8 kq8Var = (kq8) obj;
                kq8Var.getClass();
                kq8Var.v0((Bitmap) this.b, (yn9) this.c);
                return pvc.a;
            case 21:
                int intValue = ((Integer) obj).intValue();
                ((aw7) this.c).setValue(Boolean.FALSE);
                ((dt8) this.b).a(intValue, false);
                return pvc.a;
            case 22:
                ((ib3) obj).getClass();
                return new qf0(7, (ss8) this.b, (dt8) this.c);
            case 23:
                xn6 xn6Var = (xn6) this.b;
                rn6 rn6Var = (rn6) this.c;
                ((ib3) obj).getClass();
                xn6Var.a(rn6Var);
                return new qf0(8, xn6Var, rn6Var);
            case 24:
                cw9 cw9Var = (cw9) obj;
                cw9Var.getClass();
                ((w39) this.b).b.n(cw9Var, (v39) this.c);
                return pvc.a;
            case 25:
                yya yyaVar2 = (yya) this.b;
                yya yyaVar3 = (yya) this.c;
                ak3 ak3Var = (ak3) obj;
                float L0 = ak3Var.L0(2.0f);
                float f3 = L0 / 2.0f;
                ak3.D0(ak3Var, ((zl1) yyaVar2.getValue()).a, ak3Var.L0(fre.d / 2.0f) - f3, 0L, nae.e, new s4b(L0, nae.e, 0, 0, null, 30), Token.ASSIGN_ADD);
                if (rg3.a(((rg3) yyaVar3.getValue()).a, nae.e) > 0) {
                    ak3.D0(ak3Var, ((zl1) yyaVar2.getValue()).a, ak3Var.L0(((rg3) yyaVar3.getValue()).a) - f3, 0L, nae.e, ye4.a, Token.ASSIGN_ADD);
                }
                return pvc.a;
            case 26:
                uv7 uv7Var = (uv7) this.c;
                ((ux1) this.b).B(obj);
                if (uv7Var != null) {
                    uv7Var.a(obj);
                }
                return pvc.a;
            case 27:
                kk9 kk9Var = (kk9) this.b;
                Throwable th = (Throwable) this.c;
                Throwable th2 = (Throwable) obj;
                synchronized (kk9Var.d) {
                    if (th != null) {
                        if (th2 != null) {
                            try {
                                if (th2 instanceof CancellationException) {
                                    th2 = null;
                                }
                                if (th2 != null) {
                                    pye.e(th, th2);
                                }
                            } catch (Throwable th3) {
                                throw th3;
                            }
                        }
                    } else {
                        th = null;
                    }
                    kk9Var.f = th;
                    cza czaVar = kk9Var.v;
                    ik9 ik9Var = ik9.a;
                    czaVar.getClass();
                    czaVar.n(null, ik9Var);
                }
                return pvc.a;
            case 28:
                un6 un6Var = (un6) this.b;
                cw1 cw1Var = (cw1) this.c;
                ib3 ib3Var = (ib3) obj;
                an9 an9Var = new an9(cw1Var, 0);
                if (un6Var != null && (k = un6Var.k()) != null) {
                    k.a(an9Var);
                }
                if (un6Var == null) {
                    jn6 jn6Var = jn6.ON_RESUME;
                    cw1Var.getClass();
                    cw1Var.b = jn6Var.a();
                    cw1Var.a();
                }
                return new qq(4, un6Var, an9Var, cw1Var);
            default:
                ydd yddVar = (ydd) this.b;
                Object obj5 = this.c;
                ib3 ib3Var2 = (ib3) obj;
                tv7 tv7Var = yddVar.a().b;
                Object g = tv7Var.g(obj5);
                if (g == null) {
                    g = new wdd(obj5);
                    tv7Var.n(obj5, g);
                }
                wdd wddVar = (wdd) g;
                wddVar.c++;
                return new r6(new vdd(wddVar, yddVar, obj5), 16);
        }
    }

    public /* synthetic */ fl7(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }
}
