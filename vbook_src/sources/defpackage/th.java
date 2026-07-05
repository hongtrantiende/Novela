package defpackage;

import android.graphics.DashPathEffect;
import java.util.ArrayList;
import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: th  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class th implements xt4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;

    public /* synthetic */ th(long j, int i) {
        this.a = i;
        this.b = j;
    }

    private final Object a(Object obj) {
        ak3 ak3Var = (ak3) obj;
        ak3Var.getClass();
        yj a = dk.a();
        float intBitsToFloat = Float.intBitsToFloat((int) (ak3Var.b() >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (ak3Var.b() & 4294967295L));
        float f = (intBitsToFloat * 2.0f) / 7.0f;
        a.i(f, nae.e);
        float f2 = (intBitsToFloat2 * 2.0f) / 3.0f;
        a.h(f, f2);
        float f3 = (intBitsToFloat * 5.0f) / 7.0f;
        a.h(f3, f2);
        float f4 = intBitsToFloat2 / 3.0f;
        a.h(f3, f4);
        a.h(nae.e, f4);
        s4b s4bVar = new s4b(ak3Var.L0(1.0f), nae.e, 0, 0, new zj(new DashPathEffect(new float[]{ak3Var.L0(1.0f), ak3Var.L0(1.0f)}, nae.e)), 14);
        long j = this.b;
        ak3.t1(ak3Var, a, j, nae.e, s4bVar, 52);
        float min = Math.min(0.18f * intBitsToFloat, ak3Var.L0(36.0f));
        a.l();
        float f5 = (intBitsToFloat - min) / 2.0f;
        float f6 = intBitsToFloat2 / 2.0f;
        a.i(f5, f6);
        float f7 = (intBitsToFloat + min) / 2.0f;
        a.h(f7, f6);
        float f8 = min / 3.0f;
        float f9 = f6 - f8;
        a.i(f5, f9);
        a.h(f7, f9);
        float f10 = f6 + f8;
        a.i(f5, f10);
        a.h(f7, f10);
        float min2 = Math.min(0.09f * intBitsToFloat, ak3Var.L0(18.0f));
        float f11 = min2 * 2.0f;
        float f12 = (5.0f * intBitsToFloat2) / 6.0f;
        float f13 = intBitsToFloat2 / 6.0f;
        float f14 = intBitsToFloat / 2.0f;
        float f15 = min2 / 2.0f;
        float f16 = f14 - f15;
        float f17 = f11 / 2.0f;
        a.i(f16, f12 - f17);
        a.h(f14 + f15, f12);
        a.h(f16, f12 + f17);
        float f18 = intBitsToFloat / 7.0f;
        float f19 = f18 + f15;
        a.i(f19, f13 - f17);
        a.h(f18 - f15, f13);
        a.h(f19, f13 + f17);
        ak3.t1(ak3Var, a, j, nae.e, new s4b(ak3Var.L0(1.0f), nae.e, 0, 0, null, 30), 52);
        return pvc.a;
    }

    private final Object b(Object obj) {
        ak3 ak3Var = (ak3) obj;
        ak3Var.getClass();
        yj a = dk.a();
        a.l();
        a.i(nae.e, Float.intBitsToFloat((int) (ak3Var.b() & 4294967295L)) / 2.0f);
        a.h(Float.intBitsToFloat((int) (ak3Var.b() >> 32)) / 4.0f, Float.intBitsToFloat((int) (ak3Var.b() & 4294967295L)) / 2.0f);
        a.i((Float.intBitsToFloat((int) (ak3Var.b() >> 32)) * 3.0f) / 4.0f, Float.intBitsToFloat((int) (ak3Var.b() & 4294967295L)) / 2.0f);
        a.h(Float.intBitsToFloat((int) (ak3Var.b() >> 32)), Float.intBitsToFloat((int) (ak3Var.b() & 4294967295L)) / 2.0f);
        a.i(Float.intBitsToFloat((int) (ak3Var.b() >> 32)) / 4.0f, Float.intBitsToFloat((int) (ak3Var.b() & 4294967295L)) / 3.0f);
        a.h(Float.intBitsToFloat((int) (ak3Var.b() >> 32)) / 4.0f, (Float.intBitsToFloat((int) (ak3Var.b() & 4294967295L)) * 2.0f) / 3.0f);
        a.h((Float.intBitsToFloat((int) (ak3Var.b() >> 32)) * 3.0f) / 4.0f, (Float.intBitsToFloat((int) (ak3Var.b() & 4294967295L)) * 2.0f) / 3.0f);
        a.h((Float.intBitsToFloat((int) (ak3Var.b() >> 32)) * 3.0f) / 4.0f, Float.intBitsToFloat((int) (ak3Var.b() & 4294967295L)) / 3.0f);
        a.h(Float.intBitsToFloat((int) (ak3Var.b() >> 32)) / 4.0f, Float.intBitsToFloat((int) (ak3Var.b() & 4294967295L)) / 3.0f);
        s4b s4bVar = new s4b(ak3Var.L0(1.0f), nae.e, 0, 0, new zj(new DashPathEffect(new float[]{ak3Var.L0(1.0f), ak3Var.L0(1.0f)}, nae.e)), 14);
        long j = this.b;
        ak3.t1(ak3Var, a, j, nae.e, s4bVar, 52);
        float min = Math.min(Float.intBitsToFloat((int) (ak3Var.b() >> 32)) * 0.18f, ak3Var.L0(36.0f));
        a.l();
        a.i((Float.intBitsToFloat((int) (ak3Var.b() >> 32)) - min) / 2.0f, Float.intBitsToFloat((int) (ak3Var.b() & 4294967295L)) / 2.0f);
        a.h((Float.intBitsToFloat((int) (ak3Var.b() >> 32)) + min) / 2.0f, Float.intBitsToFloat((int) (ak3Var.b() & 4294967295L)) / 2.0f);
        float f = min / 3.0f;
        a.i((Float.intBitsToFloat((int) (ak3Var.b() >> 32)) - min) / 2.0f, (Float.intBitsToFloat((int) (ak3Var.b() & 4294967295L)) / 2.0f) - f);
        a.h((Float.intBitsToFloat((int) (ak3Var.b() >> 32)) + min) / 2.0f, (Float.intBitsToFloat((int) (ak3Var.b() & 4294967295L)) / 2.0f) - f);
        a.i((Float.intBitsToFloat((int) (ak3Var.b() >> 32)) - min) / 2.0f, (Float.intBitsToFloat((int) (ak3Var.b() & 4294967295L)) / 2.0f) + f);
        a.h((Float.intBitsToFloat((int) (ak3Var.b() >> 32)) + min) / 2.0f, (Float.intBitsToFloat((int) (ak3Var.b() & 4294967295L)) / 2.0f) + f);
        float min2 = Math.min(Float.intBitsToFloat((int) (ak3Var.b() >> 32)) * 0.09f, ak3Var.L0(18.0f));
        float intBitsToFloat = Float.intBitsToFloat((int) (ak3Var.b() >> 32)) / 2.0f;
        float intBitsToFloat2 = (Float.intBitsToFloat((int) (ak3Var.b() & 4294967295L)) * 5.0f) / 6.0f;
        float f2 = (min2 * 2.0f) / 2.0f;
        float f3 = intBitsToFloat - f2;
        float f4 = min2 / 2.0f;
        float f5 = intBitsToFloat2 - f4;
        a.i(f3, f5);
        a.h(intBitsToFloat, intBitsToFloat2 + f4);
        float f6 = f2 + intBitsToFloat;
        a.h(f6, f5);
        float intBitsToFloat3 = Float.intBitsToFloat((int) (4294967295L & ak3Var.b())) / 6.0f;
        float f7 = intBitsToFloat3 + f4;
        a.i(f3, f7);
        a.h(intBitsToFloat, intBitsToFloat3 - f4);
        a.h(f6, f7);
        ak3.t1(ak3Var, a, j, nae.e, new s4b(ak3Var.L0(1.0f), nae.e, 0, 0, null, 30), 52);
        return pvc.a;
    }

    @Override // defpackage.xt4
    public final Object invoke(Object obj) {
        f61 f61Var;
        Object gs9Var;
        boolean z;
        String s0;
        int i;
        int i2;
        Integer valueOf;
        Boolean bool;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        int i3 = this.a;
        long j = this.b;
        pvc pvcVar = pvc.a;
        switch (i3) {
            case 0:
                u41 u41Var = (u41) obj;
                float intBitsToFloat = Float.intBitsToFloat((int) (u41Var.a.b() >> 32)) / 2.0f;
                return u41Var.a(new uh(intBitsToFloat, qre.q(u41Var, intBitsToFloat), new wl0(j, 5), 0));
            case 1:
                qd6 qd6Var = (qd6) obj;
                qd6Var.getClass();
                ak3.R0(qd6Var, this.b, 0L, 0L, nae.e, null, 0, Token.ELSE);
                qd6Var.a();
                return pvcVar;
            case 2:
                ak3 ak3Var = (ak3) obj;
                ak3Var.getClass();
                ak3.R0(ak3Var, this.b, 0L, 0L, nae.e, null, 0, Token.ELSE);
                return pvcVar;
            case 3:
                ak3 ak3Var2 = (ak3) obj;
                ak3Var2.getClass();
                ak3.R0(ak3Var2, this.b, 0L, 0L, nae.e, null, 0, Token.ELSE);
                return pvcVar;
            case 4:
                kv0 kv0Var = (kv0) obj;
                xt4 xt4Var = kv0Var.b;
                if (xt4Var != null && (f61Var = kv0Var.a) != null) {
                    try {
                        gs9Var = xt4Var.invoke(Long.valueOf(j));
                    } catch (Throwable th) {
                        gs9Var = new gs9(th);
                    }
                    f61Var.resumeWith(gs9Var);
                }
                return pvcVar;
            case 5:
                ak3 ak3Var3 = (ak3) obj;
                ak3Var3.getClass();
                ak3.R0(ak3Var3, this.b, 0L, 0L, nae.e, null, 0, Token.ELSE);
                return pvcVar;
            case 6:
                ak3 ak3Var4 = (ak3) obj;
                ak3Var4.getClass();
                ak3.R0(ak3Var4, this.b, 0L, 0L, nae.e, null, 0, Token.ELSE);
                return pvcVar;
            case 7:
                ((l8a) obj).a(a7a.a, new z6a(h35.a, this.b, y6a.b, true));
                return pvcVar;
            case 8:
                nm nmVar = (nm) obj;
                nmVar.getClass();
                nmVar.j(0, Long.valueOf(j));
                return pvcVar;
            case 9:
                ak3 ak3Var5 = (ak3) obj;
                ak3Var5.getClass();
                ak3.R0(ak3Var5, this.b, 0L, 0L, nae.e, null, 0, Token.ELSE);
                return pvcVar;
            case 10:
                return Long.valueOf(j);
            case 11:
                ((pv7) obj).e(m55.b, Long.valueOf(j));
                return null;
            case 12:
                ((r13) obj).getClass();
                return new py5((k27.A(Float.intBitsToFloat((int) (j & 4294967295L))) & 4294967295L) | (k27.A(Float.intBitsToFloat((int) (j >> 32))) << 32));
            case 13:
                ak3 ak3Var6 = (ak3) obj;
                ak3Var6.getClass();
                ak3.R0(ak3Var6, this.b, 0L, (Float.floatToRawIntBits(ak3Var6.L0(3.0f)) << 32) | (Float.floatToRawIntBits(Float.intBitsToFloat((int) (ak3Var6.b() & 4294967295L))) & 4294967295L), nae.e, null, 0, Token.FUNCTION);
                return pvcVar;
            case 14:
                ak3 ak3Var7 = (ak3) obj;
                ak3Var7.getClass();
                ak3.R0(ak3Var7, this.b, 0L, 0L, nae.e, null, 0, Token.ELSE);
                return pvcVar;
            case 15:
                ak3 ak3Var8 = (ak3) obj;
                ak3Var8.getClass();
                ak3.R0(ak3Var8, this.b, 0L, 0L, nae.e, null, 0, Token.ELSE);
                return pvcVar;
            case 16:
                ((r13) obj).getClass();
                return new py5((k27.A(Float.intBitsToFloat((int) (j & 4294967295L))) & 4294967295L) | (k27.A(Float.intBitsToFloat((int) (j >> 32))) << 32));
            case 17:
                ak3 ak3Var9 = (ak3) obj;
                ak3Var9.getClass();
                ak3.R0(ak3Var9, this.b, 0L, 0L, nae.e, null, 0, Token.ELSE);
                return pvcVar;
            case 18:
                ak3 ak3Var10 = (ak3) obj;
                ak3Var10.getClass();
                float L0 = ak3Var10.L0(6.0f);
                ak3.Y(ak3Var10, this.b, 0L, 0L, (Float.floatToRawIntBits(L0) << 32) | (Float.floatToRawIntBits(L0) & 4294967295L), null, nae.e, 246);
                return pvcVar;
            case 19:
                ak3 ak3Var11 = (ak3) obj;
                ak3Var11.getClass();
                yj a = dk.a();
                float intBitsToFloat2 = Float.intBitsToFloat((int) (ak3Var11.b() >> 32));
                float intBitsToFloat3 = Float.intBitsToFloat((int) (ak3Var11.b() & 4294967295L));
                a.l();
                float f = (intBitsToFloat2 * 2.0f) / 7.0f;
                a.i(f, nae.e);
                float f2 = (intBitsToFloat3 * 2.0f) / 3.0f;
                a.h(f, f2);
                float f3 = (intBitsToFloat2 * 5.0f) / 7.0f;
                a.h(f3, f2);
                a.h(f3, nae.e);
                float f4 = intBitsToFloat3 / 3.0f;
                a.i(f, f4);
                a.h(f3, f4);
                s4b s4bVar = new s4b(ak3Var11.L0(1.0f), nae.e, 0, 0, new zj(new DashPathEffect(new float[]{ak3Var11.L0(1.0f), ak3Var11.L0(1.0f)}, nae.e)), 14);
                long j2 = this.b;
                ak3.t1(ak3Var11, a, j2, nae.e, s4bVar, 52);
                a.l();
                float min = Math.min(intBitsToFloat2 * 0.18f, ak3Var11.L0(36.0f));
                float f5 = (intBitsToFloat2 - min) / 2.0f;
                float f6 = intBitsToFloat3 / 2.0f;
                a.i(f5, f6);
                float f7 = (intBitsToFloat2 + min) / 2.0f;
                a.h(f7, f6);
                float f8 = min / 3.0f;
                float f9 = f6 - f8;
                a.i(f5, f9);
                a.h(f7, f9);
                float f10 = f6 + f8;
                a.i(f5, f10);
                a.h(f7, f10);
                float min2 = Math.min(intBitsToFloat2 * 0.09f, ak3Var11.L0(18.0f));
                float f11 = min2 * 2.0f;
                float f12 = intBitsToFloat2 / 2.0f;
                float f13 = (intBitsToFloat3 * 5.0f) / 6.0f;
                float f14 = min2 / 2.0f;
                float f15 = f12 - f14;
                float f16 = f11 / 2.0f;
                a.i(f15, f13 - f16);
                float f17 = f12 + f14;
                a.h(f17, f13);
                a.h(f15, f13 + f16);
                float f18 = intBitsToFloat3 / 6.0f;
                a.i(f17, f18 - f16);
                a.h(f15, f18);
                a.h(f17, f18 + f16);
                ak3.t1(ak3Var11, a, j2, nae.e, new s4b(ak3Var11.L0(1.0f), nae.e, 0, 0, null, 30), 52);
                return pvcVar;
            case 20:
                ak3 ak3Var12 = (ak3) obj;
                ak3Var12.getClass();
                yj a2 = dk.a();
                float intBitsToFloat4 = Float.intBitsToFloat((int) (ak3Var12.b() >> 32));
                float intBitsToFloat5 = Float.intBitsToFloat((int) (ak3Var12.b() & 4294967295L));
                a2.l();
                float f19 = (intBitsToFloat4 * 2.0f) / 7.0f;
                a2.i(f19, intBitsToFloat5);
                float f20 = intBitsToFloat5 / 3.0f;
                a2.h(f19, f20);
                float f21 = intBitsToFloat4 * 5.0f;
                float f22 = f21 / 7.0f;
                a2.h(f22, f20);
                a2.i(f22, nae.e);
                float f23 = (intBitsToFloat5 * 2.0f) / 3.0f;
                a2.h(f22, f23);
                a2.h(f19, f23);
                s4b s4bVar2 = new s4b(ak3Var12.L0(1.0f), nae.e, 0, 0, new zj(new DashPathEffect(new float[]{ak3Var12.L0(1.0f), ak3Var12.L0(1.0f)}, nae.e)), 14);
                long j3 = this.b;
                ak3.t1(ak3Var12, a2, j3, nae.e, s4bVar2, 52);
                a2.l();
                float min3 = Math.min(intBitsToFloat4 * 0.18f, ak3Var12.L0(36.0f));
                float f24 = (intBitsToFloat4 - min3) / 2.0f;
                float f25 = intBitsToFloat5 / 2.0f;
                a2.i(f24, f25);
                float f26 = (intBitsToFloat4 + min3) / 2.0f;
                a2.h(f26, f25);
                float f27 = min3 / 3.0f;
                float f28 = f25 - f27;
                a2.i(f24, f28);
                a2.h(f26, f28);
                float f29 = f25 + f27;
                a2.i(f24, f29);
                a2.h(f26, f29);
                float min4 = Math.min(intBitsToFloat4 * 0.09f, ak3Var12.L0(18.0f));
                float f30 = min4 * 2.0f;
                float f31 = f21 / 6.0f;
                float f32 = (intBitsToFloat5 * 5.0f) / 6.0f;
                float f33 = min4 / 2.0f;
                float f34 = f31 - f33;
                float f35 = f30 / 2.0f;
                a2.i(f34, f32 - f35);
                a2.h(f31 + f33, f32);
                a2.h(f34, f32 + f35);
                float f36 = intBitsToFloat4 / 6.0f;
                float f37 = intBitsToFloat5 / 6.0f;
                float f38 = f36 + f33;
                a2.i(f38, f37 - f35);
                a2.h(f36 - f33, f37);
                a2.h(f38, f37 + f35);
                ak3.t1(ak3Var12, a2, j3, nae.e, new s4b(ak3Var12.L0(1.0f), nae.e, 0, 0, null, 30), 52);
                return pvcVar;
            case 21:
                ak3 ak3Var13 = (ak3) obj;
                ak3Var13.getClass();
                float intBitsToFloat6 = Float.intBitsToFloat((int) (ak3Var13.b() >> 32));
                float intBitsToFloat7 = Float.intBitsToFloat((int) (ak3Var13.b() & 4294967295L));
                yj a3 = dk.a();
                a3.l();
                float f39 = intBitsToFloat6 / 3.0f;
                a3.i(f39, nae.e);
                a3.h(f39, intBitsToFloat7);
                float f40 = (intBitsToFloat6 * 2.0f) / 3.0f;
                a3.i(f40, nae.e);
                a3.h(f40, intBitsToFloat7);
                s4b s4bVar3 = new s4b(ak3Var13.L0(1.0f), nae.e, 0, 0, new zj(new DashPathEffect(new float[]{ak3Var13.L0(1.0f), ak3Var13.L0(1.0f)}, nae.e)), 14);
                long j4 = this.b;
                ak3.t1(ak3Var13, a3, j4, nae.e, s4bVar3, 52);
                a3.l();
                float min5 = Math.min(intBitsToFloat6 * 0.18f, ak3Var13.L0(36.0f));
                float f41 = (intBitsToFloat6 - min5) / 2.0f;
                float f42 = intBitsToFloat7 / 2.0f;
                a3.i(f41, f42);
                float f43 = (intBitsToFloat6 + min5) / 2.0f;
                a3.h(f43, f42);
                float f44 = min5 / 3.0f;
                float f45 = f42 - f44;
                a3.i(f41, f45);
                a3.h(f43, f45);
                float f46 = f44 + f42;
                a3.i(f41, f46);
                a3.h(f43, f46);
                float min6 = Math.min(intBitsToFloat6 * 0.09f, ak3Var13.L0(18.0f));
                float f47 = min6 * 2.0f;
                float f48 = (intBitsToFloat6 * 5.0f) / 6.0f;
                float f49 = min6 / 2.0f;
                float f50 = f48 - f49;
                float f51 = f47 / 2.0f;
                float f52 = f42 - f51;
                a3.i(f50, f52);
                a3.h(f48 + f49, f42);
                float f53 = f51 + f42;
                a3.h(f50, f53);
                float f54 = intBitsToFloat6 / 6.0f;
                float f55 = f54 + f49;
                a3.i(f55, f52);
                a3.h(f54 - f49, f42);
                a3.h(f55, f53);
                ak3.t1(ak3Var13, a3, j4, nae.e, new s4b(ak3Var13.L0(1.0f), nae.e, 0, 0, null, 30), 52);
                return pvcVar;
            case 22:
                ak3 ak3Var14 = (ak3) obj;
                ak3Var14.getClass();
                yj a4 = dk.a();
                float intBitsToFloat8 = Float.intBitsToFloat((int) (ak3Var14.b() >> 32));
                float intBitsToFloat9 = Float.intBitsToFloat((int) (ak3Var14.b() & 4294967295L));
                float f56 = intBitsToFloat8 / 2.0f;
                a4.i(f56, nae.e);
                float f57 = intBitsToFloat9 / 3.0f;
                a4.h(f56, f57);
                float f58 = (intBitsToFloat9 * 2.0f) / 3.0f;
                a4.i(f56, f58);
                a4.h(f56, intBitsToFloat9);
                float f59 = (intBitsToFloat8 * 2.0f) / 7.0f;
                a4.i(f59, f57);
                float f60 = (intBitsToFloat8 * 5.0f) / 7.0f;
                a4.h(f60, f57);
                a4.h(f60, f58);
                a4.h(f59, f58);
                a4.h(f59, f57);
                s4b s4bVar4 = new s4b(ak3Var14.L0(1.0f), nae.e, 0, 0, new zj(new DashPathEffect(new float[]{ak3Var14.L0(1.0f), ak3Var14.L0(1.0f)}, nae.e)), 14);
                long j5 = this.b;
                ak3.t1(ak3Var14, a4, j5, nae.e, s4bVar4, 52);
                float min7 = Math.min(intBitsToFloat8 * 0.18f, ak3Var14.L0(36.0f));
                a4.l();
                float f61 = (intBitsToFloat8 - min7) / 2.0f;
                float f62 = intBitsToFloat9 / 2.0f;
                a4.i(f61, f62);
                float f63 = (intBitsToFloat8 + min7) / 2.0f;
                a4.h(f63, f62);
                float f64 = min7 / 3.0f;
                float f65 = f62 - f64;
                a4.i(f61, f65);
                a4.h(f63, f65);
                float f66 = f62 + f64;
                a4.i(f61, f66);
                a4.h(f63, f66);
                float min8 = Math.min(intBitsToFloat8 * 0.09f, ak3Var14.L0(18.0f));
                float f67 = min8 * 2.0f;
                float f68 = (intBitsToFloat8 * 6.0f) / 7.0f;
                float f69 = (intBitsToFloat9 * 5.0f) / 6.0f;
                float f70 = min8 / 2.0f;
                float f71 = f68 - f70;
                float f72 = f67 / 2.0f;
                a4.i(f71, f69 - f72);
                a4.h(f68 + f70, f69);
                a4.h(f71, f69 + f72);
                float f73 = intBitsToFloat8 / 7.0f;
                float f74 = intBitsToFloat9 / 6.0f;
                float f75 = f73 - f70;
                a4.i(f75, f74 - f72);
                a4.h(f73 + f70, f74);
                a4.h(f75, f74 + f72);
                ak3.t1(ak3Var14, a4, j5, nae.e, new s4b(ak3Var14.L0(1.0f), nae.e, 0, 0, null, 30), 52);
                return pvcVar;
            case 23:
                ak3 ak3Var15 = (ak3) obj;
                ak3Var15.getClass();
                yj a5 = dk.a();
                a5.l();
                a5.i(nae.e, Float.intBitsToFloat((int) (ak3Var15.b() & 4294967295L)) / 3.0f);
                a5.h(Float.intBitsToFloat((int) (ak3Var15.b() >> 32)) / 3.0f, Float.intBitsToFloat((int) (ak3Var15.b() & 4294967295L)) / 3.0f);
                a5.h(Float.intBitsToFloat((int) (ak3Var15.b() >> 32)) / 3.0f, Float.intBitsToFloat((int) (ak3Var15.b() & 4294967295L)));
                a5.i(Float.intBitsToFloat((int) (ak3Var15.b() >> 32)) / 3.0f, (Float.intBitsToFloat((int) (ak3Var15.b() & 4294967295L)) * 2.0f) / 3.0f);
                a5.h((Float.intBitsToFloat((int) (ak3Var15.b() >> 32)) * 2.0f) / 3.0f, (Float.intBitsToFloat((int) (ak3Var15.b() & 4294967295L)) * 2.0f) / 3.0f);
                a5.h((Float.intBitsToFloat((int) (ak3Var15.b() >> 32)) * 2.0f) / 3.0f, Float.intBitsToFloat((int) (ak3Var15.b() & 4294967295L)) / 3.0f);
                a5.h(Float.intBitsToFloat((int) (ak3Var15.b() >> 32)), Float.intBitsToFloat((int) (ak3Var15.b() & 4294967295L)) / 3.0f);
                s4b s4bVar5 = new s4b(ak3Var15.L0(1.0f), nae.e, 0, 0, new zj(new DashPathEffect(new float[]{ak3Var15.L0(1.0f), ak3Var15.L0(1.0f)}, nae.e)), 14);
                long j6 = this.b;
                ak3.t1(ak3Var15, a5, j6, nae.e, s4bVar5, 52);
                a5.l();
                float min9 = Math.min(Float.intBitsToFloat((int) (ak3Var15.b() >> 32)) * 0.18f, ak3Var15.L0(36.0f));
                a5.i((Float.intBitsToFloat((int) (ak3Var15.b() >> 32)) - min9) / 2.0f, Float.intBitsToFloat((int) (ak3Var15.b() & 4294967295L)) / 3.0f);
                a5.h((Float.intBitsToFloat((int) (ak3Var15.b() >> 32)) + min9) / 2.0f, Float.intBitsToFloat((int) (ak3Var15.b() & 4294967295L)) / 3.0f);
                float f76 = min9 / 3.0f;
                a5.i((Float.intBitsToFloat((int) (ak3Var15.b() >> 32)) - min9) / 2.0f, (Float.intBitsToFloat((int) (ak3Var15.b() & 4294967295L)) / 3.0f) - f76);
                a5.h((Float.intBitsToFloat((int) (ak3Var15.b() >> 32)) + min9) / 2.0f, (Float.intBitsToFloat((int) (ak3Var15.b() & 4294967295L)) / 3.0f) - f76);
                a5.i((Float.intBitsToFloat((int) (ak3Var15.b() >> 32)) - min9) / 2.0f, (Float.intBitsToFloat((int) (ak3Var15.b() & 4294967295L)) / 3.0f) + f76);
                a5.h((Float.intBitsToFloat((int) (ak3Var15.b() >> 32)) + min9) / 2.0f, (Float.intBitsToFloat((int) (ak3Var15.b() & 4294967295L)) / 3.0f) + f76);
                float min10 = Math.min(Float.intBitsToFloat((int) (ak3Var15.b() >> 32)) * 0.09f, ak3Var15.L0(18.0f));
                float f77 = min10 * 2.0f;
                float intBitsToFloat10 = (Float.intBitsToFloat((int) (ak3Var15.b() & 4294967295L)) * 5.0f) / 6.0f;
                float intBitsToFloat11 = (Float.intBitsToFloat((int) (ak3Var15.b() >> 32)) * 2.0f) / 3.0f;
                float f78 = min10 / 2.0f;
                float f79 = intBitsToFloat11 - f78;
                float f80 = f77 / 2.0f;
                float f81 = intBitsToFloat10 - f80;
                a5.i(f79, f81);
                a5.h(intBitsToFloat11 + f78, intBitsToFloat10);
                float f82 = f80 + intBitsToFloat10;
                a5.h(f79, f82);
                float intBitsToFloat12 = Float.intBitsToFloat((int) (ak3Var15.b() >> 32)) / 6.0f;
                float f83 = intBitsToFloat12 + f78;
                a5.i(f83, f81);
                a5.h(intBitsToFloat12 - f78, intBitsToFloat10);
                a5.h(f83, f82);
                ak3.t1(ak3Var15, a5, j6, nae.e, new s4b(ak3Var15.L0(1.0f), nae.e, 0, 0, null, 30), 52);
                return pvcVar;
            case 24:
                ak3 ak3Var16 = (ak3) obj;
                ak3Var16.getClass();
                yj a6 = dk.a();
                float intBitsToFloat13 = Float.intBitsToFloat((int) (ak3Var16.b() >> 32));
                float intBitsToFloat14 = Float.intBitsToFloat((int) (ak3Var16.b() & 4294967295L));
                float f84 = (intBitsToFloat13 * 5.0f) / 7.0f;
                a6.i(f84, nae.e);
                float f85 = (intBitsToFloat14 * 2.0f) / 3.0f;
                a6.h(f84, f85);
                float f86 = (intBitsToFloat13 * 2.0f) / 7.0f;
                a6.h(f86, f85);
                float f87 = intBitsToFloat14 / 3.0f;
                a6.h(f86, f87);
                a6.h(intBitsToFloat13, f87);
                s4b s4bVar6 = new s4b(ak3Var16.L0(1.0f), nae.e, 0, 0, new zj(new DashPathEffect(new float[]{ak3Var16.L0(1.0f), ak3Var16.L0(1.0f)}, nae.e)), 14);
                long j7 = this.b;
                ak3.t1(ak3Var16, a6, j7, nae.e, s4bVar6, 52);
                float min11 = Math.min(intBitsToFloat13 * 0.18f, ak3Var16.L0(36.0f));
                a6.l();
                float f88 = (intBitsToFloat13 - min11) / 2.0f;
                float f89 = intBitsToFloat14 / 2.0f;
                a6.i(f88, f89);
                float f90 = (intBitsToFloat13 + min11) / 2.0f;
                a6.h(f90, f89);
                float f91 = min11 / 3.0f;
                float f92 = f89 - f91;
                a6.i(f88, f92);
                a6.h(f90, f92);
                float f93 = f89 + f91;
                a6.i(f88, f93);
                a6.h(f90, f93);
                float min12 = Math.min(intBitsToFloat13 * 0.09f, ak3Var16.L0(18.0f));
                float f94 = min12 * 2.0f;
                float f95 = (5.0f * intBitsToFloat14) / 6.0f;
                float f96 = intBitsToFloat14 / 6.0f;
                float f97 = intBitsToFloat13 / 2.0f;
                float f98 = min12 / 2.0f;
                float f99 = f97 - f98;
                float f100 = f94 / 2.0f;
                a6.i(f99, f95 - f100);
                a6.h(f97 + f98, f95);
                a6.h(f99, f95 + f100);
                float f101 = (intBitsToFloat13 * 6.0f) / 7.0f;
                float f102 = f101 + f98;
                a6.i(f102, f96 - f100);
                a6.h(f101 - f98, f96);
                a6.h(f102, f96 + f100);
                ak3.t1(ak3Var16, a6, j7, nae.e, new s4b(ak3Var16.L0(1.0f), nae.e, 0, 0, null, 30), 52);
                return pvcVar;
            case 25:
                return a(obj);
            case 26:
                return b(obj);
            default:
                cw9 cw9Var = (cw9) obj;
                cw9Var.getClass();
                iw9 h1 = cw9Var.h1("SELECT * FROM workspec WHERE last_enqueue_time >= ? AND state IN (2, 3, 5) ORDER BY last_enqueue_time DESC");
                try {
                    h1.m(1, j);
                    int t = que.t(h1, "id");
                    int t2 = que.t(h1, "state");
                    int t3 = que.t(h1, "worker_class_name");
                    int t4 = que.t(h1, "input_merger_class_name");
                    int t5 = que.t(h1, "input");
                    int t6 = que.t(h1, "output");
                    int t7 = que.t(h1, "initial_delay");
                    int t8 = que.t(h1, "interval_duration");
                    int t9 = que.t(h1, "flex_duration");
                    int t10 = que.t(h1, "run_attempt_count");
                    int t11 = que.t(h1, "backoff_policy");
                    int t12 = que.t(h1, "backoff_delay_duration");
                    int t13 = que.t(h1, "last_enqueue_time");
                    int t14 = que.t(h1, "minimum_retention_duration");
                    int t15 = que.t(h1, "schedule_requested_at");
                    int t16 = que.t(h1, "run_in_foreground");
                    int t17 = que.t(h1, "out_of_quota_policy");
                    int t18 = que.t(h1, "period_count");
                    int t19 = que.t(h1, "generation");
                    int t20 = que.t(h1, "next_schedule_time_override");
                    int t21 = que.t(h1, "next_schedule_time_override_generation");
                    int t22 = que.t(h1, "stop_reason");
                    int t23 = que.t(h1, "trace_tag");
                    int t24 = que.t(h1, "backoff_on_system_interruptions");
                    int t25 = que.t(h1, "required_network_type");
                    int t26 = que.t(h1, "required_network_request");
                    int t27 = que.t(h1, "requires_charging");
                    int t28 = que.t(h1, "requires_device_idle");
                    int t29 = que.t(h1, "requires_battery_not_low");
                    int t30 = que.t(h1, "requires_storage_not_low");
                    int t31 = que.t(h1, "trigger_content_update_delay");
                    int t32 = que.t(h1, "trigger_max_content_delay");
                    int t33 = que.t(h1, "content_uri_triggers");
                    ArrayList arrayList = new ArrayList();
                    while (h1.Z0()) {
                        String s02 = h1.s0(t);
                        int i4 = t13;
                        int i5 = t14;
                        jmd t34 = fxe.t((int) h1.getLong(t2));
                        String s03 = h1.s0(t3);
                        String s04 = h1.s0(t4);
                        byte[] blob = h1.getBlob(t5);
                        tf2 tf2Var = tf2.b;
                        tf2 f103 = rae.f(blob);
                        tf2 f104 = rae.f(h1.getBlob(t6));
                        long j8 = h1.getLong(t7);
                        long j9 = h1.getLong(t8);
                        long j10 = h1.getLong(t9);
                        int i6 = (int) h1.getLong(t10);
                        int i7 = t2;
                        int i8 = t3;
                        ng0 q = fxe.q((int) h1.getLong(t11));
                        long j11 = h1.getLong(t12);
                        long j12 = h1.getLong(i4);
                        long j13 = h1.getLong(i5);
                        int i9 = t;
                        int i10 = t15;
                        long j14 = h1.getLong(i10);
                        t15 = i10;
                        int i11 = t16;
                        if (((int) h1.getLong(i11)) != 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        int i12 = t17;
                        int i13 = t4;
                        mf8 s = fxe.s((int) h1.getLong(i12));
                        int i14 = t5;
                        int i15 = t18;
                        int i16 = t6;
                        int i17 = (int) h1.getLong(i15);
                        int i18 = t19;
                        int i19 = (int) h1.getLong(i18);
                        int i20 = t20;
                        long j15 = h1.getLong(i20);
                        int i21 = t21;
                        int i22 = (int) h1.getLong(i21);
                        int i23 = t22;
                        int i24 = (int) h1.getLong(i23);
                        int i25 = t23;
                        if (h1.isNull(i25)) {
                            s0 = null;
                        } else {
                            s0 = h1.s0(i25);
                        }
                        int i26 = t24;
                        if (h1.isNull(i26)) {
                            i = i22;
                            i2 = i23;
                            valueOf = null;
                        } else {
                            i = i22;
                            i2 = i23;
                            valueOf = Integer.valueOf((int) h1.getLong(i26));
                        }
                        if (valueOf != null) {
                            if (valueOf.intValue() != 0) {
                                z6 = true;
                            } else {
                                z6 = false;
                            }
                            bool = Boolean.valueOf(z6);
                        } else {
                            bool = null;
                        }
                        int i27 = t25;
                        c28 r = fxe.r((int) h1.getLong(i27));
                        int i28 = t26;
                        w18 E = fxe.E(h1.getBlob(i28));
                        int i29 = t27;
                        if (((int) h1.getLong(i29)) != 0) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        int i30 = t28;
                        if (((int) h1.getLong(i30)) != 0) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        int i31 = t29;
                        if (((int) h1.getLong(i31)) != 0) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        t29 = i31;
                        int i32 = t30;
                        if (((int) h1.getLong(i32)) != 0) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        int i33 = t31;
                        int i34 = t32;
                        int i35 = t33;
                        arrayList.add(new ymd(s02, t34, s03, s04, f103, f104, j8, j9, j10, new w02(E, r, z2, z3, z4, z5, h1.getLong(i33), h1.getLong(i34), fxe.l(h1.getBlob(i35))), i6, q, j11, j12, j13, j14, z, s, i17, i19, j15, i, i24, s0, bool));
                        t33 = i35;
                        t31 = i33;
                        t32 = i34;
                        t2 = i7;
                        t = i9;
                        t13 = i4;
                        t3 = i8;
                        t14 = i5;
                        t16 = i11;
                        t20 = i20;
                        t21 = i21;
                        t23 = i25;
                        t4 = i13;
                        t17 = i12;
                        t19 = i18;
                        t22 = i2;
                        t24 = i26;
                        t30 = i32;
                        t5 = i14;
                        t25 = i27;
                        t26 = i28;
                        t27 = i29;
                        t28 = i30;
                        t6 = i16;
                        t18 = i15;
                    }
                    h1.close();
                    return arrayList;
                } catch (Throwable th2) {
                    h1.close();
                    throw th2;
                }
        }
    }
}
