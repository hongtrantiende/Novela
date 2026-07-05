package defpackage;

import java.util.Map;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: yd9  reason: default package */
/* loaded from: classes3.dex */
public final class yd9 extends n42 {
    public String a;
    public cs9 b;
    public Map c;
    public /* synthetic */ Object d;
    public final /* synthetic */ be9 e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yd9(be9 be9Var, n42 n42Var) {
        super(n42Var);
        this.e = be9Var;
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.P(null, null, null, this);
    }
}
