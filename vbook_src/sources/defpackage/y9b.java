package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: y9b  reason: default package */
/* loaded from: classes3.dex */
public final class y9b implements m42, o82 {
    public int a = Integer.MIN_VALUE;
    public final /* synthetic */ z9b b;

    public y9b(z9b z9bVar) {
        this.b = z9bVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [m42[]] */
    /* JADX WARN: Type inference failed for: r2v2 */
    @Override // defpackage.o82
    public final o82 getCallerFrame() {
        qxa qxaVar = qxa.a;
        int i = this.a;
        z9b z9bVar = this.b;
        if (i == Integer.MIN_VALUE) {
            this.a = z9bVar.f;
        }
        int i2 = this.a;
        if (i2 < 0) {
            this.a = Integer.MIN_VALUE;
            qxaVar = null;
        } else {
            try {
                ?? r2 = z9bVar.e[i2];
                if (r2 != 0) {
                    this.a = i2 - 1;
                    qxaVar = r2;
                }
            } catch (Throwable unused) {
            }
        }
        if (!(qxaVar instanceof o82)) {
            return null;
        }
        return qxaVar;
    }

    @Override // defpackage.m42
    public final d82 getContext() {
        z9b z9bVar = this.b;
        for (int i = z9bVar.f; -1 < i; i--) {
            m42 m42Var = z9bVar.e[i];
            if (m42Var != this && m42Var != null) {
                return m42Var.getContext();
            }
        }
        vs.k("Not started");
        return null;
    }

    @Override // defpackage.m42
    public final void resumeWith(Object obj) {
        Throwable a = hs9.a(obj);
        z9b z9bVar = this.b;
        if (a != null) {
            z9bVar.f(new gs9(a));
        } else {
            z9bVar.e(false);
        }
    }
}
