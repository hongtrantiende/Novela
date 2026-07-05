package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: thb  reason: default package */
/* loaded from: classes3.dex */
public final class thb extends aab implements lu4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ vhb b;
    public final /* synthetic */ boolean c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ thb(vhb vhbVar, boolean z, m42 m42Var, int i) {
        super(2, m42Var);
        this.a = i;
        this.b = vhbVar;
        this.c = z;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        int i = this.a;
        boolean z = this.c;
        vhb vhbVar = this.b;
        switch (i) {
            case 0:
                return new thb(vhbVar, z, m42Var, 0);
            case 1:
                return new thb(vhbVar, z, m42Var, 1);
            case 2:
                return new thb(vhbVar, z, m42Var, 2);
            case 3:
                return new thb(vhbVar, z, m42Var, 3);
            default:
                return new thb(vhbVar, z, m42Var, 4);
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
                ((thb) create(m82Var, m42Var)).invokeSuspend(pvcVar);
                return pvcVar;
            case 1:
                ((thb) create(m82Var, m42Var)).invokeSuspend(pvcVar);
                return pvcVar;
            case 2:
                ((thb) create(m82Var, m42Var)).invokeSuspend(pvcVar);
                return pvcVar;
            case 3:
                ((thb) create(m82Var, m42Var)).invokeSuspend(pvcVar);
                return pvcVar;
            default:
                ((thb) create(m82Var, m42Var)).invokeSuspend(pvcVar);
                return pvcVar;
        }
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object value2;
        Object value3;
        Object value4;
        Object value5;
        int i = this.a;
        pvc pvcVar = pvc.a;
        boolean z = this.c;
        vhb vhbVar = this.b;
        switch (i) {
            case 0:
                hre.r(obj);
                ((i2c) vhbVar.c).a.b.e(y1c.o[1], Boolean.valueOf(z));
                cza czaVar = vhbVar.f;
                if (czaVar != null) {
                    do {
                        value = czaVar.getValue();
                    } while (!czaVar.l(value, rhb.a((rhb) value, null, null, false, this.c, false, false, false, nae.e, null, null, 0, 2039)));
                    return pvcVar;
                }
                return pvcVar;
            case 1:
                hre.r(obj);
                ((i2c) vhbVar.c).a.e.e(y1c.o[4], Boolean.valueOf(z));
                if (((kpc) vhbVar.d.a.getValue()).f) {
                    vhbVar.e.getClass();
                    mfb mfbVar = ix3.a;
                    ix3.a(yyb.a);
                }
                cza czaVar2 = vhbVar.f;
                if (czaVar2 != null) {
                    do {
                        value2 = czaVar2.getValue();
                    } while (!czaVar2.l(value2, rhb.a((rhb) value2, null, null, false, false, false, false, this.c, nae.e, null, null, 0, 1983)));
                    return pvcVar;
                }
                return pvcVar;
            case 2:
                hre.r(obj);
                ((i2c) vhbVar.c).a.d.e(y1c.o[3], Boolean.valueOf(z));
                cza czaVar3 = vhbVar.f;
                if (czaVar3 != null) {
                    do {
                        value3 = czaVar3.getValue();
                    } while (!czaVar3.l(value3, rhb.a((rhb) value3, null, null, false, false, this.c, false, false, nae.e, null, null, 0, 2031)));
                    return pvcVar;
                }
                return pvcVar;
            case 3:
                hre.r(obj);
                ((i2c) vhbVar.c).a.c.e(y1c.o[2], Boolean.valueOf(z));
                cza czaVar4 = vhbVar.f;
                if (czaVar4 != null) {
                    do {
                        value4 = czaVar4.getValue();
                    } while (!czaVar4.l(value4, rhb.a((rhb) value4, null, null, false, false, false, this.c, false, nae.e, null, null, 0, 2015)));
                    return pvcVar;
                }
                return pvcVar;
            default:
                hre.r(obj);
                ((i2c) vhbVar.c).a.j.e(y1c.o[9], Boolean.valueOf(z));
                cza czaVar5 = vhbVar.f;
                if (czaVar5 != null) {
                    do {
                        value5 = czaVar5.getValue();
                    } while (!czaVar5.l(value5, rhb.a((rhb) value5, null, null, this.c, false, false, false, false, nae.e, null, null, 0, 2043)));
                    return pvcVar;
                }
                return pvcVar;
        }
    }
}
