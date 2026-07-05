package defpackage;

import java.util.Map;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: xqd  reason: default package */
/* loaded from: classes3.dex */
public final class xqd extends n42 {
    public final /* synthetic */ yqd C;
    public int D;
    public Object a;
    public Object b;
    public Map c;
    public v20 d;
    public int e;
    public /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xqd(yqd yqdVar, n42 n42Var) {
        super(n42Var);
        this.C = yqdVar;
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.D |= Integer.MIN_VALUE;
        return this.C.n(null, null, this);
    }
}
