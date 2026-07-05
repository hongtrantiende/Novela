package defpackage;

import com.reader.data.server.AndroidTestServerService;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: um  reason: default package */
/* loaded from: classes3.dex */
public final class um extends aab implements lu4 {
    public final /* synthetic */ int a;
    public int b;
    public final /* synthetic */ AndroidTestServerService c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ um(AndroidTestServerService androidTestServerService, m42 m42Var, int i) {
        super(2, m42Var);
        this.a = i;
        this.c = androidTestServerService;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        int i = this.a;
        AndroidTestServerService androidTestServerService = this.c;
        switch (i) {
            case 0:
                return new um(androidTestServerService, m42Var, 0);
            case 1:
                return new um(androidTestServerService, m42Var, 1);
            default:
                return new um(androidTestServerService, m42Var, 2);
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
                return ((um) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            case 1:
                return ((um) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            default:
                return ((um) create(m82Var, m42Var)).invokeSuspend(pvcVar);
        }
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        n82 n82Var = n82.a;
        AndroidTestServerService androidTestServerService = this.c;
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
                mfb mfbVar = ix3.a;
                ja jaVar = new ja(4, (xv7) ix3.a.getValue(), cm9.a(mlb.class));
                bb bbVar = new bb(androidTestServerService, 2);
                this.b = 1;
                if (jaVar.a(bbVar, this) == n82Var) {
                    return n82Var;
                }
                return pvcVar;
            case 1:
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
                this.b = 1;
                if (((llb) androidTestServerService.a.getValue()).b(this) == n82Var) {
                    return n82Var;
                }
                return pvcVar;
            default:
                int i4 = this.b;
                if (i4 != 0) {
                    if (i4 == 1) {
                        hre.r(obj);
                    } else {
                        vs.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    hre.r(obj);
                    this.b = 1;
                    if (((llb) androidTestServerService.a.getValue()).b(this) == n82Var) {
                        return n82Var;
                    }
                }
                cza czaVar = AndroidTestServerService.d;
                cza czaVar2 = AndroidTestServerService.d;
                czaVar2.getClass();
                czaVar2.n(null, kaa.a);
                androidTestServerService.stopSelf();
                return pvcVar;
        }
    }
}
