package defpackage;

import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: g93  reason: default package */
/* loaded from: classes3.dex */
public final class g93 extends n42 {
    public int C;
    public List a;
    public String b;
    public List c;
    public List d;
    public /* synthetic */ Object e;
    public final /* synthetic */ h93 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g93(h93 h93Var, n42 n42Var) {
        super(n42Var);
        this.f = h93Var;
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.C |= Integer.MIN_VALUE;
        return this.f.E(this);
    }
}
