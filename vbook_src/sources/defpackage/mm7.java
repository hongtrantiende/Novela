package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.ConnectivityManager;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.regex.Matcher;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: mm7  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class mm7 implements vt4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ mm7(fw7 fw7Var, xt4 xt4Var) {
        this.a = 15;
        this.c = fw7Var;
        this.b = xt4Var;
    }

    @Override // defpackage.vt4
    public final Object invoke() {
        int i;
        int i2 = 0;
        switch (this.a) {
            case 0:
                ((xt4) this.b).invoke(Float.valueOf(1.5f));
                ((xt4) this.c).invoke(3);
                return pvc.a;
            case 1:
                o3c o3cVar = (o3c) this.c;
                ((lu4) this.b).invoke(o3cVar.a, o3cVar.b);
                return pvc.a;
            case 2:
                ((xt4) this.b).invoke(Boolean.valueOf(!((omb) this.c).p));
                return pvc.a;
            case 3:
                aw7 aw7Var = (aw7) this.c;
                if (!((List) this.b).isEmpty()) {
                    aw7Var.setValue(Boolean.TRUE);
                }
                return pvc.a;
            case 4:
                ((xt4) this.b).invoke((c6c) this.c);
                return pvc.a;
            case 5:
                ((xt4) this.b).invoke((bzc) this.c);
                return pvc.a;
            case 6:
                ((xt4) this.b).invoke((List) this.c);
                return pvc.a;
            case 7:
                ((xt4) this.b).invoke(Boolean.valueOf(!((wzc) this.c).f));
                return pvc.a;
            case 8:
                r13 r13Var = (r13) this.b;
                int X0 = r13Var.X0(56.0f);
                float L0 = r13Var.L0(vz7.f);
                return new y78((Float.floatToRawIntBits((((em8) this.c).h() - X0) / 2.0f) << 32) | (Float.floatToRawIntBits(L0) & 4294967295L));
            case 9:
                c0a c0aVar = (c0a) this.b;
                vt4 vt4Var = (vt4) this.c;
                int size = c0aVar.a.size() - c0aVar.c.a().size();
                while (i2 < size) {
                    vt4Var.invoke();
                    i2++;
                }
                return pvc.a;
            case 10:
                gk9 gk9Var = (gk9) this.c;
                if (((z30) ((zg4) this.b).b).get() == 0) {
                    gk9Var.invoke();
                }
                return pvc.a;
            case 11:
                return "Only found " + ((xl9) this.b).a + " digits in a row, but need to parse " + ((z68) this.c).b();
            case 12:
                return aze.n((String) this.b, a5b.i, new o9a[0], new cl7((m78) this.c, 11));
            case 13:
                return (i11) gae.t(jz4.a, (d82) this.b, new z38((rf8) this.c, null, 3), 2).b;
            case 14:
                dt8 dt8Var = (dt8) this.b;
                aw7 aw7Var2 = (aw7) this.c;
                int d = ct8.d(aw7Var2) - 1;
                if (d >= 0) {
                    i2 = d;
                }
                if (i2 != ((Number) aw7Var2.getValue()).intValue()) {
                    dt8Var.a(i2, true);
                }
                return pvc.a;
            case 15:
                xt4 xt4Var = (xt4) this.b;
                if (((fw7) this.c).Y()) {
                    xt4Var.invoke(Boolean.FALSE);
                }
                return pvc.a;
            case 16:
                return sxd.m((Context) this.b, ((a49) this.c).a);
            case 17:
                v99 v99Var = (v99) this.b;
                String str = ((jub) ((aw7) this.c).getValue()).a.b;
                str.getClass();
                String obj = k4b.N0(str).toString();
                v99Var.C = obj;
                hk1 a = jdd.a(v99Var);
                sw2 sw2Var = ab3.a;
                v99Var.f(a, ru2.c, new jk8(v99Var, obj, (m42) null, 4));
                return pvc.a;
            case 18:
                ((xt4) this.b).invoke((ce9) this.c);
                return pvc.a;
            case 19:
                uv7 uv7Var = (uv7) this.b;
                ux1 ux1Var = (ux1) this.c;
                Object[] objArr = uv7Var.b;
                long[] jArr = uv7Var.a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i3 = 0;
                    while (true) {
                        long j = jArr[i3];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i4 = 8 - ((~(i3 - length)) >>> 31);
                            for (int i5 = 0; i5 < i4; i5++) {
                                if ((255 & j) < 128) {
                                    ux1Var.B(objArr[(i3 << 3) + i5]);
                                }
                                j >>= 8;
                            }
                            if (i4 != 8) {
                            }
                        }
                        if (i3 != length) {
                            i3++;
                        }
                    }
                }
                return pvc.a;
            case 20:
                gm9 gm9Var = (gm9) this.b;
                CharSequence charSequence = (CharSequence) this.c;
                gm9Var.getClass();
                charSequence.getClass();
                Matcher matcher = gm9Var.a.matcher(charSequence);
                matcher.getClass();
                return p1d.f(matcher, 0, charSequence);
            case 21:
                ((yt2) this.b).b(((qfc) this.c).a);
                return pvc.a;
            case 22:
                return aze.n((String) this.b, l19.g, new o9a[0], new v3a((w3a) this.c, 0));
            case 23:
                ((zl9) this.b).a = nye.q((d6a) this.c, mv8.a);
                return pvc.a;
            case 24:
                f7a f7aVar = (f7a) this.b;
                long j2 = ((zy5) ((aw7) this.c).getValue()).a;
                g6a i6 = f7aVar.i();
                long j3 = 9205357640488583168L;
                if (i6 != null) {
                    h35 h = f7aVar.h();
                    if (h == null) {
                        i = -1;
                    } else {
                        i = g7a.a[h.ordinal()];
                    }
                    if (i != -1) {
                        if (i != 1) {
                            if (i != 2) {
                                if (i != 3) {
                                    xk5.o();
                                    return null;
                                }
                                vs.k("SelectionContainer does not support cursor");
                                return null;
                            }
                            j3 = yte.t(f7aVar, j2, i6.b);
                        } else {
                            j3 = yte.t(f7aVar, j2, i6.a);
                        }
                    }
                }
                return new y78(j3);
            case 25:
                fl7 fl7Var = (fl7) this.b;
                ConnectivityManager connectivityManager = (ConnectivityManager) this.c;
                synchronized (tga.b) {
                    LinkedHashMap linkedHashMap = tga.c;
                    linkedHashMap.remove(fl7Var);
                    if (linkedHashMap.isEmpty()) {
                        r95.n().c(zld.a, "NetworkRequestConstraintController unregister shared callback");
                        connectivityManager.unregisterNetworkCallback(tga.a);
                        tga.f = null;
                        tga.d = null;
                        tga.e = false;
                    }
                }
                return pvc.a;
            case 26:
                SharedPreferences sharedPreferences = ((Context) this.b).getSharedPreferences((String) this.c, 0);
                sharedPreferences.getClass();
                return sharedPreferences;
            case 27:
                lia liaVar = (lia) this.b;
                ((aw7) this.c).setValue(Boolean.FALSE);
                hk1 a2 = jdd.a(liaVar);
                sw2 sw2Var2 = ab3.a;
                liaVar.f(a2, ru2.c, new z38(liaVar, null, 27));
                return pvc.a;
            case 28:
                uxa uxaVar = (uxa) this.b;
                cza czaVar = uxaVar.d;
                Boolean bool = Boolean.FALSE;
                czaVar.getClass();
                czaVar.n(null, bool);
                z87.v((m82) this.c, null, null, new txa(uxaVar, null, 1), 3);
                return pvc.a;
            default:
                ((vt4) this.b).invoke();
                ((sxa) this.c).getClass();
                return pvc.a;
        }
    }

    public /* synthetic */ mm7(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }
}
