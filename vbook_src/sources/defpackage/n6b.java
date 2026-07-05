package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: n6b  reason: default package */
/* loaded from: classes.dex */
public final class n6b extends fb6 implements lu4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ o6b b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n6b(o6b o6bVar, int i) {
        super(2);
        this.a = i;
        this.b = o6bVar;
    }

    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        o6b o6bVar = this.b;
        switch (i) {
            case 0:
                od6 od6Var = (od6) obj;
                o6bVar.a().b = (px1) obj2;
                return pvcVar;
            case 1:
                be6 a = o6bVar.a();
                ((od6) obj).h0(new yd6(a, (lu4) obj2, a.L));
                return pvcVar;
            default:
                od6 od6Var2 = (od6) obj;
                o6b o6bVar2 = (o6b) obj2;
                r6b r6bVar = o6bVar.a;
                be6 be6Var = od6Var2.e0;
                if (be6Var == null) {
                    be6Var = new be6(od6Var2, r6bVar);
                    od6Var2.e0 = be6Var;
                }
                o6bVar.b = be6Var;
                o6bVar.a().i();
                be6 a2 = o6bVar.a();
                if (a2.c != r6bVar) {
                    a2.c = r6bVar;
                    a2.j(false);
                    od6.a0(a2.a, false, 7);
                }
                return pvcVar;
        }
    }
}
