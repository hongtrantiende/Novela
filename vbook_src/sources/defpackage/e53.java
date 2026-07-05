package defpackage;

import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: e53  reason: default package */
/* loaded from: classes3.dex */
public final class e53 extends n42 {
    public int C;
    public List a;
    public String b;
    public List c;
    public List d;
    public /* synthetic */ Object e;
    public final /* synthetic */ i53 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e53(i53 i53Var, n42 n42Var) {
        super(n42Var);
        this.f = i53Var;
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.C |= Integer.MIN_VALUE;
        return i53.E(this.f, this);
    }
}
