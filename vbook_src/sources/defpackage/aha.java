package defpackage;

import android.util.Log;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: aha  reason: default package */
/* loaded from: classes.dex */
public final class aha extends aab implements lu4 {
    public final /* synthetic */ int a;
    public int b;
    public final /* synthetic */ eha c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ aha(eha ehaVar, m42 m42Var, int i) {
        super(2, m42Var);
        this.a = i;
        this.c = ehaVar;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        int i = this.a;
        eha ehaVar = this.c;
        switch (i) {
            case 0:
                return new aha(ehaVar, m42Var, 0);
            default:
                return new aha(ehaVar, m42Var, 1);
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
                return ((aha) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            default:
                return ((aha) create(m82Var, m42Var)).invokeSuspend(pvcVar);
        }
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        Object obj2 = n82.a;
        eha ehaVar = this.c;
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
                ja jaVar = new ja(8, ehaVar.e.getData(), new wa(ehaVar, (m42) null, 17));
                r58 r58Var = new r58(ehaVar, 3);
                this.b = 1;
                if (jaVar.a(r58Var, this) == obj2) {
                    return obj2;
                }
                return pvcVar;
            default:
                int i3 = this.b;
                try {
                    if (i3 != 0) {
                        if (i3 == 1) {
                            hre.r(obj);
                        } else {
                            vs.k("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                    } else {
                        hre.r(obj);
                        ng2 ng2Var = ehaVar.e;
                        cha chaVar = new cha(ehaVar, null, 0);
                        this.b = 1;
                        if (ng2Var.a(chaVar, this) == obj2) {
                            pvcVar = obj2;
                        }
                    }
                    return pvcVar;
                } catch (Exception e) {
                    Log.d("FirebaseSessions", "App backgrounded, failed to update data. Message: " + e.getMessage());
                    vaa vaaVar = ehaVar.h;
                    if (vaaVar != null) {
                        ehaVar.d.getClass();
                        ehaVar.h = vaa.a(vaaVar, null, t9c.a(), null, 5);
                        return pvcVar;
                    }
                    c16.w("localSessionData");
                    throw null;
                }
        }
    }
}
