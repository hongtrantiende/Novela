package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: god  reason: default package */
/* loaded from: classes3.dex */
public final class god extends n42 {
    public int C;
    public Object a;
    public Object b;
    public sw7 c;
    public int d;
    public /* synthetic */ Object e;
    public final /* synthetic */ hod f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public god(hod hodVar, n42 n42Var) {
        super(n42Var);
        this.f = hodVar;
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.C |= Integer.MIN_VALUE;
        return this.f.b(null, null, this);
    }
}
