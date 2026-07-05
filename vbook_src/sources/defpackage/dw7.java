package defpackage;

import java.util.Iterator;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: dw7  reason: default package */
/* loaded from: classes3.dex */
public final class dw7 extends n42 {
    public ez5 a;
    public ew7 b;
    public Iterator c;
    public /* synthetic */ Object d;
    public final /* synthetic */ db1 e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dw7(db1 db1Var, m42 m42Var) {
        super(m42Var);
        this.e = db1Var;
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.a(null, this);
    }
}
