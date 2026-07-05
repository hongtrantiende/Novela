package defpackage;

import android.os.Build;
import android.os.Looper;
import android.view.View;
import android.view.contentcapture.ContentCaptureSession;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: v7  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class v7 extends xu4 implements vt4 {
    public final /* synthetic */ int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v7(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, i2, cls, obj, str, str2);
        this.a = i3;
    }

    @Override // defpackage.vt4
    public final Object invoke() {
        ContentCaptureSession o;
        Object value;
        Object value2;
        int i;
        int i2;
        int n;
        int i3;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        x14 x14Var;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        kn knVar;
        Object value3;
        f76 f76Var;
        Object value4;
        int i4 = this.a;
        jp6 jp6Var = jp6.a;
        String str6 = null;
        pvc pvcVar = pvc.a;
        switch (i4) {
            case 0:
                ((b8) this.receiver).k();
                return pvcVar;
            case 1:
                b8 b8Var = (b8) this.receiver;
                if (!b8Var.F && b8Var.E) {
                    b8Var.j();
                }
                return pvcVar;
            case 2:
                View view = (View) this.receiver;
                int i5 = Build.VERSION.SDK_INT;
                if (i5 >= 30) {
                    qka.v(view);
                }
                if (i5 < 29 || (o = ff.o(view)) == null) {
                    return null;
                }
                return new p12(o, view);
            case 3:
                ((ee1) this.receiver).j();
                return pvcVar;
            case 4:
                cz7 cz7Var = (cz7) this.receiver;
                cz7Var.getClass();
                cz7Var.b(t99.INSTANCE);
                return pvcVar;
            case 5:
                ng1 ng1Var = (ng1) this.receiver;
                cza czaVar = ng1Var.C;
                Long U = r4b.U(ng1Var.c);
                if (U != null) {
                    long longValue = U.longValue();
                    if (!((cg1) czaVar.getValue()).m && !((cg1) czaVar.getValue()).l) {
                        hk1 a = jdd.a(ng1Var);
                        sw2 sw2Var = ab3.a;
                        ng1Var.f(a, ru2.c, new hg1(ng1Var, longValue, null));
                    }
                }
                return pvcVar;
            case 6:
                ng1 ng1Var2 = (ng1) this.receiver;
                if (!ng1Var2.N && ng1Var2.M) {
                    hk1 a2 = jdd.a(ng1Var2);
                    sw2 sw2Var2 = ab3.a;
                    ng1Var2.f(a2, ru2.c, new ig1(1, ng1Var2, null));
                }
                return pvcVar;
            case 7:
                ng1 ng1Var3 = (ng1) this.receiver;
                ng1Var3.getClass();
                hk1 a3 = jdd.a(ng1Var3);
                sw2 sw2Var3 = ab3.a;
                ng1Var3.f(a3, ru2.c, new n0(ng1Var3, null, 22));
                return pvcVar;
            case 8:
                ((ng1) this.receiver).l();
                return pvcVar;
            case 9:
                ng1 ng1Var4 = (ng1) this.receiver;
                if (!ng1Var4.F && ng1Var4.G) {
                    int i6 = ng1Var4.E;
                    w26 w26Var = ng1Var4.S;
                    if (w26Var != null) {
                        w26Var.cancel(null);
                    }
                    hk1 a4 = jdd.a(ng1Var4);
                    sw2 sw2Var4 = ab3.a;
                    ng1Var4.S = ng1Var4.f(a4, ru2.c, new jg1(i6, ng1Var4, null));
                }
                return pvcVar;
            case 10:
                cza czaVar2 = ((ng1) this.receiver).C;
                if (czaVar2 != null) {
                    do {
                        value = czaVar2.getValue();
                    } while (!czaVar2.l(value, cg1.a((cg1) value, false, false, false, false, null, null, null, null, null, false, false, false, false, false, false, false, null, false, false, false, false, false, false, false, null, null, null, 0, null, null, 1610612735)));
                    return pvcVar;
                }
                return pvcVar;
            case 11:
                cza czaVar3 = ((ng1) this.receiver).C;
                if (czaVar3 != null) {
                    do {
                        value2 = czaVar3.getValue();
                    } while (!czaVar3.l(value2, cg1.a((cg1) value2, false, false, false, false, null, null, null, null, null, false, false, false, false, false, false, false, null, false, false, false, false, false, false, false, null, null, null, 0, null, null, 1879048191)));
                    return pvcVar;
                }
                return pvcVar;
            case 12:
                ((xa2) this.receiver).getClass();
                String name = Thread.currentThread().getName();
                name.getClass();
                return Boolean.valueOf(k4b.V(name, "Firebase Background Thread #", false));
            case 13:
                ((xa2) this.receiver).getClass();
                String name2 = Thread.currentThread().getName();
                name2.getClass();
                return Boolean.valueOf(k4b.V(name2, "Firebase Blocking Thread #", false));
            case 14:
                ((xa2) this.receiver).getClass();
                return Boolean.valueOf(!Looper.getMainLooper().isCurrentThread());
            case 15:
                ((lb2) this.receiver).k();
                return pvcVar;
            case 16:
                lb2 lb2Var = (lb2) this.receiver;
                if (!lb2Var.F && lb2Var.E) {
                    lb2Var.j();
                }
                return pvcVar;
            case 17:
                return ((oob) this.receiver).z0();
            case 18:
                ((v14) this.receiver).j();
                return pvcVar;
            case 19:
                ((v14) this.receiver).j();
                return pvcVar;
            case 20:
                p24 p24Var = (p24) this.receiver;
                n24 n24Var = (n24) p24Var.C.getValue();
                boolean z5 = n24Var.b;
                String str7 = n24Var.C;
                String str8 = n24Var.B;
                e24 e24Var = n24Var.r;
                f24 f24Var = n24Var.s;
                int i7 = n24Var.o;
                if (!z5 && !k4b.j0(n24Var.e) && i7 > 0) {
                    int i8 = i7 - 1;
                    f24 f24Var2 = f24.a;
                    if (f24Var == f24Var2) {
                        i2 = 0;
                        n = 0;
                    } else {
                        Integer R = r4b.R(10, n24Var.t);
                        if (R != null) {
                            i = R.intValue();
                        } else {
                            i = 1;
                        }
                        i2 = 0;
                        n = dce.n(i - 1, 0, i8);
                    }
                    if (f24Var != f24Var2) {
                        Integer R2 = r4b.R(10, n24Var.u);
                        if (R2 != null) {
                            i7 = R2.intValue();
                        }
                        i8 = dce.n(i7 - 1, i2, i8);
                    }
                    if (n > i8) {
                        i3 = i8;
                    } else {
                        i3 = n;
                    }
                    if (i8 >= n) {
                        n = i8;
                    }
                    if (n24Var.w && n24Var.c()) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (n24Var.v && n24Var.b()) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    boolean z6 = n24Var.z;
                    if (n24Var.x && n24Var.d()) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (h9a.V(e24Var) && !n24Var.y) {
                        z4 = false;
                    } else {
                        z4 = true;
                    }
                    w14 w14Var = new w14(i3, n, z, z2, z6, z3, z4, n24Var.q, str8, str7, n24Var.D);
                    int ordinal = e24Var.ordinal();
                    if (ordinal != 0) {
                        if (ordinal != 1) {
                            if (ordinal != 2) {
                                if (ordinal != 3) {
                                    if (ordinal == 4) {
                                        x14Var = x14.Html;
                                    } else {
                                        xk5.o();
                                        return null;
                                    }
                                } else {
                                    x14Var = x14.Txt;
                                }
                            } else {
                                x14Var = x14.Cbz;
                            }
                        } else {
                            x14Var = x14.Epub3;
                        }
                    } else {
                        x14Var = x14.Epub;
                    }
                    if (!z4) {
                        str = "zip";
                    } else {
                        str = x14Var.a;
                    }
                    String str9 = str;
                    if (k4b.j0(str8)) {
                        if (z6) {
                            str5 = n24Var.f;
                        } else {
                            str5 = n24Var.g;
                        }
                        str2 = str5;
                    } else {
                        str2 = str8;
                    }
                    if (k4b.j0(str7)) {
                        if (z6) {
                            str4 = n24Var.h;
                        } else {
                            str4 = n24Var.i;
                        }
                        str3 = str4;
                    } else {
                        str3 = str7;
                    }
                    StringBuilder sb = new StringBuilder();
                    if (k4b.j0(str2)) {
                        str2 = "book";
                    }
                    sb.append(str2);
                    if (!k4b.j0(str3)) {
                        sb.append("_");
                        sb.append(str3);
                    }
                    String sb2 = sb.toString();
                    hk1 a5 = jdd.a(p24Var);
                    sw2 sw2Var5 = ab3.a;
                    p24Var.f(a5, ru2.c, new da(sb2, str9, p24Var, n24Var, x14Var, w14Var, (m42) null));
                }
                return pvcVar;
            case 21:
                mm4 mm4Var = (mm4) this.receiver;
                uv7 uv7Var = mm4Var.c;
                uv7 uv7Var2 = mm4Var.d;
                rm4 rm4Var = mm4Var.a;
                hn4 f = rm4Var.f();
                dn4 dn4Var = dn4.c;
                char c = 7;
                int i9 = 8;
                if (f == null) {
                    Object[] objArr = uv7Var2.b;
                    long[] jArr = uv7Var2.a;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i10 = 0;
                        while (true) {
                            long j = jArr[i10];
                            long[] jArr2 = jArr;
                            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i11 = 8 - ((~(i10 - length)) >>> 31);
                                for (int i12 = 0; i12 < i11; i12++) {
                                    if ((j & 255) < 128) {
                                        ((fm4) objArr[(i10 << 3) + i12]).h0(dn4Var);
                                    }
                                    j >>= 8;
                                }
                                if (i11 != 8) {
                                }
                            }
                            if (i10 != length) {
                                i10++;
                                jArr = jArr2;
                            }
                        }
                    }
                } else if (f.J) {
                    if (uv7Var.c(f)) {
                        f.N1();
                    }
                    dn4 M1 = f.M1();
                    if (!f.a.J) {
                        lv5.c("visitAncestors called on an unattached node");
                    }
                    mq7 mq7Var = f.a;
                    od6 v = voe.v(f);
                    int i13 = 0;
                    while (v != null) {
                        if ((((mq7) v.c0.C).d & 5120) != 0) {
                            while (mq7Var != null) {
                                int i14 = mq7Var.c;
                                char c2 = c;
                                if ((i14 & 5120) != 0) {
                                    if ((i14 & 1024) != 0) {
                                        i13++;
                                    }
                                    if ((mq7Var instanceof fm4) && uv7Var2.c(mq7Var)) {
                                        if (i13 <= 1) {
                                            ((fm4) mq7Var).h0(M1);
                                        } else {
                                            ((fm4) mq7Var).h0(dn4.b);
                                        }
                                        uv7Var2.l(mq7Var);
                                    }
                                }
                                mq7Var = mq7Var.e;
                                c = c2;
                            }
                        }
                        char c3 = c;
                        v = v.v();
                        if (v != null && (knVar = v.c0) != null) {
                            mq7Var = (hkb) knVar.f;
                        } else {
                            mq7Var = null;
                        }
                        c = c3;
                    }
                    char c4 = c;
                    Object[] objArr2 = uv7Var2.b;
                    long[] jArr3 = uv7Var2.a;
                    int length2 = jArr3.length - 2;
                    if (length2 >= 0) {
                        int i15 = 0;
                        while (true) {
                            long j2 = jArr3[i15];
                            int i16 = i9;
                            int i17 = i15;
                            if ((((~j2) << c4) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i18 = 8 - ((~(i17 - length2)) >>> 31);
                                for (int i19 = 0; i19 < i18; i19++) {
                                    if ((j2 & 255) < 128) {
                                        ((fm4) objArr2[(i17 << 3) + i19]).h0(dn4Var);
                                    }
                                    j2 >>= i16;
                                }
                                if (i18 != i16) {
                                }
                            }
                            if (i17 != length2) {
                                i15 = i17 + 1;
                                i9 = i16;
                            }
                        }
                    }
                }
                if (rm4Var.f() == null || rm4Var.c.M1() == dn4Var) {
                    rm4Var.c();
                }
                uv7Var.b();
                uv7Var2.b();
                mm4Var.e = false;
                return pvcVar;
            case 22:
                return Boolean.valueOf(hn4.P1(((mn4) this.receiver).R));
            case 23:
                np6 np6Var = (np6) this.receiver;
                if (((rp6) np6Var.h.getValue()).g) {
                    np6Var.d.a(np6Var.a);
                    np6Var.e.invoke(jp6Var);
                }
                return pvcVar;
            case 24:
                ((np6) this.receiver).e.invoke(jp6Var);
                return pvcVar;
            case 25:
                np6 np6Var2 = (np6) this.receiver;
                rp6 rp6Var = (rp6) np6Var2.h.getValue();
                if (rp6Var.f) {
                    String obj = k4b.N0(rp6Var.a).toString();
                    if (obj.length() > 0) {
                        str6 = obj;
                    }
                    np6Var2.d.b(np6Var2.a, rp6Var.b, str6);
                    np6Var2.e.invoke(jp6.b);
                }
                return pvcVar;
            case 26:
                pq0 pq0Var = (pq0) this.receiver;
                cza czaVar4 = pq0Var.e;
                oq0 oq0Var = (oq0) czaVar4.getValue();
                if (!oq0Var.c && oq0Var.d && pq0Var.C.length() <= 0) {
                    if (czaVar4 != null) {
                        do {
                            value3 = czaVar4.getValue();
                        } while (!czaVar4.l(value3, oq0.a((oq0) value3, null, false, true, false, 11)));
                        hk1 a6 = jdd.a(pq0Var);
                        sw2 sw2Var6 = ab3.a;
                        pq0Var.f(a6, ru2.c, new n0(pq0Var, oq0Var, null, 13));
                    } else {
                        hk1 a62 = jdd.a(pq0Var);
                        sw2 sw2Var62 = ab3.a;
                        pq0Var.f(a62, ru2.c, new n0(pq0Var, oq0Var, null, 13));
                    }
                }
                return pvcVar;
            case 27:
                s9 s9Var = (s9) this.receiver;
                cza czaVar5 = s9Var.d;
                q9 q9Var = (q9) czaVar5.getValue();
                f76 f76Var2 = q9Var.a;
                f76 f76Var3 = q9Var.b;
                if (f76Var2 != null && f76Var3 != null && !k4b.j0(q9Var.c) && !q9Var.f && (f76Var = q9Var.a) != null && f76Var3 != null) {
                    if (czaVar5 != null) {
                        do {
                            value4 = czaVar5.getValue();
                        } while (!czaVar5.l(value4, q9.a((q9) value4, null, null, null, null, null, true, 31)));
                        hk1 a7 = jdd.a(s9Var);
                        sw2 sw2Var7 = ab3.a;
                        s9Var.f(a7, ru2.c, new r9(s9Var, f76Var, f76Var3, q9Var, (m42) null, 0));
                    } else {
                        hk1 a72 = jdd.a(s9Var);
                        sw2 sw2Var72 = ab3.a;
                        s9Var.f(a72, ru2.c, new r9(s9Var, f76Var, f76Var3, q9Var, (m42) null, 0));
                    }
                }
                return pvcVar;
            case 28:
                ((l13) this.receiver).a(false);
                return pvcVar;
            default:
                g13 g13Var = (g13) this.receiver;
                g13Var.a.setValue(Boolean.FALSE);
                g13Var.b.setValue(null);
                return pvcVar;
        }
    }
}
