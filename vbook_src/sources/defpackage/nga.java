package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: nga  reason: default package */
/* loaded from: classes3.dex */
public final class nga implements kb3 {
    public final pga a;
    public final long b;
    public final Object c;
    public final f61 d;

    public nga(pga pgaVar, long j, Object obj, f61 f61Var) {
        this.a = pgaVar;
        this.b = j;
        this.c = obj;
        this.d = f61Var;
    }

    @Override // defpackage.kb3
    public final void a() {
        pga pgaVar = this.a;
        synchronized (pgaVar) {
            if (this.b >= pgaVar.r()) {
                Object[] objArr = pgaVar.D;
                objArr.getClass();
                long j = this.b;
                if (objArr[((int) j) & (objArr.length - 1)] == this) {
                    qga.b(objArr, j, qga.a);
                    pgaVar.m();
                }
            }
        }
    }
}
