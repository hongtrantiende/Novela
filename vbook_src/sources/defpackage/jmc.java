package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: jmc  reason: default package */
/* loaded from: classes3.dex */
public final class jmc extends n42 {
    public String a;
    public rmc b;
    public /* synthetic */ Object c;
    public final /* synthetic */ kmc d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jmc(kmc kmcVar, m42 m42Var) {
        super(m42Var);
        this.d = kmcVar;
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.a(null, this);
    }
}
