package defpackage;

import java.util.Iterator;
import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: dd7  reason: default package */
/* loaded from: classes.dex */
public final class dd7 extends n42 {
    public final /* synthetic */ bm1 C;
    public int D;
    public ad7 a;
    public hd7 b;
    public byte[] c;
    public List d;
    public Iterator e;
    public /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dd7(bm1 bm1Var, n42 n42Var) {
        super(n42Var);
        this.C = bm1Var;
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.D |= Integer.MIN_VALUE;
        return this.C.j(this);
    }
}
