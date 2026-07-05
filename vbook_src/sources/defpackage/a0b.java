package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.textclassifier.TextClassification;
import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;
import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: a0b  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class a0b implements vt4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ a0b(kvb kvbVar, os osVar, xo xoVar) {
        this.a = 14;
        this.b = osVar;
        this.c = xoVar;
    }

    @Override // defpackage.vt4
    public final Object invoke() {
        View view;
        int i;
        long j;
        gvb d;
        ol6 ol6Var;
        ps psVar;
        d89 d89Var;
        grb d2;
        String str;
        int i2;
        kkc kkcVar;
        int f0;
        int i3 = this.a;
        int i4 = 4;
        int i5 = 3;
        int i6 = 2;
        int i7 = 0;
        sw1 sw1Var = null;
        fxb fxbVar = null;
        pvc pvcVar = pvc.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i3) {
            case 0:
                ((xt4) obj2).invoke((qq0) obj);
                return pvcVar;
            case 1:
                return ((a23) obj2).invoke((WorkDatabase) obj);
            case 2:
                b7b b7bVar = (b7b) obj;
                String i0 = sl1.i0((List) obj2, null, "[", "]", null, 57);
                StringBuilder sb = new StringBuilder("SubsamplingState. regionDecoders=");
                b7bVar.getClass();
                sb.append(i0);
                sb.append(". '");
                sb.append(b7bVar.c());
                sb.append('\'');
                return sb.toString();
            case 3:
                rm rmVar = (rm) obj;
                ViewGroup viewGroup = (ViewGroup) ((bu1) obj2).findViewById(16908290);
                if (viewGroup != null) {
                    view = viewGroup.getChildAt(0);
                } else {
                    view = null;
                }
                if (view instanceof sw1) {
                    sw1Var = view;
                }
                if (!rmVar.b) {
                    rmVar.b(sw1Var);
                }
                return pvcVar;
            case 4:
                vhb vhbVar = (vhb) obj2;
                ((aw7) obj).setValue(Boolean.FALSE);
                hk1 a = jdd.a(vhbVar);
                sw2 sw2Var = ab3.a;
                vhbVar.f(a, ru2.c, new koa(vhbVar, null, 10));
                return pvcVar;
            case 5:
                go3 go3Var = (go3) obj;
                Boolean bool = (Boolean) go3Var.d.getValue();
                bool.booleanValue();
                ((mu4) obj2).c((String) go3Var.b.getValue(), (String) go3Var.c.getValue(), bool);
                go3Var.a();
                return pvcVar;
            case 6:
                ((aw7) obj).setValue(Boolean.FALSE);
                ((ja0) obj2).j();
                return pvcVar;
            case 7:
                y5c y5cVar = (y5c) obj2;
                int i8 = ((nnb) obj).o;
                if (i8 != 0) {
                    if (i8 != 1) {
                        if (i8 != 3) {
                            i4 = 0;
                        }
                    } else {
                        i4 = 3;
                    }
                } else {
                    i4 = 1;
                }
                y5cVar.getClass();
                hk1 a2 = jdd.a(y5cVar);
                sw2 sw2Var2 = ab3.a;
                y5cVar.f(a2, ru2.c, new i4c(i4, 2, null, y5cVar));
                return pvcVar;
            case 8:
                y5c y5cVar2 = (y5c) obj2;
                ((aw7) obj).setValue(Boolean.FALSE);
                y5cVar2.getClass();
                hk1 a3 = jdd.a(y5cVar2);
                sw2 sw2Var3 = ab3.a;
                y5cVar2.f(a3, ru2.c, new iz7(null, y5cVar2, null, 20));
                return pvcVar;
            case 9:
                ay5.s((Context) obj2, (TextClassification) obj);
                return pvcVar;
            case 10:
                yy9 yy9Var = io3.h;
                ((io3) obj2).d("", "", true, !((zpb) ((yya) obj).getValue()).a);
                return pvcVar;
            case 11:
                lrb lrbVar = (lrb) obj2;
                xl9 xl9Var = (xl9) obj;
                lrbVar.P.f();
                if (lrbVar.J && ((zk6) ((oid) nye.q(lrbVar, dy1.u))).c()) {
                    i6 = 1;
                }
                int i9 = xl9Var.a;
                int i10 = i6 * i9;
                xl9Var.a = i9 * (-1);
                return Integer.valueOf(i10);
            case 12:
                trb trbVar = (trb) obj;
                if (!((ytb) obj2).h) {
                    mn4 mn4Var = trbVar.W;
                    if (mn4Var.J) {
                        hn4.P1(mn4Var.R);
                    }
                }
                return pvcVar;
            case 13:
                gtb gtbVar = (gtb) obj2;
                long j2 = ((zy5) ((aw7) obj).getValue()).a;
                y78 i11 = gtbVar.i();
                long j3 = 9205357640488583168L;
                if (i11 != null) {
                    long j4 = i11.a;
                    ps m = gtbVar.m();
                    if (m != null && m.b.length() != 0) {
                        h35 h35Var = (h35) gtbVar.r.getValue();
                        if (h35Var == null) {
                            i = -1;
                        } else {
                            i = itb.a[h35Var.ordinal()];
                        }
                        if (i != -1) {
                            if (i != 1 && i != 2) {
                                if (i == 3) {
                                    long j5 = gtbVar.n().b;
                                    int i12 = fxb.c;
                                    j = j5 & 4294967295L;
                                } else {
                                    xk5.o();
                                    return null;
                                }
                            } else {
                                long j6 = gtbVar.n().b;
                                int i13 = fxb.c;
                                j = j6 >> 32;
                            }
                            int i14 = (int) j;
                            ol6 ol6Var2 = gtbVar.d;
                            if (ol6Var2 != null && (d = ol6Var2.d()) != null && (ol6Var = gtbVar.d) != null && (psVar = ol6Var.a.a) != null) {
                                int n = dce.n(gtbVar.b.w(i14), 0, psVar.b.length());
                                float intBitsToFloat = Float.intBitsToFloat((int) (d.d(j4) >> 32));
                                fvb fvbVar = d.a;
                                it7 it7Var = fvbVar.b;
                                int d3 = it7Var.d(n);
                                float g = fvbVar.g(d3);
                                float h = fvbVar.h(d3);
                                float m2 = dce.m(intBitsToFloat, Math.min(g, h), Math.max(g, h));
                                if (zy5.b(j2, 0L) || Math.abs(intBitsToFloat - m2) <= ((int) (j2 >> 32)) / 2) {
                                    float f = it7Var.f(d3);
                                    j3 = (Float.floatToRawIntBits(m2) << 32) | (Float.floatToRawIntBits(((it7Var.b(d3) - f) / 2.0f) + f) & 4294967295L);
                                }
                            }
                        }
                    }
                }
                return new y78(j3);
            case 14:
                xo xoVar = (xo) obj;
                fp6 fp6Var = (fp6) ((os) obj2).a;
                if (fp6Var instanceof ep6) {
                    d89 d89Var2 = ((ep6) fp6Var).c;
                    if (d89Var2 != null) {
                        d89Var2.b(fp6Var);
                    } else {
                        try {
                            xoVar.a(((ep6) fp6Var).a);
                        } catch (IllegalArgumentException unused) {
                        }
                    }
                } else if ((fp6Var instanceof dp6) && (d89Var = ((dp6) fp6Var).c) != null) {
                    d89Var.b(fp6Var);
                }
                return pvcVar;
            case 15:
                hx9 hx9Var = (hx9) obj2;
                String i02 = sl1.i0(hx9Var.b, null, "[", "]", new txb(9), 25);
                StringBuilder sb2 = new StringBuilder("TileManager. init. sortedTileGridMap. ");
                sb2.append(hx9Var.a);
                sb2.append(':');
                sb2.append(i02);
                sb2.append(". '");
                return rs8.h(((z8c) obj).b, sb2, '\'');
            case 16:
                xt4 xt4Var = (xt4) obj2;
                String str2 = ((l23) obj).e;
                if (str2.length() > 0) {
                    xt4Var.invoke(str2);
                }
                return pvcVar;
            case 17:
                ((xt4) obj2).invoke((f76) obj);
                return pvcVar;
            case 18:
                cz7 cz7Var = (cz7) obj2;
                w43 w43Var = (w43) obj;
                int i15 = w43Var.a;
                int i16 = w43Var.c;
                cz7Var.getClass();
                cz7Var.a.c(new zhc(i16, Integer.valueOf(i15)));
                return pvcVar;
            case 19:
                mkc mkcVar = (mkc) obj2;
                return iv8.c(mkcVar.a.d(), (dmb) obj, mkcVar.e());
            case 20:
                mkc mkcVar2 = (mkc) obj2;
                lh9 lh9Var = (lh9) obj;
                h23 h23Var = mkcVar2.e;
                if (h23Var != null && (kkcVar = (kkc) h23Var.getValue()) != null) {
                    d2 = kkcVar.a;
                } else {
                    d2 = mkcVar2.a.d();
                }
                r7a e = mkcVar2.e();
                bz5 bz5Var = new bz5(2, false);
                StringBuilder sb3 = new StringBuilder();
                boolean z = false;
                while (i7 < d2.d.length()) {
                    int codePointAt = Character.codePointAt(d2, i7);
                    lh9Var.getClass();
                    if (codePointAt == 10) {
                        i2 = 32;
                    } else if (codePointAt == 13) {
                        i2 = 65279;
                    } else {
                        i2 = codePointAt;
                    }
                    int charCount = Character.charCount(codePointAt);
                    if (i2 != codePointAt) {
                        bz5Var.i(sb3.length(), sb3.length() + charCount, Character.charCount(i2));
                        z = true;
                    }
                    sb3.appendCodePoint(i2);
                    i7 += charCount;
                    z = z;
                }
                String sb4 = sb3.toString();
                if (z) {
                    str = sb4;
                } else {
                    str = d2;
                }
                if (str == d2) {
                    return null;
                }
                long f2 = iv8.f(d2.e, bz5Var, e);
                fxb fxbVar2 = d2.f;
                if (fxbVar2 != null) {
                    fxbVar = new fxb(iv8.f(fxbVar2.a, bz5Var, e));
                }
                return new kkc(new grb(str, f2, fxbVar, null, null, null, null, 120), bz5Var);
            case 21:
                ylc ylcVar = (ylc) obj2;
                vt4 vt4Var = (vt4) obj;
                String str3 = ylcVar.G;
                String str4 = ylcVar.H;
                String str5 = ylcVar.I;
                boolean z2 = ylcVar.K;
                int i17 = ylcVar.J;
                if (i17 == 1) {
                    m82 a4 = idd.a(ylcVar);
                    sw2 sw2Var4 = ab3.a;
                    ylcVar.f(a4, ru2.c, new xlc(ylcVar, str3, z2, str4, str5, null, 0));
                } else if (i17 == 2) {
                    m82 a5 = idd.a(ylcVar);
                    sw2 sw2Var5 = ab3.a;
                    ylcVar.f(a5, ru2.c, new xlc(ylcVar, str3, z2, str4, str5, null, 1));
                } else {
                    m82 a6 = idd.a(ylcVar);
                    sw2 sw2Var6 = ab3.a;
                    ylcVar.f(a6, ru2.c, new xlc(ylcVar, z2, str3, str4, str5, null));
                }
                vt4Var.invoke();
                return pvcVar;
            case 22:
                ((xt4) obj2).invoke(((tmc) obj).a);
                return pvcVar;
            case 23:
                vyc vycVar = (vyc) obj;
                String str6 = vycVar.C;
                if (((ArrayList) obj2).isEmpty() || (f0 = k4b.f0(str6, '/', vycVar.E.a.length() + 3, 4)) == -1) {
                    return "";
                }
                int i03 = k4b.i0(str6, new char[]{'?', '#'}, f0, 4);
                if (i03 == -1) {
                    return str6.substring(f0);
                }
                return str6.substring(f0, i03);
            case 24:
                xt4 xt4Var2 = (xt4) obj2;
                int i18 = ((s6d) obj).b;
                if (i18 != 0) {
                    if (i18 != 3) {
                        i5 = 0;
                    } else {
                        i5 = 1;
                    }
                }
                xt4Var2.invoke(Integer.valueOf(i5));
                return pvcVar;
            case 25:
                gcd gcdVar = (gcd) obj;
                ((xt4) obj2).invoke(null);
                hq7 hq7Var = wl3.b;
                long O = jue.O(0, am3.MILLISECONDS);
                j9d j9dVar = gcdVar.n;
                if (j9dVar != null) {
                    j9dVar.l(O);
                }
                gcdVar.a();
                return pvcVar;
            case 26:
                ((xt4) obj2).invoke(Boolean.valueOf(!((p6d) obj).k));
                return pvcVar;
            case 27:
                yrd yrdVar = (yrd) obj2;
                StringBuilder sb5 = new StringBuilder("ZoomableState. ");
                yrdVar.getClass();
                sb5.append((String) obj);
                sb5.append(". animated started. transform=");
                sb5.append(v9e.P(yrdVar.s));
                sb5.append(", userTransform=");
                sb5.append(v9e.P(yrdVar.r));
                return sb5.toString();
            default:
                atd atdVar = (atd) obj2;
                m82 m82Var = (m82) obj;
                if (atdVar.k()) {
                    atdVar.g.d();
                } else {
                    z87.v(m82Var, null, null, new asd(atdVar, null, 1), 3);
                }
                return pvcVar;
        }
    }

    public /* synthetic */ a0b(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    public /* synthetic */ a0b(Object obj, xt4 xt4Var, int i) {
        this.a = i;
        this.c = obj;
        this.b = xt4Var;
    }
}
