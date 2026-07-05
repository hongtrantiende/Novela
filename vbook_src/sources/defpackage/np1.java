package defpackage;

import java.util.Iterator;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: np1  reason: default package */
/* loaded from: classes.dex */
public final class np1 extends n42 {
    public xq5 a;
    public mb1 b;
    public Iterator c;
    public /* synthetic */ Object d;
    public final /* synthetic */ uwd e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public np1(uwd uwdVar, n42 n42Var) {
        super(n42Var);
        this.e = uwdVar;
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.x(null, this);
    }
}
