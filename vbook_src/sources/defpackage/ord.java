package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ord  reason: default package */
/* loaded from: classes.dex */
public final class ord extends n42 {
    public yrd a;
    public Integer b;
    public String c;
    public /* synthetic */ Object d;
    public final /* synthetic */ yrd e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ord(yrd yrdVar, n42 n42Var) {
        super(n42Var);
        this.e = yrdVar;
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return yrd.a(this.e, null, null, null, this);
    }
}
