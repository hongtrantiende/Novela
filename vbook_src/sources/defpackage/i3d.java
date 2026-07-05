package defpackage;

import java.util.ArrayList;
import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: i3d  reason: default package */
/* loaded from: classes3.dex */
public final class i3d extends aab implements lu4 {
    public final /* synthetic */ qw7 C;
    public final /* synthetic */ xl9 D;
    public final /* synthetic */ xt4 E;
    public final /* synthetic */ int F;
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ List c;
    public final /* synthetic */ q8a d;
    public final /* synthetic */ s3d e;
    public final /* synthetic */ boolean f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i3d(List list, q8a q8aVar, s3d s3dVar, boolean z, qw7 qw7Var, xl9 xl9Var, xt4 xt4Var, int i, m42 m42Var) {
        super(2, m42Var);
        this.c = list;
        this.d = q8aVar;
        this.e = s3dVar;
        this.f = z;
        this.C = qw7Var;
        this.D = xl9Var;
        this.E = xt4Var;
        this.F = i;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        i3d i3dVar = new i3d(this.c, this.d, this.e, this.f, this.C, this.D, this.E, this.F, m42Var);
        i3dVar.b = obj;
        return i3dVar;
    }

    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        return ((i3d) create((m82) obj, (m42) obj2)).invokeSuspend(pvc.a);
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        m82 m82Var = (m82) this.b;
        int i = this.a;
        if (i != 0) {
            if (i == 1) {
                hre.r(obj);
                return obj;
            }
            vs.k("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        hre.r(obj);
        List<yk8> list = this.c;
        ArrayList arrayList = new ArrayList(tl1.s(list, 10));
        for (yk8 yk8Var : list) {
            gn8 gn8Var = (gn8) yk8Var.b;
            arrayList.add(z87.s(m82Var, null, new h3d(this.d, gn8Var, this.e, (String) yk8Var.a, this.f, this.C, this.D, this.E, this.F, null), 3));
        }
        this.b = null;
        this.a = 1;
        Object n = nxe.n(arrayList, this);
        n82 n82Var = n82.a;
        if (n == n82Var) {
            return n82Var;
        }
        return n;
    }
}
