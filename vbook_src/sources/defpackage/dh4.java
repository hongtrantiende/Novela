package defpackage;

import java.util.Iterator;
import java.util.Map;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: dh4  reason: default package */
/* loaded from: classes.dex */
public final class dh4 extends n42 {
    public final /* synthetic */ eh4 C;
    public int D;
    public Map a;
    public Iterator b;
    public oba c;
    public Map d;
    public Object e;
    public /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dh4(eh4 eh4Var, n42 n42Var) {
        super(n42Var);
        this.C = eh4Var;
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.D |= Integer.MIN_VALUE;
        return this.C.b(this);
    }
}
