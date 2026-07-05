package defpackage;

import java.util.LinkedHashMap;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: h44  reason: default package */
/* loaded from: classes3.dex */
public final class h44 extends aab implements lu4 {
    public final /* synthetic */ int a;
    public int b;
    public final /* synthetic */ i44 c;
    public final /* synthetic */ String d;
    public final /* synthetic */ String e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h44(i44 i44Var, String str, String str2, m42 m42Var, int i) {
        super(2, m42Var);
        this.a = i;
        this.c = i44Var;
        this.d = str;
        this.e = str2;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        switch (this.a) {
            case 0:
                return new h44(this.c, this.d, this.e, m42Var, 0);
            default:
                return new h44(this.c, this.d, this.e, m42Var, 1);
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
                return ((h44) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            default:
                return ((h44) create(m82Var, m42Var)).invokeSuspend(pvcVar);
        }
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        int i = this.a;
        String str = this.e;
        String str2 = this.d;
        i44 i44Var = this.c;
        n82 n82Var = n82.a;
        pvc pvcVar = pvc.a;
        switch (i) {
            case 0:
                int i2 = this.b;
                if (i2 != 0) {
                    if (i2 == 1) {
                        hre.r(obj);
                    } else {
                        vs.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    hre.r(obj);
                    n64 n64Var = i44Var.d;
                    String str3 = i44Var.c;
                    this.b = 1;
                    ((c74) n64Var).a.J.s0(new vn2(eub.o(str3, "-", str2), str3, str2, str));
                    if (pvcVar == n82Var) {
                        return n82Var;
                    }
                }
                return pvcVar;
            default:
                int i3 = this.b;
                if (i3 != 0) {
                    if (i3 == 1) {
                        hre.r(obj);
                    } else {
                        vs.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    hre.r(obj);
                    n64 n64Var2 = i44Var.d;
                    String str4 = i44Var.c;
                    this.b = 1;
                    gk2 gk2Var = ((c74) n64Var2).a.I;
                    un2 un2Var = (un2) gk2Var.k0(str4).e();
                    if (un2Var != null) {
                        LinkedHashMap z = o17.z(un2Var.s);
                        z.put(str2, str);
                        gk2Var.getClass();
                        ((mm) gk2Var.a).q(-2075492989, "UPDATE DbExtension\nSET settingData = ?\nWHERE id = ?", new r7(21, gk2Var, z, str4));
                        gk2Var.C(-2075492989, new ao2(6));
                    }
                    if (pvcVar == n82Var) {
                        return n82Var;
                    }
                }
                return pvcVar;
        }
    }
}
