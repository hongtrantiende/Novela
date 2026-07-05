package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: nhc  reason: default package */
/* loaded from: classes3.dex */
public final class nhc extends aab implements mu4 {
    public final /* synthetic */ aw7 C;
    public final /* synthetic */ aw7 D;
    public final /* synthetic */ aw7 E;
    public /* synthetic */ wgc a;
    public final /* synthetic */ cz7 b;
    public final /* synthetic */ rz4 c;
    public final /* synthetic */ h81 d;
    public final /* synthetic */ z86 e;
    public final /* synthetic */ aw7 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nhc(cz7 cz7Var, rz4 rz4Var, h81 h81Var, z86 z86Var, aw7 aw7Var, aw7 aw7Var2, aw7 aw7Var3, aw7 aw7Var4, m42 m42Var) {
        super(3, m42Var);
        this.b = cz7Var;
        this.c = rz4Var;
        this.d = h81Var;
        this.e = z86Var;
        this.f = aw7Var;
        this.C = aw7Var2;
        this.D = aw7Var3;
        this.E = aw7Var4;
    }

    @Override // defpackage.mu4
    public final Object c(Object obj, Object obj2, Object obj3) {
        m82 m82Var = (m82) obj;
        aw7 aw7Var = this.D;
        aw7 aw7Var2 = this.E;
        nhc nhcVar = new nhc(this.b, this.c, this.d, this.e, this.f, this.C, aw7Var, aw7Var2, (m42) obj3);
        nhcVar.a = (wgc) obj2;
        pvc pvcVar = pvc.a;
        nhcVar.invokeSuspend(pvcVar);
        return pvcVar;
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        wgc wgcVar = this.a;
        hre.r(obj);
        boolean z = wgcVar instanceof ugc;
        cz7 cz7Var = this.b;
        if (z) {
            lpe.t(cz7Var, ((ugc) wgcVar).a, null);
        } else if (wgcVar instanceof vgc) {
            String str = ((vgc) wgcVar).a;
            rz4 rz4Var = this.c;
            rz4Var.getClass();
            str.getClass();
            rz4Var.b.setValue(str);
            rz4Var.a(true);
        } else if (wgcVar instanceof sgc) {
            this.d.a();
            this.f.setValue(ks3.a);
            this.C.setValue(null);
            Boolean bool = Boolean.FALSE;
            this.D.setValue(bool);
            this.E.setValue(bool);
            this.e.b();
        } else if (wgcVar instanceof tgc) {
            cz7Var.c();
        } else {
            xk5.o();
            return null;
        }
        return pvc.a;
    }
}
