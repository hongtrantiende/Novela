package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: r5c  reason: default package */
/* loaded from: classes3.dex */
public final class r5c extends n42 {
    public int C;
    public boolean a;
    public String b;
    public String c;
    public String d;
    public /* synthetic */ Object e;
    public final /* synthetic */ y5c f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r5c(y5c y5cVar, n42 n42Var) {
        super(n42Var);
        this.f = y5cVar;
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.C |= Integer.MIN_VALUE;
        return this.f.Q0(false, this);
    }
}
