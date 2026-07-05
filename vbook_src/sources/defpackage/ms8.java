package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ms8  reason: default package */
/* loaded from: classes3.dex */
public final class ms8 extends aab implements lu4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ss8 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ms8(int i, m42 m42Var, ss8 ss8Var) {
        super(2, m42Var);
        this.a = i;
        this.b = ss8Var;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        int i = this.a;
        ss8 ss8Var = this.b;
        switch (i) {
            case 0:
                return new ms8(0, m42Var, ss8Var);
            default:
                return new ms8(1, m42Var, ss8Var);
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
                ((ms8) create(m82Var, m42Var)).invokeSuspend(pvcVar);
                return pvcVar;
            default:
                ((ms8) create(m82Var, m42Var)).invokeSuspend(pvcVar);
                return pvcVar;
        }
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        ss8 ss8Var = this.b;
        switch (i) {
            case 0:
                hre.r(obj);
                cza czaVar = ss8Var.Q;
                if (czaVar == null) {
                    return pvcVar;
                }
                while (true) {
                    Object value = czaVar.getValue();
                    bm5 bm5Var = ss8Var.D;
                    pi9 pi9Var = ss8Var.E;
                    int e = ((cm5) bm5Var).e();
                    cm5 cm5Var = (cm5) bm5Var;
                    int d = cm5Var.d();
                    so5 so5Var = cm5Var.b;
                    vi4 vi4Var = so5Var.c;
                    r76[] r76VarArr = so5.l;
                    float floatValue = ((Number) vi4Var.c(r76VarArr[2], so5Var)).floatValue();
                    int b = cm5Var.b();
                    int c = cm5Var.c();
                    so5 so5Var2 = cm5Var.b;
                    boolean booleanValue = ((Boolean) so5Var2.f.c(r76VarArr[5], so5Var2)).booleanValue();
                    boolean d2 = cm5Var.a.d();
                    float a = cm5Var.a.a();
                    qi9 qi9Var = (qi9) pi9Var;
                    int c2 = qi9Var.c();
                    int d3 = qi9Var.d();
                    boolean h = qi9Var.h();
                    boolean i2 = qi9Var.i();
                    boolean f = qi9Var.f();
                    boolean e2 = qi9Var.e();
                    ss8 ss8Var2 = ss8Var;
                    so5 so5Var3 = cm5Var.b;
                    pvc pvcVar2 = pvcVar;
                    boolean booleanValue2 = ((Boolean) so5Var3.g.c(r76VarArr[6], so5Var3)).booleanValue();
                    so5 so5Var4 = cm5Var.b;
                    boolean booleanValue3 = ((Boolean) so5Var4.h.c(r76VarArr[7], so5Var4)).booleanValue();
                    boolean c3 = cm5Var.a.c();
                    so5 so5Var5 = cm5Var.b;
                    boolean booleanValue4 = ((Boolean) so5Var5.i.c(r76VarArr[8], so5Var5)).booleanValue();
                    so5 so5Var6 = cm5Var.b;
                    if (!czaVar.l(value, dm5.a((dm5) value, e, d, floatValue, b, c, booleanValue, booleanValue2, booleanValue3, d2, a, c2, d3, i2, f, h, e2, c3, booleanValue4, ((Boolean) so5Var6.j.c(r76VarArr[9], so5Var6)).booleanValue(), cm5Var.a.e(), cm5Var.a(), 1024))) {
                        ss8Var = ss8Var2;
                        pvcVar = pvcVar2;
                    } else {
                        return pvcVar2;
                    }
                }
            default:
                hre.r(obj);
                wpc wpcVar = ss8Var.F;
                String str = ss8Var.c;
                int i3 = ((xp5) ss8Var.T.getValue()).b;
                if (i3 < 0) {
                    i3 = 0;
                }
                wpcVar.a(i3, 0, str);
                return pvcVar;
        }
    }
}
