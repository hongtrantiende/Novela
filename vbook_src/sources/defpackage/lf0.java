package defpackage;

import android.app.Activity;
import android.view.WindowManager;
import java.util.List;
import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: lf0  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class lf0 implements xt4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ lf0(fi8 fi8Var, boolean z, h2a h2aVar) {
        this.a = 4;
        this.c = fi8Var;
        this.b = z;
        this.d = h2aVar;
    }

    @Override // defpackage.xt4
    public final Object invoke(Object obj) {
        int i;
        float max;
        float intBitsToFloat;
        uf ufVar;
        int i2;
        int i3 = this.a;
        boolean z = true;
        pvc pvcVar = pvc.a;
        Object obj2 = this.d;
        Object obj3 = this.c;
        boolean z2 = this.b;
        switch (i3) {
            case 0:
                ws2 ws2Var = (ws2) obj3;
                ((ib3) obj).getClass();
                en enVar = new en((aw7) obj2, 5);
                if (!(true & true)) {
                    z = z2;
                }
                if (true & true) {
                    i = 0;
                } else {
                    i = Integer.MIN_VALUE;
                }
                we0 we0Var = new we0(i, enVar, z);
                if (!ws2Var.a.contains(we0Var)) {
                    ws2Var.a = fca.w(ws2Var.a, we0Var);
                    we0Var.b = fca.w(we0Var.b, ws2Var.d);
                    ws2Var.a();
                } else {
                    vs.k("Callback is already registered");
                }
                return new qf0(0, ws2Var, we0Var);
            case 1:
                cz7 cz7Var = (cz7) obj3;
                yya yyaVar = (yya) obj2;
                String str = (String) obj;
                str.getClass();
                if (!z2) {
                    lpe.t(cz7Var, str, ((v43) yyaVar.getValue()).b);
                }
                return pvcVar;
            case 2:
                tl tlVar = (tl) obj3;
                aw7 aw7Var = (aw7) obj2;
                Float f = (Float) obj;
                float floatValue = f.floatValue();
                if (!z2) {
                    aw7Var.setValue(f);
                    Activity activity = tlVar.a;
                    WindowManager.LayoutParams attributes = activity.getWindow().getAttributes();
                    attributes.screenBrightness = floatValue;
                    activity.getWindow().setAttributes(attributes);
                }
                return pvcVar;
            case 3:
                rj8 rj8Var = (rj8) obj3;
                m82 m82Var = (m82) obj2;
                l8a l8aVar = (l8a) obj;
                if (z2) {
                    l85 l85Var = new l85(1, m82Var, rj8Var);
                    r76[] r76VarArr = j8a.a;
                    l8aVar.a(s7a.y, new g4(null, l85Var));
                    l8aVar.a(s7a.A, new g4(null, new l85(2, m82Var, rj8Var)));
                } else {
                    l85 l85Var2 = new l85(3, m82Var, rj8Var);
                    r76[] r76VarArr2 = j8a.a;
                    l8aVar.a(s7a.z, new g4(null, l85Var2));
                    l8aVar.a(s7a.B, new g4(null, new l85(4, m82Var, rj8Var)));
                }
                return pvcVar;
            case 4:
                fi8 fi8Var = (fi8) obj3;
                h2a h2aVar = (h2a) obj2;
                ak3 ak3Var = (ak3) obj;
                ak3Var.getClass();
                if (fi8Var != fi8.a) {
                    if (z2) {
                        uf ufVar2 = h2aVar.i;
                        if (ufVar2 != null) {
                            ufVar2.a(ak3Var.Q0().w());
                        }
                    } else {
                        uf ufVar3 = h2aVar.h;
                        if (ufVar3 != null) {
                            ufVar3.a(ak3Var.Q0().w());
                        }
                    }
                    if (z2) {
                        max = Math.min(Float.intBitsToFloat((int) (ak3Var.b() >> 32)), (h2aVar.e() + Float.intBitsToFloat((int) (ak3Var.b() >> 32))) - h2aVar.c);
                        intBitsToFloat = Float.intBitsToFloat((int) (ak3Var.b() >> 32));
                    } else {
                        max = Math.max((float) nae.e, h2aVar.e() - h2aVar.c);
                        intBitsToFloat = Float.intBitsToFloat((int) (ak3Var.b() >> 32));
                    }
                    float f2 = 1.0f - (max / intBitsToFloat);
                    float f3 = 0.85f * f2;
                    float f4 = 0.18f;
                    if (f3 < 0.2f) {
                        f4 = 0.18f * f3 * 5.0f;
                    }
                    float f5 = 1.0f - f4;
                    float intBitsToFloat2 = Float.intBitsToFloat((int) (ak3Var.b() & 4294967295L)) / Float.intBitsToFloat((int) (ak3Var.b() >> 32));
                    float f6 = (intBitsToFloat2 - 1.0f) / 2.0f;
                    if (z2) {
                        ufVar = h2aVar.h;
                    } else {
                        ufVar = h2aVar.j;
                    }
                    if (ufVar != null) {
                        int intBitsToFloat3 = (int) Float.intBitsToFloat((int) (ak3Var.b() >> 32));
                        int intBitsToFloat4 = (int) Float.intBitsToFloat((int) (ak3Var.b() & 4294967295L));
                        float intBitsToFloat5 = (((Float.intBitsToFloat((int) (ak3Var.b() & 4294967295L)) * f4) * f3) * intBitsToFloat2) - f6;
                        ak3 ak3Var2 = ak3Var;
                        float intBitsToFloat6 = 1.0f / Float.intBitsToFloat((int) (ak3Var.b() >> 32));
                        k61 w = ak3Var2.Q0().w();
                        int i4 = 0;
                        while (i4 < intBitsToFloat3) {
                            if (i4 + 3 > intBitsToFloat3) {
                                i2 = intBitsToFloat3 - i4;
                            } else {
                                i2 = 3;
                            }
                            float f7 = i4 * intBitsToFloat6;
                            int i5 = intBitsToFloat4;
                            double sin = intBitsToFloat5 * (Math.sin((f7 - f2) * 6.283185307179586d) + 1.100000023841858d) * f4;
                            long j = i4 << 32;
                            long j2 = i2 << 32;
                            ak3 ak3Var3 = ak3Var2;
                            int i6 = intBitsToFloat3;
                            long j3 = j2 | (i5 & 4294967295L);
                            int A = k27.A(Float.intBitsToFloat((int) (ak3Var3.b() >> 32)) * ((f7 * f5) - f3));
                            long j4 = ((-k27.z(sin)) & 4294967295L) | (A << 32);
                            long z3 = j2 | (k27.z((2.0d * sin) + Float.intBitsToFloat((int) (ak3Var3.b() & 4294967295L))) & 4294967295L);
                            w.getClass();
                            nl5 nl5Var = ufVar.a;
                            if (nl5Var != null) {
                                ((jj) nl5Var).a.prepareToDraw();
                                w.a(nl5Var, j, j3, j4, z3, ufVar.b);
                            }
                            i4 += i2;
                            intBitsToFloat4 = i5;
                            intBitsToFloat3 = i6;
                            ak3Var2 = ak3Var3;
                        }
                        ak3 ak3Var4 = ak3Var2;
                        float intBitsToFloat7 = Float.intBitsToFloat((int) (ak3Var4.b() >> 32)) * (f5 - f3);
                        ij1 Q0 = ak3Var4.Q0();
                        long G = Q0.G();
                        Q0.w().i();
                        try {
                            mu9.E((mu9) Q0.b, intBitsToFloat7, nae.e, 2);
                            List list = cma.a;
                            float f8 = cma.b;
                            vo6 v = ox9.v(list, ak3Var4.L0(f8), 8);
                            float L0 = ak3Var4.L0(f8);
                            float intBitsToFloat8 = Float.intBitsToFloat((int) (ak3Var4.b() & 4294967295L));
                            ak3.h1(ak3Var4, v, 0L, (Float.floatToRawIntBits(L0) << 32) | (Float.floatToRawIntBits(intBitsToFloat8) & 4294967295L), nae.e, null, null, 0, Token.FUNCTION);
                            return pvcVar;
                        } finally {
                            rs8.r(Q0, G);
                        }
                    }
                }
                return pvcVar;
            case 5:
                aw7 aw7Var2 = (aw7) obj2;
                aw7 aw7Var3 = (aw7) obj3;
                Float f9 = (Float) obj;
                f9.floatValue();
                if (!z2) {
                    aw7Var2.setValue(Boolean.TRUE);
                    aw7Var3.setValue(f9);
                }
                return pvcVar;
            default:
                xt4 xt4Var = (xt4) obj3;
                xt4 xt4Var2 = (xt4) obj2;
                Float f10 = (Float) obj;
                float floatValue2 = f10.floatValue();
                if (z2 && floatValue2 > nae.e) {
                    xt4Var.invoke(Boolean.FALSE);
                }
                xt4Var2.invoke(f10);
                return pvcVar;
        }
    }

    public /* synthetic */ lf0(boolean z, aw7 aw7Var, aw7 aw7Var2) {
        this.a = 5;
        this.b = z;
        this.d = aw7Var;
        this.c = aw7Var2;
    }

    public /* synthetic */ lf0(boolean z, Object obj, Object obj2, int i) {
        this.a = i;
        this.b = z;
        this.c = obj;
        this.d = obj2;
    }
}
