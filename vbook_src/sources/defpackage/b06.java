package defpackage;

import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: b06  reason: default package */
/* loaded from: classes.dex */
public final class b06 extends n42 {
    public final /* synthetic */ e06 C;
    public int D;
    public t00 a;
    public List b;
    public int c;
    public int d;
    public int e;
    public /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b06(e06 e06Var, n42 n42Var) {
        super(n42Var);
        this.C = e06Var;
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.D |= Integer.MIN_VALUE;
        return this.C.b(null, 0, this);
    }
}
