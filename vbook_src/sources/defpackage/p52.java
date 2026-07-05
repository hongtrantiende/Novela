package defpackage;

import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: p52  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class p52 implements xt4 {
    public final /* synthetic */ Object C;
    public final /* synthetic */ Object D;
    public final /* synthetic */ Object E;
    public final /* synthetic */ Object F;
    public final /* synthetic */ Object G;
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ cyb b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ p52(kj6 kj6Var, cyb cybVar, aw7 aw7Var, aw7 aw7Var2, aw7 aw7Var3, aw7 aw7Var4, aw7 aw7Var5, aw7 aw7Var6, aw7 aw7Var7, aw7 aw7Var8) {
        this.c = kj6Var;
        this.b = cybVar;
        this.d = aw7Var;
        this.e = aw7Var2;
        this.f = aw7Var3;
        this.C = aw7Var4;
        this.D = aw7Var5;
        this.E = aw7Var6;
        this.F = aw7Var7;
        this.G = aw7Var8;
    }

    @Override // defpackage.xt4
    public final Object invoke(Object obj) {
        pwb pwbVar;
        pwb b;
        int i = this.a;
        pvc pvcVar = pvc.a;
        Object obj2 = this.G;
        Object obj3 = this.F;
        Object obj4 = this.E;
        Object obj5 = this.D;
        Object obj6 = this.C;
        Object obj7 = this.f;
        Object obj8 = this.e;
        Object obj9 = this.d;
        Object obj10 = this.c;
        switch (i) {
            case 0:
                ri6 ri6Var = (ri6) obj;
                ri6Var.getClass();
                List list = ((kob) obj10).b;
                ln1 ln1Var = new ln1(14);
                ln1 ln1Var2 = new ln1(15);
                ri6Var.z(list.size(), new x7(13, ln1Var, list), new x7(14, ln1Var2, list), new tu1(new gk8(list, (su0) obj9, (e6c) obj8, this.b, (j2c) obj7, (sxb) obj6, (ymb) obj5, (vt4) obj4, (xt4) obj3, (xt4) obj2), true, 802480018));
                return pvcVar;
            default:
                kj6 kj6Var = (kj6) obj10;
                aw7 aw7Var = (aw7) obj3;
                aw7 aw7Var2 = (aw7) obj2;
                y78 y78Var = (y78) obj;
                float intBitsToFloat = Float.intBitsToFloat((int) (y78Var.a >> 32));
                c3c c3cVar = k3c.a;
                long j = y78Var.a;
                pwb b2 = k3c.b(intBitsToFloat - ((Number) ((aw7) obj9).getValue()).floatValue(), Float.intBitsToFloat((int) (j & 4294967295L)) - ((Number) ((aw7) obj8).getValue()).floatValue(), ((Number) ((aw7) obj7).getValue()).intValue(), kj6Var.j().k, kj6Var.j().p, ((kob) ((aw7) obj6).getValue()).b);
                int i2 = b2.c;
                p7a p7aVar = p7a.b;
                cyb cybVar = this.b;
                cybVar.a.setValue(p7aVar);
                Boolean bool = Boolean.TRUE;
                ((aw7) obj5).setValue(bool);
                ((aw7) obj4).setValue(new y78(j));
                pwb pwbVar2 = pwb.d;
                if (!b2.equals(pwbVar2)) {
                    if (c16.i((pwb) aw7Var.getValue(), pwbVar2)) {
                        if (Math.abs(i2 - cybVar.c().c) > Math.abs(i2 - cybVar.b().c)) {
                            b = cybVar.c();
                        } else {
                            b = cybVar.b();
                        }
                        aw7Var.setValue(b);
                    }
                    if (i2 > ((pwb) aw7Var.getValue()).c) {
                        aw7Var2.setValue(Boolean.FALSE);
                        b2 = (pwb) aw7Var.getValue();
                        pwbVar = b2;
                    } else {
                        aw7Var2.setValue(bool);
                        pwbVar = (pwb) aw7Var.getValue();
                    }
                    b2.getClass();
                    cybVar.b.setValue(b2);
                    pwbVar.getClass();
                    cybVar.c.setValue(pwbVar);
                }
                return pvcVar;
        }
    }

    public /* synthetic */ p52(kob kobVar, su0 su0Var, e6c e6cVar, cyb cybVar, j2c j2cVar, sxb sxbVar, ymb ymbVar, vt4 vt4Var, xt4 xt4Var, xt4 xt4Var2) {
        this.c = kobVar;
        this.d = su0Var;
        this.e = e6cVar;
        this.b = cybVar;
        this.f = j2cVar;
        this.C = sxbVar;
        this.D = ymbVar;
        this.E = vt4Var;
        this.F = xt4Var;
        this.G = xt4Var2;
    }
}
