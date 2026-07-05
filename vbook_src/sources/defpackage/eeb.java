package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: eeb  reason: default package */
/* loaded from: classes3.dex */
public final class eeb extends n42 {
    public final /* synthetic */ heb C;
    public int D;
    public boolean a;
    public boolean b;
    public boolean c;
    public boolean d;
    public ieb e;
    public /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eeb(heb hebVar, n42 n42Var) {
        super(n42Var);
        this.C = hebVar;
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.D |= Integer.MIN_VALUE;
        return this.C.n(false, false, false, false, null, this);
    }
}
