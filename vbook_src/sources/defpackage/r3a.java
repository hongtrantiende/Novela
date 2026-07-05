package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: r3a  reason: default package */
/* loaded from: classes.dex */
public final class r3a extends aab implements lu4 {
    public final /* synthetic */ yl9 C;
    public final /* synthetic */ long D;
    public t3a a;
    public yl9 b;
    public long c;
    public int d;
    public /* synthetic */ Object e;
    public final /* synthetic */ t3a f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r3a(t3a t3aVar, yl9 yl9Var, long j, m42 m42Var) {
        super(2, m42Var);
        this.f = t3aVar;
        this.C = yl9Var;
        this.D = j;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        r3a r3aVar = new r3a(this.f, this.C, this.D, m42Var);
        r3aVar.e = obj;
        return r3aVar;
    }

    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        return ((r3a) create((s3a) obj, (m42) obj2)).invokeSuspend(pvc.a);
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        t3a t3aVar;
        float c;
        yl9 yl9Var;
        t3a t3aVar2;
        long j;
        long a;
        int i = this.d;
        ff8 ff8Var = ff8.b;
        if (i != 0) {
            if (i == 1) {
                j = this.c;
                yl9Var = this.b;
                t3aVar = this.a;
                t3aVar2 = (t3a) this.e;
                hre.r(obj);
            } else {
                vs.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        } else {
            hre.r(obj);
            t3aVar = this.f;
            ae aeVar = new ae(1, t3aVar, (s3a) this.e);
            li4 li4Var = t3aVar.c;
            yl9 yl9Var2 = this.C;
            long j2 = yl9Var2.a;
            ff8 ff8Var2 = t3aVar.d;
            long j3 = this.D;
            if (ff8Var2 == ff8Var) {
                c = z4d.b(j3);
            } else {
                c = z4d.c(j3);
            }
            float e = t3aVar.e(c);
            this.e = t3aVar;
            this.a = t3aVar;
            this.b = yl9Var2;
            this.c = j2;
            this.d = 1;
            obj = li4Var.a(aeVar, e, this);
            n82 n82Var = n82.a;
            if (obj == n82Var) {
                return n82Var;
            }
            yl9Var = yl9Var2;
            t3aVar2 = t3aVar;
            j = j2;
        }
        float e2 = t3aVar2.e(((Number) obj).floatValue());
        if (t3aVar.d == ff8Var) {
            a = z4d.a(j, e2, nae.e, 2);
        } else {
            a = z4d.a(j, nae.e, e2, 1);
        }
        yl9Var.a = a;
        return pvc.a;
    }
}
