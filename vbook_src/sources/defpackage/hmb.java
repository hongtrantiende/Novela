package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: hmb  reason: default package */
/* loaded from: classes3.dex */
public final class hmb extends aab implements lu4 {
    public final /* synthetic */ Object C;
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hmb(ppb ppbVar, uo3 uo3Var, ym0 ym0Var, wm0 wm0Var, boolean z, zm4 zm4Var, m42 m42Var) {
        super(2, m42Var);
        this.c = ppbVar;
        this.d = uo3Var;
        this.e = ym0Var;
        this.f = wm0Var;
        this.b = z;
        this.C = zm4Var;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        int i = this.a;
        Object obj2 = this.C;
        Object obj3 = this.f;
        Object obj4 = this.e;
        Object obj5 = this.d;
        Object obj6 = this.c;
        switch (i) {
            case 0:
                return new hmb((ppb) obj6, (uo3) obj5, (ym0) obj4, (wm0) obj3, this.b, (zm4) obj2, m42Var);
            default:
                return new hmb(this.b, (hoa) obj6, (xl0) obj5, (dub) obj4, (aw7) obj3, (aw7) obj2, m42Var);
        }
    }

    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        m82 m82Var = (m82) obj;
        m42 m42Var = (m42) obj2;
        switch (i) {
            case 0:
                ((hmb) create(m82Var, m42Var)).invokeSuspend(pvcVar);
                return pvcVar;
            default:
                ((hmb) create(m82Var, m42Var)).invokeSuspend(pvcVar);
                return pvcVar;
        }
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        sc6 sc6Var;
        rk9 c;
        String str;
        int i = this.a;
        Object obj2 = this.e;
        Object obj3 = this.C;
        Object obj4 = this.f;
        boolean z = this.b;
        pvc pvcVar = pvc.a;
        Object obj5 = this.c;
        Object obj6 = this.d;
        switch (i) {
            case 0:
                hre.r(obj);
                ppb ppbVar = (ppb) obj5;
                no3 g = gwe.g((uo3) obj6, (ym0) obj2, (wm0) obj4);
                ppbVar.getClass();
                ppbVar.a.a();
                ppbVar.b = g;
                if (z) {
                    zm4.a((zm4) obj3);
                }
                return pvcVar;
            default:
                xl0 xl0Var = (xl0) obj6;
                hoa hoaVar = (hoa) obj5;
                hre.r(obj);
                boolean z2 = false;
                if (!z) {
                    String str2 = xl0Var.a;
                    hoaVar.getClass();
                    str2.getClass();
                    pm0 pm0Var = (pm0) hoaVar.a.getValue();
                    if (pm0Var != null) {
                        str = pm0Var.a;
                    } else {
                        str = null;
                    }
                    if (str != null) {
                        z2 = str.equals(str2);
                    }
                    if (z2) {
                        hoaVar.a(null);
                        hoaVar.b.setValue(null);
                    }
                } else {
                    fvb fvbVar = (fvb) ((aw7) obj4).getValue();
                    if (fvbVar != null && (sc6Var = (sc6) ((aw7) obj3).getValue()) != null && sc6Var.t()) {
                        long j = ((dub) obj2).d().e;
                        int i2 = fxb.c;
                        float f = fvbVar.c(dce.n((int) (j >> 32), 0, fvbVar.a.a.b.length())).a;
                        long m = sc6Var.m((Float.floatToRawIntBits(c.b) & 4294967295L) | (Float.floatToRawIntBits(f) << 32));
                        long m2 = sc6Var.m((Float.floatToRawIntBits(c.c) << 32) | (Float.floatToRawIntBits(c.d) & 4294967295L));
                        String str3 = xl0Var.a;
                        rk9 rk9Var = new rk9(Float.intBitsToFloat((int) (m >> 32)), Float.intBitsToFloat((int) (m & 4294967295L)), Float.intBitsToFloat((int) (m2 >> 32)), Float.intBitsToFloat((int) (m2 & 4294967295L)));
                        hoaVar.getClass();
                        str3.getClass();
                        hoaVar.a(str3);
                        hoaVar.b.setValue(rk9Var);
                    }
                }
                return pvcVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hmb(boolean z, hoa hoaVar, xl0 xl0Var, dub dubVar, aw7 aw7Var, aw7 aw7Var2, m42 m42Var) {
        super(2, m42Var);
        this.b = z;
        this.c = hoaVar;
        this.d = xl0Var;
        this.e = dubVar;
        this.f = aw7Var;
        this.C = aw7Var2;
    }
}
