package defpackage;

import java.util.List;
import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: nf0  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class nf0 implements xt4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;

    public /* synthetic */ nf0(Object obj, boolean z, int i) {
        this.a = i;
        this.c = obj;
        this.b = z;
    }

    @Override // defpackage.xt4
    public final Object invoke(Object obj) {
        long b;
        int i = this.a;
        pvc pvcVar = pvc.a;
        Object obj2 = this.c;
        boolean z = this.b;
        switch (i) {
            case 0:
                xv1 xv1Var = (xv1) obj2;
                xv1Var.a.h(z);
                xv1Var.b.i(z);
                return new rf0((do6) obj, xv1Var, 0);
            case 1:
                ak3 ak3Var = (ak3) obj;
                ak3Var.getClass();
                float a = ((ef2) obj2).a();
                if (z) {
                    b = zl1.b(b23.o(0.04f, 0.02f, a), zl1.b);
                } else {
                    b = zl1.b(b23.o(0.06f, 0.02f, a), zl1.e);
                }
                ak3.R0(ak3Var, b, 0L, 0L, nae.e, null, 0, Token.ELSE);
                return pvcVar;
            case 2:
                StringBuilder sb = (StringBuilder) obj2;
                Byte b2 = (Byte) obj;
                byte byteValue = b2.byteValue();
                if (!xk1.a.contains(b2) && !xk1.d.contains(b2)) {
                    if (z && byteValue == 32) {
                        sb.append('+');
                    } else {
                        sb.append(xk1.g(byteValue));
                    }
                } else {
                    sb.append((char) byteValue);
                }
                return pvcVar;
            case 3:
                nm nmVar = (nm) obj;
                nmVar.getClass();
                nmVar.l(0, Boolean.valueOf(z));
                nmVar.g(1, (String) obj2);
                return pvcVar;
            case 4:
                cz7 cz7Var = (cz7) obj2;
                String str = (String) obj;
                str.getClass();
                if (!z) {
                    q0f.m(cz7Var, str);
                }
                return pvcVar;
            case 5:
                i53 i53Var = (i53) obj2;
                Integer num = (Integer) obj;
                num.getClass();
                if (!z) {
                    hk1 a2 = jdd.a(i53Var);
                    sw2 sw2Var = ab3.a;
                    i53Var.f(a2, ru2.c, new d53((fdd) i53Var, (Object) num, (m42) null, 1));
                }
                return pvcVar;
            case 6:
                wpa wpaVar = (wpa) obj2;
                l8a l8aVar = (l8a) obj;
                if (!z) {
                    r76[] r76VarArr = j8a.a;
                    l8aVar.a(h8a.j, pvcVar);
                }
                String valueOf = String.valueOf(k27.A(wpaVar.d.h() * 100.0f) / 100.0f);
                r76[] r76VarArr2 = j8a.a;
                k8a k8aVar = h8a.b;
                r76 r76Var = j8a.a[0];
                l8aVar.a(k8aVar, valueOf);
                l8aVar.a(s7a.i, new g4(null, new opa(wpaVar, 2)));
                return pvcVar;
            case 7:
                List list = (List) obj2;
                ri6 ri6Var = (ri6) obj;
                ri6Var.getClass();
                ri6Var.z(list.size(), null, new pj7(24, list), new tu1(new t43(3, list), true, 802480018));
                if (z) {
                    ri6.y(ri6Var, null, gae.b, 3);
                }
                return pvcVar;
            default:
                qi8 qi8Var = (qi8) obj2;
                dm8 dm8Var = qi8Var.a;
                t15 t15Var = (t15) obj;
                t15Var.getClass();
                if (z) {
                    t15Var.v(dm8Var.h());
                    t15Var.l(dm8Var.h());
                    t15Var.x(qi8Var.b.h());
                    t15Var.i(qi8Var.c.h());
                } else {
                    t15Var.v(1.0f);
                    t15Var.l(1.0f);
                    t15Var.x(nae.e);
                    t15Var.i(nae.e);
                }
                t15Var.Z0(ckc.b);
                return pvcVar;
        }
    }

    public /* synthetic */ nf0(boolean z, Object obj, int i) {
        this.a = i;
        this.b = z;
        this.c = obj;
    }
}
