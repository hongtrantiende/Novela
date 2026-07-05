package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: lw9  reason: default package */
/* loaded from: classes3.dex */
public final class lw9 extends n42 implements tj4 {
    public final tj4 a;
    public final d82 b;
    public final int c;
    public d82 d;
    public m42 e;

    public lw9(tj4 tj4Var, d82 d82Var) {
        super(et1.c, gs3.a);
        this.a = tj4Var;
        this.b = d82Var;
        this.c = ((Number) d82Var.fold(0, new mx8(14))).intValue();
    }

    @Override // defpackage.tj4
    public final Object b(Object obj, m42 m42Var) {
        try {
            Object o = o(m42Var, obj);
            if (o == n82.a) {
                return o;
            }
            return pvc.a;
        } catch (Throwable th) {
            this.d = new qg3(m42Var.getContext(), th);
            throw th;
        }
    }

    @Override // defpackage.hh0, defpackage.o82
    public final o82 getCallerFrame() {
        m42 m42Var = this.e;
        if (m42Var instanceof o82) {
            return (o82) m42Var;
        }
        return null;
    }

    @Override // defpackage.n42, defpackage.m42
    public final d82 getContext() {
        d82 d82Var = this.d;
        if (d82Var == null) {
            return gs3.a;
        }
        return d82Var;
    }

    @Override // defpackage.hh0
    public final StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        Throwable a = hs9.a(obj);
        if (a != null) {
            this.d = new qg3(getContext(), a);
        }
        m42 m42Var = this.e;
        if (m42Var != null) {
            m42Var.resumeWith(obj);
        }
        return n82.a;
    }

    public final Object o(m42 m42Var, Object obj) {
        d82 context = m42Var.getContext();
        k27.q(context);
        d82 d82Var = this.d;
        if (d82Var != context) {
            if (!(d82Var instanceof qg3)) {
                if (((Number) context.fold(0, new el7(this, 10))).intValue() == this.c) {
                    this.d = context;
                } else {
                    throw new IllegalStateException(("Flow invariant is violated:\n\t\tFlow was collected in " + this.b + ",\n\t\tbut emission happened in " + context + ".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead").toString());
                }
            } else {
                throw new IllegalStateException(l4b.y("\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception " + ((qg3) d82Var).b + ", but then emission attempt of value '" + obj + "' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ").toString());
            }
        }
        this.e = m42Var;
        mu4 mu4Var = nw9.a;
        tj4 tj4Var = this.a;
        tj4Var.getClass();
        Object c = mu4Var.c(tj4Var, obj, this);
        if (!c16.i(c, n82.a)) {
            this.e = null;
        }
        return c;
    }
}
