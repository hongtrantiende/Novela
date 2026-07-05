package defpackage;

import java.util.HashMap;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: e93  reason: default package */
/* loaded from: classes3.dex */
public final class e93 extends n42 {
    public final /* synthetic */ h93 C;
    public int D;
    public Object a;
    public bw7 b;
    public Object c;
    public HashMap d;
    public long e;
    public /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e93(h93 h93Var, n42 n42Var) {
        super(n42Var);
        this.C = h93Var;
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.D |= Integer.MIN_VALUE;
        return h93.D(this.C, this);
    }
}
