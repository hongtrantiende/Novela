package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: g72  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class g72 implements lu4 {
    public final /* synthetic */ int a = 2;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;

    public /* synthetic */ g72(gpa gpaVar, boolean z) {
        this.c = gpaVar;
        this.b = z;
    }

    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        boolean z = this.b;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                ch0.i((gtb) obj3, z, (rv4) obj, xoe.p(1));
                return pvcVar;
            case 1:
                ((Integer) obj2).getClass();
                que.c(z, (cz7) obj3, (rv4) obj, xoe.p(1));
                return pvcVar;
            default:
                ak3 ak3Var = (ak3) obj;
                kpa kpaVar = kpa.a;
                long a = ((gpa) obj3).a(z, true);
                float f = kpa.b;
                ak3.D0(ak3Var, a, ak3Var.L0(f) / 2.0f, ((y78) obj2).a, nae.e, null, 120);
                return pvcVar;
        }
    }

    public /* synthetic */ g72(gtb gtbVar, boolean z, int i) {
        this.c = gtbVar;
        this.b = z;
    }

    public /* synthetic */ g72(boolean z, cz7 cz7Var, int i) {
        this.b = z;
        this.c = cz7Var;
    }
}
