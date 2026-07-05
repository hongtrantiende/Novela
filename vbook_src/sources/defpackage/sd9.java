package defpackage;

import java.util.Map;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: sd9  reason: default package */
/* loaded from: classes3.dex */
public final class sd9 extends n42 {
    public cs9 a;
    public Map b;
    public /* synthetic */ Object c;
    public final /* synthetic */ be9 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sd9(be9 be9Var, n42 n42Var) {
        super(n42Var);
        this.d = be9Var;
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.J(null, null, this);
    }
}
