package defpackage;

import java.io.Serializable;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: hz1  reason: default package */
/* loaded from: classes.dex */
public final class hz1 extends n42 {
    public boolean C;
    public /* synthetic */ Object D;
    public final /* synthetic */ iz1 E;
    public int F;
    public Object a;
    public Serializable b;
    public o19 c;
    public zl9 d;
    public d82 e;
    public zl9 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hz1(iz1 iz1Var, n42 n42Var) {
        super(n42Var);
        this.E = iz1Var;
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        this.D = obj;
        this.F |= Integer.MIN_VALUE;
        return this.E.N(false, null, this);
    }
}
