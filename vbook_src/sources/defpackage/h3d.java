package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: h3d  reason: default package */
/* loaded from: classes3.dex */
public final class h3d extends aab implements lu4 {
    public xt4 C;
    public boolean D;
    public int E;
    public int F;
    public final /* synthetic */ q8a G;
    public final /* synthetic */ gn8 H;
    public final /* synthetic */ s3d I;
    public final /* synthetic */ String J;
    public final /* synthetic */ boolean K;
    public final /* synthetic */ qw7 L;
    public final /* synthetic */ xl9 M;
    public final /* synthetic */ xt4 N;
    public final /* synthetic */ int O;
    public q8a a;
    public gn8 b;
    public s3d c;
    public String d;
    public qw7 e;
    public xl9 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h3d(q8a q8aVar, gn8 gn8Var, s3d s3dVar, String str, boolean z, qw7 qw7Var, xl9 xl9Var, xt4 xt4Var, int i, m42 m42Var) {
        super(2, m42Var);
        this.G = q8aVar;
        this.H = gn8Var;
        this.I = s3dVar;
        this.J = str;
        this.K = z;
        this.L = qw7Var;
        this.M = xl9Var;
        this.N = xt4Var;
        this.O = i;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        return new h3d(this.G, this.H, this.I, this.J, this.K, this.L, this.M, this.N, this.O, m42Var);
    }

    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        return ((h3d) create((m82) obj, (m42) obj2)).invokeSuspend(pvc.a);
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        q8a q8aVar;
        gn8 gn8Var;
        s3d s3dVar;
        qw7 qw7Var;
        xl9 xl9Var;
        xt4 xt4Var;
        String str;
        boolean z;
        int i;
        Throwable th;
        q8a q8aVar2;
        int i2 = this.F;
        n82 n82Var = n82.a;
        try {
            if (i2 != 0) {
                if (i2 != 1) {
                    if (i2 == 2) {
                        q8aVar2 = this.a;
                        try {
                            hre.r(obj);
                            q8aVar2.c();
                            return pvc.a;
                        } catch (Throwable th2) {
                            th = th2;
                            q8aVar2.c();
                            throw th;
                        }
                    }
                    vs.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                i = this.E;
                boolean z2 = this.D;
                xt4Var = this.C;
                xl9Var = this.f;
                qw7Var = this.e;
                String str2 = this.d;
                s3dVar = this.c;
                gn8Var = this.b;
                q8a q8aVar3 = this.a;
                hre.r(obj);
                z = z2;
                str = str2;
                q8aVar = q8aVar3;
            } else {
                hre.r(obj);
                q8aVar = this.G;
                this.a = q8aVar;
                gn8Var = this.H;
                this.b = gn8Var;
                s3dVar = this.I;
                this.c = s3dVar;
                String str3 = this.J;
                this.d = str3;
                qw7Var = this.L;
                this.e = qw7Var;
                xl9Var = this.M;
                this.f = xl9Var;
                xt4Var = this.N;
                this.C = xt4Var;
                boolean z3 = this.K;
                this.D = z3;
                int i3 = this.O;
                this.E = i3;
                this.F = 1;
                if (q8aVar.a(this) != n82Var) {
                    str = str3;
                    z = z3;
                    i = i3;
                }
                return n82Var;
            }
            abf abfVar = qe4.a;
            abfVar.getClass();
            gn8Var.getClass();
            if (!gn8Var.a.exists()) {
                abf.l(abfVar, gn8Var);
            }
            xt4 xt4Var2 = xt4Var;
            s3d s3dVar2 = s3dVar;
            g3d g3dVar = new g3d(qw7Var, xl9Var, xt4Var2, i);
            this.a = q8aVar;
            this.b = null;
            this.c = null;
            this.d = null;
            this.e = null;
            this.f = null;
            this.C = null;
            this.F = 2;
            if (s3d.a(s3dVar2, str, gn8Var, z, g3dVar, this) != n82Var) {
                q8aVar2 = q8aVar;
                q8aVar2.c();
                return pvc.a;
            }
            return n82Var;
        } catch (Throwable th3) {
            q8a q8aVar4 = q8aVar;
            th = th3;
            q8aVar2 = q8aVar4;
            q8aVar2.c();
            throw th;
        }
    }
}
