package defpackage;

import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: nf1  reason: default package */
/* loaded from: classes3.dex */
public final class nf1 extends n42 {
    public long a;
    public List b;
    public int c;
    public /* synthetic */ Object d;
    public final /* synthetic */ yf1 e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nf1(yf1 yf1Var, n42 n42Var) {
        super(n42Var);
        this.e = yf1Var;
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.g(0L, this);
    }
}
