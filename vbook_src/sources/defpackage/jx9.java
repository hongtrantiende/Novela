package defpackage;

import java.util.Collection;
import java.util.Iterator;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: jx9  reason: default package */
/* loaded from: classes.dex */
public final class jx9 extends n42 {
    public Collection a;
    public Iterator b;
    public Collection c;
    public /* synthetic */ Object d;
    public final /* synthetic */ lx9 e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jx9(lx9 lx9Var, n42 n42Var) {
        super(n42Var);
        this.e = lx9Var;
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.o(null, this);
    }
}
