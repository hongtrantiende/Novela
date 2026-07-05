package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: wlc  reason: default package */
/* loaded from: classes3.dex */
public final class wlc extends aab implements lu4 {
    public final /* synthetic */ int a;
    public int b;
    public final /* synthetic */ zlc c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wlc(zlc zlcVar, m42 m42Var, int i) {
        super(2, m42Var);
        this.a = i;
        this.c = zlcVar;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        int i = this.a;
        zlc zlcVar = this.c;
        switch (i) {
            case 0:
                return new wlc(zlcVar, m42Var, 0);
            default:
                return new wlc(zlcVar, m42Var, 1);
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
                return ((wlc) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            default:
                return ((wlc) create(m82Var, m42Var)).invokeSuspend(pvcVar);
        }
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        n82 n82Var = n82.a;
        zlc zlcVar = this.c;
        switch (i) {
            case 0:
                int i2 = this.b;
                if (i2 != 0) {
                    if (i2 == 1) {
                        hre.r(obj);
                        return pvcVar;
                    }
                    vs.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hre.r(obj);
                mx c = ((plc) zlcVar.c).c();
                vlc vlcVar = new vlc(zlcVar, 0);
                this.b = 1;
                if (c.a(vlcVar, this) == n82Var) {
                    return n82Var;
                }
                return pvcVar;
            default:
                int i3 = this.b;
                if (i3 != 0) {
                    if (i3 == 1) {
                        hre.r(obj);
                        return pvcVar;
                    }
                    vs.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hre.r(obj);
                mx d = ((plc) zlcVar.c).d();
                vlc vlcVar2 = new vlc(zlcVar, 1);
                this.b = 1;
                if (d.a(vlcVar2, this) == n82Var) {
                    return n82Var;
                }
                return pvcVar;
        }
    }
}
