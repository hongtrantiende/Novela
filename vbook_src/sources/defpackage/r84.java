package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: r84  reason: default package */
/* loaded from: classes3.dex */
public final class r84 extends aab implements ou4 {
    public final /* synthetic */ int a;
    public /* synthetic */ Object b;
    public /* synthetic */ Object c;
    public /* synthetic */ Object d;
    public /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r84(int i, int i2, m42 m42Var) {
        super(i, m42Var);
        this.a = i2;
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        switch (this.a) {
            case 0:
                Object obj2 = this.b;
                Object obj3 = this.c;
                Object obj4 = this.d;
                Object obj5 = this.e;
                hre.r(obj);
                return new Object[]{obj2, obj3, obj4, obj5};
            case 1:
                Object obj6 = this.b;
                Object obj7 = this.c;
                Object obj8 = this.d;
                Object obj9 = this.e;
                hre.r(obj);
                return new Object[]{obj6, obj7, obj8, obj9};
            default:
                d6c d6cVar = (d6c) this.b;
                g6c g6cVar = (g6c) this.c;
                f6c f6cVar = (f6c) this.d;
                z5c z5cVar = (z5c) this.e;
                hre.r(obj);
                return new x6c(d6cVar.a, d6cVar.b, g6cVar.a, g6cVar.b, g6cVar.c, g6cVar.d, g6cVar.e, f6cVar.a, f6cVar.b, f6cVar.c, f6cVar.d, f6cVar.e, z5cVar.a, z5cVar.b, z5cVar.c, 512);
        }
    }

    @Override // defpackage.ou4
    public final Object l(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        switch (i) {
            case 0:
                r84 r84Var = new r84(5, 0, (m42) obj5);
                r84Var.b = obj;
                r84Var.c = obj2;
                r84Var.d = obj3;
                r84Var.e = obj4;
                return r84Var.invokeSuspend(pvcVar);
            case 1:
                r84 r84Var2 = new r84(5, 1, (m42) obj5);
                r84Var2.b = obj;
                r84Var2.c = obj2;
                r84Var2.d = obj3;
                r84Var2.e = obj4;
                return r84Var2.invokeSuspend(pvcVar);
            default:
                r84 r84Var3 = new r84(5, 2, (m42) obj5);
                r84Var3.b = (d6c) obj;
                r84Var3.c = (g6c) obj2;
                r84Var3.d = (f6c) obj3;
                r84Var3.e = (z5c) obj4;
                return r84Var3.invokeSuspend(pvcVar);
        }
    }
}
