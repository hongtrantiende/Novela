package defpackage;

import android.util.Log;
import com.vbook.android.R;
import java.util.ArrayList;
import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: vt3  reason: default package */
/* loaded from: classes.dex */
public final class vt3 extends fb6 implements xt4 {
    public final /* synthetic */ int a;
    public static final vt3 b = new vt3(1, 0);
    public static final vt3 c = new vt3(1, 1);
    public static final vt3 d = new vt3(1, 2);
    public static final vt3 e = new vt3(1, 3);
    public static final vt3 f = new vt3(1, 4);
    public static final vt3 C = new vt3(1, 5);
    public static final vt3 D = new vt3(1, 6);
    public static final vt3 E = new vt3(1, 7);
    public static final vt3 F = new vt3(1, 8);
    public static final vt3 G = new vt3(1, 9);
    public static final vt3 H = new vt3(1, 10);
    public static final vt3 I = new vt3(1, 11);
    public static final vt3 J = new vt3(1, 12);
    public static final vt3 K = new vt3(1, 13);
    public static final vt3 L = new vt3(1, 14);
    public static final vt3 M = new vt3(1, 15);
    public static final vt3 N = new vt3(1, 16);
    public static final vt3 O = new vt3(1, 17);
    public static final vt3 P = new vt3(1, 18);
    public static final vt3 Q = new vt3(1, 19);
    public static final vt3 R = new vt3(1, 20);
    public static final vt3 S = new vt3(1, 21);
    public static final vt3 T = new vt3(1, 22);
    public static final vt3 U = new vt3(1, 23);
    public static final vt3 V = new vt3(1, 24);
    public static final vt3 W = new vt3(1, 25);
    public static final vt3 X = new vt3(1, 26);
    public static final vt3 Y = new vt3(1, 27);
    public static final vt3 Z = new vt3(1, 28);
    public static final vt3 a0 = new vt3(1, 29);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vt3(int i, int i2) {
        super(i);
        this.a = i2;
    }

    @Override // defpackage.xt4
    public final Object invoke(Object obj) {
        u95 u95Var;
        yk8 yk8Var;
        yk8 yk8Var2;
        pp3 pp3Var;
        q94 q94Var;
        xy4 d2;
        xy4 d3;
        int i = this.a;
        boolean z = true;
        uv7 uv7Var = null;
        int i2 = 0;
        pvc pvcVar = pvc.a;
        switch (i) {
            case 0:
                long j = ((ckc) obj).a;
                return new gs(ckc.b(j), ckc.c(j));
            case 1:
                gs gsVar = (gs) obj;
                return new ckc(y9e.j(gsVar.a, gsVar.b));
            case 2:
                qkc qkcVar = (qkc) obj;
                return tte.v(nae.e, nae.e, 7, null);
            case 3:
                qkc qkcVar2 = (qkc) obj;
                return zt3.d;
            case 4:
                b61 b61Var = (b61) obj;
                return pvcVar;
            case 5:
                b61 b61Var2 = (b61) obj;
                return pvcVar;
            case 6:
                ak3 ak3Var = (ak3) obj;
                return pvcVar;
            case 7:
                ak3.R0((ak3) obj, zl1.h, 0L, 0L, nae.e, null, 0, Token.ELSE);
                return pvcVar;
            case 8:
                nx5 nx5Var = (nx5) obj;
                return pvcVar;
            case 9:
                ow8 ow8Var = (ow8) obj;
                if (ow8Var.T()) {
                    ry6 ry6Var = ow8Var.b;
                    if (!ry6Var.K) {
                        xt4 f2 = ow8Var.a.f();
                        if (ow8Var.a.c() != null) {
                            ry6Var.o1();
                        } else if (f2 == null) {
                            ry6Var.D = null;
                            ry6Var.E = null;
                            ry6Var.C = null;
                            ry6Var.o1();
                        } else {
                            ry6Var.D = null;
                            ry6Var.E = null;
                            ry6Var.N0(ow8Var, 9223372034707292159L, 0L);
                            ry6Var.C = f2;
                        }
                    }
                }
                return pvcVar;
            case 10:
                ow8 ow8Var2 = (ow8) obj;
                if (ow8Var2.T() && (u95Var = ow8Var2.c) != null) {
                    ry6 ry6Var2 = ow8Var2.b;
                    tv7 tv7Var = ry6Var2.N;
                    if (tv7Var != null) {
                        uv7Var = (uv7) tv7Var.g(u95Var);
                    }
                    if (uv7Var != null) {
                        t6f t6fVar = ry6Var2.M;
                        if (t6fVar != null) {
                            t6fVar.h(u95Var);
                        }
                        ry6Var2.l1(uv7Var);
                        uv7Var.b();
                    }
                }
                return pvcVar;
            case 11:
                vg8 vg8Var = ((i38) obj).n0;
                if (vg8Var != null) {
                    ((s15) vg8Var).c();
                }
                return pvcVar;
            case 12:
                i38 i38Var = (i38) obj;
                od6 od6Var = i38Var.O;
                try {
                    if (i38Var.T()) {
                        i38Var.e2(true);
                    }
                    return pvcVar;
                } catch (Throwable th) {
                    od6Var.d0(th);
                    throw null;
                }
            case 13:
                return Boolean.valueOf(((wy4) obj) instanceof o5);
            case 14:
                wy4 wy4Var = (wy4) obj;
                if (!(wy4Var instanceof mid) && !(wy4Var instanceof u55) && !(wy4Var instanceof w72)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 15:
                lp3 lp3Var = (lp3) obj;
                if (!(lp3Var instanceof rp3) && lp3Var.a().b(new co9(1, 16))) {
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    xy4 a = lp3Var.a();
                    boolean b2 = a.b(N);
                    xy4 xy4Var = vy4.a;
                    if (b2) {
                        yk8Var = (yk8) a.a(new yk8(null, xy4Var), co5.Q);
                    } else {
                        yk8Var = new yk8(null, a);
                    }
                    fg0 fg0Var = (fg0) yk8Var.a;
                    xy4 xy4Var2 = (xy4) yk8Var.b;
                    if (fg0Var != null && (fg0Var instanceof fg0)) {
                        arrayList2.add(fg0Var);
                    }
                    if (((Number) xy4Var2.a(0, co5.S)).intValue() > 1) {
                        Log.w("GlanceAppWidget", "More than one clickable defined on the same GlanceModifier, only the last one will be used.");
                    }
                    if (xy4Var2.b(O)) {
                        yk8Var2 = (yk8) xy4Var2.a(new yk8(null, xy4Var), co5.R);
                    } else {
                        yk8Var2 = new yk8(null, xy4Var2);
                    }
                    o5 o5Var = (o5) yk8Var2.a;
                    xy4 xy4Var3 = (xy4) yk8Var2.b;
                    arrayList.add(o5Var);
                    if (o5Var != null) {
                        il ilVar = new il(R.drawable.glance_ripple);
                        pp3Var = new pp3();
                        pp3Var.a = s9e.r(xy4Var);
                        pp3Var.b = ilVar;
                    } else {
                        pp3Var = null;
                    }
                    if (xy4Var3.b(L)) {
                        q94Var = (q94) xy4Var3.a(new q94((xy4) null, 3), co5.L);
                    } else {
                        q94Var = new q94(xy4Var3, 1);
                    }
                    xy4 xy4Var4 = q94Var.a;
                    xy4 xy4Var5 = q94Var.b;
                    arrayList.add(xy4Var4);
                    arrayList2.add(s9e.r(xy4Var5));
                    mp3 mp3Var = new mp3();
                    int size = arrayList.size();
                    int i3 = 0;
                    xy4 xy4Var6 = xy4Var;
                    while (i3 < size) {
                        Object obj2 = arrayList.get(i3);
                        i3++;
                        xy4 xy4Var7 = (xy4) obj2;
                        if (xy4Var7 != null && (d3 = xy4Var6.d(xy4Var7)) != null) {
                            xy4Var6 = d3;
                        }
                    }
                    mp3Var.c = xy4Var6;
                    int size2 = arrayList2.size();
                    while (i2 < size2) {
                        Object obj3 = arrayList2.get(i2);
                        i2++;
                        xy4 xy4Var8 = (xy4) obj3;
                        if (xy4Var8 != null && (d2 = xy4Var.d(xy4Var8)) != null) {
                            xy4Var = d2;
                        }
                    }
                    lp3Var.b(xy4Var);
                    ArrayList arrayList3 = mp3Var.b;
                    arrayList3.add(lp3Var);
                    if (pp3Var != null) {
                        arrayList3.add(pp3Var);
                    }
                    return mp3Var;
                }
                return lp3Var;
            case 16:
                return Boolean.valueOf(((wy4) obj) instanceof fg0);
            case 17:
                return Boolean.valueOf(((wy4) obj) instanceof o5);
            case 18:
                s78 s78Var = (s78) obj;
                if (s78Var.T()) {
                    s78Var.a.S0();
                }
                return pvcVar;
            case 19:
                od6 od6Var2 = (od6) obj;
                if (od6Var2.J()) {
                    od6Var2.Z(false);
                }
                return pvcVar;
            case 20:
                od6 od6Var3 = (od6) obj;
                if (od6Var3.J()) {
                    od6Var3.Z(false);
                }
                return pvcVar;
            case 21:
                od6 od6Var4 = (od6) obj;
                if (od6Var4.J()) {
                    od6Var4.X(false);
                }
                return pvcVar;
            case 22:
                od6 od6Var5 = (od6) obj;
                if (od6Var5.J()) {
                    od6Var5.X(false);
                }
                return pvcVar;
            case 23:
                od6 od6Var6 = (od6) obj;
                if (od6Var6.J()) {
                    od6.Y(od6Var6, false, 7);
                }
                return pvcVar;
            case 24:
                od6 od6Var7 = (od6) obj;
                if (od6Var7.J()) {
                    od6.a0(od6Var7, false, 7);
                }
                return pvcVar;
            case 25:
                od6 od6Var8 = (od6) obj;
                if (od6Var8.J()) {
                    od6Var8.H();
                }
                return pvcVar;
            case 26:
                t15 t15Var = (t15) obj;
                return pvcVar;
            case 27:
                i29 i29Var = (i29) obj;
                if (i29Var.isAttachedToWindow()) {
                    i29Var.s();
                }
                return pvcVar;
            case 28:
                wy4 wy4Var2 = (wy4) obj;
                return Boolean.FALSE;
            default:
                long j2 = ((y78) obj).a;
                return pvcVar;
        }
    }
}
