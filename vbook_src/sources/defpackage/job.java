package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: job  reason: default package */
/* loaded from: classes3.dex */
public final class job extends aab implements nu4 {
    public int a;
    public /* synthetic */ String b;
    public /* synthetic */ String c;
    public /* synthetic */ String d;
    public final /* synthetic */ y5c e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public job(y5c y5cVar, m42 m42Var) {
        super(4, m42Var);
        this.e = y5cVar;
    }

    @Override // defpackage.nu4
    public final Object h(Object obj, Object obj2, Object obj3, Object obj4) {
        job jobVar = new job(this.e, (m42) obj4);
        jobVar.b = (String) obj;
        jobVar.c = (String) obj2;
        jobVar.d = (String) obj3;
        return jobVar.invokeSuspend(pvc.a);
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        String str = this.b;
        String str2 = this.c;
        String str3 = this.d;
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
        this.b = null;
        this.c = null;
        this.d = null;
        this.a = 1;
        Object T0 = this.e.T0(str, str2, str3, this);
        n82 n82Var = n82.a;
        if (T0 == n82Var) {
            return n82Var;
        }
        return T0;
    }
}
