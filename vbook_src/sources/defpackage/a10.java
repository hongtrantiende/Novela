package defpackage;

import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: a10  reason: default package */
/* loaded from: classes.dex */
public final class a10 extends n42 {
    public int C;
    public List a;
    public rf b;
    public int c;
    public int d;
    public /* synthetic */ Object e;
    public final /* synthetic */ b10 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a10(b10 b10Var, n42 n42Var) {
        super(n42Var);
        this.f = b10Var;
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.C |= Integer.MIN_VALUE;
        return this.f.a(this);
    }
}
